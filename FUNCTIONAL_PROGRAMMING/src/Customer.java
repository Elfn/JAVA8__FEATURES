import java.util.ArrayList;
import java.util.List;

/**
 * Created by Elimane on Feb, 2018, at 20:13
 */
public class Customer {
    private String name;
    private List<Product> products= new ArrayList<>();


    public void addProduct(Product p)
    {
        products.add(p);
    }

    public Customer(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }
}
