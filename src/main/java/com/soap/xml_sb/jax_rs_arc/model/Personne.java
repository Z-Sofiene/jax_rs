package com.soap.xml_sb.jax_rs_arc.model;

import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;

@XmlRootElement // Indicates this class can be serialized into XML
public class Personne {

    private int id;
    private String nom;
    private int age;

    // Default constructor is required for JAXB
    public Personne() {}

    @XmlElement // Marks this field for XML serialization
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @XmlElement
    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    @XmlElement
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
