package practice10;

public class Hero {
    private String name;
    private int hp;
    private int mp;
    static final int MAX_HP = 50;
    static final int MAX_MP = 10;

    public String getName() {
        return this.name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public int getHp() {
        return this.hp;
    }
    public void setHp(int hp) {
        this.hp = hp;
    }

    public int getMp() {
        return this.mp;
    }
    public void setMp(int mp) {
        this.mp = mp;
    }
}
