package com.jsp.WeatherReportWebService.REPOSITORY;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jsp.WeatherReportWebService.DTO.Weather;

public interface WeatherRepository extends JpaRepository<Weather, Integer>{

	// all inherited methods are present here
}
			