package com.highcar.demo.serivce.impl;

import com.highcar.demo.mapper.FavoriteMapper;
import com.highcar.demo.serivce.FavoriteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FavoriteServiceImpl implements FavoriteService {
    @Autowired
    private FavoriteMapper favoriteMapper;
    @Override
    public List<Integer> getFavoriteByUserId(String Uid) {

        return favoriteMapper.getFavoriteByUserId(Uid);
    }

    @Override
    public Integer AddFavorite(String Uid, Integer Cid) {
//            if(favoriteMapper.AddFavorite(Uid,Cid)){
//
//            }
        return favoriteMapper.AddFavorite(Uid,Cid);
    }

    @Override
    public Integer delefalvorite(String Uid, Integer Cid) {
        return favoriteMapper.delefalvorite(Uid,Cid);
    }
}
