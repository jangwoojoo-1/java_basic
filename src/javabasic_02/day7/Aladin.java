package javabasic_02.day7;



public class Aladin {
    public static void main(String[] args) {
        Book 전지적독자시점 = new Book();
        System.out.println(전지적독자시점);
        전지적독자시점.title = "전지적 독자 시점";
        전지적독자시점.author = "싱숑";
        전지적독자시점.company = "비채";
        전지적독자시점.price = 13500;

        Book 견우와선녀 = new Book();
        견우와선녀.title = "견우와 선녀";
        견우와선녀.author = "안수민";
        견우와선녀.company = "아르테팝";
        견우와선녀.price = 18800;

        Book[] 판타지  = new Book[2];

        판타지 [0] = 전지적독자시점;
        판타지[1] = 견우와선녀;

    // 주소에 대한 참조를 통한 간접 접근
        System.out.println(판타지[1].title);
        System.out.println(판타지[1].author);
        System.out.println(판타지[1].price);

        System.out.println(전지적독자시점.title);
        System.out.println(전지적독자시점.author);
        System.out.println(전지적독자시점.company);
        System.out.println(전지적독자시점.price);
    }
}
