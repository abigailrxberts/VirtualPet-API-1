package com.example.virtual_pet_api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.example.virtual_pet_api.Models.OrganicCat;
import com.example.virtual_pet_api.Models.OrganicDog;
import com.example.virtual_pet_api.Models.RoboticCat;
import com.example.virtual_pet_api.Models.RoboticDog;
import com.example.virtual_pet_api.Models.Shelter;
import com.example.virtual_pet_api.Models.Volunteer;
import com.example.virtual_pet_api.Repositories.OrganicCatRepo;
import com.example.virtual_pet_api.Repositories.OrganicDogRepo;
import com.example.virtual_pet_api.Repositories.RoboticCatRepo;
import com.example.virtual_pet_api.Repositories.RoboticDogRepo;
import com.example.virtual_pet_api.Repositories.ShelterRepo;
import com.example.virtual_pet_api.Repositories.VolunteerRepo;

@Component
public class Populator implements CommandLineRunner{

    @Autowired
    private ShelterRepo shelterRepo;

    @Autowired
    private VolunteerRepo volunteerRepo;

    @Autowired
    private RoboticDogRepo roboticDogRepo;

    @Autowired
    private RoboticCatRepo roboticCatRepo;

    @Autowired
    private OrganicDogRepo organicDogRepo;

    @Autowired
    private OrganicCatRepo organicCatRepo;

    @Override
    public void run(String... args) throws Exception {

        Shelter shelter1 = new Shelter("Shelter");
        shelterRepo.save(shelter1);

        Volunteer volunteer1 = new Volunteer("Abigail");
        volunteerRepo.save(volunteer1);

        RoboticDog roboticDog1 = new RoboticDog(50, "Rosie", "Grey Dog", false);
        roboticDogRepo.save(roboticDog1);

        RoboticDog roboticDog2 = new RoboticDog(72, "Princess", "Black Dog", true);
        roboticDogRepo.save(roboticDog2);

        RoboticCat roboticCat1 = new RoboticCat(25, "Timmy", "Tan Cat", true);
        roboticCatRepo.save(roboticCat1);

        RoboticCat roboticCat2 = new RoboticCat(30, "Marcel", "Spotted Cat", true);
        roboticCatRepo.save(roboticCat2);

        OrganicDog organicDog1 = new OrganicDog(86, "Spot", "Spotted Dog", false, true, true, true);
        organicDogRepo.save(organicDog1);

        OrganicCat organicCat1 = new OrganicCat(90, "MeowMix", "Black Cat", true, true, false);
        organicCatRepo.save(organicCat1);
    }
}
