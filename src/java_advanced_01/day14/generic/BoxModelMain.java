package java_advanced_01.day14.generic;

import java.util.ArrayList;
import java.util.List;

public class BoxModelMain {
    public static void main(String[] args) {

        BoxModel<String> boxModel = new BoxModel<>();
        //BoxModel<String> boxModel = new BoxModel<String>();

//        boxModel.box.add("배추");
//        boxModel.box.add("무");
//        boxModel.box.add("상추");
//        boxModel.box.add("삼겹살");

        boxModel.contents = new String[]{"배추", "무", "상추", "삼겹살"};

        for (String content : boxModel.contents) {
            System.out.println(content);
        }
    }
}
