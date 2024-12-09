package com.soap.xml_sb.jax_rs_arc.service;

import com.soap.xml_sb.jax_rs_arc.model.Personne;
import com.soap.xml_sb.jax_rs_arc.model.Reponse;

public interface IPersonneService {
    public Reponse ajouterPersonne(Personne p);
    public Reponse supprimerPersonne(int id);
    public Personne getPersonne(int id);
    public Personne[] getAllPersonnes();
    public Reponse updatePersonne(Personne p);
}
