package com.highcar.demo.serivce;

import com.highcar.demo.pojo.News;

import java.util.List;

public interface NewsService {
    List<News> selectNewsByTyte(Integer type);
    News selectNewsById(Integer id);
}
