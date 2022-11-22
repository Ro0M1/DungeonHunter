package org.example.pojo;
//import org.example.enumSpec.Type;

public class TANK extends Player {

    public String passifTank;

    public TANK(String passifTank) {
        this.passifTank = passifTank;
    }

    public TANK(String name, Integer HPS, Integer damage, Integer HP, String passifTank) {
        super(name, HPS, damage, HP);
        this.passifTank = passifTank;
    }

    public TANK(){
        super();
        this.passifTank ="";

    }

    public String toString(){
        return super.toString() + " Mon passif est " + this.passifTank;
    }
}
