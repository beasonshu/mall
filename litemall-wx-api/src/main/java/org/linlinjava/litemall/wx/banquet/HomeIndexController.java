package org.linlinjava.litemall.wx.banquet;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.linlinjava.litemall.core.util.ResponseUtil;
import org.linlinjava.litemall.db.service.LitemallAdService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 测试服务
 */
@RestController
@RequestMapping("/bq/home")
public class HomeIndexController {
    private final Log logger = LogFactory.getLog(HomeIndexController.class);
    @Autowired
    private LitemallAdService adService;





    /**
     * 测试数据
     *
     * @return 测试数据
     */
    @GetMapping("/index")
    public Object index() {

        return ResponseUtil.ok("hello world, this is wx service");
    }

}