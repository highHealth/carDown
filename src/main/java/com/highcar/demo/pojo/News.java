package com.highcar.demo.pojo;

import lombok.Data;

@Data
public class News {
    private Integer id;
    private String title;
    private String writer;
    private String time;
    private String img;
    private String video;
    private String location;
    private String type;
}
