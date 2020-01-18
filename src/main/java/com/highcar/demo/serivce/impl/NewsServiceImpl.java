package com.highcar.demo.serivce.impl;
import com.highcar.demo.mapper.NewsMapper;
import com.highcar.demo.pojo.News;
import com.highcar.demo.serivce.NewsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NewsServiceImpl implements NewsService {
    @Autowired
    private NewsMapper nm;
    @Override
    public List<News> selectNewsByTyte(Integer type) {
        return nm.selectNewsByTyte(type);
    }

    @Override
    public News selectNewsById(Integer id) {
        return nm.selectNewsById(id);
    }
}
