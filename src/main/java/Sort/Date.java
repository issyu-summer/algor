package sort;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author summer
 * @see <a href=""></a><br/>
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Date implements Comparable<Date>{


    private int day;
    private int month;
    private int year;


    @Override
    public int compareTo(Date that) {
        int yCompared = Integer.compare(year, that.year);
        int mCompared=Integer.compare(month, that.month);
        int dCompared=Integer.compare(day, that.day);
        if(yCompared!=0){
            return yCompared;
        }
        if(mCompared!=0){
            return mCompared;
        }
        return dCompared;
    }
}
