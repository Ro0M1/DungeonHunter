package org.example.pojo;
import java.util.List;
//import org.example.enumSpec.Type;

import java.lang.reflect.Type;

public class HEAL extends Player {

    public String passifSoin;

    public HEAL(String passifSoin) {
        this.passifSoin = passifSoin;
    }

    public HEAL(String name, Integer HPS, Integer damage, Integer HP, String passifSoin) {
        super(name, HPS, damage, HP);
        this.passifSoin = passifSoin;
    }

    public HEAL(){
        super();
        this.passifSoin ="";

    }

    public String toString(){
        return super.toString() + " Mon passif est " + this.passifSoin;
    }
}
