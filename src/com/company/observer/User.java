package com.company.observer;
import com.company.observer.Observer;
import java.util.List;
import java.util.Scanner;

public class User implements Observer {

    Scanner scan = new Scanner(System.in);
    private String login;


    public User(String login){
        this.login = login;
    }
    @Override
    public void update(List<String> artists) {
        System.out.println("Dear "+login+" we have some news for you");
        System.out.println(artists);
    }
}
