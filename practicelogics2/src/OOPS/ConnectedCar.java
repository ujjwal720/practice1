package OOPS;





import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;
import java.nio.charset.Charset;
import java.util.Scanner;

 

public class ConnectedCar {

 

//    public static void main(String[] args) throws UnknownHostException, IOException, InterruptedException {
//        ConnectedCar.ClientCall("Test,Test1");
//    }

 

    protected static Socket clientSocket;
    protected static PrintWriter out;
    protected static BufferedReader in;

 

    public static String ClientCall(String message,int limit,int duration) throws UnknownHostException, IOException, InterruptedException {

 

// 
//
//        Scanner scanner = new Scanner(System.in);
//        String message = "";

 

        ConnectedCar client = new ConnectedCar();
        clientSocket = new Socket("104.211.160.43", 23000);
        System.out.println("$$$$$$$$$$$$ Connected: " + clientSocket.isConnected());
        out = new PrintWriter(clientSocket.getOutputStream(), true);
        in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
        client.sendMessage("chaaat");
        int i = 0;
        while (true) {
//            message = scanner.nextLine();

 

//            if (message.equals("exit")) {
//                client.stopConnection();
//                break;
//            } else if (!message.isEmpty()) {

 

            // String[] str = message.split(",");
            // int i = 0;
            // for (i = 0; i < str.length; i++) {

 

//                    String response = client.sendMessage(str[i]);
            String response = client.sendMessage(message);
            System.out.println(new String(response.getBytes(Charset.defaultCharset())));
            Thread.sleep(duration);
            // }
            // if (i == str.length) {
            // message = "exit";
            // }
            if (i == limit) {
                break;
            }
            i++;
//            }
        }

 

        return "### " + client.getClientSocket().isConnected();
//         System.out.println("### " + client.getClientSocket().isConnected());
    }

 

    public String sendMessage(String msg) throws IOException {
        out.println(msg);
        String str = in.readLine();
        return str;
    }

 

    public void stopConnection() throws IOException {
        in.close();
        out.close();
        clientSocket.close();
    }

 

    public Socket getClientSocket() {
        return clientSocket;
    }
}
