package java_advanced_01.day17.lambdaEx.lambda03;

public class Button {
    //정적 멤버 인터페이스
    public static interface ClickListener{
        void onClick();
    }

    private ClickListener clickListener;

    public void setClickListener(ClickListener listener){
        this.clickListener = listener;
    }

    public void click(){
        this.clickListener.onClick();
    }

    public static void main(String[] args) {
        Button buttonOk = new Button();

        buttonOk.setClickListener(()->{
            System.out.println("Ok 버튼을 클릭!");
        });

        //Ok 버튼 클릭
        buttonOk.click();
    }
}
