package WebView;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.web.WebEngine;
import javafx.scene.web.WebView;

public class MainController implements Initializable{
    
    @FXML private WebView webView;
    private WebEngine engine; 
    
    @Override
    public void initialize(URL location, ResourceBundle resources) {
        engine = webView.getEngine();
    }
    
    public void btn1(ActionEvent evt){
        engine.load("https://www.google.com");
    }
    
    public void btn2(ActionEvent evt){
        engine.executeScript("window.location = \"https://www.youtube.com/watch?v=t4ehYIynI34//\";");
    }
    public void btn3(ActionEvent evt){
        engine.loadContent("<html><body><h1>Hello</h1></body></html>");
    }
    public void btn4(ActionEvent evt){
        engine.reload();
    }
    
}
