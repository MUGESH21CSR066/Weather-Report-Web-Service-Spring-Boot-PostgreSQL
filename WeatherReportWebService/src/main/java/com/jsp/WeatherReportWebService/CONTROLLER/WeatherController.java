package com.jsp.WeatherReportWebService.CONTROLLER;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.jsp.WeatherReportWebService.DTO.Weather;
import com.jsp.WeatherReportWebService.SERVICE.WeatherService;

@RestController
public class WeatherController {

	@Autowired
	WeatherService service;
	
	// REST API/END POINT to store a weather object into DB
	@PostMapping("/weather")
	public Weather saveWeatherReport(@RequestBody Weather weather) {
		return service.insertWeather(weather);
	}
	
	// REST API to fetch an object from DB based on ID
	@GetMapping("/weather")
	public Weather getWeatherReportById(@RequestParam int id) {
		return service.getWeatherById(id);
	}
	
	// REST API to update an object
	@PutMapping("/weather")
	public String updateWeatherReport(@RequestParam int id , 
							@RequestParam String temp , 
								@RequestParam String condt) 
	{	
		return service.updateWeather(id, temp, condt);
	}
	
	// REST API to delete
	@DeleteMapping("/weather")
	public String deleteWeatherReport(@RequestParam int id) {
		return service.deleteWeather(id);
	}
	
	@GetMapping("/all")
	public List<Weather> getAllWeatherReports() {
		return service.getAllWeather();
	}
}












