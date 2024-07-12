package com.bottledrive.controller;

import com.bottledrive.dto.BottleDTO;
import com.bottledrive.model.Bottle;
import com.bottledrive.service.BottleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/bottles")
public class BottleController {

    private final BottleService bottleService;

    @Autowired
    public BottleController(BottleService bottleService) {
        this.bottleService = bottleService;
    }

    @PostMapping
    public Bottle createBottle(@RequestBody BottleDTO bottleDTO) {
        // Convert BottleDTO to Bottle entity if needed
        Bottle bottle = new Bottle();
        bottle.setAddress(bottleDTO.getAddress());
        bottle.setNumberOfBottles(bottleDTO.getNumberOfBottles());

        // Call service method to save the bottle
        return bottleService.saveBottle(bottle);
    }

    // Other controller methods for CRUD operations, etc.
}
