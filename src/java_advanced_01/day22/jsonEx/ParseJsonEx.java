package java_advanced_01.day22.jsonEx;

import org.json.JSONArray;
import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.nio.charset.Charset;

//JSON에서 속성 순서는 중요하지 않음.
//따라서 추가한 순서대로 작성하지 않아도 상관없음
//그리고 줄바꿈 처리도 되지 않음.
// 네트워크의 전송량을 줄여주어 오히려 이 점이 장점이 되었다.
//.json 파일을 파싱하는 방법을 실습
public class ParseJsonEx {
    public static void main(String[] args) {
        // 파일로부터 JSON 읽어오기
        try(BufferedReader bufferedReader = new BufferedReader(
                new FileReader("jjw.json",
                        Charset.forName("UTF-8")))){
            String json = bufferedReader.readLine();
            JSONObject root = new JSONObject(json);

            //속성정보 읽기
            System.out.println(root.getString("Id"));
            System.out.println(root.getString("Name"));

            JSONObject obj = root.getJSONObject("tel");
            System.out.println(obj.getString("home"));
            System.out.println(obj.getString("mobile"));

            JSONArray skill = root.getJSONArray("skill");
            for(int i = 0; i < skill.length(); i++) {
                System.out.println(skill.getString(i));
            }
        } catch (IOException e){
            System.out.println(e.getMessage());
        } catch (Exception e){
            System.out.println(e.getMessage());
        }



    }
}
