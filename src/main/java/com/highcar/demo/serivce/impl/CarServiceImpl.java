package com.highcar.demo.serivce.impl;

import com.highcar.demo.mapper.CarMapper;
import com.highcar.demo.pojo.Car;
import com.highcar.demo.pojo.pojotool.CarPojo;
import com.highcar.demo.serivce.CarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class CarServiceImpl implements CarService {
    @Autowired
    private CarMapper cm;
    @Override
    public List<Car> selectJieshaoCarByType(String mark) {
        return cm.selectJieshaoCarByType(mark);
    }

    @Override
    public CarPojo selectCarById(Integer id) {
        return cm.selectCarById(id);
    }
}
