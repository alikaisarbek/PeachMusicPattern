package com.company.factory;

import java.util.Scanner;

public class ChooseArtist {
    public void chooseartist(){
        Scanner scan= new Scanner(System.in);
        String text;
        int num;
        System.out.println("\nChoose one option:\n1-Olivia Rodrigo: good 4 you \n2-Bruno Mars: talking to the moon \n3-Ariana Grande: pov");
        num=scan.nextInt();
        if (num == 1){
            PlayArtist olivia = new OliviaArtist();
            olivia.turnartist();
        }
        else if (num == 2){
            PlayArtist bruno = new BrunoArtist();
            bruno.turnartist();
        }
        else if (num == 3){
            PlayArtist ariana = new ArianaArtist();
            ariana.turnartist();
        }
        else {
            System.out.println("Error");
        }
    }
}
