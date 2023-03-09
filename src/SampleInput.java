import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SampleInput {
    public static void main(String args[])throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Input a string: ");
        String a = br.readLine();
        System.out.println(a);
    }
}
