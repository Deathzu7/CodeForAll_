package io.codeforall.fanstatics;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity(name="TennisSingleTable")
@DiscriminatorValue("tennis")
public class Tennis extends OlympicSports {
    private int racket;

    public int getRacket() {
        return racket;
    }

    public void setRacket(int racket) {
        this.racket = racket;
    }
}
