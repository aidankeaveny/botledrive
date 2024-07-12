package com.bottledrive.controller;

import com.bottledrive.model.Bottle;
import com.bottledrive.service.BottleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/bottles")
public class BottleController {

    @Autowired
    private BottleService bottleService;

    @GetMapping
    public List<Bottle> getAllBottles() {
        return bottleService.getAllBottles();
    }

    @PostMapping
    public ResponseEntity<Bottle> addBottle(@RequestBody Bottle bottle) {
        Bottle savedBottle = bottleService.addBottle(bottle);
        return new ResponseEntity<>(savedBottle, HttpStatus.CREATED);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Bottle> updateBottle(@PathVariable Long id, @RequestBody Bottle bottle) {
        Bottle updatedBottle = bottleService.updateBottle(id, bottle);
        return ResponseEntity.ok(updatedBottle);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteBottle(@PathVariable Long id) {
        bottleService.deleteBottle(id);
        return ResponseEntity.noContent().build();
    }
}
