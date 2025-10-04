package com.example.weatherapp;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class WeatherService {

    private final RestTemplate restTemplate = new RestTemplate();
    private final String apiKey = "d54703e81bd514215a2d361a49c4c150";
    private final String baseUrl = "https://api.openweathermap.org/data/2.5/weather";

    public WeatherResponse getWeather(String city) {
        String url = baseUrl + "?q=" + city + "&appid=" + apiKey + "&units=metric";
        return restTemplate.getForObject(url, WeatherResponse.class);
    }
}
