package ListaVI_ex03;

import java.time.LocalDate;

public class Customer {
    public String name;
    public int id;
    public LocalDate birth;

    public Customer(String name, int id, LocalDate birth) {
        this.name = name;
        this.id = id;
        this.birth = birth;
    }
       
}
