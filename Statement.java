import java.util.Enumeration;

 public abstract class Statement {
    
    public abstract String value(Customer aCustomer);

    public abstract String header(Customer aCustomer);

    public abstract String body(Rental each);

    public abstract String footer(Customer aCustomer);

}
