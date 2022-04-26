import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        double radius = Double.parseDouble(br.readLine());

        sb.append(String.format("%.6f", Math.PI * Math.pow(radius, 2))).append("\n")
                .append(String.format("%.6f", 2.0 * Math.pow(radius, 2)));

        System.out.print(sb);
    }
}