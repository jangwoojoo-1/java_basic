package java_advanced_01.day14;

public class ExceptionEx01 {
    public static void main(String[] args) {
        String[] array = {"100", "lOO"};

        try{
            for (int i = 0; i < array.length; i++) {
                String string = array[i];
                Integer number = Integer.parseInt(string);
                System.out.println(number);
            }
        }catch (ArrayIndexOutOfBoundsException e){
            e.getMessage();
        } catch (NumberFormatException e1){
            e1.getMessage();
        } catch (Exception e2){
            throw new RuntimeException(e2);
        }

        System.out.println("프로그램 종료");
    }
}
