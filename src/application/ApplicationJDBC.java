package application;

import java.util.Locale;

import javafx.application.Application;
import javafx.stage.Stage;
import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Seller;

public class ApplicationJDBC extends Application {
    public static void main(String[] args) throws Exception {

        Locale.setDefault(Locale.US);
        SellerDao sellerDao = DaoFactory.createSellerDao();

        System.out.println("=== TEST 01 === Seller findById ===");
        Seller seller = sellerDao.findById(3);
        System.out.println(seller);
 
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
    
    }
}

