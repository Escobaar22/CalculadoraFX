package com.example.calculadorafx;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;


public class OperacionesController implements Initializable {

    @FXML
    private Button btnOperar;
    @FXML
    private TextField txtOp1;
    @FXML
    private TextField txtOp2;
    @FXML
    private TextField txtResultado;
    @FXML
    private RadioButton rbSumar;
    @FXML
    private RadioButton rbRestar;
    @FXML
    private RadioButton rbMultiplicar;
    @FXML
    private RadioButton rbDividir;

    @FXML
    protected void hacerOperacion(ActionEvent event) {
        try{
            int op1 = Integer.parseInt(this.txtOp1.getText());
            int op2 = Integer.parseInt(this.txtOp2.getText());

            Operaciones op = new Operaciones(op1, op2);

            if(this.rbSumar.isSelected()){
                this.txtResultado.setText(op.Suma()+"");
            }
            else if(this.rbRestar.isSelected()){
                this.txtResultado.setText(op.Resta()+"");
            }
            else if(this.rbMultiplicar.isSelected()){
                this.txtResultado.setText(op.Multiplicar()+"");
            }
            else if (this.rbDividir.isSelected()) {
                if(op2 == 0){
                    Alert alert = new Alert(Alert.AlertType.ERROR);
                    alert.setHeaderText(null);
                    alert.setTitle("Error");
                    alert.setContentText("No puedo dividir entre 0");
                    alert.showAndWait();
                }else{
                    this.txtResultado.setText(op.Dividir()+"");
                }
            }

        }catch(NumberFormatException e){
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setHeaderText(null);
            alert.setTitle("Error");
            alert.setContentText("Formato incorrecto");
            alert.showAndWait();
        }
    }





    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        ToggleGroup tg = new ToggleGroup();
        this.rbSumar.setToggleGroup(tg);
        this.rbRestar.setToggleGroup(tg);
        this.rbMultiplicar.setToggleGroup(tg);
        this.rbDividir.setToggleGroup(tg);
    }
}