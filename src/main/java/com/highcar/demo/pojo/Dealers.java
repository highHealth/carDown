package com.highcar.demo.pojo;

import lombok.Data;

import java.util.Date;

/**
 * 售后经销商以及地图信息 pojo
 */
@Data
public class Dealers {
    // 主键ID
    private String id;
    // 地址
    private String address;
    // 电话
    private String telephone;
    // 经度
    private String longitude;
    // 纬度
    private String latitude;
    // 显示大小
    private String symbolSize;
    // 创建时间
    private Date date;
    // 类型（1经销商 2售后）
    private Integer type;
}
