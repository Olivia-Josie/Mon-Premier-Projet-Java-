package vue;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

public class VoyageZozo extends JFrame {
     private JLabel lNom,lIcon,lSexe,lAge,lTaille,lCheveux;
     private JTextField tNom,tTaille;
    private JRadioButton rtranche1,rTarnche2,rTranche3,rTranche4;
    private JComboBox CSex,CCheveux;
    private JButton bOk,bAnnuler;

    //declaration du container
    public JPanel container = new JPanel();
    //declaration du constructeur
    public  VoyageZozo(){
        this.setTitle("Coucou les zeros");
        this.setSize(800,400);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);
        this.setLocationRelativeTo(null);
        this.setContentPane(container);
        container.setLayout(new BorderLayout());

        initComportement();
        this.setVisible(true);



    }

    private void initComportement() {

        //insertion de l'icone
        lIcon = new JLabel(new ImageIcon("Capture.png"));
        lIcon.setPreferredSize(new Dimension(120, 0));
        JPanel panIcon = new JPanel();
        panIcon.setBackground(Color.WHITE);
        panIcon.setLayout(new BorderLayout());
        panIcon.add(lIcon);
        container.add(panIcon, BorderLayout.WEST);
//        panIcon.setPreferredSize(new Dimension(150,20));

        //pan nom
        JPanel panNom = new JPanel();
        panNom.setPreferredSize(new Dimension(300,80));
        panNom.setBackground(Color.WHITE);
        panNom.setBorder(BorderFactory.createTitledBorder("Nom du personnage"));
        lNom = new JLabel("saisie le nom : ");
        panNom.add(lNom);
        tNom = new JTextField();
        tNom.setPreferredSize(new Dimension(100,30));
        panNom.add(tNom);

        //pan sex
        JPanel panSex = new JPanel();
        panSex.setBackground(Color.WHITE);
        panSex.setPreferredSize(new Dimension(300,80));
        panSex.setBorder(BorderFactory.createTitledBorder("Sexe du personnage"));
        lSexe = new JLabel("Sexe");
        CSex = new JComboBox();
        CSex.addItem("Masculin");
        CSex.addItem("Feminin");
        CSex.setPreferredSize(new Dimension(100,30));
        panSex.add(lSexe);
        panSex.add(CSex);
        JPanel topPanel = new JPanel();
        topPanel.setBackground(Color.white);
        topPanel.add(panNom);
        topPanel.add(panSex);

        //tranche d'age
        JPanel panAge = new JPanel();
        panAge.setBackground(Color.WHITE);
        panAge.setPreferredSize(new Dimension(600,80));
        panAge.setBorder(BorderFactory.createTitledBorder("Age du personnage"));
        rtranche1 = new JRadioButton("15-25 ans");
        rtranche1.setSelected(true);
        rTarnche2 = new JRadioButton("26-35 ans");
        rTranche3 = new JRadioButton("36-50 ans");
        rTranche4 = new JRadioButton("plus de 50 ans");
        panAge.add(rtranche1);
        panAge.add(rTarnche2);
        panAge.add(rTranche3);
        panAge.add(rTranche4);
        JPanel middlePanel = new JPanel();
        middlePanel.setBackground(Color.white);
        middlePanel.add(panAge);

        // pan taille
        JPanel panTaille = new JPanel();
        panTaille.setBackground(Color.WHITE);
        panTaille.setPreferredSize(new Dimension(300,80));
        panTaille.setBorder(BorderFactory.createTitledBorder("Taille du personnage"));
        lTaille = new JLabel("Taille");
        panTaille.add(lTaille);
        tTaille = new JTextField();
        tTaille.setPreferredSize(new Dimension(100,30));
        panTaille.add(tTaille);

//        pan cheveux
        JPanel panCheveux = new JPanel();
        panCheveux.setBackground(Color.WHITE);
        panCheveux.setPreferredSize(new Dimension(300,80));
        panCheveux.setBorder(BorderFactory.createTitledBorder("couleur des cheveux"));
        lCheveux = new JLabel("Cheveux");
        CCheveux = new JComboBox();
        CCheveux.addItem("Marron");
        CCheveux.addItem("Noir");
        CCheveux.addItem("Bleu");
        CCheveux.addItem("Roux");
        CCheveux.addItem("Blanc");
        CCheveux.addItem("Brun");
        CCheveux.setPreferredSize(new Dimension(100,30));
        panCheveux.add(lCheveux);
        panCheveux.add(CCheveux);
        JPanel bottomPanel = new JPanel();
        bottomPanel.setBackground(Color.WHITE);
        bottomPanel.add(panTaille);
        bottomPanel.add(panCheveux);

        JPanel panButton = new JPanel();
        panButton.setPreferredSize(new Dimension(500,60));
        bOk = new JButton("Ok");
        bOk.setPreferredSize(new Dimension(60,35));
        bAnnuler = new JButton ("Annuler");
        bAnnuler.setPreferredSize(new Dimension(80,35));
        panButton.add(bOk);
        panButton.add(bAnnuler);
        bAnnuler.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Vous avez clique sur annuler");
                setVisible(false);
            }
        });

        bOk.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Vous avez clique sur annuler");
                setVisible(false);
            }
        });




//        JPanel panCentre = new JPanel();
//        panCentre.setPreferredSize(new Dimension(800,320));
//        panCentre.setBackground(Color.WHITE);
//        panCentre.add(panNom);
//        panCentre.add(panSex);
//        panCentre.add(panAge);
//        panCentre.add(panTaille);
//        panCentre.add(panCheveux);
//        container.add(panCentre,BorderLayout.WEST);
//        container.add(panCentre,BorderLayout.EAST);
        container.add(panButton,BorderLayout.SOUTH);
        JPanel containeAll = new JPanel();
        containeAll.setBackground(Color.WHITE);
        containeAll.add(topPanel);
        containeAll.add(middlePanel);
        containeAll.add(bottomPanel);
        container.add(containeAll, BorderLayout.CENTER);

//        container.add(panIcon);
//        container.add(panCentre);
//        container.add(panButton);




    }
}

