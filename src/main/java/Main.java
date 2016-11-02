/**
 * Created by sereo_000 on 02.11.2016.
 */
public class Main {
   // private static tls.Sender tlsSender = new tls.Sender("sereosil@gmail.com", "544d11eb");
    private static ssl.Sender sslSender = new ssl.Sender("sereosil@gmail.com", "544d11eb");


    public static void main(String[] args){
       // tlsSender.send("This is Subject", "TLS: This is text!", "support@devcolibri.com", "alex@devcolibri.com");
        sslSender.send("This is Subject", "TLS: This is text!", "support@devcolibri.com", "soton95@mail.ru");

    }
}
