import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class Client {

    public static void main(String[] args) throws IOException, InterruptedException {

        System.out.println("Type MENIU to see possible operations");
        BufferedReader reader;
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request;
        HttpResponse<String> response;
        while(true) {
            reader =  new BufferedReader(new InputStreamReader(System.in)); 
            String operation = reader.readLine();
            if(operation.equals("EXIT"))
                break;
            if(operation.equals("MENIU")) {
                System.out.println("EXIT - to close");
                continue;
            }
        }
    }
}