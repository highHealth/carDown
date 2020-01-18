package com.highcar.demo.serivce;

import com.highcar.demo.pojo.Favorite;

import java.util.List;

public interface favoriteService {
    List<Integer> getFavoriteByUserId(String Uid);
    Integer AddFavorite(String Uid,Integer Cid);
    Integer delefalvorite(String Uid,Integer Cid);
}
