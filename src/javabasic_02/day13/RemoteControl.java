package javabasic_02.day13;

public interface RemoteControl {
    public static final int MAX_VOLUME = 30;
    public static final int MIN_VOLUME = 0;

    public void turnOn();
    public void turnOff();

    public void setVolume(int volume);
    public void setMute(boolean mute);

//    default void setMute(boolean mute){
//        if(mute){
//            System.out.println("무음처리 작동 시작");
//            setVolume(MIN_VOLUME);
//        } else {
//            System.out.println("무음 해제");
//        }
//    coolDown();
//    }

    //정적 메서드
    static void changeBattery(){
        System.out.println("리코콘 건전지를 교환해야 합니다.");

        //정적필드 접근 가능
        System.out.println(RemoteControl.MIN_VOLUME);
        //인스턴스, 디폴트 메서드 호출 불가, private 메서드 호출 불가
        //private static 메서드는 호출 가능

    }

    private void coolDown(){

    }
}
