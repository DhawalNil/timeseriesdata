package com.infy.timeseries.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.infy.timeseries.dto.EntityDTO;
import com.infy.timeseries.exception.TimeSeriesException;
import com.infy.timeseries.utility.JsonToDto;

@Service
public class TimeSeriesServiceImpl implements TimeSeriesService{

	@Autowired
	JsonToDto jsonToDto;
	
	@Override
	public String entry(Object object) throws TimeSeriesException {
		EntityDTO entityDTO = jsonToDto.getPayLoad(object);
		return entityDTO.toString();
	}

}
