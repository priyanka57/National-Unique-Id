import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class Notif1 implements ActionListener
{
                             JFrame f;
                             JPanel p;
                             JLabel l;
                             JButton b;
                             public void display1()
                       {
                            
                             f=new JFrame();
                             f.setSize(1024,768);
                             p=new JPanel();
                             p.setLayout(null);
                             f.setVisible(true);
                             f.add(p);
                             l=new JLabel("Update Completed.");
                             p.add(l);
                             l.setFont(new Font("Arial",Font.BOLD,22));
                             l.setBounds(400,300,1000,50);
                             b=new JButton("Finish");
                             b.addActionListener(this);
                             b.setFont(new Font("Arial",Font.BOLD,18));
                             b.setBounds(450,425,100,25);
                             p.add(b);
                       }

                            public void actionPerformed(ActionEvent e)
                       {
                            Object ob=e.getSource();
                                if(ob==b)
                            {
                                f.setVisible(false);
                                Im a=new Im();
                                a.show1();
                             }
                       }
}
