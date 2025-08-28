package java_advanced_01.day24.Thread;

public class ThreadEx01 {
    public static void main(String[] args) {
        //실행하는 스레드 객체 참조 얻기
        Thread mainThread = Thread.currentThread();
        System.out.println(mainThread.getName() + "실행");

        for(int i = 0 ; i < 3 ; i++){
            Thread theadA = new Thread(){
                @Override
                public void run() {
                    System.out.println(getName() + "실행");
                }
            };
            theadA.start(); //getName() 메서드는 Thread의 인스턴스 메서드로 스레드의 이름을 리턴
        }

        Thread chatThread = new Thread(){
            @Override
            public void run() {
                System.out.println(getName() + "실행");
            }
        };
        chatThread.setName("chatting-thread");
        chatThread.setPriority(Thread.MAX_PRIORITY);
        chatThread.start();

    }
}
