package com.bottledrive.service;

import com.bottledrive.model.Bottle;
import com.bottledrive.repository.BottleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BottleService {

    @Autowired
    private BottleRepository bottleRepository;

    public List<Bottle> getAllBottles() {
        return bottleRepository.findAll();
    }

    public Bottle addBottle(Bottle bottle) {
        return bottleRepository.save(bottle);
    }

    public void deleteBottle(Long id) {
        bottleRepository.deleteById(id);
    }

    public Bottle updateBottle(Long id, Bottle updatedBottle) {
        Optional<Bottle> optionalBottle = bottleRepository.findById(id);
        if (optionalBottle.isPresent()) {
            Bottle existingBottle = optionalBottle.get();
            existingBottle.setAddress(updatedBottle.getAddress());
            existingBottle.setNumberOfBottles(updatedBottle.getNumberOfBottles());
            // Set other properties as needed
            return bottleRepository.save(existingBottle);
        } else {
            throw new RuntimeException("Bottle not found with id: " + id);
        }
    }
}
