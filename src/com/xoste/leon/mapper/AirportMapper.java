package com.xoste.leon.mapper;

import com.xoste.leon.pojo.Airport;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * @author leon
 */
public interface AirportMapper {
    /**
     * 用来查询数据库中所有的机场
     * @return List
     */
    @Select("select * from airport")
    List<Airport> selectAllAirports();
}
