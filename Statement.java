import java.util.Enumeration;

 public abstract class Statement {
    
    public String value(Customer aCustomer){
        Enumeration rentals = aCustomer.getRentals();

        String result = header(aCustomer);

        while (rentals.hasMoreElements()) {
                Rental each = (Rental) rentals.nextElement();
                
                result += body(each);
        }

        result += footer(aCustomer);
        return result;
    }

    public abstract String header(Customer aCustomer);

    public abstract String body(Rental each);

    public abstract String footer(Customer aCustomer);

}
