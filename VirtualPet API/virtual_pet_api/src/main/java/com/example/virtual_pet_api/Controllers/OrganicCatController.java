package com.example.virtual_pet_api.Controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.virtual_pet_api.Models.OrganicCat;
import com.example.virtual_pet_api.Repositories.OrganicCatRepo;

@RestController
@RequestMapping("/organicCat")
public class OrganicCatController {
    @Autowired
    private OrganicCatRepo organicCatRepo;

    @GetMapping("/name/{name}")
    public List<OrganicCat> getOrganicCatByName(@PathVariable String name) {
        return organicCatRepo.findByName(name);
    }

    @GetMapping("/{id}")
    public OrganicCat getOrganicCatById(@PathVariable Long id) {
        return organicCatRepo.findById(id).orElse(null);
    }


    @GetMapping("/isFed/{isFed}")
    public List<OrganicCat> getOrganicCatByIsFed(@PathVariable boolean isFed) {
        return organicCatRepo.findByIsFed(isFed);
    }

    @GetMapping("/isWatered/{isWatered}")
    public List<OrganicCat> getOrganicCatByIsWatered(@PathVariable boolean isWatered) {
        return organicCatRepo.findByIsWatered(isWatered);
    }

    @GetMapping("/isCleanLitterBox/{isCleanLitterBox}")
    public List<OrganicCat> getOrganicCatByIsCleanLitterBox(@PathVariable boolean isCleanLitterBox) {
        return organicCatRepo.findByIsCleanLitterBox(isCleanLitterBox);
    }
}
