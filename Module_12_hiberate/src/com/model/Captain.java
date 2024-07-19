package com.model;

import java.io.Serializable;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name = "captain")
public class Captain implements Serializable {

    @Id
    @GenericGenerator(name = "ref", strategy = "increment")
    @GeneratedValue(generator = "ref")
    private int captid;
    private String captname;
    private int captage;
    private String captplace;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "team_id") // Ensure this name matches the foreign key in the Team table
    private Team team;

    public Team getTeam() {
        return team;
    }

    public void setTeam(Team team) {
        this.team = team;
    }

    public Captain() {
        // Default constructor
    }

    public int getCaptid() {
        return captid;
    }

    public void setCaptid(int captid) {
        this.captid = captid;
    }

    public String getCaptname() {
        return captname;
    }

    public void setCaptname(String captname) {
        this.captname = captname;
    }

    public int getCaptage() {
        return captage;
    }

    public void setCaptage(int captage) {
        this.captage = captage;
    }

    public String getCaptplace() {
        return captplace;
    }

    public void setCaptplace(String captplace) {
        this.captplace = captplace;
    }
}
