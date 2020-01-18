package com.highcar.demo.controller;

import com.highcar.demo.serivce.impl.favoriteServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/favorite")
public class favoriteController {
    @Autowired
    private favoriteServiceImpl favoriteService;

    @RequestMapping("/favoriteUid")
    public List<Integer> getFavoriteByUserId(String Uid){
        return favoriteService.getFavoriteByUserId(Uid);
    }
    @RequestMapping("/addfavorite")
    public Integer AddFavorite(String Uid,Integer Cid){
        return favoriteService.AddFavorite(Uid,Cid);
    }
    @RequestMapping("/delfavorite")
    public Integer delefalvorite(String Uid,Integer Cid){
        return favoriteService.delefalvorite(Uid,Cid);
    }
}
