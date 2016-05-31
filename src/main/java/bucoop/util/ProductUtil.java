package bucoop.util;

import bucoop.model.Category;
import bucoop.model.Product;
import java.util.List;


public interface ProductUtil {
    
    boolean addProduct(String productname, String productdesc, Integer producer, Integer category);

    Product getProductById(Integer productID);
    
    List<Product> getProductList();
    
    List<Product> getProductListByItem(String searchitem);
    
    boolean deleteProduct(Integer productID);
    
    boolean addCategory(String categoryname);
    
    Category getCategoryById(Integer categoryID);
    
    List<Category> getCategoryList();
    
    List<Category> getCategoryListByItem(String searchitem);
    
}
