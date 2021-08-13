package learn10InnerClass.demo6;

public class Hero {
    private String name;
    private Skill skill;

    public Hero() {
    }

    public Hero(String name, Skill skill) {
        this.name = name;
        this.skill = skill;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Skill getSkill() {
        return skill;
    }
public void attack(){
    System.out.println("我叫"+name+"开始释放技能");
    skill.use();
    System.out.println("释放完毕");
}
    public void setSkill(Skill skill) {
        this.skill = skill;
    }
}
