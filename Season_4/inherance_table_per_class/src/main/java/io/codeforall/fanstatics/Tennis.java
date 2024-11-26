package io.codeforall.fanstatics;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.Table;


@Table(name = "Tenis")
public class Tennis extends OlympicSports {
    private int racket;

    public int getRacket() {
        return racket;
    }

    public void setRacket(int racket) {
        this.racket = racket;
    }
}
