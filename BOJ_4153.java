import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        while (true) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            int z = Integer.parseInt(st.nextToken());

            if (x == 0 && y == 0 && z == 0) {
                break;
            }

            if ((x * x + y * y) == z * z || (x * x + z * z) == y * y || (y * y + z * z) == x * x) {
                sb.append("right");
            } else {
                sb.append("wrong");
            }
            sb.append("\n");
        }

        System.out.print(sb);
    }
}