package org.linlinjava.litemall.db.service;

import org.linlinjava.litemall.db.dao.HallMenuMapper;
import org.linlinjava.litemall.db.domain.HallMenu;
import org.linlinjava.litemall.db.domain.HallMenuExample;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class HallMenuService {
    @Resource
   private HallMenuMapper hallMenuMapper;

    public List<HallMenu> queryById(Integer id){
        HallMenuExample example = new HallMenuExample();
        example.or().andIdEqualTo(id);
        return hallMenuMapper.selectByExample(example);
    }
}
