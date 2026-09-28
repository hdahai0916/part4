package part4.task3;

public class Archer implements Character {
    private final String name;
    private final String skill;

    public Archer() {
        this.name = "卫宫";
        this.skill = "Unlimited Blade Works";
    }

    @Override
    public void attack() {
        System.out.println("[弓兵] " + name + " 使用 " + skill + " 发动攻击！");
    }
}
