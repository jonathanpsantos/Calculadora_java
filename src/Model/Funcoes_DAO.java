/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import javax.swing.JOptionPane;

/**
 *
 * @author manager
 */
public class Funcoes_DAO {  
  
 
public static void soma(){

    String num1 = View.Home_GUI.valor1_txt.getText();
     int valor1 = Integer.parseInt(num1);
   
    String num2 = View.Home_GUI.valor2_txt.getText();
    int valor2 = Integer.parseInt(num2);
      
   int res1 = valor1 + valor2;
   
    View.Home_GUI.resultado_txt.setText(String.valueOf(res1));
   
   

} 
public static void menos(){

    String num1 = View.Home_GUI.valor1_txt.getText();
     int valor1 = Integer.parseInt(num1);
   
    String num2 = View.Home_GUI.valor2_txt.getText();
    int valor2 = Integer.parseInt(num2);
      
   int res1 = valor1 - valor2;
   
    View.Home_GUI.resultado_txt.setText(String.valueOf(res1));
   
   } 
public static void mult(){

    String num1 = View.Home_GUI.valor1_txt.getText();
    double valor1 = Integer.parseInt(num1);
   
    String num2 = View.Home_GUI.valor2_txt.getText();
    double valor2 = Integer.parseInt(num2);
      
    double res1 = valor1 * valor2;
   
    View.Home_GUI.resultado_txt.setText(String.valueOf(res1));
   

} 
public static void div(){

    String num1 = View.Home_GUI.valor1_txt.getText();
    double valor1 = Integer.parseInt(num1);
   
    String num2 = View.Home_GUI.valor2_txt.getText();
    double valor2 = Integer.parseInt(num2);
      
    double res1 = valor1 / valor2;
   
    View.Home_GUI.resultado_txt.setText(String.valueOf(res1));
   
   

    
} 

}