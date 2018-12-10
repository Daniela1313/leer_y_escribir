
package main;
import view.View;
import model.Model;
import controller.Controller;

/**
 *
 * @author Dany
 */
public class Main {
private static View view;
    private static Model model;
    private static Controller controller;
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
            view = new View();
        model = new Model();
        controller = new Controller(view, model);
    }
} 
  




   