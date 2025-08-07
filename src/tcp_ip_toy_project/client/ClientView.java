package tcp_ip_toy_project.client;

import java.util.Scanner;

public class ClientView {
    public void printProducts(Product[] products){
        System.out.println("==============================================");
        System.out.printf(" 상품번호 \t | \t 이름 \t | 가격 \t | \t 수량 \n");
        for (Product product : products) {
            System.out.printf("%s \t | \t %s \t | %d \t | \t %d \n",
                    product.getProductNo(), product.getName(),
                    product.getPrice(), product.getCount());
        }
    }

    public int inputMenu(){
        System.out.println("==============================================");
        System.out.println("1.Create  |  2.Update  |  3.Delete  |  4.Exit");
        System.out.print("선택> ");
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        return n;
    }

}
