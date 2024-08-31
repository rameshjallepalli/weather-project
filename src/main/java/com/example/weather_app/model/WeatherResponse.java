package com.example.weather_app.model;


import lombok.*;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class WeatherResponse {


    private String name;

    private Sys sys;

    private List<Weather> weather;

    private Main main;

    private Wind wind;
    @Setter
    @Getter
    public static class Sys {

        private String country;
    }
    @Setter
    @Getter
    public static class Weather{

        private int id;

        private String description;
    }
    @Setter
    @Getter
    public static class Main {

        private double temp;

        private int humidity;
    }
    @Setter
    @Getter
    public static class Wind{

        private double speed;
    }



}
