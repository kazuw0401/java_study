//練習10
package practice10;

import practice8.Cleric;

public class Wizard {
    private int hp;
    private int mp;
    private String name;
    Wand wand;

    public void heal(Cleric c) {
        int basePoint = 10;
        int recovPoint = (int) (basePoint * this.getWand().getPower());

        c.setHp(c.getHp() + recovPoint);
        System.out.println(c.getName() + "のHPを" + recovPoint + "回復した！");
    }

    public int getHp() {
        return this.hp;
    }

    public void setHp(int hp) {
        if (hp < 0) {
            this.hp = 0;
        } else {
            this.hp = hp;
        }
    }

    public int getMp() {
        return this.mp;
    }

    public void setMp(int mp) {
        if (mp < 0) {
            throw new IllegalArgumentException("MPは0以上に設定する必要があります。");
        }
        this.mp = mp;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        if (name == null) {
            throw new IllegalArgumentException("名前を入力してください。");
        }
        else if (name.length() < 3) {
            throw new IllegalArgumentException("杖の名前は3文字以上入力してください。");
        } else {
            this.name = name;
        }
    }

    public Wand getWand() {
        return this.wand;
    }

    public void setWand(Wand wand) {
        if (wand == null) {
            throw new IllegalArgumentException("杖の名前を入力してください。");
        } else {
        this.wand =wand;
        }
    }
}
