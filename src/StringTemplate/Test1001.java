package StringTemplate;

import org.w3c.dom.ls.LSOutput;

import static java.lang.StringTemplate.STR;

public class Test1001 {
    public static void main(String[] args){
        int id =1001;
        String productName = "TV";
        String json = STR."""
            {
                prodId :\{id},
                productName :\{productName}
            }
            """;
        System.out.println(json);
    }


}
