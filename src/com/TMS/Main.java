package com.TMS;

public class Main {

    public static void main(String[] args) {
	IStart shutl = new Shuttle();
	Cosmodrom cosm = new Cosmodrom();
	cosm.launch (shutl);
IStart space = new SpaceX();
cosm.launch(space);
    }
}
