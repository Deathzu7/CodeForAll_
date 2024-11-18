package io.codeforall.fanstatics;


import javax.persistence.Embeddable;
import javax.persistence.Embedded;

@Embeddable
public class Mapping {

    private int age;
    private String bestPlayer;
    private String nickName;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getBestPlayer() {
        return bestPlayer;
    }

    public void setBestPlayer(String bestPlayer) {
        this.bestPlayer = bestPlayer;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }
}
