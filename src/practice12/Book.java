package practice12;

public class Book extends TangibleAsset {
    private String name;
    private int price;
    private String color;
    private String isbn;

//    コンストラクタ
    public Book(String name, int price, String color, String isbn) {
        super(name, price, color);
        this.isbn = isbn;
    }

//    フィールドにgetterメソッドを設定
    public String getIsbn() {
        return this.isbn;
    }
}
