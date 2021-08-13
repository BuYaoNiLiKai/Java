package learn10InnerClass.demo6;

public class DemoGame {
    public static void main(String[] args) {

        Hero hero=new Hero();
        hero.setName("艾希");
//        hero.setSkill(new SkillImpl());
        hero.setSkill(new Skill(){

            @Override
            public void use() {
                System.out.println("Biu~Pia");
            }
        });
        hero.attack();
    }
}
