package part4.task3;

public class Saber implements Character {
    private final String name;
    private final String skill;

    public Saber() {
        this.name = "阿尔托莉雅";
        this.skill = "Excalibur";
    }

    @Override
    public void attack() { 
        System.out.println("[剑士] " + name + " 使用 " + skill + " 发动攻击！");
     }
}
