package com.mycompany.tecnicasupi;

import java.text.DecimalFormat;
import javax.swing.JOptionPane;

public class Ingenieria {
    DecimalFormat df=new DecimalFormat("#.00");
    double promedio, parcial1, parcial2, examenfinal;
    //programacion,cáculo,ingles algebra

    public void programacion() {
        parcial1 = Double.parseDouble(JOptionPane.showInputDialog("Digite la nota del primer parcial"));
        parcial2 = Double.parseDouble(JOptionPane.showInputDialog("Digite la nota del segundo parcial"));
        examenfinal = Double.parseDouble(JOptionPane.showInputDialog("Digite la nota del examen final"));
        promedio = (parcial1 + parcial2 + examenfinal) / 3;

        JOptionPane.showMessageDialog(null, " El promedio es :" +(df.format( promedio)));
    }

    public void calculo() {
        parcial1 = Double.parseDouble(JOptionPane.showInputDialog("Digite la nota del primer parcial"));
        parcial2 = Double.parseDouble(JOptionPane.showInputDialog("Digite la nota del segundo parcial"));
        examenfinal = Double.parseDouble(JOptionPane.showInputDialog("Digite la nota del examen final"));
        promedio = (parcial1 + parcial2 + examenfinal) / 3;

        JOptionPane.showMessageDialog(null, " El promedio es :" +(df.format( promedio)));
    }

    public void ingles() {
        parcial1 = Double.parseDouble(JOptionPane.showInputDialog("Digite la nota del primer parcial"));
        parcial2 = Double.parseDouble(JOptionPane.showInputDialog("Digite la nota del segundo parcial"));
        examenfinal = Double.parseDouble(JOptionPane.showInputDialog("Digite la nota del examen final"));
        promedio = (parcial1 + parcial2 + examenfinal) / 3;

        JOptionPane.showMessageDialog(null, " El promedio es :" +(df.format( promedio)));
    }

    public void algebra() {
        parcial1 = Double.parseDouble(JOptionPane.showInputDialog("Digite la nota del primer parcial"));
        parcial2 = Double.parseDouble(JOptionPane.showInputDialog("Digite la nota del segundo parcial"));
        examenfinal = Double.parseDouble(JOptionPane.showInputDialog("Digite la nota del examen final"));
        promedio = (parcial1 + parcial2 + examenfinal) / 3;
        JOptionPane.showMessageDialog(null, " El promedio es :" +(df.format( promedio)));
    }
    
    public static void main(String[] args) {
     Ingenieria notas=new Ingenieria();
     int menu;
     do
         {
             menu=Integer.parseInt(JOptionPane.showInputDialog("Digite el promedio segun corresponda"
             +"\n 1) Programación "
             +"\n 2) Cálculo"
             +"\n 3) Ingles "
             +"\n 4) Algebra"
             +"\n 0) salir "));
             switch (menu) {
                 case 1:
                     notas.programacion();
                     break;
                 case 2:
                     notas.calculo();
                     break;
                 case 3:
                     notas.ingles();
                     break;
                 case 4:
                     notas.algebra();
               
             }
             
         }while (menu!=0);
         
    }
}
