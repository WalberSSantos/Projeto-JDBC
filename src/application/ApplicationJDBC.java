package application;

import javafx.application.Application;
import javafx.stage.Stage;
import model.entities.Department;

public class ApplicationJDBC extends Application {
    public static void main(String[] args) throws Exception {
        
        Department obj = new Department(1, "Books");
        System.out.println(obj);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        Department obj = new Department(1, "Books");
        System.out.println(obj);
        
    }
}
