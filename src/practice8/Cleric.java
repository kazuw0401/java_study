package practice8;

import java.util.Random;

//最大HPと最大MPは静的フィールドにて宣言
public class Cleric {
    public String name;
    public int hp = 50;
    protected  static final int MAX_HP = 50;
    public int mp = 10;
    protected static final int MAX_MP = 10;

//    コンストラクタ宣言
//    司祭の名前、HP、MPが入力されている場合はその値を代入
    public Cleric(String name, int hp, int mp) {
        this.name = name;
        this.hp = hp;
        this.mp = mp;
    }

//    司祭の名前、HPのみ入力されている場合はその値を代入
    public Cleric(String name, int hp) {
        this(name, hp, Cleric.MAX_HP);
    }

//    司祭の名前のみ入力されている場合はその値を代入
    public Cleric(String name) {
        this(name, Cleric.MAX_HP);
    }



    public void selfRecover() {
            System.out.println(this.name + ":集気法");
            this.mp -= 5;
            hp = Cleric.MAX_HP;
            System.out.println(this.name + "のHPが最大まで回復！");
    }

    public int pray(int second) {
            System.out.println(this.name + "は呼吸を整えて" + second + "秒瞑想した。");
            int mpRecover = new Random().nextInt(3) + second;
            int mpRecoverResult = Math.min(Cleric.MAX_MP - this.mp, mpRecover);
            this.mp += mpRecoverResult;
            System.out.println(this.name + "のMPが" + mpRecoverResult + "回復！");
            return mpRecoverResult;
    }
}

