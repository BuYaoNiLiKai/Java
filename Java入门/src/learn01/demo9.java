package learn01;

public class demo9 {
    String name;
    int id;
    char sex;

    public demo9(String name, int id, char sex) {
        this.name = name;
        this.id = id;
        this.sex = sex;
    }

    public demo9() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public char getSex() {
        return sex;
    }

    public void setSex(char sex) {
        this.sex = sex;
    }
}
