package javabasic_02.day13;

public class Television implements RemoteControl {
    private int volume;
    private int memoryVolume;

    @Override
    public void setVolume(int volume) {
        if (volume > RemoteControl.MAX_VOLUME) {
            this.volume = RemoteControl.MAX_VOLUME;
        } else if (volume < RemoteControl.MIN_VOLUME) {
            this.volume = RemoteControl.MIN_VOLUME;
        } else {
            this.volume = volume;
        }
        System.out.println("현재 TV 볼륨 : " + this.volume);
    }

    @Override
    public void turnOn() {
        System.out.println("TV 전원을 켠다.");
    }

    @Override
    public void turnOff() {
        System.out.println("TV 전원을 끈다.");
    }

    @Override
    public void setMute(boolean mute) {
        if (mute) {
            System.out.println("무음처리 작동 시작");
            this.memoryVolume = this.volume;
            setVolume(RemoteControl.MIN_VOLUME);
        } else {
            System.out.println("무음 해제");
            setVolume(this.memoryVolume);
        }

    }
}
