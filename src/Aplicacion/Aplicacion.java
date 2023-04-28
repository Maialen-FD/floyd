/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Aplicacion;
import javax.swing.UIManager;
 import javax.swing.UnsupportedLookAndFeelException;
/**
 *
 * @author Lenovo
 */
 public class Aplicacion
 {
 public static void main(String args[])
   {
       try
        {
          UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
        } catch (ClassNotFoundException e)
          {
             e.printStackTrace();
          } catch (InstantiationException e)
          {
            e.printStackTrace();
          } catch (IllegalAccessException e)
          {
            e.printStackTrace();
          } catch (UnsupportedLookAndFeelException e)
          {
            e.printStackTrace();
          }
         Ventana miVentana;
         Logica logica;
 
         miVentana=new Ventana();
         logica=new Logica();
   }
 }