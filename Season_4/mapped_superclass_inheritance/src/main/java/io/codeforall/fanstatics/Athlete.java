package io.codeforall.fanstatics;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "athlete")
public class Athlete extends OlympicSports {

    private String gender;
    private String sport;


    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getSport() {
        return sport;
    }

    public void setSport(String sport) {
        this.sport = sport;
    }
}
