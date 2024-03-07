package PatternMatching;

public class PatternMatchingInstanceOf {

    //Pattern Matching for instance of
    public String getDetails(Object object) {
        String details="";
        if(object instanceof Product product){
            details = "Product" + product.id() + " " + product.productName() + " " + product.productCategory() + " " + product.productPrice();
        } else if (object instanceof Customers customers) {
            details = "Customers" + customers.customerName() + " " + customers.customerId();
        }
        return details;
    }
    //Record Patterns
    public String getDetails1(Object object) {
        String details="";
        if(object instanceof Product(Integer productId, String productName, String productCategory, Double productPrice )){
            details = "Product" + productId + " " + productName + " " + productCategory + " " + productPrice;
        } else if (object instanceof Customers customers) {
            details = "Customers" + customers.customerName() + " " + customers.customerId();
        }
        return details;
    }

}
