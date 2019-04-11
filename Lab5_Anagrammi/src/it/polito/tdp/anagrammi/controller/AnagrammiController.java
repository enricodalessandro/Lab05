/**
 * Sample Skeleton for 'Anagrammi.fxml' Controller Class
 */

package it.polito.tdp.anagrammi.controller;

import java.net.URL;
import java.util.LinkedList;
import java.util.ResourceBundle;

import it.polito.tdp.anagrammi.model.Parola;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class AnagrammiController {

    @FXML // ResourceBundle that was given to the FXMLLoader
    private ResourceBundle resources;

    @FXML // URL location of the FXML file that was given to the FXMLLoader
    private URL location;

    @FXML // fx:id="txtField"
    private TextField txtField; // Value injected by FXMLLoader

    @FXML // fx:id="btnAnagrammi"
    private Button btnAnagrammi; // Value injected by FXMLLoader

    @FXML // fx:id="resultOk"
    private TextArea resultOk; // Value injected by FXMLLoader

    @FXML // fx:id="resulWrong"
    private TextArea resulWrong; // Value injected by FXMLLoader

    @FXML // fx:id="btnReset"
    private Button btnReset; // Value injected by FXMLLoader

    @FXML
    void doCalcola(ActionEvent event) {
    	String s= txtField.getText();
    	Parola parola =new Parola(s);
    	LinkedList <Parola> paroleCorrette=parola.trovaAnagrammiCorretti();
    	for (Parola p: paroleCorrette)
    		resultOk.appendText(p.toString()+"\n");
    	LinkedList <Parola> paroleErrate=parola.trovaAnagrammiErrati();
    	for (Parola p: paroleErrate)
    		resulWrong.appendText(p.toString()+"\n");
    	
    	

    }

    @FXML
    void doReset(ActionEvent event) {
    	resultOk.clear();
    	resulWrong.clear();
    	txtField.clear();
    }

    @FXML // This method is called by the FXMLLoader when initialization is complete
    void initialize() {
        assert txtField != null : "fx:id=\"txtField\" was not injected: check your FXML file 'Anagrammi.fxml'.";
        assert btnAnagrammi != null : "fx:id=\"btnAnagrammi\" was not injected: check your FXML file 'Anagrammi.fxml'.";
        assert resultOk != null : "fx:id=\"resultOk\" was not injected: check your FXML file 'Anagrammi.fxml'.";
        assert resulWrong != null : "fx:id=\"resulWrong\" was not injected: check your FXML file 'Anagrammi.fxml'.";
        assert btnReset != null : "fx:id=\"btnReset\" was not injected: check your FXML file 'Anagrammi.fxml'.";

    }
}
