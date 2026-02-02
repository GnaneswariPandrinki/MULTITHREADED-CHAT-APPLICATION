import java.io.*;
import java.net.*;

public class chatclient {

    public static void main(String[] args) {
        String serverAddress = "localhost";
        int port = 12345;

        try {
            Socket socket = new Socket(serverAddress, port);
            System.out.println("Connected to chat server");

            BufferedReader serverInput = new BufferedReader(
                    new InputStreamReader(socket.getInputStream()));
            PrintWriter serverOutput = new PrintWriter(
                    socket.getOutputStream(), true);

            BufferedReader userInput = new BufferedReader(
                    new InputStreamReader(System.in));

            // Thread to receive messages
            new Thread(() -> {
                String msg;
                try {
                    while ((msg = serverInput.readLine()) != null) {
                        System.out.println("Message: " + msg);
                    }
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }).start();

            // Send messages
            String input;
            while ((input = userInput.readLine()) != null) {
                serverOutput.println(input);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
