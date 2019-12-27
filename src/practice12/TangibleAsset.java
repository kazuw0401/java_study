package practice12;

public abstract class TangibleAsset extends Asset implements Thing {
    private String name;
    private int price;
    private String color;
    private double weight;

    //    コンストラクタ
    public TangibleAsset(String name, int price, String color) {
        super(name, price);
        this.color = color;
    }

    //    フィールドにgetterメソッドを設定
    public String getColor() {
        return this.color;
    }
    public double getWeight() {
        return this.weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }
}
