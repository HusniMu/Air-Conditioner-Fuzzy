/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fuzzy;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

/**
 *
 * @author root
 */
public class FXMLDocumentController implements Initializable {
    
    @FXML
    private Label label;
    @FXML
    private Button button;

    @FXML
    private TextField Input1;

    @FXML
    private TextField Output;

    @FXML
    private TextField Input2;

    @FXML
    private TextField Input3;
    
    @FXML
    private void handleButtonAction(ActionEvent event) {
        String in1=null,in2=null,in3=null,output=null;
        in1=derajat_keanggotaan(Float.parseFloat(Input1.getText()));
        in2=derajat_keanggotaan(Float.parseFloat(Input2.getText()));
        in3=derajat_keanggotaan(Float.parseFloat(Input3.getText()));
        
        if(in1=="rendah"){
            if(in2=="rendah"){
                if(in3=="rendah"){
                    output="naik";
                }else if(in3=="sedang"){
                    output="naik";
                }else if(in3=="tinggi"){
                    output="naik";
                } else {
                    output="error";
                }
            }else if(in2=="sedang"){
                if(in3=="rendah"){
                    output="naik";
                }else if(in3=="sedang"){
                    output="tetap";
                }else if(in3=="tinggi"){
                    output="turun";
                } else {
                    output="error";
                }                
            }else if(in2=="tinggi"){
                if(in3=="rendah"){
                    output="naik";
                }else if(in3=="sedang"){
                    output="turun";
                }else if(in3=="tinggi"){
                    output="turun";
                } else {
                    output="error";
                }                
            }
             else {
                    output="error";
                }
        }else if(in1=="sedang"){
            if(in2=="rendah"){
                if(in3=="rendah"){
                    output="naik";
                }else if(in3=="sedang"){
                    output="naik";
                }else if(in3=="tinggi"){
                    output="turun";
                } else {
                    output="error";
                }
            }else if(in2=="sedang"){
                if(in3=="rendah"){
                    output="tetap";
                }else if(in3=="sedang"){
                    output="tetap";
                }else if(in3=="tinggi"){
                    output="turun";
                } else {
                    output="error";
                }                
            }else if(in2=="tinggi"){
                if(in3=="rendah"){
                    output="turun";
                }else if(in3=="sedang"){
                    output="turun";
                }else if(in3=="tinggi"){
                    output="turun";
                } else {
                    output="error";
                }                
            } else {
                    output="error";
                }            
        }else if(in1=="tinggi"){
            if(in2=="rendah"){
                if(in3=="rendah"){
                    output="naik";
                }else if(in3=="sedang"){
                    output="naik";
                }else if(in3=="tinggi"){
                    output="turun";
                } else {
                    output="error";
                }
            }else if(in2=="sedang"){
                if(in3=="rendah"){
                    output="turun";
                }else if(in3=="sedang"){
                    output="tetap";
                }else if(in3=="tinggi"){
                    output="turun";
                } else {
                    output="error";
                }                
            }else if(in2=="tinggi"){
                if(in3=="rendah"){
                    output="turun";
                }else if(in3=="sedang"){
                    output="turun";
                }else if(in3=="tinggi"){
                    output="turun";
                } else {
                    output="error";
                }                
            } else {
                    output="error";
                }            
        } else {
                    output="error";
                }
        Output.setText(output);
    }
    public String derajat_keanggotaan(float t){
        float rendah=0,sedang=0,tinggi=0;
        String status = null;
        if(t>0&&t<12){
            status="rendah";
        }else if(t>=12&&t<=16){
            rendah=(16-t)/4;
            sedang=(t-12)/4;
            if(rendah>=sedang){
                status="rendah";
            }else if(rendah<sedang){
                status="sedang";
            }
        }else if(t>=16&&t<=20){
            sedang=(20-t)/6;
            tinggi=(t-16)/6;
            if(sedang>=tinggi){
                status="sedang";
            }else if(sedang<tinggi){
                status="tinggi";
            }
        }else if(t>20){
            status="tinggi";
        } else {
            status="error";
        }
      return status;
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
