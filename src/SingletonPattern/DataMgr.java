package SingletonPattern;

import java.util.ArrayList;
import java.util.List;

public class DataMgr {
    List<Category> Categorys;
    List<Product> products;
    private static DataMgr instance = null;


    private DataMgr() {
        Categorys = new ArrayList<>();
        products = new ArrayList<>();
    }

    public static DataMgr getInstance(){
        if (instance == null){
            instance = new DataMgr();
        }
        return instance;
    }

    public List<Category> getCategorys() {
        return Categorys;
    }

    public void setCategorys(List<Category> categorys) {
        Categorys = categorys;
    }

    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }
    

    
    
}
