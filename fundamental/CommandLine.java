package fundamental;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class CommandLine {
    public static void main(String[] args) throws IOException, InterruptedException {
        String parsedArgs = Arrays.stream(args).reduce("", (acc, cur) -> (acc + cur + " "));
        System.out.println(parsedArgs);
        Process process = Runtime.getRuntime().exec("yt " + parsedArgs);
        // Read the output of the command
        BufferedReader reader = new BufferedReader(new InputStreamReader(process.getInputStream()));
        String line = null;
        while ((line = reader.readLine()) != null) {
            System.out.println(line);
        }

        // Close BufferedReader
        reader.close();

        // Wait for the process to complete
        int exitCode = process.waitFor();
        System.out.println(exitCode);
    }
}
