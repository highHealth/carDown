package com.highcar.demo.serivce.impl;

import com.highcar.demo.mapper.DealersMapper;
import com.highcar.demo.pojo.Dealers;
import com.highcar.demo.serivce.DealersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 售后经销商以及地图信息 ServiceImpl
 */
@Service
public class DealersServiceImpl implements DealersService {

    @Autowired
    private DealersMapper mapMapper;

    /**
     * @Description: 获取Map信息
     * @Date:   2019-11
     */
    @Override
    public List<Dealers> showMap() {
       return mapMapper.showMap();
    }

    /**
     * @Description: 获取经销商数据
     * @Date:   2019-12
     */
    @Override
    public List<Dealers> getDealerData() {
        return mapMapper.getDealerData();
    }

    /**
     * @Description: 获取售后数据
     * @Date:   2019-12
     */
    @Override
    public List<Dealers> getAfterData() {
        return mapMapper.getAfterData();
    }

}
