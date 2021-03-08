package com.tts.WeatherApp.services;


import com.tts.WeatherApp.models.Response;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class WeatherService {
    @Value("${api_key}")
    private String apiKey;

    public Response getForecast(String zipCode) {
        return null;
    }

}