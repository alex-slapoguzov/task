import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

public class Tests {
    FibonacciNumbers fibonacciNumbers = new FibonacciNumbers();
    int count = 10;
    String textToCheck = "1 1 2 3 5 8 13 21 34 55 89 144 233 377 610  ";
    String path = "C:\\New folder\\index.txt";

    @Test
    public void testListWithFibonacciNumbers(){
        List<Integer> list =  new ArrayList<Integer>();
          list =  fibonacciNumbers.listWithFibonacciNumbers(count);
        Assert.assertEquals(list.size(), count, "Number of elements is not equal to the specified");
    }

    @Test
    public void testReadFibonacciNumbers(){
      String text =  fibonacciNumbers.readFibonacciNumbers(path);
        Assert.assertEquals(text, textToCheck);

    }
}
