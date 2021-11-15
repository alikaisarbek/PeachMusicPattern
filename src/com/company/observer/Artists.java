package com.company.observer;

import java.util.List;
import java.util.ArrayList;

public class Artists implements Observable {
    private List<Observer> observers = new ArrayList<>();
    private List<String> artists = new ArrayList<>();

    public void addNews(String news){
        this.artists.add(news);
        notifyAllObservers();
    }
    @Override
    public void register(Observer observer) {
        this.observers.add(observer);
    }

    @Override
    public void unRegister(Observer observer) {
    this.observers.remove(observer);
    }

    @Override
    public void notifyAllObservers() {
    for(Observer observ : this.observers){
        observ.update(this.artists);
    }
    }
}
