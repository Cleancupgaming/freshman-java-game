package Src.Game.Assets;

public class player {
    
    // player stats
    private int takenDamage;
    private int health;
    private int attack;
    private int defense;

    //player constructor
    player() {
        int health = 100;
        int attack = 10;
        int defense = 0;

    }

    public void hurt(int takenDamage) {
        this.takenDamage = takenDamage;

    }

}
