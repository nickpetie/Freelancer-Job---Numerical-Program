/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package numericalprogram;

/**
 *
 * @author nicholaspeterson
 */
public class NumericalProgram {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        View theView = new View();
        Controller theController = new Controller();
        Model theModel = new Model();
        
        theView.main();
    }
    
}
