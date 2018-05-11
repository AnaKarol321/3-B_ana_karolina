/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifro;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

/**
 *
 * @author 04503322257
 */
public class MenuPrincipalController implements Initializable {

    @FXML
    private Label label;
    @FXML
    private Label txtnumero1;
    @FXML
    private Label txtnumero3;
    @FXML
    private Label txtresultado;
    @FXML
    private TextField txtnuemero2;
    @FXML
    private Button btnSoma;

      
      
    private void Soma(ActionEvent event) {
       Double num1 = Double.parseDouble(txtnumero1.getText());
       Double num2 = Double.parseDouble(txtnumero3.getText());
       Double Resultado  = num1 + num2;
      
       txtresultado.setText(Resultado.toString());
    }
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
   public void abrirCadastroAluno(ActionEvent event) {
try{
    FXMLLoader fxmlLoader = new FXMLLoader();
    fxmlLoader.setLocation(getClass().getResource("Aluno.fxml"));
    Scene scene = new Scene(fxmlLoader.load(),900,682);
    Stage stage = new Stage();
    stage.setTitle("Cadastrar Aluno");
    stage.setScene(scene);
    stage.show();
}
catch(IOException e){

}
   

}
}

