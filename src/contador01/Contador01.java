/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package contador01;

/**
 *
 * @author eduar
 */
public class Contador01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int aa = 1;
        while (aa<=4){
            System.out.println("Cambalhota" + (aa));
            aa++;
        }
        
       int bb = 0;
        while (bb<=10){
            bb++;
            if (bb == 5 || bb == 7){
                continue;
            }
            System.out.println("Cambalhota" + (bb));
}
    
    int cc = 0;
        while (cc<10){
            cc++;
            if (cc == 2 || cc == 3 || cc == 4){
                continue;
            }
            if (cc == 7){
                break;
            }
            System.out.println("Cambalhota" + (cc));
       
    }
    
    }
}
    

