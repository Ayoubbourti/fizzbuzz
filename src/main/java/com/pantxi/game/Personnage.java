package com.pantxi.game;

public class Personnage {
    private String orientation;


    public String tourner(int fois) {
        fois=fois%4;
        if(fois==1){orientation="EST";}
        else if (fois==2) {orientation="SUD";}
        else if (fois==3) { orientation = "OUEST";}
        else if (fois==4) { orientation="NORD";}

        return orientation;
    }

}

