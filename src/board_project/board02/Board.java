package board_project.board02;

import lombok.AllArgsConstructor;
import lombok.Builder;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@Builder
@NoArgsConstructor //default 생성자
@AllArgsConstructor //모든 argument를 매개변수로 받는 생성자
public class Board{
    private int bno;
    private String bTitle;
    private String bContent;
    private String bWriter;
    private Date bDate;
}
