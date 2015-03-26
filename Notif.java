import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class Notif implements ActionListener
{
                             JFrame f;
                             JPanel p;
                             JLabel l,l1,l2;
                             JButton b;
                             long id4;
                             public void display(long id3)
                       {
                             id4=id3;
                             String dis=Long.toString(id4);
                             f=new JFrame();
                             f.setSize(1024,768);
                             p=new JPanel();
                             p.setLayout(null);
                             f.setVisible(true);
                             f.add(p);
                             l=new JLabel("Registeration Completed.");
                             p.add(l);
                             l.setFont(new Font("Arial",Font.BOLD,22));
                             l.setBounds(375,250,1000,50);
                             l1=new JLabel("The UID generated for this registration is");
                             p.add(l1);
                             l1.setFont(new Font("Arial",Font.BOLD,22));
                             l1.setBounds(245,300,1000,50);
                             l2=new JLabel("");
                             p.add(l2);
                             l2.setText(dis);
                             l2.setFont(new Font("Arial",Font.BOLD,22));
                             l2.setBounds(680,300,1000,50);
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
