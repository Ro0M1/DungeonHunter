package org.example.pojo;

//import org.example.enumSpec.Type;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class Player {
    private String name;
    private Integer HPS;
    private Integer Damage;
    private Integer HP;
    public Player() {
        this.name = "";
        this.HP = 0;
        this.HPS = 0;
        this.Damage = 0;
    }

    public String getName() {return this.name;}

    public void setName(String name) {this.name = name;}

    public Player(String name, Integer HPS, Integer damage, Integer HP) {
        this.name = name;
        this.HPS = HPS;
        this.Damage = damage;
        this.HP = HP;
    }
    public int getHPS() {
        return HPS;
    }

    public void setHPS(int HPS) {
        this.HPS = HPS;
    }

    public int getDamage() {
        return Damage;
    }

    public void setDamage(int damage) {
        this.Damage = damage;
    }

    public Integer getHP() {
        return HP;
    }

    public void setHP(Integer HP) {
        this.HP = HP;
    }

    @Override
    public String toString(){
        return  this.name+ " a " + this.HP + " hp." + " inflige un montant de dégât de " + this.Damage + ". Soigne un montant de " + this.HPS;
    }
}
