public class Main {
    public static void main(String[] args) {
        int sex = 2;
        int age = 25;
        System.out.println("こんにちは。");
        if (sex == 0) {
            System.out.println("私は男です。");
            System.out.println(age + "歳です。");
        } else if (sex == 1) {
            System.out.println("私は女です。");
            System.out.println("年齢は秘密です。");
        } else {
            System.out.println("性別と年齢は秘密です。");
        }
        System.out.println("よろしくお願いします！");
    }
}
