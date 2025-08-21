package java_advanced_01.day19;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString
@AllArgsConstructor
public class Product {
    //제품은 제품번호, 제품이름, 제조사, 가격이란 속성을 가지고 있다.
    private String no;
    private String name;
    private String company;
    private Integer price;
}
