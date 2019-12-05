package com.highcar.demo.serivce.impl;

import com.highcar.demo.mapper.carMapper;
import com.highcar.demo.pojo.Car;
import com.highcar.demo.pojo.pojotool.CarPojo;
import com.highcar.demo.serivce.carService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class carServiceImpl implements carService {
    @Autowired
    private carMapper cm;
    @Override
    public List<Car> selectJieshaoCarByType(String mark) {
        return cm.selectJieshaoCarByType(mark);
    }

    @Override
    public CarPojo selectCarById(Integer id) {
        return cm.selectCarById(id);
    }
}
