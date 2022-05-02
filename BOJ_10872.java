import java.io.*;

public class Main {

    static int result = 0;

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int num = Integer.parseInt(br.readLine());

        sb.append(factorial(num));
        System.out.print(sb);
    }

    static int factorial(int num) {
        if (num == 0) {
            result = 1;
        } else if (num == 1) {
            result = num;
        } else {
            result = num * factorial(num - 1);
        }

        return result;
    }
}