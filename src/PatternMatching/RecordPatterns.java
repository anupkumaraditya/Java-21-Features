package PatternMatching;

record Product(Integer id,String productName, String  productCategory, Double productPrice){
}

record Customers(Integer customerId, String customerName){}

record Sales(Integer salesId,Double totalAmount){}

record Vendor(Integer vendorId){}

record Shop(Integer shopId, String shopName, Vendor vendor){}


class Product1{
    Integer id;
    String productName;
    String productCategory;
    Double productPrice;

    //then we need to create args, params, getter and setter
}

//Instead of this we can create a record
public class RecordPatterns {


}
