package com.highcar.demo.mapper;

import com.highcar.demo.pojo.Car;
import com.highcar.demo.pojo.pojotool.CarPojo;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CarMapper {
    @Select("SELECT c.id,name,money,location,img FROM Car c  LEFT JOIN car_type t ON c.type_Id = t.id WHERE t.mark= #{mark}")
    List<Car> selectJieshaoCarByType(String mark);
    @Select("select car.id,car.name,car_type.mark,car.money,car.location,car.img from car left join car_type on car.type_Id = car_type.id where car.id = #{id}")
    CarPojo selectCarById(Integer id);
}
