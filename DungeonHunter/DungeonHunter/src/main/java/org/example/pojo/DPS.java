package org.example.pojo;
//import org.example.enumSpec.Type;

public class DPS extends Player{

    public String passifDPS;

    public DPS(String passifDPS) {
        this.passifDPS = passifDPS;
    }

    public DPS(String name, Integer HPS, Integer damage, Integer HP, String passifDPS) {
        super(name, HPS, damage, HP);
        this.passifDPS = passifDPS;
    }

    public DPS(){
        super();
        this.passifDPS ="";

    }

    public String toString(){
        return super.toString() + " Mon passif est " + this.passifDPS + ".";
    }
}
