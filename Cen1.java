import javax.swing.*;
import java.awt.*;
import java.sql.*;

class Cen1 

{
   JFrame f;
   JPanel p;
   JLabel l1, l2, l3, l4,l5;
   JTextField tf1, tf2, tf3, tf4;
   String s1=null;
                        
                  
                    public void display4(String s)
              {
                  s1=s;   
                  Connection con1=null;
                  Statement st1;
                  ResultSet rs1;
                  String sex=null;
                  String qa=null;
                  String hs=null;
                  int i2=0,y2=0,x2=0,z2=0;
                  String i3=null;
                  String y3=null;
                  String x3=null;
                  String z3=null;
 

                         try
                  {
                         Class.forName("com.mysql.jdbc.Driver");
                         con1=DriverManager.getConnection("jdbc:mysql://localhost:3306/project2","root","vbnm2357");
                  }
                        catch(Exception e2)
                  {
                        System.out.println(e2.getMessage());
                  }
                 
                            try
                                     {
                                         
                                           st1=con1.createStatement();
                                           rs1=st1.executeQuery("select * from formI");
                                               while(rs1.next())
                                             {
                                                   sex=rs1.getString(4).trim();
                                                   qa=rs1.getString(11).trim();
                                                   hs=rs1.getString(12).trim();
                                                   if(s1.equalsIgnoreCase(hs))        
                                                   {
                                                         
                                                         i2++;  
                                                         if(sex.equalsIgnoreCase("Male"))
                                                         {y2++;}
                                                         else
                                                         {z2++;}
                                                         if(!qa.equalsIgnoreCase("Other"))
                                                         x2++;
                                                    }   
                                              }
                                      

                                        i3=Integer.toString(i2);
                                        y3=Integer.toString(y2);
                                        z3=Integer.toString(z2);
                                        x3=Integer.toString(x2);
                                    }
                                   
                                             catch(SQLException e2)
                                         {
                                               System.out.println(e2.getMessage());
                                         }





 
                  f=new JFrame();
                  f.setSize(1024,768);
                  p=new JPanel();
                  f.setVisible(true);
                  f.add(p);
                  p.setLayout(null);
                  l1=new JLabel("Census");
                  l1.setFont(new Font("Arial",Font.BOLD,22));
                  l1.setBounds(460,70,100,20);
                  p.add(l1);
                  l2=new JLabel("Total \n");
                  l2.setFont(new Font("Arial",Font.BOLD,16));
                  l2.setBounds(350,150,100,20);
                  p.add(l2);
                  tf1=new JTextField(10);
                  tf1.setFont(new Font("Arial",Font.PLAIN,16));
                  tf1.setBounds(550,150,50,20);
                  tf1.setText(i3);
                  p.add(tf1);
                  l3=new JLabel("Male \n");
                  l3.setFont(new Font("Arial",Font.BOLD,16));
                  l3.setBounds(350,200,100,20);
                  p.add(l3);
                  tf2=new JTextField(10);
                  tf2.setBounds(550,200,50,20);
                  tf2.setFont(new Font("Arial",Font.PLAIN,16));
                  tf2.setText(y3);
                  p.add(tf2);
                  l4=new JLabel("Female \n");
                  l4.setFont(new Font("Arial",Font.BOLD,16));
                  l4.setBounds(350,250,140,20);
                  p.add(l4);
                  tf3=new JTextField(10);
                  tf3.setFont(new Font("Arial",Font.PLAIN,16));
                  tf3.setBounds(550,250,50,20);
                  tf3.setText(z3);
                  p.add(tf3);
                  l5=new JLabel("Educated \n");
                  l5.setFont(new Font("Arial",Font.BOLD,16));
                  l5.setBounds(350,300,140,20);
                  p.add(l5);
                  tf4=new JTextField(10);
                  tf4.setFont(new Font("Arial",Font.PLAIN,16));
                  tf4.setBounds(550,300,50,20);
                  tf4.setText(x3);
                  p.add(tf4);
                  
           
             }

}

