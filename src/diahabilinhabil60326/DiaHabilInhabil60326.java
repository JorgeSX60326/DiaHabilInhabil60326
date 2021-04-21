/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package diahabilinhabil60326;

import java.util.Scanner;

/**
 *
 * @author Jun
 */
public class DiaHabilInhabil60326 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    
        int DiaSemana;
        String NumDia = null;
        String NumDia2 = null;
        Scanner DiaEscaneado = new Scanner (System.in);
        System.out.println("Introduzca un dia de la semana del 1 al 7 (1 para lunes hasta 7 para domingo)");
        DiaSemana = DiaEscaneado.nextInt();
        
        if (DiaSemana > 0 && DiaSemana <= 7){
        switch (DiaSemana){
            case 1:
               NumDia = "Lunes";
               NumDia2 = "Hábil";
               break;
            case 2:
               NumDia = "Martes";
               NumDia2 = "Hábil";
               break;
            case 3:
               NumDia = "Miercoles";
               NumDia2 = "Hábil";
               break;
            case 4:
               NumDia = "Jueves";
               NumDia2 = "Hábil";
               break;
            case 5:
               NumDia = "Viernes";
               NumDia2 = "Hábil";
               break;
            case 6:
               NumDia = "Sábado";
               NumDia2 = "Inhábil";
               break;
            case 7:
               NumDia = "Domingo";
               NumDia2 = "Inhábil";
               break;
            default:
                
                break;
        }
        System.out.println("El dia " + NumDia + " es un dia: " + NumDia2);
        }else {
         System.out.println("Verifique que haya escogido un numero entre 1 a 7");
        }
    
    }
}