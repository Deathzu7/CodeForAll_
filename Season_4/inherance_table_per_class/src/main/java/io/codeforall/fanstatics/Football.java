package io.codeforall.fanstatics;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "Football")
public class Football extends OlympicSports {
    private int ball;

    public int getBall() {
        return ball;
    }

    public void setBall(int ball) {
        this.ball = ball;
    }

}
