package java_advanced_01.day20.optinonalEx;

import java.util.Optional;

public class OptionalEx02 {
    public static void main(String[] args) {
        String str = "Hello Optional!"; // str null 값이 아닌 문자열을 할당
        Optional<String> optStr = Optional.of(str);
        System.out.println(optStr);
        //of() : 값이 null이 아닌 경우에만 Optional 객체 생성

        String nullStr = null;
        Optional<String> optNull = Optional.ofNullable(nullStr);
        System.out.println(optNull);
        //ofNullable() : 값이 null일 수 있을 때 래핑에서 nullpointException 해결

        Optional<String> emptyOptional = Optional.empty();
        System.out.println(emptyOptional);
        //빈 객체는 optional.empty()로


    }
}
