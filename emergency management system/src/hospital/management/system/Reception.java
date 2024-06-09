package hospital.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

public class Reception extends JFrame {
    Reception(){

        JPanel panel = new JPanel();
        panel.setLayout(null);
        panel.setBounds(5,160,1525,670);
        panel.setBackground(new Color(109,167,170));
        add(panel);

        JPanel panel1 = new JPanel();
        panel1.setLayout(null);
        panel1.setBounds(5,5,1525,150);
        panel1.setBackground(new Color(109,167,170));
        add(panel1);

        ImageIcon i11 = new ImageIcon("C:\\Users\\Guezouli Yasmin\\IdeaProjects\\emergency management system\\src\\icon\\amb.png");
        Image image1 = i11.getImage().getScaledInstance(300, 100, Image.SCALE_DEFAULT);
        ImageIcon i22 = new ImageIcon(image1);
        JLabel label1 = new JLabel(i22);
        label1.setBounds(950, 25, 300, 100);  // Corrected and adjusted bounds for label1
        panel1.add(label1);

        JButton btn1 = new JButton("add new Patient ");
        btn1.setBounds(30,15,200,30);
        btn1.setBackground(new Color(182, 255, 227));
        panel1.add(btn1);
        btn1.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new New_Patient();
            }
        }
        );

        JButton btn2 = new JButton("Room");
        btn2.setBounds(30,58,200,30);
        btn2.setBackground(new Color(182, 255, 227));
        panel1.add(btn2);
        btn2.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
            }
        }
        );

        JButton btn3 = new JButton("Departement");
        btn3.setBounds(30,100,200,30);
        btn3.setBackground(new Color(182, 255, 227));
        panel1.add(btn3);
        btn3.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
            }
        }
        );

        JButton btn4 = new JButton("All employee Info");
        btn4.setBounds(270,15,200,30);
        btn4.setBackground(new Color(182, 255, 227));
        panel1.add(btn4);
        btn4.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
            }
        }
        );

        JButton btn5 = new JButton("Patient info");
        btn5.setBounds(270,58,200,30);
        btn5.setBackground(new Color(182, 255, 227));
        panel1.add(btn5);
        btn5.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
            }
        }
        );

        JButton btn6 = new JButton("Patient Discharge");
        btn6.setBounds(270,100,200,30);
        btn6.setBackground(new Color(182, 255, 227));
        panel1.add(btn6);
        btn6.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
            }
        }
        );

        JButton btn7 = new JButton("Update Patient Details");
        btn7.setBounds(510,15,200,30);
        btn7.setBackground(new Color(182, 255, 227));
        panel1.add(btn7);
        btn7.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
            }
        }
        );

        JButton btn8 = new JButton("Hospital Ambulance");
        btn8.setBounds(510,58,200,30);
        btn8.setBackground(new Color(182, 255, 227));
        panel1.add(btn8);
        btn8.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
            }
        }
        );

        JButton btn9 = new JButton("Search Room");
        btn9.setBounds(510,100,200,30);
        btn9.setBackground(new Color(182, 255, 227));
        panel1.add(btn9);
        btn9.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
            }
        }
        );

        JButton btn10 = new JButton("Logout");
        btn10.setBounds(750,15,200,30);
        btn10.setBackground(new Color(182, 255, 227));
        panel1.add(btn10);
        btn10.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
            }
        }
        );





        setSize(1950,1090);
        getContentPane().setBackground(Color.white);
        setLayout(null);
        setVisible(true);
    }

    public static void main(String[] args) {
        new Reception();
    }
}
