import java.util.ArrayList;
import java.util.List;

public class Method {
     List<Product> products = new ArrayList<>();
//
//    static {
//        products.add(new Product(1, "iphone", "kss", 2, "dd"));
//        products.add(new Product(2, "iphone", "kss", 2, "dd"));
//        products.add(new Product(4, "iphone", "kss", 2, "dd"));
//
//
//    }

    public boolean daTrung(int id) {
        for (Product a : products) {
            if (id == a.getiD()) {
                return true;
            }
        }
        return false;
    }
    public void add(Product product){
        products.add(product);
    }
    public void display() {
        for (Product p: products
             ) {
            System.out.println(p.toString());
        }
    }

}
