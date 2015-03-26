import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class Notif2 implements ActionListener
{
                             JFrame f;
                             JPanel p;
                             JLabel l,l1,l2,l3,l4;
                             JButton b;
                             public void display2()
                       {
                            
                             f=new JFrame();
                             f.setSize(1024,768);
                             p=new JPanel();
                             p.setLayout(null);
                             f.setVisible(true);
                             f.add(p);
                             l=new JLabel("Instructions");
                             p.add(l);
                             l.setFont(new Font("Arial",Font.BOLD,22));
                             l.setBounds(480,100,1000,50);
                             l1=new JLabel("1. This form has four parts i.e Form I,Form II, Form IIIA & Form IIIB.");
                             p.add(l1);
                             l1.setFont(new Font("Arial",Font.BOLD,16));
                             l1.setBounds(250,200,1000,50);
                             l2=new JLabel("2.Form I is mandatory while other forms are optional.");
                             p.add(l2);
                             l2.setFont(new Font("Arial",Font.BOLD,16));
                             l2.setBounds(250,250,1000,50);
                             l3=new JLabel("3.Do not close the window untill submit button appears else registration will not be completed.");
                             p.add(l3);
                             l3.setFont(new Font("Arial",Font.BOLD,16));
                             l3.setBounds(250,300,1000,50);
                             l4=new JLabel("4.After submission of form completely UID will appear on the screen.");
                             p.add(l4);
                             l4.setFont(new Font("Arial",Font.BOLD,16));
                             l4.setBounds(250,350,1000,50);
                             b=new JButton("Proceed");
                             b.addActionListener(this);
                             b.setFont(new Font("Arial",Font.BOLD,18));
                             b.setBounds(450,425,140,25);
                             p.add(b);
                       }

                            public void actionPerformed(ActionEvent e)
                       {
                            Object ob=e.getSource();
                                if(ob==b)
                            {
                                f.setVisible(false);
                                Form1 f1=new Form1();
                                f1.show2();
                             }
                       }
}
