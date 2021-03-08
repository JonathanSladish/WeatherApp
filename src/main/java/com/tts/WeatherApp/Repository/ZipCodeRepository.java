package com.tts.WeatherApp.Repository;


import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.tts.WeatherApp.models.ZipCodes;

@Repository
public interface ZipCodeRepository extends CrudRepository<ZipCodes, Long> {

    ZipCodes findByZipCode(String zip);

    @Query(value = "SELECT ZIP_CODE,FROM ZIP_CODES ORDER BY CREATED_AT DESC LIMIT 10",
            nativeQuery = true)
    List<String> findMostRecent();



    }
