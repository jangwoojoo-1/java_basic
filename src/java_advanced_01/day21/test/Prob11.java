package java_advanced_01.day21.test;

import java.io.*;

// 문제 11: 간단한 메모장 (덮어쓰기 모드 vs 이어쓰기 모드)
//       사용자가 입력한 내용을 memo.txt에 저장하는 프로그램을 작성하세요.
//       "append" 모드를 선택하면 기존 내용 뒤에 이어쓰기,
//       "overwrite" 모드를 선택하면 새로 쓰기 기능을 수행합니다.
public class Prob11 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("쓰기 모드 선택 (append / overwrite): ");
        String mode = br.readLine();

        boolean append = mode.equalsIgnoreCase("append");

        BufferedWriter bw = new BufferedWriter(new FileWriter("C:/Temp/memo.txt", append));

        System.out.println("메모 내용을 입력하세요 (exit 입력 시 종료):");
        String line;
        while (!(line = br.readLine()).equals("exit")) {
            bw.write(line);
            bw.newLine();
        }

        bw.close();
        br.close();
        System.out.println("memo.txt 저장 완료!");
    }
}
