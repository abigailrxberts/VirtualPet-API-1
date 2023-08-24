package com.example.virtual_pet_api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.example.virtual_pet_api.Models.Shelter;
import com.example.virtual_pet_api.Models.Volunteer;
import com.example.virtual_pet_api.Repositories.ShelterRepo;
import com.example.virtual_pet_api.Repositories.VolunteerRepo;

@Component
public class Populator implements CommandLineRunner{

    @Autowired
    private ShelterRepo shelterRepo;

    @Autowired
    private VolunteerRepo volunteerRepo;

    @Override
    public void run(String... args) throws Exception {

        Shelter shelter1 = new Shelter("Shelter");
        shelterRepo.save(shelter1);

        Volunteer volunteer1 = new Volunteer("Abigail");
        volunteerRepo.save(volunteer1);
    }
    
}
