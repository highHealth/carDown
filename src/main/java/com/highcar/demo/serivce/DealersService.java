package com.highcar.demo.serivce;

import com.highcar.demo.pojo.Dealers;

import java.util.List;

/**
 * 售后经销商以及地图信息 Service
 */
public interface DealersService {

    /**
     * @Description: 获取Map信息
     * @Date:   2019-11
     */
    List<Dealers> showMap();

    /**
     * @Description: 获取经销商数据
     */
    List<Dealers> getDealerData();

    /**
     * @Description: 获取售后数据
     */
    List<Dealers> getAfterData();
}
