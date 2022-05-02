import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int count = Integer.parseInt(br.readLine());

        for (int i = 0; i < count; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            double x1 = Double.parseDouble(st.nextToken());
            double y1 = Double.parseDouble(st.nextToken());
            double r1 = Double.parseDouble(st.nextToken());
            double x2 = Double.parseDouble(st.nextToken());
            double y2 = Double.parseDouble(st.nextToken());
            double r2 = Double.parseDouble(st.nextToken());

            double distance_xy = Math.sqrt(Math.pow(x1 - x2, 2) + Math.pow(y1 - y2, 2));
            double distance_r_plus = r1 + r2;
            double distance_r_minus = r1 >= r2 ? r1 - r2 : r2 - r1;

            if (distance_xy == 0 && distance_r_minus == 0) {
                sb.append(-1).append("\n");
            } else if (distance_xy == distance_r_plus || distance_xy == distance_r_minus) {
                sb.append(1).append("\n");
            } else if (distance_xy > distance_r_plus || distance_xy < distance_r_minus) {
                sb.append(0).append("\n");
            } else {
                sb.append(2).append("\n");
            }
        }

        System.out.print(sb);
    }
}