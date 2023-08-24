package com.example.virtual_pet_api.Models;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.MappedSuperclass;

@MappedSuperclass
public abstract class VirtualPet {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private int happiness;
    private String petName;
    private String description;

    public VirtualPet() {
    }

    public VirtualPet(int happiness, String petName, String description) {
        this.happiness = happiness;
        this.petName = petName;
        this.description = description;
    }

    public long getId() {
        return this.id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public int getHappiness() {
        return this.happiness;
    }

    public void setHappiness(int happiness) {
        this.happiness = happiness;
    }

    public String getPetName() {
        return this.petName;
    }

    public void setPetName(String petName) {
        this.petName = petName;
    }

    public String getDescription() {
        return this.description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

}
