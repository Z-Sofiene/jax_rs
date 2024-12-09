package com.soap.xml_sb.jax_rs_arc.config;

import org.glassfish.jersey.server.ResourceConfig;
import org.springframework.stereotype.Component;

@Component
public class JerseyConfig extends ResourceConfig {

    public JerseyConfig() {
        packages("com.soap.xml_sb.jax_rs_arc.controller"); // Ensure the package is correct
    }
}

