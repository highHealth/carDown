package com.highcar.demo.controller;

import com.highcar.demo.pojo.Car;
import com.highcar.demo.pojo.pojotool.CarPojo;
import com.highcar.demo.serivce.impl.carServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/car")
public class CarController {
    @Autowired
    private carServiceImpl sci;
    @RequestMapping("/type")
    public List<Car> selectCarByType(String type){
        return sci.selectJieshaoCarByType(type);
    }
    @RequestMapping("/id")
    public CarPojo selectCarById(Integer id){
        return sci.selectCarById(id);
    }
}
