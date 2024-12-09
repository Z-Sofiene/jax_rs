package com.soap.xml_sb.jax_rs_arc.service;

import com.soap.xml_sb.jax_rs_arc.model.Personne;
import com.soap.xml_sb.jax_rs_arc.model.Reponse;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

@Service
public class PersonneServiceImp implements IPersonneService {

    private static Map<Integer, Personne> pers = new HashMap<>();
    @Override
    public Reponse ajouterPersonne(Personne p) {
        Reponse reponse = new Reponse();
        if (pers.get(p.getId()) != null) {
            reponse.setStatus(false);
            reponse.setMessage("Personne déjà existante...");
            return reponse;
        }
        pers.put(p.getId(), p);
        reponse.setStatus(true);
        reponse.setMessage("Personne créée avec succès...");
        return reponse;
    }
    @Override
    public Reponse supprimerPersonne(int id) {
        Reponse reponse = new Reponse();
        if (pers.get(id) == null) {
            reponse.setStatus(false);
            reponse.setMessage("Personne non existante...");
            return reponse;
        }
        pers.remove(id);
        reponse.setStatus(true);
        reponse.setMessage("Personne supprimée avec succès...");
        return reponse;
    }
    @Override
    public Personne getPersonne(int id) {
        return pers.get(id);
    }
    @Override
    public Personne[] getAllPersonnes() {
        Set<Integer> ids = pers.keySet();
        Personne[] p = new Personne[ids.size()];
        int i = 0;
        for (Integer id : ids) {
            p[i] = pers.get(id);
            i++;
        }
        return p;
    }
    @Override
    public Reponse updatePersonne(Personne p) {
        Reponse reponse = new Reponse();
        if (pers.get(p.getId()) == null) {
            reponse.setStatus(false);
            reponse.setMessage("Personne non existante...");
            return reponse;
        }
        pers.put(p.getId(), p); // Mise à jour de la personne
        reponse.setStatus(true);
        reponse.setMessage("Personne mise à jour avec succès...");
        return reponse;
    }
}