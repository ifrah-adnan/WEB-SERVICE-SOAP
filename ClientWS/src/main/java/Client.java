import proxy.BanqueService;
import proxy.BanqueWs;
import proxy.Compte;

import java.util.List;

/**
 * @author Dell Latitude 5420
 * IFRAH soumia
 **/
public class Client {
    public static void main(String[] args) {
        BanqueService stup=new BanqueWs().getBanqueServicePort();
        System.out.println(stup.convertir(33));
        Compte c= stup.getCompte(2);
        System.out.println(c);
        System.out.println(c.getSolde());
        List<Compte> c2 = stup.getListCompte();
        System.out.println("Liste des Comptes:");
        for (Compte c3 : c2) {
            System.out.println(c3.getCode());
            System.out.println(c3.getSolde());
        }
    }
}
