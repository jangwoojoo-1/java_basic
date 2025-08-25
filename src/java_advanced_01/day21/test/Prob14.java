package java_advanced_01.day21.test;

import java.io.*;
import java.util.Arrays;

//문제 : 정수 배열 {5,10,15,20} dmf array.dat에 저장한 후
// 다시 읽어 합계와 평균을 구하고 평균을 기준으로 정렬하여 콘솔에 출력하세요
public class Prob14 {
    public static void main(String[] args) {
        //1. 정수 뱅ㄹ {5, 10, 15, 20} ==> resource 저장 파일의 이름 지정

        int[] array = {5, 10, 15, 20};
        String filename = "C:/Temp/array.dat";

        // 2. 배열을 파일에 저장 로직 구현
        try(DataOutputStream dos = new DataOutputStream(new FileOutputStream(filename))){
            dos.writeInt(array.length); // 배열의 길이 먼저 저장
            for (int num : array) {
                dos.writeInt(num);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (Exception e){
            throw new RuntimeException(e);
        }

        // 3. 저장한 파일에서 배열 일기 로직 구현
        int[] readArray = null;
        try(DataInputStream dis = new DataInputStream(new FileInputStream(filename))){
            int length = dis.readInt();
            readArray = new int[length];
            for (int i = 0; i < length; i++) {
                readArray[i] = dis.readInt();
            }
        } catch (Exception e){
            throw new RuntimeException(e);
        }

        // 4. 배열에서 값을 요소를 모두 더하여 합계를 구하고 평균을 구함.
        if(readArray != null) {
            int sum = 0;
            for (int num : readArray) {
                sum += num;
            }
            double avg = (double) sum/ readArray.length;
            System.out.println(Arrays.toString(readArray));
            System.out.println(sum + " " + avg);
        }


        // 배열의 요소 순서대로 정렬해서 출력
        Arrays.sort(readArray);
        System.out.println(Arrays.toString(readArray));
    }
}
