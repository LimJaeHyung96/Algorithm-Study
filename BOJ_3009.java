import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        String[] input1 = (br.readLine()).split(" ");
        String[] input2 = (br.readLine()).split(" ");
        String[] input3 = (br.readLine()).split(" ");

        int pointX = Integer.parseInt(input1[0]);
        int pointY = Integer.parseInt(input1[1]);
        int[] point2 = { Integer.parseInt(input2[0]), Integer.parseInt(input2[1]) };
        int[] point3 = { Integer.parseInt(input3[0]), Integer.parseInt(input3[1]) };

        if (pointX == point2[0]) {
            pointX = point3[0];
        } else if (pointX == point3[0]) {
            pointX = point2[0];
        }

        if (pointY == point2[1]) {
            pointY = point3[1];
        } else if (pointY == point3[1]) {
            pointY = point2[1];
        }

        sb.append(pointX).append(" ").append(pointY);
        System.out.print(sb);
    }
}