import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Input data address: ");
        String address1 = in.nextLine();
        in.close();
        try (FileReader reader = new FileReader(address1)) {
            int c;
            String data = "";
            while ((c = reader.read()) != -1) {
                data += (char) c;

            }
            String[] dataarray = data.split("\n");
            int[] dataarrayint = new int [dataarray.length];
            for (int i = 0; i < dataarray.length; i++){
                dataarrayint[i] = Integer.parseInt(dataarray[i].replaceAll("[^0-9]", ""));
            }
            Arrays.sort(dataarrayint);
            int sum = 0;
            for(int i : dataarrayint){
                sum += Math.abs(dataarrayint[Math.round(dataarrayint.length / 2)] - i);
            }
            System.out.println(sum);
        }
         catch(IOException ex){
            System.out.println(ex.getMessage());
        }
    }
}
