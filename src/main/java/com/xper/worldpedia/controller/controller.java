package com.xper.worldpedia.controller;

import com.xper.worldpedia.models.WorldEntity;
import com.xper.worldpedia.repository.WorldRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/countries")
public class controller {

    @Autowired
    private WorldRepository worldRepository;

    @GetMapping("/{country}")
    public WorldEntity getCountry(@PathVariable String country) {
        return worldRepository.findByCountry(country);
    }

    @GetMapping("/all")
    public List<WorldEntity> getAllCountries() {
        return worldRepository.findAll();
    }
}
