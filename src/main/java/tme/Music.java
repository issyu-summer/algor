package tme;

import lombok.Data;

import java.util.Date;

/**
 * @author summer
 * @see <a href=""></a><br/>
 */
@Data
public class Music {
    private Long id;
    private String name;
    private String author;
    private String info;
    private Date date;
    private Integer score;
}
