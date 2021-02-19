/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package revcaneta4;

/**
 *
 * @author ti
 */
public class RevCaneta4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Caneta c1 = new Caneta();
        c1.setModelo("Bic");
        c1.setPonta(0.5f); //f por que é float
        c1.status();
    }
    
}
