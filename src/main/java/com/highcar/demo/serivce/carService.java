package com.highcar.demo.serivce;

import com.highcar.demo.pojo.Car;
import com.highcar.demo.pojo.pojotool.CarPojo;

import java.util.List;

public interface carService {
    List<Car> selectJieshaoCarByType(String mark);
    CarPojo selectCarById(Integer id);
}
