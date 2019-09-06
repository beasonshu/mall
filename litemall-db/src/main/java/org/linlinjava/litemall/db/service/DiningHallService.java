package org.linlinjava.litemall.db.service;

import org.linlinjava.litemall.db.dao.DiningHallMapper;
import org.linlinjava.litemall.db.domain.DiningHall;
import org.linlinjava.litemall.db.domain.DiningHallExample;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class DiningHallService {
    @Resource
    private DiningHallMapper diningHallMapper;
    public List<DiningHall> queryByUid(Integer uid) {
        DiningHallExample example = new DiningHallExample();
        example.or().andIdEqualTo(uid);
        return diningHallMapper.selectByExample(example);
    }
}
