package org.linlinjava.litemall.wx.web;


import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.core.io.ByteArrayResource;
import org.springframework.core.io.Resource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.util.ResourceUtils;
import org.springframework.util.StringUtils;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;


@RestController
@RequestMapping("/wx/upload")
public class RestFilesController {

    private final Logger logger = LoggerFactory.getLogger(RestFilesController.class);

    // Save the uploaded file to this folder
//    private static String UPLOADED_FOLDER = "/Users/shuxinghu/IdeaProjects/uploads/";
    @Autowired
    private Environment env;
    // Single file upload
    @PostMapping("/rest/upload")
    public ResponseEntity<?> uploadFile(@RequestParam("file") MultipartFile uploadfile) {

        logger.debug("Single file upload!");

        if (uploadfile.isEmpty()) {
            return new ResponseEntity<>("You must select a file!", HttpStatus.OK);
        }
        try {
            File path = new File(ResourceUtils.getURL("classpath:").getPath());
            System.out.println("path:"+path.getAbsolutePath());
            logger.info("path:"+path.getAbsolutePath());
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        try {
            saveUploadedFiles(Collections.singletonList(uploadfile));
        } catch (IOException e) {
            logger.error(e.getMessage());
            return new ResponseEntity<Object>(e.getMessage(),HttpStatus.INTERNAL_SERVER_ERROR);
        }
        return new ResponseEntity<>("Successfully uploaded - " + uploadfile.getOriginalFilename(), new HttpHeaders(),
                HttpStatus.OK);

    }

    // multiple upload
    @RequestMapping(value = "/rest/multipleUpload", method = RequestMethod.POST)
    public ResponseEntity<Object> uploadFile(@RequestPart String metaData,
                                             @RequestPart(required = true) MultipartFile[] uploadfiles) {
        // Get file name
        String uploadedFileName = Arrays.stream(uploadfiles).map(x -> x.getOriginalFilename())
                .filter(x -> !StringUtils.isEmpty(x)).collect(Collectors.joining(" , "));

        if (StringUtils.isEmpty(uploadedFileName)) {
            return new ResponseEntity<Object>("please select a file!", HttpStatus.OK);
        }

        try {

            saveUploadedFiles(Arrays.asList(uploadfiles));
            return new ResponseEntity<Object>("Successfully uploaded - " + uploadedFileName, HttpStatus.OK);
        } catch (IOException e) {
            logger.error(e.getMessage());
            return new ResponseEntity<Object>(e.getMessage(),HttpStatus.INTERNAL_SERVER_ERROR);
        }


    }

    // file download
    @RequestMapping(path = "/rest/download", method = RequestMethod.GET)
    public ResponseEntity<Resource> download(String param) throws IOException {

        File file = new File(param);
        HttpHeaders headers = new HttpHeaders();
        headers.add("Cache-Control", "no-cache, no-store, must-revalidate");
        headers.add("Pragma", "no-cache");
        headers.add("Expires", "0");
        Path path = Paths.get(file.getAbsolutePath());
        ByteArrayResource resource = new ByteArrayResource(Files.readAllBytes(path));

        return ResponseEntity.ok().headers(headers).contentLength(file.length())
                .contentType(MediaType.parseMediaType("application/octet-stream")).body(resource);
    }

    // save file
    private void saveUploadedFiles(List<MultipartFile> files) throws IOException {

        for (MultipartFile file : files) {

            if (file.isEmpty()) {
                continue; // next pls
            }
            File directory = new File(env.getProperty("staticResource.realPath"));
            if (!directory.exists()){
                directory.mkdir();
            }
            byte[] bytes = file.getBytes();
            Path path = Paths.get(env.getProperty("staticResource.realPath") + file.getOriginalFilename());
            Files.write(path, bytes);

        }

    }
}
