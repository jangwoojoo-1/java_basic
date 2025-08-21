package BookMarketProject.com.market.main;

import BookMarketProject.com.market.cart.Cart;
import BookMarketProject.com.market.member.User;
import BookMarketProject.com.market.operation.MenuOperation;

import java.util.Scanner;

public class Welcome {
    public static void main(String[] args) {
        MenuOperation menu = new MenuOperation();
        menu.run();
    }
}
