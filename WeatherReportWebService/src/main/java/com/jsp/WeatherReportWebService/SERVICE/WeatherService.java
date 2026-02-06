package com.jsp.WeatherReportWebService.SERVICE;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jsp.WeatherReportWebService.DTO.Weather;
import com.jsp.WeatherReportWebService.REPOSITORY.WeatherRepository;

@Service
public class WeatherService {

	@Autowired
	WeatherRepository repository;
	
	// to insert/store weather object into DB
	public Weather insertWeather(Weather weather) {
		return repository.save(weather);
	}
	
	// to search and fetch an object from DB based on ID
	public Weather getWeatherById(int id) {
		Optional<Weather> opt = repository.findById(id);
		
		if(opt.isPresent()) {
			return opt.get();
		}
		else {
			return null;
		}
	}
	
	// to update weather object
	public String updateWeather(int id , String temp ,
										String condt) 
	{
		Weather w = getWeatherById(id);
		if(w != null) {
			w.setConditions(condt);
			w.setTemperature(temp);
			
			repository.save(w);
			return "Weather report is updated.";
		}
		else {
			return "Weather ID doesnt exist.";
		}
	}
	
	// to delete an object from DB based on ID
	public String deleteWeather(int id) {
		Weather w = getWeatherById(id);
		if(w != null) {
			repository.delete(w);
			// repository.deleteById(id);
			// repository.deleteAll();
			return "Weather report is removed.";
		}
		else {
			return "Weather ID doesnt exist.";
		}
	}
	
	// to fetch all objects from DB
	public List<Weather> getAllWeather() {
		return repository.findAll();
	}
}


			

















