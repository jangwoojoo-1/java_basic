package java_advanced_01.day13.exceptionEx;

import java.util.InputMismatchException;
import java.util.Scanner;

public class RuntimeErrorEx {
//    public static void main(String[] args) {
//        try {
//            int array[] = {10, 20, 30};
//
//            //ArrayOutOfBoundsException
//            System.out.println(array[3]);
//
//            //Arithemetic Exception
//            System.out.println(12/0);
//
//            //NullPointerException: 정수가 아닌 문자열을 정수로 변환할 때 예외 발생
//            String str = null;
//            System.out.println(str.length());
//
//            //NumberFormatException
//            String str1 = "skdl";
//            System.out.println(Integer.parseInt(str1));
//
//            //ClassCastException: 타입변환은 상위클래스와 하위 클래스 간의 상속, 인터페이스 캐스팅
//            Integer num = 30;
//            Object x = num;
//            System.out.println((String)x);
//
//            //InputMissMatchException: 의도치 않은 입력오류가 발생할 때 예외
//            Scanner sc = new Scanner(System.in);
//            System.out.println("정수 3개를 입력하세요. ");
//            int num1 = sc.nextInt();
//            sc.close();
//        } catch (NumberFormatException e) {
//            throw new RuntimeException(e);
//        } catch (InputMismatchException e1){
//            throw new RuntimeException(e1);
//        } catch (ArrayIndexOutOfBoundsException e2){
//            throw new RuntimeException(e2);
//        }catch (ArithmeticException e3){
//            throw new RuntimeException(e3);
//        }catch (ClassCastException e4){
//            throw  new RuntimeException(e4);
//        } catch (RuntimeException e5){
//            e5.getMessage();
//        }catch (Exception e6){
//            e6.getMessage();
//        }catch (Throwable t){
//            t.getMessage();
//        }
//
//
//    }
}

//예외처리는 subclass => superclass로 확장하며 처리하는 것이 원칙
