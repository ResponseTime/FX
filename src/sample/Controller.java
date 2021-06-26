package sample;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;

import javafx.event.ActionEvent;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;

import java.io.IOException;

public class Controller {
    @FXML
    Label text;
    @FXML
    Label lab1;
    @FXML
    Label lab2;
    @FXML
    ImageView pic;
    int i =0;
    public int points = 0;
    Image img = new Image("Zephyrus Duo 15 x MDJ_top screen.jpg");

    public void plus(ActionEvent e){
        i++;
        points++;
        pic.setImage(img);
        pic.setFitHeight(i+120);
        pic.setFitWidth(i+120);
        lab2.setText(String.valueOf(points));
        text.setText(String.valueOf(i));

        if(i == 50){
            points+=50;
            lab1.setText("50 points");
        }
        else if(i == 100){
            points+=100;
            lab1.setText("100 points");
        }



    }
    private Parent root;
    private Scene scene;
    private Stage stage;
    public void change(ActionEvent e)throws IOException{
        FXMLLoader loader = new FXMLLoader(getClass().getResource("ui.fxml"));
        root = loader.load();
        stage = (Stage)((Node)e.getSource()).getScene().getWindow();
        control con = loader.getController();
        con.setPoints(String.valueOf(points));
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

}
