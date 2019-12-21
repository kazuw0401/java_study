public class Practice5 {
//    練習5-1
//    public static void main(String[] args) {
//        introduceOneself();
//    }
//
//    public static void introduceOneself() {
//        String name = "takahashi";
//        int age = 25;
//        double height = 165.2;
//        char sex = '女';
//        System.out.println("私の名前は、" + name + "です");
//        System.out.println("年齢は、" + age + "です");
//        System.out.println("身長は、" + height + "です");
//        System.out.println("性別は、" + sex + "です");
//    }

//    練習5-2
//    public static void main(String[] args) {
//        String title = "来週の案件について";
//        String address = "test@test@jp";
//        String text = "お世話になっております。次回のミーティングは12/25（水）10:00から本社の第一会議室で行います。";
//        email(title, address, text);
//    }
//    public static void email(String title, String address, String text) {
//        System.out.println("「" + address + "」に、以下のメールを送信しました。");
//        System.out.println("件名:" + title);
//        System.out.println("本文:" + text);
//    }

    //    練習5-3
//    public static void main(String[] args) {
//        String title = "来週の案件について";
//        String address = "test@test@jp";
//        String text = "お世話になっております。次回のミーティングは12/25（水）10:00から本社の第一会議室で行います。";
//        email(address, text);
//    }
//    public static void email(String address, String text) {
//        System.out.println("「" + address + "」に、以下のメールを送信しました。");
//        System.out.println("本文:" + text);
//    }

    //練習5-4
    public static double calcTriangleArea(double bottom, double height) {
        double area = (bottom * height) / 2;
        System.out.println("三角形の底辺の長さが" + bottom + "cm、高さは" + height + "の場合、");
        return area;
    }

    public static double calcCircleArea(double radius) {
//        空白行を出力
//        System.out.println("");
        double area = (radius * radius) * 3.14;
        System.out.println("円の半径が" + radius + "の場合、");
        return area;
    }
    public static void main(String[] args) {
//        三角形の面積を算出
        double triangleArea = calcTriangleArea(8.0, 10.0);
        System.out.println("三角形の面積は、" + triangleArea + "㎡");

//        円の面積を算出
        double circleArea = calcCircleArea(10);
        System.out.println("円の面積は、" + circleArea + "㎡");

    }
}
