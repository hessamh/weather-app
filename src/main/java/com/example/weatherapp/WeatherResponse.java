package com.example.weatherapp;

import lombok.Data;

import java.util.List;

@Data
public class WeatherResponse {

    private Main main;
    private List<Weather> weather;
    private String name;

    @Data
    public static class Main {
        private double temp;
        private double feels_like;
    }

    @Data
    public static class Weather {
        private String description;
    }
}
