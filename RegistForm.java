package com.example.demo.model;

public class RegistForm {

	private String animal;
    private String features;
    private String habitat;

    public RegistForm(String animal,String features,String habitat) {
    	this.animal = animal;
        this.features = features;
        this.habitat = habitat;
    }

    public RegistForm() {
        this("","","");
    }

    public String getHabitat() {
        return habitat;
    }
    public void setHabitat(String habitat) {
        this.habitat = habitat;
    }

    public String getAnimal() {
        return animal;
    }
    public void setAnimal(String animal) {
        this.animal = animal;
    }

	public String getFeatures() {
        return features;
    }
    public void setFeatures(String features) {
        this.features = features;
    }
}
