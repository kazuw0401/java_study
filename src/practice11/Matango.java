package practice11;

import practice8.Cleric;

public class Matango {
    int hp = 50;
    private char suffix;

    public Matango(char suffix) {
        this.suffix = suffix;
    }

    public void attack(Cleric c) {
        System.out.println("キノコ" + this.suffix + "の攻撃");
        System.out.println("10のダメージ");
        c.setHp(c.getHp() - 10);
    }
}
