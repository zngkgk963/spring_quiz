package com.quiz.weather.bo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.quiz.weather.dao.WeatherHistoryMapper;
import com.quiz.weather.domain.WeatherHistory;



public class WeatherHistoryBO {
	
	@Autowired
	private WeatherHistoryMapper weatherHistoryMapper; // spring bean을 주입받는다. DI
	
	public List<WeatherHistory> getWeatherHistoryList() {
		List<WeatherHistory> weatherHistoryList = weatherHistoryMapper.selectWeatherHistoryList();
		return weatherHistoryList;
	}
}
