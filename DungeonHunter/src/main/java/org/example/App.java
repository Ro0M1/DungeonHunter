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
    public static void main( String[] args )
    {
        List<TANK> tank = new ArrayList<>();
        List<DPS> dps = new ArrayList<>();
        List<HEAL> heal = new ArrayList<>();


        System.out.println("Combien souhaitez-vous de joueurs? (Pas plus de 5!)");
        Scanner sc = new Scanner(System.in);
        int saisie = 0;
        boolean verif =false;

        while(!verif) {
            try {
                saisie = sc.nextInt();
                verif = true;

            } catch (InputMismatchException e) {
                System.out.println("Votre saisie est incorrecte ,veuillez recommencer");
                sc.next();
            }
        }

        if (saisie<=0 || saisie>5) {
            System.out.println ("Nombre de joueurs incorrect");
        }

        int HealCount = 0; int DpsCount= 0; int TankCount = 0;
        //int totalplayer= 0;//HealCount + DpsCount + TankCount;
        int i = 1;
        while (i <= saisie){
            String rep = "";
            String nom = "";
            System.out.println("Joueur " + i + ": choisis ta spécialisation! DPS, HEAL ou TANK");
            rep = sc.next();
            System.out.println("Ton nom?");
            nom = sc.next();
            if (rep == "HEAL"){
                HealCount++;
                heal.add(new HEAL());
                Player Joueur = new HEAL(nom,300, 0, 300, "Soigneurs");
                System.out.println(Joueur);
            }
            else if (rep == "TANK"){
                TankCount++;
                tank.add(new TANK());
                Player Joueur = new TANK(nom, 800, 0, 0,"Dégâts réduits");
                System.out.println(Joueur);
            }
            else if (rep == "DPS"){
                DpsCount ++;
                dps.add(new DPS());
                Player Joueur = new DPS(nom, 100, 500, 0, " Inflige des dégâts");
                System.out.println(Joueur);
            }
            i++;
        }
        System.out.println(saisie);
        if (saisie>=0 && saisie<3){
            Boss boss1 =  new Boss( 100, "Gargantua",500);
            System.out.println(boss1);
        }
        else if (saisie >= 3){
            Boss boss2 =  new Boss( 200, "Baptiste",700);
            System.out.println(boss2);
        } else if (saisie == 5) {
            Boss boss3 =  new Boss( 300, "hugo",900);
            System.out.println(boss3);
        }
    }

    public void fight
}
