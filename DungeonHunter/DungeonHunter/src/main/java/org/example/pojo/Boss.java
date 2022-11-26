package org.example.pojo;

public class Boss {
    private Integer BossHP;
    private String BossName;
    private Integer BossDamage;

    public Boss(int BossHP, String BossName, Integer BossDamage) {
        this.BossHP = BossHP;
        this.BossName = BossName;
        this.BossDamage = BossDamage;
    }
    public Boss() {
        this.BossName = "";
        this.BossHP = 0;
        this.BossDamage = 0;
    }

    public Integer getBossHP() {
        return BossHP;
    }

    public void setBossHP(Integer bossHP) {
        this.BossHP = bossHP;
    }

    public String getBossName() {
        return BossName;
    }

    public void setBossName(String bossName) {
        this.BossName = bossName;
    }

    public Integer getBossDamage() {
        return BossDamage;
    }

    public void setBossDamage(Integer bossDamage) {
        this.BossDamage = bossDamage;
    }
    public String toString(){
        return  this.BossName+ " a " + this.BossHP + " hp." + " inflige un montant de dégât de " + this.BossDamage;
    }
}
