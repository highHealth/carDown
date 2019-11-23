package com.highcar.demo.controller;

import com.highcar.demo.pojo.News;
import com.highcar.demo.serivce.impl.newsServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/news")
public class newsController {

    @Autowired
    private newsServiceImpl nsi;

    @RequestMapping("/title")
    public List<News> selectTitleFromType(Integer type){
        return nsi.selectNewsByTyte(type);
    }
    @RequestMapping("/nid")
    public News selectNewsById(Integer id){
        return nsi.selectNewsById(id);
    }
}
