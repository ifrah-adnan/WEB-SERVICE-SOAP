package ws;

import jakarta.jws.WebMethod;
import jakarta.jws.WebParam;
import jakarta.jws.WebService;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * @author Dell Latitude 5420
 * IFRAH soumia
 **/
@WebService(serviceName ="BanqueWs")
public class BanqueService {
    @WebMethod(operationName ="convertir")
    public double Converti( @WebParam(name = "montant") double mt){
        return mt*10.8;
    }
    @WebMethod
    public Compte getCompte(@WebParam int code){
        return  new Compte(code,Math.random(),new Date());
    }
    @WebMethod
    public List<Compte> getListCompte(){
        List<Compte> listeComptes = new ArrayList<>();

        // Add some sample accounts to the list (replace this with your actual logic)
        listeComptes.add(new Compte(1, Math.random(), new Date()));
        listeComptes.add(new Compte(2, Math.random(), new Date()));
        listeComptes.add(new Compte(3, Math.random(), new Date()));
        listeComptes.add(new Compte(4, Math.random(), new Date()));

        return listeComptes;
    }}
