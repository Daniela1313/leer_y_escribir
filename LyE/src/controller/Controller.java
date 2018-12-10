package controller;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import model.Model;
import view.View;

public class Controller implements ActionListener
{
    private final Model model;
    private final View view;
    
    public Controller(View view, Model model)    
    {
        this.view = view;
        this.model = model;
        view.jmi_leer.addActionListener(this);
        view.jmi_escribir.addActionListener(this);
        initView();
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==view.jmi_leer){
            model.setPath("C:\\Users\\Dany\\Documents\\Leer\\leeryescribir.txt");
            model.readFile(model.getPath());      
            view.jta_txt.setText(model.getMessage());
        }else if(e.getSource()==view.jmi_escribir){
            model.setPath("C:\\Users\\Dany\\Documents\\Leer\\leeryescribir.txt");
            model.setMessage(view.jta_txt.getText());
            model.writeFile(model.getPath(), model.getMessage());
        }
    }
    private void initView() 
    {
        view.setTitle("Archivo!");
        view.setResizable(false);
        view.setLocationRelativeTo(null);
        view.setVisible(true);
    }
}
       