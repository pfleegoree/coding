import java.util.ArrayList;
import java.util.List;

public class NumberMagic {
    /**
     * This method generates a list of multiples of a given number less than a specified limit.
     * 
     * @param number the number to find multiples of
     * @param limit the upper bound for the multiples
     * @return a List of multiples of the number less than the limit
     */
    public List<Integer> determineMultiples(int number, int limit) {
       List<Integer> list = new ArrayList<Integer>();
       int i = 0;
       
       if(number <=0){
           return new ArrayList<>();
       }
       
        for (i=1; i<limit; i++)
        if (i%number == 0)
        list.add(i);    
         return list;         
    }
    
}
