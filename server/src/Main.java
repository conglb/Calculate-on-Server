import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.ServerSocket;
import java.nio.Buffer;

public class Main {

    public static int gcd(int a, int b) {
        if (b == 0) return a;
        return gcd(b, a % b);
    }

    public static int lcm(int a, int b) {
        if (a > b) {
            int tmp = a;
            a = b;
            b = tmp;
        }
        return a * b / gcd(a,b);
    }

    public static void main(String args[]) throws IOException {
        // Serversocket initlize at 12345 port
        ServerSocket serverSocket = new ServerSocket(12345);

        // Ready listen and process when client come
        while (true) {
            Socket socket = serverSocket.accept();

            PrintWriter out = new PrintWriter(socket.getOutputStream(), true);
            BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));

            int a = Integer.parseInt(in.readLine());

            int b = Integer.parseInt(in.readLine());

            out.println(lcm(a, b));

            socket.close();
        }

        // Serversocket close
        //serverSocket.close();

    }
}
