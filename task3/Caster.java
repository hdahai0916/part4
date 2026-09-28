package part4.task3;

public class Caster implements Character {
    private final String name;
    private final String skill;

    public Caster() {
        this.name = "美狄亚";
        this.skill = "Rho Aias";
    }

    @Override
    public void attack() {
        System.out.println("[法师] " + name + " 使用 " + skill + " 发动攻击！");
    }
}
