package com.example.virtual_pet_api.Models;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.OneToMany;

@Entity
public class Shelter {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String name;

    public Shelter() {
    }

    public Shelter(String name) {
        this.name = name;
    }

    public long getId() {
        return this.id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    //many shelters to many volunteers
    @ManyToMany(mappedBy = "shelters")
    private List<Volunteer> volunteers = new ArrayList<>();

    //one shelter to many robotic dogs
    @OneToMany(mappedBy = "shelter")
    private List<RoboticDog> roboticDogs = new ArrayList<>();

    //one shelter to many robotic cats
    @OneToMany(mappedBy = "shelter")
    private List<RoboticCat> roboticCats = new ArrayList<>();

    //one shelter to many organic dogs
    @OneToMany(mappedBy = "shelter")
    private List<OrganicDog> organicDogs = new ArrayList<>();

    //one shelter to many organic cats
    @OneToMany(mappedBy = "shelter")
    private List<OrganicCat> organicCats = new ArrayList<>();

}
