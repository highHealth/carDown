package com.highcar.demo.controller;

import com.highcar.demo.pojo.Dealers;
import com.highcar.demo.serivce.DealersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * 售后经销商以及地图信息 Controller
 */
@RestController
@RequestMapping("/dealers")
public class DealersController {

    @Autowired
    private DealersService MapService;

    /**
     * @Description: 获取Map信息
     * @Date:   2019-11
     */
    @GetMapping("/showMap")
    public List<Dealers> showMap(){
        return MapService.showMap();
    }

    /**
     * @Description: 获取经销商数据
     * @Date:   2019-12
     */
    @GetMapping("/getDealerData")
    public List<Dealers> getDealerData(){
        return MapService.getDealerData();
    }

    /**
     * @Description: 获取售后数据
     * @Date:   2019-12
     */
    @GetMapping("/getAfterData")
    public List<Dealers> getAfterData(){
        return MapService.getAfterData();
    }



}
