package generics;

public class Student {
    Integer age;
    String name;

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Student(Integer age, String name) {
        this.age = age;
        this.name = name;
    }
    @Override
    public String toString() {
        return name;
    }

    
    
}
