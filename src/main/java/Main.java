public class Main {
    public static void main(String[] args) {
        FibonacciNumbers fibonacciNumbers = new FibonacciNumbers();
     //  fibonacciNumbers.writeFibonacciNumbers(fibonacciNumbers.listWithFibonacciNumbers(15));


        System.out.println(fibonacciNumbers.getListWithFibonacciNumbers(fibonacciNumbers.readFibonacciNumbers("C:\\New folder\\index.txt")));
        System.out.println(fibonacciNumbers.checkFibonacciNumbersFromFile(fibonacciNumbers.getListWithFibonacciNumbers(fibonacciNumbers.readFibonacciNumbers("C:\\New folder\\index.txt"))));

        }
    }

