package practice10;

public class Wand {
    private String name;
    private  double power;

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPower() {
        return this.power;
    }

    public void setPower(double power) {
        if (power < 0.5 || power > 100.0) {
            throw new IllegalArgumentException("杖の魔力の増幅率を0.5以上、100.0未満にしてください。");
        }
        this.power = power;
    }
}
