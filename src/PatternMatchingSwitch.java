public class PatternMatchingSwitch {
    public String getDetails(Object object){
        return switch(object){
            case Product product->{
                yield "Product Details" + product.id() + " " + product.productName() + " " + product.productCategory() + " " + product.productPrice();
            }
            case Customers customers-> {
                yield "Customers" + customers.customerName() + " " + customers.customerId();
            }
            case Shop(Integer shopId, String shopName, Vendor(Integer vendorId)) -> {
                yield "Shop Details" + shopId + " " + shopName + " Vendor Id" + vendorId;
            }
            default -> throw new IllegalStateException("Unexpected value: " + object);
        };
    }

    public static void main(String[] args){
        Product product = new Product(1001,"Shampoo","Hair Product",50.00);
        Customers customers = new Customers(1001, "Bhaijaan");
        PatternMatchingInstanceOf patternMatchingInstanceOf = new PatternMatchingInstanceOf();
        System.out.println(patternMatchingInstanceOf.getDetails(product));
        System.out.println(patternMatchingInstanceOf.getDetails(customers));
    }
}
