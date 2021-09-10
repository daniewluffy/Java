package ListaVI_ex03;


import java.util.ArrayList;
import java.util.List;

public class Invoice{
    public Adress adress;
    public Customer customer;
    
    ArrayList<Transactions> transactions = new ArrayList<>();

    public Invoice(Adress adress, Customer customer) {
        this.adress = adress;
        this.customer = customer;
    }
 
}
