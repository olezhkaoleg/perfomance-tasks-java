import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        int a = 0;
        int b = 0;
        int r = 0;

        Scanner in = new Scanner(System.in);
        System.out.print("Input circle data address: ");
        String address1 = in.nextLine();
        System.out.print("Input points data address: ");
        String address2 = in.nextLine();
        in.close();
        try(FileReader reader = new FileReader(address1))
        {
            int c;
            String data = "";
            while((c=reader.read())!=-1){
                data += (char)c;

            }
            String[] dataarray = data.split("\n");
            String[] dataarray2 = dataarray[0].split(" ");
            a = Integer.parseInt(dataarray2[0]);
            b = Integer.parseInt(dataarray2[1].replaceAll("[^0-9]", ""));
            r = Integer.parseInt(dataarray[1].replaceAll("[^0-9]", ""));
        }
        catch(IOException ex){

            System.out.println(ex.getMessage());
        }
        try(FileReader reader1 = new FileReader(address2))
        {
            int c1;
            String data1 = "";
            while((c1 = reader1.read())!=-1){
                data1 += (char)c1;

            }
            String[] dataarray1 = data1.split("\n");
            for(String i : dataarray1){
                int x = Integer.parseInt(i.split(" ")[0].replaceAll("[^0-9]", ""));
                int y = Integer.parseInt(i.split(" ")[1].replaceAll("[^0-9]", ""));
                double d = Math.sqrt(Math.pow((x - a),2) + Math.pow((y - b),2));
                if (d < r){
                    System.out.println("1 - точка внутри");
                } else if(d == r){
                    System.out.println("0 - точка на окружности");
                } else{
                    System.out.println("2 - точка снаружи");
                }
            }

        }
        catch(IOException ex){

            System.out.println(ex.getMessage());
        }


    }
}