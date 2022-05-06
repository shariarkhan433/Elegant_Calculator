package branch;

public class branch_feature {
    String name, id;
    float gpa;
    int age;

    public branch_feature(String name, String id, float gpa, int age) {
        this.name = name;
        this.id = id;
        this.gpa = gpa;
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public float getGpa() {
        return gpa;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setGpa(float gpa) {
        this.gpa = gpa;
    }

    public void setName(String name) {
        this.name = name;
    }
}
