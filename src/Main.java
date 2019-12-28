import practice10.Wand;
import practice10.Wizard;
import practice11.PoisonMatango;
import practice6.First;
import practice8.Cleric;
import practice13.A;
import practice13.B;
import practice13.Y;

import java.util.Random;

public class Main {
//    public static void main(String[] args) {
//        System.out.println("数あてゲーム");
//        int ans = new java.util.Random().nextInt(10);
//        for (int i = 0; i < 5; i++) {
//            System.out.println("0～9の数字を入力してください。");
//            int num = new java.util.Scanner(System.in).nextInt();
//            System.out.println(ans); // 確認のため、ランダム生成された数を出力
//            if (ans == num) {)
//                System.out.println("アタリ！");
//                break; // アタリの場合、途中で終了させる上で必要。
//            } else {
//                System.out.println("違います。");
//            }
//        }
//        System.out.println("ゲームを終了します。");
//    }

//    練習6
//    public static void main(String[] args) throws Exception {
//        First.introduceMyself();
//        practice6.Second.showMessage1();
//        practice6.Second.showMessage2();
//        Thread.sleep(3000);
//        practice6.Third.betrayMessage();
//    }

//    練習8
//    public static void main(String[] args) {
//        Cleric c = new Cleric();
//        c.name = "Tom";
//        c.hp = 100;
//        c.mp = 10;
//
//        c.selfRecover();
//        c.pray(new Random().nextInt(3));
//    }

//    練習9
//    public static void main(String[] args) {
//        コンストラクタ宣言をしているので、インスタンス作成時にname,hp,mpの引数を設定
//        Cleric c = new Cleric("Tom", 100, 10);
//        c.name = "Tom";
//        c.hp = 100;
//        c.mp = 10;

//        c.selfRecover();
//        c.pray(new Random().nextInt(3));

//        Wizard wiz = new Wizard();
//        wiz.setName("Mary");
//        wiz.setHp(40);
//        wiz.setMp(20);
//
//        Wand w = new Wand();
//        w.setName("水晶の杖");
//        w.setPower(5.0);
//
//        System.out.println("司祭の名前：" + c.name);
//        System.out.println("司祭のHP：" + c.hp);
//        System.out.println("司祭のMP：" + c.mp);
//
//        System.out.println("魔法使いの名前：" + wiz.getName());
//        System.out.println("魔法使いのHP：" + wiz.getHp());
//        System.out.println("魔法使いのMP：" + wiz.getMp());
//        System.out.println("杖の名前：" + w.getName());
//        System.out.println("杖の増幅：" + w.getPower());
//
//        PoisonMatango pm = new PoisonMatango('A');
//        pm.attack(c);

//    }

//    練習13
    public static void main(String[] args) {
        Y[] array = new Y[2];
        array[0] = new A();
        array[1] = new B();
        for (Y y : array) {
            y.a();
            y.b();
        }
    }
}
