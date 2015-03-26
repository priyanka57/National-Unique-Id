import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;

class Home implements ActionListener

{        
     JFrame f;
     JPanel p;
     JLabel l1,l2,l3,l4,l5,l6;
     JTextField t,tf;
     JPasswordField pa;
     long id;
     JButton b,b1,b2;
                
                    public void show()
               {
                    
                    f=new JFrame();
                    f.setVisible(true);
                    f.setSize(1024,768);
                    p=new JPanel();
                    f.add(p);
                    p.setLayout(null);
                    l1=new JLabel(" WELCOME TO UID PROJECT WEBSITE");
                    l1.setBounds(350,6,500,100);
                    l1.setFont(new Font("Arial",Font.BOLD,20));
                    p.add(l1); 
                    l2=new JLabel("WE THE PEOPLE.......WHICH MATTERS");
                    l2.setBounds(560,24,500,120);
                    l2.setFont(new Font("Arial",Font.BOLD,12));
                    p.add(l2);
                    l3=new JLabel("LOGIN HERE");
                    l3.setBounds(7,300,250,50);
                    l3.setFont(new Font("Arial",Font.BOLD,16));
                    p.add(l3); 
                    l4=new JLabel("User ID :");
                    l4.setBounds(7,340,100,50);
                    l4.setFont(new Font("Arial",Font.BOLD,16));
                    p.add(l4); 
                    t=new JTextField(10);
                    t.setBounds(100,350,100,25);
                    t.setFont(new Font("Arial",Font.BOLD,16));
                    p.add(t); 
                    l5=new JLabel("Password :");
                    l5.setBounds(7,380,120,50);
                    l5.setFont(new Font("Arial",Font.BOLD,16));
                    p.add(l5); 
                    pa=new JPasswordField(10);
                    pa.setBounds(100,390,100,25);
                    p.add(pa);
                    b=new JButton("Submit"); 
                    b.setBounds(100,425,80,30);
                    b.addActionListener(this);
                    p.add(b);
                    l6=new JLabel("Enter UID:");
                    l6.setFont(new Font("Arial",Font.BOLD,16));
                    l6.setBounds(380,300,100,30);
                    p.add(l6);
                    tf=new JTextField(20);
                    tf.setBounds(485,300,120,25);
                    tf.setFont(new Font("Arial",Font.BOLD,16));
                    p.add(tf);
                    b1=new JButton("Show");
                    b1.setFont(new Font("Arial",Font.BOLD,18));
                    b1.setBounds(650,300,120,30);
                    p.add(b1);
                    b1.addActionListener(this);
                    b2=new JButton("Census");
                    b2.setFont(new Font("Arial",Font.BOLD,18));
                    b2.setBounds(500,400,120,30);
                    p.add(b2);
                    b2.addActionListener(this);
 
 
 
                 }

        
              public static void main(String args[])

               {
                   Home h=new Home();
                   h.show();
               }

           
                     public void actionPerformed(ActionEvent e)

                  {
                         Object ob= e.getSource();
                         
                         if(ob==b)
                           {
                              String s=t.getText();
                              String x=pa.getText();
                                   
                                       if( s.equals("admin") && x.equals("admin"))
                                          {
                                            f.setVisible(false);
                                            Im m=new Im();
                                            m.show1();
                                           }
                                       
                                        else if( s.equalsIgnoreCase("admin") && x.equalsIgnoreCase("admin"))
                                           {
                                             JOptionPane.showMessageDialog(f, 
                                             "please enter data in small case","Error Message",
                                             JOptionPane.ERROR_MESSAGE);
                                            }
                                         
                                         else
                                           {
                                              JOptionPane.showMessageDialog(f, 
                                              "Sorry.Incorrect User ID or Password","Error Message",                                       
                                              JOptionPane.ERROR_MESSAGE);
                                            }

                                
                              }


                            else if(ob==b1)
                         {
                            String val=tf.getText();
                                 
                                         if((val.equals(null))||(val.equals("")))
                                   {
                                              JOptionPane.showMessageDialog(f, 
                                              "Sorry.Please Enter UID.","Error Message",                                       
                                              JOptionPane.ERROR_MESSAGE);
                                   
                                   }
                                        else
                                   { 
                                       
                                       Connection con=null;
                                       Statement st;
                                       ResultSet rs;
                                       long re;
                                                  try
                                           {
                                                  Class.forName("com.mysql.jdbc.Driver");
                                                  con=DriverManager.getConnection("jdbc:mysql://localhost:3306/project2","root","vbnm2357");
                                           }
                                                 catch(Exception e2)
                                           {
                                                  System.out.println(e2.getMessage());
                                           }
                                                   try
                                            {      
                                                   int i=0;                                                  
                                                   st=con.createStatement();
                                                   rs=st.executeQuery("select * from formI");
                                                   while(rs.next())
                                                 { 
                                                    re=rs.getLong(1);
                                                    id=Long.parseLong(tf.getText());
                                                      if(id==re)
                                                        {
                                                           
                                                              f.setVisible(false);
                                                              Sh_Form1 s1=new Sh_Form1();
                                                              s1.show13(id);
                                                               i++;
                                                          
                                                        }

                                                     
                                                 } 
                                              if(i==0)
                                              {     JOptionPane.showMessageDialog(f, 
                                                    "Sorry.This UID is not registered.","Error Message",                                       
                                                    JOptionPane.ERROR_MESSAGE);
                                               } 
                                           }  
                                                                   

                                                     

                                                       catch(SQLException e1)
                                           {
                                                    System.out.println(e1.getMessage());
                                           }
                                              

 
                                   }
                         }       


                                else if(ob==b2)
                         {
                               
                              Cen c1=new Cen();
                              c1.display3();
                         }




                        

                  }      
                                            
}
