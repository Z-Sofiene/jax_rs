package com.soap.xml_sb.jax_rs_arc.model;

import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
@XmlRootElement // Permet à JAXB de sérialiser cette classe en XML
public class Reponse {

    private boolean status; // état
    private String message;

    /*
    WHY NO CONSTRUCTOR NEEDED HERE ...
    Default Constructor in Java
        Java provides a no-argument default constructor automatically,
        if no constructors are explicitly defined.
        JAXB requires a no-argument constructor for deserialization.
        The default constructor fulfills this requirement without needing
        to define one explicitly.

        In this example, JAXB uses the no-argument constructor to create the object,
        and then it uses the setter methods (like setStatus and setMessage) to populate
        the fields during XML deserialization.
     */
    // Getter et Setter pour status
    @XmlElement // Indique que cet attribut sera inclus dans le XML
    public boolean getStatus() {
        return status;
    }
    public void setStatus(boolean status) {
        this.status = status;
    }
    // Getter et Setter pour message
    @XmlElement
    public String getMessage() {
        return message;
    }
    public void setMessage(String message) {
        this.message = message;
    }
}