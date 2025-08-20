package board_project.board03;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

import java.util.Date;

@Data
@Builder
@AllArgsConstructor
public class Board {
    private int bno;
    private String title;
    private String author;
    private String content;
    private Date date;
}
