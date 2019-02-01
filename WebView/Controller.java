package WebView;

import java.io.BufferedReader;
import java.io.FileReader;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.web.WebEngine;
import javafx.scene.web.WebView;

public class Controller implements Initializable{
    
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
        
        engine.loadContent(leer());
    }
    public void btn4(ActionEvent evt){
        engine.reload();
    }
    
    private String leer(){
        String html = "";
        try {
            
            FileReader entrada = new FileReader("html.html");
            BufferedReader buffer = new BufferedReader(entrada);
            String linea = buffer.readLine();

            while(linea != null){
                    html += linea;
                    linea = buffer.readLine();
            }

            entrada.close();
            
        } catch (Exception e) {
                System.out.println(e); //naisu
        }
        return html;
    }
}
