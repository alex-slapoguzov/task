public class Main {
    public static void main(String[] args) {
        String path = "C:\\New folder\\index.txt";
        FibonacciNumbers fibonacciNumbers = new FibonacciNumbers();
        fibonacciNumbers.writeFibonacciNumbers(fibonacciNumbers.listWithFibonacciNumbers(15), path);
        System.out.println(fibonacciNumbers.getListWithFibonacciNumbers(fibonacciNumbers.readFibonacciNumbers(path)));
        System.out.println(fibonacciNumbers.checkFibonacciNumbersFromFile(fibonacciNumbers.getListWithFibonacciNumbers(fibonacciNumbers.readFibonacciNumbers(path))));

    }
}

