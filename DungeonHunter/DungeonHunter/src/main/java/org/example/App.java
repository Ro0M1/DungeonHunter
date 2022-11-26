package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.InputMismatchException;
import java.util.Scanner;
import org.example.pojo.HEAL;
import org.example.pojo.Player;
import org.example.pojo.TANK;
import org.example.pojo.DPS;
import org.example.pojo.Boss;


/**
 * Hello world!
 *
 */
public class App
{
    public static void main( String[] args ) {
        Scanner sc = new Scanner(System.in);


        int HealCount = 0;
        int DpsCount = 0;
        int TankCount = 0;
        //int totalplayer= 0;//HealCount + DpsCount + TankCount;


        String heal = "HEAL";
        String dps = "DPS";
        String tank = "TANK";
        String rep = "";
        String nom = "";
        System.out.println("Joueur 1 choisis ta spécialisation! DPS, HEAL ou TANK");
        rep = sc.next();
        System.out.println("Ton nom?");
        nom = sc.next();
        int teamHp = 0;
        int teamDmg = 0;
        ArrayList<Integer> dmg = new ArrayList<>();
        if (rep.equals(heal)) {
            Player joueur = new HEAL(nom, 300, 0, 300, "Soigneurs");
            System.out.println(joueur);
            int hpJ1 = joueur.getHP();
            int dmgJ1 = joueur.getHP();
            dmg.add(dmgJ1);
            teamHp = teamHp + hpJ1;
            teamDmg = teamDmg + dmgJ1;
        } else if (rep.equals(tank)) {
            Player joueur = new TANK(nom, 0, 0, 800, "Dégâts réduits");
            System.out.println(joueur);
            int hpJ1 = joueur.getHP();
            int dmgJ1 = joueur.getDamage();
            dmg.add(dmgJ1);
            teamHp = teamHp + hpJ1;
        } else if (rep.equals(dps)) {
            Player joueur = new DPS(nom, 0, 500, 100, "Dégâts bonus");
            System.out.println(joueur);
            int hpJ1 = joueur.getHP();
            int dmgJ1 = joueur.getDamage();
            teamHp = teamHp + hpJ1;
            dmg.add(dmgJ1);
        }

        System.out.println("Joueur 2 choisis ta spécialisation! DPS, HEAL ou TANK");
        rep = sc.next();
        System.out.println("Ton nom?");
        nom = sc.next();
        if (rep.equals(heal)) {
            Player joueur2 = new HEAL(nom, 300, 0, 300, "Soigneurs");
            System.out.println(joueur2);
            int hpJ2 = joueur2.getHP();
            int dmgJ2 = joueur2.getDamage();
            teamHp = teamHp + hpJ2;
            dmg.add(dmgJ2);
        } else if (rep.equals(tank)) {
            Player joueur2 = new TANK(nom, 0, 0, 800, "Dégâts réduits");
            System.out.println(joueur2);
            int hpJ2 = joueur2.getHP();
            int dmgJ2 = joueur2.getDamage();
            teamHp = teamHp + hpJ2;
            dmg.add(dmgJ2);
        } else if (rep.equals(dps)) {
            Player joueur2 = new DPS(nom, 0, 500, 100, "Dégâts bonus");
            System.out.println(joueur2);
            int hpJ2 = joueur2.getHP();
            int dmgJ2 = joueur2.getDamage();
            teamHp = teamHp + hpJ2;
            dmg.add(dmgJ2);
        }

        System.out.println("Joueur 3 choisis ta spécialisation! DPS, HEAL ou TANK");
        rep = sc.next();
        System.out.println("Ton nom?");
        nom = sc.next();
        if (rep.equals(heal)) {
            Player joueur3 = new HEAL(nom, 300, 0, 300, "Soigneurs");
            System.out.println(joueur3);
            int hpJ3 = joueur3.getHP();
            int dmgJ3 = joueur3.getDamage();
            teamHp = teamHp + hpJ3;
            dmg.add(dmgJ3);
        } else if (rep.equals(tank)) {
            Player joueur3 = new TANK(nom, 100, 0, 800, "Dégâts réduits");
            System.out.println(joueur3);
            int hpJ3 = joueur3.getHP();
            int dmgJ3 = joueur3.getDamage();
            teamHp = teamHp + hpJ3;
            dmg.add(dmgJ3);
        } else if (rep.equals(dps)) {
            Player joueur3 = new DPS(nom, 0, 500, 100, "Dégâts bonus");
            System.out.println(joueur3);
            int hpJ3 = joueur3.getHP();
            int dmgJ3 = joueur3.getDamage();
            teamHp = teamHp + hpJ3;
            dmg.add(dmgJ3);
        }

        System.out.println("En route pour l'Aventure êtes vous prêt pour la première salle ? (oui/non)");
        if (sc.next().equals("oui")) {
            System.out.println("Tant mieux");
            Boss hugo = new Boss(2000, "HUGO", 50);

            int hpBoss = hugo.getBossHP();
            int dmgBoss = hugo.getBossDamage();
                System.out.println("Vous arrivez dans la Salle n°");
                System.out.println("Un monstre s'approche, que le combat commence !!!");
                while (hpBoss > 0 || teamHp > 0) {//boucle tant que le boss ou la team a encore de la vie

                    System.out.println("Au tour du joueur 1, que faites vous? (attack/spell/chill)");
                    String reponse = "";
                    reponse = sc.next();
                    if (reponse.equals("attack")) {
                        Integer attack1 = dmg.get(0);
                        hpBoss = hpBoss - attack1;
                        System.out.println(hugo.getBossName() + " a subi" + attack1 + "point de dégats");
                        if(hpBoss <= 0 ){
                            System.out.println("Félicitation vous avez vaincu " + hugo.getBossName());
                            return;
                        }
                    }
                    else if (reponse.equals("chill")) {
                        System.out.println("Vous passez votre tour !");
                    }
                    else if (reponse.equals("spell")) {

                        return;
                    }

                    System.out.println("Au tour du joueur 2, que faites vous? (attack/spell/chill");
                    String reponse2 = "";
                    reponse2 = sc.next();
                    if(reponse2.equals("attack")) {
                        Integer attack2 = dmg.get(1);
                        hpBoss = hpBoss - attack2;
                        System.out.println(hugo.getBossName() + " a subi" + attack2 + "point de dégats");
                        if (hpBoss <= 0) {
                            System.out.println(hugo.getBossName() + " est vaincu ! Félicitation !");
                            return;
                        }
                    }
                    else if (reponse2.equals("chill")) {
                        System.out.println("Vous passez votre tour !");
                    }
                    else if (reponse2.equals("spell")) {
                    }

                    System.out.println("Au tour du boss");
                    if (hpBoss > 200) {
                        System.out.println(hugo.getBossName() + " passe à l'attaque");
                        teamHp = teamHp - dmgBoss;
                        System.out.println(hugo.getBossName() + " vous a infligez " + dmgBoss + " de dégats");
                        if (teamHp <= 0) {
                            return;
                        }
                    } else {
                        teamHp = teamHp - dmgBoss * 3;
                        System.out.println(hugo.getBossName() + " S'énerve et vous a infligez " + dmgBoss*3 + "de dégats");
                    }
                    String reponse3 = "";
                    System.out.println("Au tour du joueur 3, que faites vous? (attack/spell/chill");
                    reponse3 = sc.next();
                    if (reponse3.equals("attack")) {
                        Integer attack3 = dmg.get(2);
                        hpBoss = hpBoss - attack3;
                        System.out.println(hugo.getBossName() + " a subi" + attack3 + " point de dégats");
                        if (hpBoss <= 0) {
                            System.out.println(hugo.getBossName() + " est vaincu ! Félicitation !");
                            return;
                        }
                    }
                    if (reponse3.equals("chill")) {
                        System.out.println("Vous passez votre tour !");
                    }
                    if (reponse3.equals("spell")) {
                    }
                    System.out.println("Au tour du boss");
                    if (hpBoss > 200) {
                        System.out.println(hugo.getBossName() + "passe à l'attaque");
                        teamHp = teamHp - dmgBoss;
                        System.out.println(hugo.getBossName() + " vous a infligez " + dmgBoss + " de dégats");
                        System.out.println("Il vous reste" + teamHp + " points de vie");
                        if (teamHp <= 0) {
                            return;
                        }
                    } else {
                        teamHp = teamHp - dmgBoss * 3;
                        System.out.println(hugo.getBossName() + " S'énerve et vous a infligez " + dmgBoss*3 + " de dégats");
                    }

                }
            }
         else {
            System.out.println("Lâcheee !!!!!");
        }


    }
}
