package io.codeforall.fanstatics;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity(name="FootballSingleTable")
@DiscriminatorValue("football")
public class Football extends OlympicSports {
    private int ball;

    public int getBall() {
        return ball;
    }

    public void setBall(int ball) {
        this.ball = ball;
    }
}
