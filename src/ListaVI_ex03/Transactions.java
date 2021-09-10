package ListaVI_ex03;

import java.time.LocalDate;

public class Transactions {
    public double value;
    public String description;
    public LocalDate date;

    public Transactions(double value, String description, LocalDate date) {
        this.value = value;
        this.description = description;
        this.date = date;
    }
        
}
