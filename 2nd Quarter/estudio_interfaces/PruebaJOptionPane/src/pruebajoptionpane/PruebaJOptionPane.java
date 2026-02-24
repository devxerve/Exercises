/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebajoptionpane;

import javax.swing.JOptionPane;

/**
 *
 * @author anaibislopezvara
 */
public class PruebaJOptionPane {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
     // Ejemplos de uso del método JOptionPane.showMessageDialog
     
     JOptionPane.showMessageDialog(null, "Operación realizada", "Ventana1", JOptionPane.INFORMATION_MESSAGE);    
     // JOptionPane.showMessageDialog(null, "Operación realizada", "Ventana1", 1);    
     //JOptionPane.showMessageDialog(null, "Mensaje de ERROR", "Ejemplos Clase DI", JOptionPane.ERROR_MESSAGE);
     //JOptionPane.showMessageDialog(null, "Mensaje de ERROR", "Ejemplos Clase DI", 0);
     //JOptionPane.showMessageDialog(null, "Mensaje de WARNING_MESSAGE o 2","Ejemplos Clase DI", JOptionPane.WARNING_MESSAGE);
     //JOptionPane.showMessageDialog(null, "Mensaje de QUESTION_MESSAGE o 3", "Ejemplos Clase DI", JOptionPane.QUESTION_MESSAGE);    
     //JOptionPane.showMessageDialog(null, "Mensaje sin icono PLAIN_MESSAGE o -1", "Ejemplos Clase DI", -1);
     //JOptionPane.showMessageDialog(null, "Mensaje sin icono PLAIN_MESSAGE o -1", "Ejemplos Clase DI",JOptionPane.PLAIN_MESSAGE);
    
     //Ejemplos de uso del método JOptionPane.showInputDialog
     String inputValue = JOptionPane.showInputDialog("Please input a value"); 
     
     if (inputValue == null) {
          System.out.println("El usuario ha pulsado 'Cancelar' o ha cerrado la ventana.");
      } else if (inputValue.isEmpty()) {
          System.out.println("El usuario ha pulsado 'Aceptar' sin escribir nada.");
      } else {
          System.out.println("El usuario ha introducido: " + inputValue);
      }
     
      /* String nombre = JOptionPane.showInputDialog (null, "Ingrese su nombre: ", "DATOS",JOptionPane.PLAIN_MESSAGE);
      
      if (nombre == null) {
            System.out.println("El usuario ha pulsado 'Cancelar' o ha cerrado la ventana.");
        } else if (nombre.isEmpty()) {
             System.out.println("El usuario ha pulsado 'Aceptar' sin escribir nada.");
        } else {
             System.out.println("El usuario ha introducido: " + nombre);
      */
    

   /* en este caso, antes de ejecutar el parseInt, hay que validar antes que el showInputDialog no haya dado 
      valor null( Botón Cancelar) o cadena vacía (botón Aceptar sin teclear valor)

      String cadena = JOptionPane.showInputDialog(null,"Ingrese un número: ", "",JOptionPane.INFORMATION_MESSAGE);

      if (cadena == null) {
            System.out.println("El usuario ha pulsado 'Cancelar' o ha cerrado la ventana.");
        } else if (cadena.isEmpty()) {
             System.out.println("El usuario ha pulsado 'Aceptar' sin escribir nada.");
        } else {
            int numero = Integer.parseInt (cadena);
            System.out.println("Continuar la funcionalidad del programa");
            }
   */
    
     // Ejemplos de uso del método JOptionPane.showConfirmDialog
     
     /* int ventanaYesNotCancel = JOptionPane.showConfirmDialog(null, "¿Quieres salir del programa?", "CONFIRMACIÓN", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.WARNING_MESSAGE);
     
     if(ventanaYesNotCancel == 0) {
       System.out.println("Has pulsado Yes");
      }else if(ventanaYesNotCancel == 1){
        System.out.println("Has pulsado No");
      }else if(ventanaYesNotCancel == 2){
         System.out.println("Has pulsado Cancel");
     
     */
     
   /* int codigo=JOptionPane.showConfirmDialog(null, "¿Desea participar en el sorteo?", "Sorteo", JOptionPane.YES_NO_OPTION, JOptionPane.PLAIN_MESSAGE);
      if (codigo==JOptionPane.YES_OPTION){
          System.out.println("SI deseas participar en el sorteo");
        } else if(codigo==JOptionPane.NO_OPTION){
           System.out.println("SI deseas participar en el sorteo");
    
        }
    
      }
   */
} 
}