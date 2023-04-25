public class Member {
    private int ID;
    private String name;
    private int age;

    Member(int ID, String name, int age) {
        this.ID = ID;
        this.name = name;
        this.age = age;
    }

    public String toString() {
        return ("ID: " + this.getID() + ", name: " + this.getName() + ", age: " + getAge());
    }

    public int getID() {
        return this.ID;
    }


    public String getName() {
        return this.name;
    }

    public int getAge() {
        return this.age;
    }
}
