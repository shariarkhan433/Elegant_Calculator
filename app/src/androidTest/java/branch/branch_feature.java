package branch;

public class branch_feature {
    String name, id;
    float gpa;
    int income;

    public int getIncome() {
        return income;
    }

    public void setIncome(int income) {
        this.income = income;
    }

    branch_feature(String s, String s1, float f){
        this.name=s;
        this.id=s1;
        this.gpa=f;
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
