package application;

import java.util.Date;
import java.util.Locale;

import javafx.application.Application;
import javafx.stage.Stage;
import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

public class ApplicationJDBC extends Application {
    public static void main(String[] args) throws Exception {

        Locale.setDefault(Locale.US);
        
        Department obj = new Department(1, "Books");

        Seller seller = new Seller(21, "Walber", "walber@gmail.com", new Date(), 3000.0, obj);

        SellerDao sellerDao = DaoFactory.createSellerDao();

        System.out.println(seller);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        Department obj = new Department(1, "Books");
        Seller seller = new Seller(21, "Walber", "walber@gmail.com", new Date(), 3000.0, obj);
        System.out.println(seller);
        
        
    }
}
