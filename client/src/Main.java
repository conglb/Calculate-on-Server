import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.InetAddress;
import java.net.Socket;
import java.nio.Buffer;
import java.util.Scanner;

public class Main {

    public static void main(String args[]) throws Exception {
        Socket socket = new Socket(InetAddress.getLocalHost().getHostAddress(), 12345);

        PrintWriter out = new PrintWriter(socket.getOutputStream(), true);
        BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));

        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        out.println(a);
        out.println(b);

        String response;
        while ((response = in.readLine()) != null) {
            System.out.println(response);
        }

        socket.close();
        scanner.close();
        in.close();
        out.close();
    }
}
