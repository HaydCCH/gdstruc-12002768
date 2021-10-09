package com.gdstruc.module2;

public class node {
    private linklist player;
    private node nextplayer;


    public node(linklist player) {
        this.player = player;
    }

    public linklist getPlayer() {
        return player;
    }

    public void setPlayer(linklist player) {
        this.player = player;
    }

    public node getNextplayer() {
        return nextplayer;
    }

    public void setNextplayer(node nextplayer) {
        this.nextplayer = nextplayer;
    }


}
