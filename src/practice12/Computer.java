package practice12;

public class Computer extends TangibleAsset {
    private String name;
    private int price;
    private String color;
    private String makerName;

    //    コンストラクタ
    public Computer(String name, int price, String color, String makerName) {
        super(name, price, color);
        this.makerName = makerName;
    }

    //    フィールドにgetterメソッドを設定
    public String getMakerName() {
        return this.makerName;
    }
}
