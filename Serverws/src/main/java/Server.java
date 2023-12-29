import jakarta.xml.ws.Endpoint;
import ws.BanqueService;

/**
 * @author Dell Latitude 5420
 * IFRAH soumia
 **/
public class Server {
    public static void main(String[] args) {
        Endpoint.publish("http://0.0.0.0:2323/",new BanqueService());
        System.out.println("port demaree");
    }
}
