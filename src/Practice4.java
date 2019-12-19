public class Practice4 {
    public static void main(String[] args) {
//        int[] points = new int[4];
//        double[] weights = new double[5];
//        boolean[] answers = new boolean[3];
//        String[] names = new String[3];

//        練習4-2
//        int[] moneyList = {121902, 8302, 55100, 230000};
//        通常のfor文
//        for (int i = 0; i < moneyList.length; i++) {
//            System.out.println(moneyList[i]);
//        }

//        拡張for文
//        for (int i : moneyList) {
//            System.out.println(i);
//        }

//        練習4-4
        int[] numbers = {5, 8, 6};
        System.out.println("1ケタの数字を入力してください。");
        int input = new java.util.Scanner(System.in).nextInt();
//        入力した値が配列の中の値と一致すればアタリと表示
        for (int n :numbers) {
            if (input == n) {
                System.out.println(("アタリです！"));
            }
        }

    }
}
