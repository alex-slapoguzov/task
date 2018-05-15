import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class FibonacciNumbers {

    File file = new File("C:\\New folder\\index.txt");


    public List<Integer> listWithFibonacciNumbers(int count) {
        int n0 = 1;
        int n1 = 1;
        int n2;
        ArrayList<Integer> list = new ArrayList();
        list.add(n0);
        list.add(n1);

        if (count < 2) {
            System.out.println("Enter the correct value");
        } else if (count == 2) {
            return list;
        } else if (count > 2) {
            for (int i = 2; i < count; i++) {
                n2 = n0 + n1;
                list.add(n2);
                n0 = n1;
                n1 = n2;
            }
            return list;
        }

        return list;


    }

    public void writeFibonacciNumbers(List<Integer> list) {
        StringBuffer text = new StringBuffer();
        for (Integer number : list) {
            text = text.append(number.toString());
            text = text.append(" ");
        }


        try {
            FileWriter fileWriter = new FileWriter(file);
            fileWriter.write(String.valueOf(text));
            fileWriter.close();
        } catch (IOException ex) {

            System.out.println(ex.getMessage());
        }


    }

    public String readFibonacciNumbers() {

        BufferedReader reader = null;

        try {
            reader = new BufferedReader(new FileReader(file));
            String s;
            StringBuilder sb = new StringBuilder();
            while ((s = reader.readLine()) != null) {
                sb.append(s + " ");
                return sb.toString();
            }


            reader.close();

        } catch (FileNotFoundException e1) {
            e1.printStackTrace();
        } catch (IOException e1) {
            e1.printStackTrace();
        }
        return null;

    }


    public List<Integer> getListWithFibonacciNumbers(String text) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        String[] masString;

        masString = text.split(" ");
        for (String a : masString) {

            int x;
            x = Integer.parseInt(a);
            list.add(x);

        }
        return list;

    }

    public boolean checkFibonacciNumbersFromFile(List<Integer> list){
        boolean result = false;
        for (int i = list.size(); i > 3; i--){
            if ( list.get(list.size()-1) == ( list.get(list.size() - 2) + list.get(list.size() - 3)))    {
                result = true;
            }
       }
        return result;

    }
}






