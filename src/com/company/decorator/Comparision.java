package com.company.decorator;
import java.util.Scanner;

public class Comparision {
    public void comparision(){
        Scanner scan= new Scanner(System.in);
        String text;
        int num;
        System.out.println("\nDo you want to add some background sounds?");
        text = scan.next();
        if(text.equals("Yes") || text.equals("yes")){
            System.out.println("Choose one option:\n1-Rain.\n2-Dark Noise.\n3-Ocean.");
            num=scan.nextInt();
            if(num==1){
                Song rainmelody= new Rain(new ArtistSong());
                rainmelody.equalizer();
                }
            else if(num==2){
                Song darknoise= new DarkNoise(new ArtistSong());
                darknoise.equalizer();
                }
            else if(num==3){
                Song oceanmelody= new Ocean(new ArtistSong());
                oceanmelody.equalizer();
               }
            else {
                System.out.println("error");
            }
        }
        else{
            System.out.println("Okay.");
        }

    }
    }

