package com.highcar.demo.mapper;

import com.highcar.demo.pojo.Favorite;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface favoriteMapper {
    @Select("SELECT f.car_id FROM favorite f WHERE f.user_id= #{Uid}")
    List<Integer> getFavoriteByUserId(String Uid);
    @Insert("INSERT INTO favorite (user_id,car_id) VALUES(#{Uid},#{Cid})")
    Integer AddFavorite(String Uid,Integer Cid);
    @Delete("DELETE FROM favorite WHERE user_id=#{Uid} AND car_id=#{Cid}")
    Integer delefalvorite(String Uid,Integer Cid);
}
