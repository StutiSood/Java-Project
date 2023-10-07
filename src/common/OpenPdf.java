/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package common;

import dao.PharmacyUtils;
import java.io.File;
import javax.swing.JOptionPane;

/**
 *
 * @author Acer
 */
public class OpenPdf {
    public static void openById(String id){
        try{
            if((new File(PharmacyUtils.billPath+id+".pdfkk")).exists()){
                Process p =Runtime
                        .getRuntime()
                        .exec("rundl32 url.dll,FileProtocolHandler "+PharmacyUtils.billPath+""+id+".pdf");
            }
            else{
                JOptionPane.showMessageDialog(null, "File does not exist");
            }    
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }
}
