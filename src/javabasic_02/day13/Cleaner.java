package javabasic_02.day13;

public class Cleaner implements RemoteControl {
    @Override
    public void turnOn() {
        System.out.println("청소기 전원을 켰습니다.");
    }

    @Override
    public void turnOff() {
        System.out.println("청소기 전원을 껐습니다.");
    }

    public void clean() {
        System.out.println("10분 동안 청소를 진행합니다.");
    }

    @Override
    public void setVolume(int volume) {

    }

    @Override
    public void setMute(boolean mute) {

    }
}
