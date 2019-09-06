package org.linlinjava.litemall.wx.banquet;

import io.swagger.annotations.Api;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.linlinjava.litemall.core.util.ResponseUtil;
import org.linlinjava.litemall.db.domain.DiningHall;
import org.linlinjava.litemall.db.service.DiningHallService;
import org.linlinjava.litemall.db.service.LitemallAdService;
import org.linlinjava.litemall.wx.service.HomeCacheManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.FutureTask;

/**
 * 测试服务
 */
@Api(tags = "首页")
@RestController
@RequestMapping("/bq/home")
public class HomeIndexController {
    private final Log logger = LogFactory.getLog(HomeIndexController.class);
    @Autowired
    private LitemallAdService adService;

    @Autowired
    private DiningHallService diningHallService;




    /**
     * wx
     *
     * @return 测试数据
     */
    @GetMapping("/index")
    public Object index() {
        //优先从缓存中读取
        if (HomeCacheManager.hasData(HomeCacheManager.BQ_INDEX)) {
            return ResponseUtil.ok(HomeCacheManager.getCacheData(HomeCacheManager.BQ_INDEX));
        }

        ExecutorService executorService = Executors.newFixedThreadPool(10);

        Callable<List> bannerListCallable = () -> adService.queryBqIndex();

        FutureTask<List> bannerTask = new FutureTask<>(bannerListCallable);

        Callable<DiningHall> hallCallable = () -> diningHallService.queryByUid(0);

        FutureTask<DiningHall> hallTask = new FutureTask<>(hallCallable);



        executorService.submit(bannerTask);
        Map<String, Object> entity = new HashMap<>();
        try {
            entity.put("banner", bannerTask.get());
            //缓存数据
            HomeCacheManager.loadData(HomeCacheManager.BQ_INDEX, entity);
        }
        catch (Exception e) {
            e.printStackTrace();
        }finally {
            executorService.shutdown();
        }
        return ResponseUtil.ok(entity);
    }

}