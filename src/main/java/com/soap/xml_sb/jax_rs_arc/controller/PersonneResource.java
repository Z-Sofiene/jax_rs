package com.soap.xml_sb.jax_rs_arc.controller;

import com.soap.xml_sb.jax_rs_arc.model.Reponse;
import com.soap.xml_sb.jax_rs_arc.model.Personne;
import com.soap.xml_sb.jax_rs_arc.service.IPersonneService;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;

@Path("/person")
@CrossOrigin("*")
@Produces({MediaType.APPLICATION_XML})
public class PersonneResource {
    @Autowired
    private IPersonneService personneService;

    //@CrossOrigin(origins = "http://localhost:20000")
    @POST
    @Consumes({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
    @Path("/add")
    public Reponse ajouterPersonne(Personne p) {
        return personneService.ajouterPersonne(p);
    }

    @GET
    @Path("/{id}/delete")
    public Reponse supprimerPersonne(@PathParam("id") int id) {
        return personneService.supprimerPersonne(id);
    }

    @GET
    @Path("/{id}/get")
    public Personne getPersonne(@PathParam("id") int id) {
        return personneService.getPersonne(id);
    }

    @GET
    @Path("/{id}/getTest")
    public Personne getTestPersonne(@PathParam("id") int id) {
        Personne p = new Personne();
        p.setId(id);
        p.setAge(0);
        p.setNom("Test");
        return p;
    }

    @GET
    @Path("/getAll")
    @Produces({MediaType.APPLICATION_XML,MediaType.APPLICATION_JSON})
    public Personne[] getAllPersonnes() {
        return personneService.getAllPersonnes();
    }
    @PUT
    @Consumes({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
    @Path("/update")
    public Reponse updatePersonne(Personne p) {
        return personneService.updatePersonne(p);
    }
}