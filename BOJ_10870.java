import java.io.*;

public class Main {

    static int result;

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int num = Integer.parseInt(br.readLine());

        sb.append(fibonacci(num));
        System.out.print(sb);
    }

    static int fibonacci(int num) {
        if (num == 0) {
            result = 0;
        } else if (num == 1) {
            result = 1;
        } else {
            result = fibonacci(num - 1) + fibonacci(num - 2);
        }

        return result;
    }
}