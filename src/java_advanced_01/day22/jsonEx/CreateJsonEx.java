package java_advanced_01.day22.jsonEx;

import org.json.JSONArray;
import org.json.JSONObject;

import java.io.FileWriter;
import java.io.Writer;
import java.nio.charset.Charset;

public class CreateJsonEx {
    public static void main(String[] args) {
        //1. json 객체 생성
        JSONObject root = new JSONObject();

        //2. 객체에 속성 추가
        root.put("Id", "jjw");
        root.put("Name", "주장우");
        root.put("password", "123456");

        //3. 복합 속성 추가
        JSONObject tel = new JSONObject();
        tel.put("home", "1388888888");
        tel.put("mobile", "0101-1112-1818");
        root.put("tel", tel);

        JSONArray skill = new JSONArray();
        skill.put("JAVA");
        skill.put("HTML");
        skill.put("JPA");
        root.put("skill", skill);

        // 배열 속성 추가


        //4. JSON 얻기
        String Json = root .toString();


        //5. 콘솔에 출력
        System.out.println(Json);

        //6. 파일에 저장
        try (Writer writer = new FileWriter("jjw.json", Charset.forName("UTF-8"))){
            writer.write(Json);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
