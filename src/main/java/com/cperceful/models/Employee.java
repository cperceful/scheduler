package com.cperceful.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * Employee class, database entity
 */

@Entity
public class Employee {

    @GeneratedValue
    @Id
    private int id;

    private String name;

    private boolean isManager;

    //Availability will need to be a collection of days and times/periods. Or something. TBA.

    private int maxHours;
}
