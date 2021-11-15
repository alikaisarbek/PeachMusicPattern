package com.company.observer;

public interface Observable {
    void register(Observer observer);
    void unRegister(Observer observer);
    void notifyAllObservers();
}
