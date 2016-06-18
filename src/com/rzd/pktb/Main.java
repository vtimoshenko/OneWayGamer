package com.rzd.pktb;

import com.rzd.pktb.OneWayGamer.oneWayGamer;

public class Main {

    public static void main(String[] args) {
        oneWayGamer gamer = new oneWayGamer();
        for (int i=0;i<100;i++)
        {
            System.out.println(gamer.fight());
        }
    }
}
