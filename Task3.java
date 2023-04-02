import com.google.gson.Gson;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;
import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Input data address: ");
        String address1 = in.nextLine();
        in.close();
        StringBuilder jsonStringBuilder = new StringBuilder();

        try (BufferedReader reader = new BufferedReader(new FileReader(address1))) {
            String line;
            while ((line = reader.readLine()) != null) {
                jsonStringBuilder.append(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        String jsonString = jsonStringBuilder.toString();
        System.out.println(jsonString);
        class Test {
            private int id;
            private String title;
            private String value;
            private List<Test> values;

            public int getId() {
                return id;
            }

            public String getTitle() {
                return title;
            }

            public String getValue() {
                return value;
            }

            public List<Test> getValues() {
                return values;
            }
        }
        }
        class Value{
            public String id;
            public String value;

        }
        Gson g = new Gson();
    }
}


