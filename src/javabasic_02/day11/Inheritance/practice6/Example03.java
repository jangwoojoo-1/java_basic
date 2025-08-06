package javabasic_02.day11.Inheritance.practice6;

public class Example03 {
    public static void main(String[] args) {
        SubSon objSon = new SubSon();

        objSon.printSon();
        System.out.println("나의 아버지는 " +objSon.familyName);
        System.out.println("나의 집은 " + objSon.houseAddress);
        objSon.printFather();
        objSon.printGrandFather();
    }
}
