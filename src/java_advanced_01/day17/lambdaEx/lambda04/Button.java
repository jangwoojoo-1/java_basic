package java_advanced_01.day17.lambdaEx.lambda04;

public class Button {
    static interface ClickListener {
        void onClick();
    }

    private ClickListener clickListener;

    public void setClickListener(ClickListener clickListener) {
        this.clickListener = clickListener;
    }

    public void click(){
        this.clickListener.onClick();
    }

    public static void main(String[] args) {
        Button buttonCL = new Button();
        buttonCL.setClickListener(()->{
            System.out.println("Cancel 버튼 클릭!");
        });

        buttonCL.click();
    }
}
