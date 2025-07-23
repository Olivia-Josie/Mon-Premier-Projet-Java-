package vue;

import javax.swing.*;

public class Fenetre extends JFrame {
    public Fenetre(){
        this.setTitle("Ma premiere fenetre");
        this.setSize(300,200);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setResizable(false);
        this.setVisible(true);
        JButton button1= new JButton("Ajouter");
        JButton button2= new JButton("Annuler");
        JPanel pan = new JPanel();
        this.setContentPane(pan);
        pan.add(button1);
        pan.add(button2);

        this.setVisible(true);
    }
}
