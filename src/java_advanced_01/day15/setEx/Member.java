package java_advanced_01.day15.setEx;

public class Member {
    public String name;
    public int age;

    Member(String name, int age){
        this.name = name;
        this.age = age;
    }

    @Override
    public int hashCode() {
        return name.hashCode() + age;
    }

    @Override
    public boolean equals(Object obj) {
        if(obj instanceof Member target){
            return target.name.equals(name) && (target.age==age);
        }
        return false;
    }
}
