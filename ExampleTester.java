import static org.junit.Assert.*;

import java.io.BufferedReader;
import java.io.FileReader;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class ExampleTester {
    @Test
    @DisplayName("Testing file writing")

    public static void testFileWrite(){
        FileWriter fw = new FileWriter();
        try{
            fw.writeToFile("ajfjdasliojasf", "testFile");
            BufferedReader br = new BufferedReader(new FileReader("file.txt"));
            StringBuilder sb = new StringBuilder();
            String line = br.readLine();

            while (line != null) {
                sb.append(line);
                sb.append(System.lineSeparator());
                line = br.readLine();
            }

            br.close();

            String everything = sb.toString();
            assertEquals(everything, "ajfjdasliojasf");
        } catch (Exception e) {}
    }
}
