package com.highcar.demo.mapper;

import com.highcar.demo.pojo.News;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface newsMapper {
    @Select("select id,title,writer,time from News where type = #{type} ORDER BY time LIMIT 5")
    List<News> selectNewsByTyte(Integer type);
    @Select("SELECT id,title,writer,time,img,location FROM News WHERE id = #{id}")
    News selectNewsById(Integer id);
}
