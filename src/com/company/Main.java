package com.company;

import com.company.adapter.AdapterOS;
import com.company.decorator.Comparision;
import com.company.facade.PlayerOptions;
import com.company.factory.ChooseArtist;
import com.company.observer.Begin;
import com.company.state.MusicPlayer;


public class Main {
    public static void main(String[] args) {
//observer
		Begin star = new Begin();
		star.begin();
//adapter
		AdapterOS bb = new AdapterOS();
		bb.AdapterOS();
//decorator
		Comparision ss = new Comparision();
		ss.comparision();

//factory
		ChooseArtist aa = new ChooseArtist();
		aa.chooseartist();
//state
		MusicPlayer pp= new MusicPlayer();
		pp.MusicPlayer();
//facade
		PlayerOptions cc = new PlayerOptions();
		cc.PlayerOptions();

	}
}
