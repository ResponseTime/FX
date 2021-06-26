package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.stage.Stage;


import java.io.IOException;

public class control {
    @FXML
    private Parent root;
    private Stage stage;
    private Scene scene;
    @FXML
    Label labe;
    public void changeback(ActionEvent e) throws IOException{
        FXMLLoader loader = new FXMLLoader(getClass().getResource("sample.fxml"));
        root = loader.load();
        scene = new Scene(root);
        stage = (Stage)((Node)e.getSource()).getScene().getWindow();
        stage.setScene(scene);
        stage.show();
    }
    public void setPoints(String points){
        labe.setText(points);
    }
}
