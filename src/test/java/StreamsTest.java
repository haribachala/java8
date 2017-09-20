import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static java.util.stream.Collectors.toList;

public class StreamsTest {

    @Test
    public void testEvenNumbersWithDistinct(){

        List<Integer> numbers= Arrays.asList(1,4,3,2,2,1);
        numbers.stream().filter(i-> i%2==0).distinct().forEach(System.out::println);

     }

    @Test
    public void testEvenNumbersWithDistinctAndLimit(){

        List<Integer> numbers= Arrays.asList(2,2,1,10,12,4);
         numbers.stream().filter(i-> i%2==0).distinct().limit(2).forEach(System.out::println);;
    }

    @Test
    public void testEvenNumbersWithDistinctAndSkip(){
              List<Integer> numbers= Arrays.asList(1,4,3,2,2,2,1,8);
               numbers.stream().filter(i-> i%2==0).skip(2).forEach(System.out::println);

    }
}
