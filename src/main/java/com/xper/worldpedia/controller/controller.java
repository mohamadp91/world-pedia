package com.xper.worldpedia.controller;

import com.xper.worldpedia.models.WorldEntity;
import com.xper.worldpedia.repository.WorldRepository;
import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping(value = "/countries")
public class controller {

    @Autowired
    private WorldRepository worldRepository;

    @CrossOrigin
    @GetMapping("/{country}")
    @CircuitBreaker(name = "main", fallbackMethod = "getCountryFallback")
    public WorldEntity getCountry(@PathVariable String country) throws Throwable {
        if(worldRepository.count() == 0 || !worldRepository.existsByCountry(country))
            throw new Throwable();
        return worldRepository.findByCountry(country);
    }

    public WorldEntity getCountryFallback(String country, Throwable th) {
        return new WorldEntity();
    }

    @CrossOrigin
    @GetMapping("/all")
    @CircuitBreaker(name = "main", fallbackMethod = "getAllCountryFallback")
    public List<WorldEntity> getAllCountries() throws Throwable {
        if(worldRepository.count() == 0)
            throw new Throwable();
       return worldRepository.findAll();
    }

    public List<WorldEntity> getAllCountryFallback(Throwable th) {
        List<WorldEntity> worldEntityList = new ArrayList<>();
        WorldEntity w = new WorldEntity();
        worldEntityList.add(w);
        return worldEntityList;
    }
}
