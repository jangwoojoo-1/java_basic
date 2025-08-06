package javabasic_02.day11.Inheritance.practice7;

public class Example04 {
    public static void main(String[] args) {
        SubSon objSon = new SubSon();
        SubDaughter objDaughter = new SubDaughter();

        objSon.printSon();
        System.out.println(objSon.FamilyName);
        System.out.println(objSon.houseAddress);
        objSon.printFather();
    }
}
