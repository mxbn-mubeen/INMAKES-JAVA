package com.model;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name ="showroom")
public class Showroom implements Serializable {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int showroom_id;
    private String location;
    private String manager;
    
    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(
        name = "SHOWROOM_CAR",
        joinColumns = @JoinColumn(name = "SHOWROOM_ID"),
        inverseJoinColumns = @JoinColumn(name = "CAR_ID")
    )
    private Set<Car> cars = new HashSet<>();

    public Showroom() {
    }

    public int getShowroom_id() {
        return showroom_id;
    }

    public void setShowroom_id(int showroom_id) {
        this.showroom_id = showroom_id;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getManager() {
        return manager;
    }

    public void setManager(String manager) {
        this.manager = manager;
    }

    public Set<Car> getCars() {
        return cars;
    }

    public void setCars(Set<Car> cars) {
        this.cars = cars;
    }
}
