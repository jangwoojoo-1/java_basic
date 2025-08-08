package javabasic_02.day13;

public class User {
    public static void main(String[] args) {
        RemoteControl rc = null;
        rc = new Television();
        rc.turnOn();
        rc.turnOff();
        rc.setVolume(10);
        rc.setVolume(11);
        rc.setMute(true);
        RemoteControl.changeBattery(); //

        //리모컨을 통해서 청소기를 동작시키려 한다.
        //1. 전윈키고
        //2. 청소 시킨다.
        //3. 전원 끈다.
        rc = new Cleaner();
        rc.turnOn();
        ((Cleaner) rc).clean();
        rc.turnOff();

        System.out.println(RemoteControl.MAX_VOLUME);

        System.out.println(RemoteControl.MIN_VOLUME);
    }
}
