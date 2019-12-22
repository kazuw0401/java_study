import practice6.First;
import practice8.Cleric;

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
    public static void main(String[] args) {
        Cleric c = new Cleric();
        c.name = "Tom";
        c.hp = 100;
        c.mp = 10;

        c.selfRecover();
        c.pray(new Random().nextInt(3));
    }
}
