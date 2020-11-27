package com.xoste.leon.service.impl;

import com.xoste.leon.mapper.AirportMapper;
import com.xoste.leon.pojo.Airport;
import com.xoste.leon.service.AirportService;

import java.util.List;

/**
 * @author Tiger
 */
public class AirportServiceImpl implements AirportService {
    private AirportMapper airportMapper;

    public AirportMapper getAirportMapper() {
        return airportMapper;
    }

    public void setAirportMapper(AirportMapper airportMapper) {
        this.airportMapper = airportMapper;
    }

    @Override
    public List<Airport> show() {
        return airportMapper.selectAllAirports();
    }
}
