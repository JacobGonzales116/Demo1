package mvc;

public class Cat {
    private String catName;
    private int age;

    public Cat(String catName, int age) {
        this.catName = catName;
        this.age = age;
    }

    @Override
    public String toString() {
        return getCatName();
    }

    // accessors

    public String getCatName() {
        return catName;
    }

    public void setCatName(String catName) {
        this.catName = catName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
