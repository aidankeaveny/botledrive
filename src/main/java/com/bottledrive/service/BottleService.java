package com.bottledrive.service;

import com.bottledrive.model.Bottle;
import com.bottledrive.repository.BottleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BottleService {

    @Autowired
    private BottleRepository bottleRepository;

    public List<Bottle> getAllBottles() {
        return bottleRepository.findAll();
    }

    public Bottle saveBottle(Bottle bottle) {
        return bottleRepository.save(bottle);
    }

    public void deleteBottle(Long id) {
        bottleRepository.deleteById(id);
    }

    public Bottle updateBottle(Bottle bottle) {
        return bottleRepository.save(bottle);
    }
}
