package javabasic_02.day13.afternoon;

import java.util.ArrayList;
import java.util.Vector;

public class User {
    public static void main(String[] args) {
        RemoteControl rc = new smartTelevision();
        rc.turnOn();
        rc.turnOff();

        Searchable searchable = new smartTelevision();
        searchable.search("https://www.naver.com");
    }
}
