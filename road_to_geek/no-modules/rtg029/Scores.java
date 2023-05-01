import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.Charset;

public class Scores {

    public static void main(String[] args) {

        try (BufferedReader reader = new BufferedReader(new InputStreamReader(
                new FileInputStream("scores.csv"), Charset.forName("UTF-8")))) {

            String line;
            int index = 0;
            while ((line = reader.readLine()) != null) {
                if (index >= 0) {
                    String[] data = line.split(",");

                    if (data.length > 1) {
                        
                        System.out.print(data[0] + ",");
                        System.out.print(data[1] + ",");
                        System.out.print(data[2] + ",");
                        System.out.println(data[3]);
                    }
                }
                index++;
            }

        } catch (IOException e) {
            System.out.println("ファイル読み込みに失敗");
        }
    }
}