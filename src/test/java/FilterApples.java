import java.util.ArrayList;
import java.util.List;

public class FilterApples {

    public static void  filterApples(List<Apple> apples){

        List<Apple> greenApples =new ArrayList<>();
        for (Apple apple: apples){
            if ("green".equals(apple.getColor()))
                greenApples.add(apple);

        }

    }
}
