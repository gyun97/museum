package com.kdg.MuseumAPI.controller;

import com.kdg.MuseumAPI.dto.MuseumDTO;
import com.kdg.MuseumAPI.service.MuseumService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;
import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/museum")
public class MuseumController {
    private final MuseumService museumService;

    @PostMapping("/new")
    public String setData(@RequestBody List<MuseumDTO> museumDTOList) {
        for (MuseumDTO museumDTO : museumDTOList) {
            museumService.save(museumDTO);
        }
        return "OK";
    }

    @GetMapping("/")
    public List<MuseumDTO> findAll() {
        return museumService.findAll();
    }
}
