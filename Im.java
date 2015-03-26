import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class Im implements ActionListener 

{
         JFrame f;
         JPanel p;
         JButton b1,b2,b3,b4,b5;
         JLabel l1;   

                  public void show1()
             {
             
                  f=new JFrame();
                  p=new JPanel();
                  f.setSize(1024,768);
                  f.setVisible(true);
                  f.add(p);
                  p.setLayout(null);
                  l1=new JLabel("NATIONAL UID");
                  l1.setFont(new Font("Arial",Font.BOLD,25));
                  l1.setBounds(435,8,300,200);
                  p.add(l1);
                  b1=new JButton("Create New");
                  b1.setFont(new Font("Arial",Font.BOLD,18));
                  b1.setBounds(200,250,250,70);
                  p.add(b1);
                  b2=new JButton("Update");
                  b2.setFont(new Font("Arial",Font.BOLD,18));
                  b2.setBounds(550,250,250,70);
                  p.add(b2);
                  b3=new JButton("Search"); 
                  b3.setFont(new Font("Arial",Font.BOLD,18));
                  b3.setBounds(200,400,250,70);
                  p.add(b3);  
                  b4=new JButton("Delete");
                  b4.setFont(new Font("Arial",Font.BOLD,18));
                  b4.setBounds(550,400,250,70);
                  p.add(b4);
                  b5=new JButton("Sign Out");
                  b5.setFont(new Font("Arial",Font.BOLD,18));
                  b5.setBounds(100,100,115,45);
                  p.add(b5);
                  b1.addActionListener(this);
                  b2.addActionListener(this);
                  b3.addActionListener(this);
                  b4.addActionListener(this);
                  b5.addActionListener(this);
             }



               public void actionPerformed(ActionEvent e)
               
             {
                  
               Object ob =e.getSource();
                     
                           if(ob==b5)
                         {
                           f.setVisible(false);
                           Home h=new Home();
                           h.show();
                         } 
                        
                        else if(ob==b1)
                          {
                           f.setVisible(false);
                           Notif2 n2=new Notif2();
                           n2.display2();
                         }     
                        
                        else if(ob==b2)
                          {
                           f.setVisible(false);
                           Up_Im u1=new Up_Im();
                           u1.show6();
                         }  
                        
                        else if(ob==b4)
                          {
                           f.setVisible(false);
                           Del d1=new Del();
                           d1.show11();
                         }  
                        
                        else if(ob==b3)
                          {
                           f.setVisible(false);
                           Sear s1=new Sear();
                           s1.show12();
                         }   


             } 


}
