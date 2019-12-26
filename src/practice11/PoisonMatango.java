package practice11;

import practice8.Cleric;

public class PoisonMatango extends Matango {
    private int poisonCount = 5;
    public PoisonMatango(char suffix) {
        super(suffix);
    }

    public void attack(Cleric c) {
        super.attack(c);
        if (this.poisonCount > 0) {
            System.out.println("さらに毒の胞子を散布！");
            int damage = c.getHp() / 5;
            c.setHp(c.getHp() - damage);
            System.out.println("司祭は" + damage + "ポイントのダメージを受けた");
            poisonCount--;
            System.out.println("毒の追加攻撃の残り回数:" + poisonCount + "回");
            System.out.println("司祭のHP:" + c.getHp());
        }
    }
}
