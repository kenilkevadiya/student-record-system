package com.kenilsk.studentrecordsystem.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private String address;

    public Student() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAdress(String address) {
        this.address = address;
    }


}





////////////////////////////////////////////////////////////////////////////
////////////////////////////////////////////////////////////////////////////

// It seems like you're referring to an @Entity annotation,
// which is commonly used in Java persistence frameworks like Hibernate or JPA (Java Persistence API).

// In Java, the @Entity annotation is used to mark a Java class as an entity.
// An entity represents a table in a relational database,
// and each instance of the entity class corresponds to a row in that table.


// @Id:
//Marks a field in an entity class as the primary key.
//Denotes that the field is used to uniquely identify instances of the entity in the database.

//@GeneratedValue:
//Specifies how the primary key value is automatically generated.
//The strategy attribute of @GeneratedValue determines the generation strategy.