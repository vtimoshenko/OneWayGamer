package com.rzd.pktb.OneWayGamer;

import com.rzd.pktb.SPSGame.gameSPS;
import com.rzd.pktb.SPSGame.playerSPS;

import java.util.Random;

/**
 * Игрок всегда делающий один ход в рамках игры
 * Created by SimpleUser on 18.06.2016.
 */
public class oneWayGamer implements playerSPS {

    private int step;

    public oneWayGamer() {
        Random rand = new Random();
        int st = rand.nextInt(3);
        switch (st){
            case 0 : step = gameSPS.PAPER; break;
            case 1 : step = gameSPS.SCISSORS; break;
            case 2 : step = gameSPS.STONE; break;
        }
    }

    @Override
    public int fight() {
        return step;
    }

    @Override
    public void result(int i, int i1) {

    }

    @Override
    public String about() {
        return "Пользователь, который ходит всегда одним, произвольно выбранным знаком!";
    }
}
