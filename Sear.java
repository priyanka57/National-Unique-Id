import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;


class Sear implements ActionListener

{

         JFrame f;
         JPanel p;
         JLabel l,l1,l2;
         JTextField tf1, tf2;
         Choice ch,ch1;
         JButton b1,b2,b3,b4;
         
                           public void show12()
             {
             
                  f=new JFrame();
                  p=new JPanel();
                  f.setSize(1024,768);
                  f.setVisible(true);
                  f.add(p);
                  p.setLayout(null);
                  l=new JLabel("First Name \n");
                  l.setFont(new Font("Arial",Font.BOLD,16));
                  l.setBounds(350,150,100,20);
                  p.add(l);
                  tf1=new JTextField(10);
                  tf1.setFont(new Font("Arial",Font.PLAIN,16));
                  tf1.setBounds(550,150,100,20);
                  p.add(tf1);
                  l1=new JLabel("Last Name \n");
                  l1.setFont(new Font("Arial",Font.BOLD,16));
                  l1.setBounds(350,200,100,20);
                  p.add(l1);
                  tf2=new JTextField(10);
                  tf2.setBounds(550,200,100,20);
                  tf2.setFont(new Font("Arial",Font.PLAIN,16));
                  p.add(tf2);
                  l2=new JLabel("Home State \n");
                  l2.setFont(new Font("Arial",Font.BOLD,16));
                  l2.setBounds(350,250,150,20);
                  p.add(l2);
                  ch=new Choice();
                  ch.add("");
                  ch.add("Andhra Pradesh");
                  ch.add("Arunachal Pradesh");
                  ch.add("Assam");
                  ch.add("Bihar");
                  ch.add("Chhattisgarh");
                  ch.add("Goa");
                  ch.add("Gujarat");
                  ch.add("Haryana");
                  ch.add("Himachal Pradesh");
                  ch.add("Jammu & Kashmir");
                  ch.add("Jharkhand");
                  ch.add("Karnataka");
                  ch.add("Kerala");
                  ch.add("Madhya Pradesh");
                  ch.add("Maharashtra");
                  ch.add("Manipur");
                  ch.add("Meghalaya");
                  ch.add("Mizoram");
                  ch.add("Nagaland");
                  ch.add("Orissa");
                  ch.add("Punjab");
                  ch.add("Rajasthan");
                  ch.add("Sikkim");
                  ch.add("Tamil Nadu");
                  ch.add("Tripura");
                  ch.add("Uttar Pradesh");
                  ch.add("Uttarakhand");
                  ch.add("West Bengal");
                  ch.add("Andaman & Nicobar Island");
                  ch.add("Chandigarh");
                  ch.add("Dadra & Nagar Haveli");
                  ch.add("Daman & Diu");
                  ch.add("Lakshadweep");
                  ch.add("Delhi");
                  ch.add("Puducherry");
                  ch.setBounds(550,250,160,20);
                  p.add(ch);    
                  b2= new JButton("Search");
                  b2.setFont(new Font("Arial",Font.BOLD,16));
                  b2.setBounds(450,350,120,25);
                  p.add(b2);
                  b1=new JButton("Back");
                  b1.setFont(new Font("Arial",Font.BOLD,18));
                  b1.setBounds(100,100,115,45);
                  p.add(b1);
                  b3=new JButton("Check");
                  b3.setFont(new Font("Arial",Font.BOLD,18));
                  b3.setBounds(720,450,115,25);
                  b4=new JButton("Refresh");
                  b4.setFont(new Font("Arial",Font.BOLD,18));
                  b4.setBounds(800,100,115,45);
                  p.add(b4);
                  b1.addActionListener(this);
                  b2.addActionListener(this);
                  b3.addActionListener(this);
                  b4.addActionListener(this);

 
             }
               
                          public void actionPerformed(ActionEvent e)
               
             {
                  
               Object ob =e.getSource();
                     
                           if(ob==b1)
                         {
                           f.setVisible(false);
                           Im a2=new Im();
                           a2.show1();
                         } 
                        
         
                        
                        else if(ob==b2)
                          {
                           String fn=tf1.getText();
                           String ln=tf2.getText();
                           String hs=ch.getSelectedItem();
                           String id=null;
                           Connection con=null;
                           Statement st;
                           ResultSet rs;
                           int z=0,i=0;
                           
                                          
              
                                          
                                           if((fn.equals(null))||(fn.equals("")))
                                   {
                                              JOptionPane.showMessageDialog(f, 
                                              "Sorry.First Name is not filled.","Error Message",                                       
                                              JOptionPane.ERROR_MESSAGE);
                                    z++;
                                   } 
                                           else if((ln.equals(null))||(ln.equals("")))
                                   {
                                              JOptionPane.showMessageDialog(f, 
                                              "Sorry.Last Name is not filled.","Error Message",                                       
                                              JOptionPane.ERROR_MESSAGE);
                                    z++;
                                   }
         
                                           else if(z==0)
                                    {
                                              

                                            if((hs.equals(null))||(hs.equals("")))
                                               {
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
                                                            
                                                            st=con.createStatement();
                                                            rs=st.executeQuery("select * from formI");
                                                            while(rs.next())
                                                          {
                                                            id=rs.getString(1).trim();
                                                            String fn1=rs.getString(2).trim();
                                                            String ln1=rs.getString(3).trim();
                                                                if(fn1.equalsIgnoreCase(fn) && ln1.equalsIgnoreCase(ln))
                                                                 
                                                                       {    ch1=new Choice();
                                                                            ch1.setBounds(550,450,160,20);
                                                                            ch1.add(id);
                                                                            i++;
                                                                        }   
                                                          }
                                                             if(i==0)
                                                            {
                                                             JOptionPane.showMessageDialog(f, 
                                                              "Sorry.No UID Found.","Error Message",                                       
                                                             JOptionPane.ERROR_MESSAGE);
                                                                    
                                                            }
          
                                                             else { p.add(ch1);p.add(b3);}
                                                      }
                                                          catch(SQLException e2)
                                                      {
                                                          System.out.println(e2.getMessage());
                                                      }


 
                                               }
                                            
                                            else
                                               {

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
                                                           
                                                            st=con.createStatement();
                                                            rs=st.executeQuery("select * from formI");
                                                            while(rs.next())
                                                          {
                                                            id=rs.getString(1).trim();
                                                            String fn1=rs.getString(2).trim();
                                                            String ln1=rs.getString(3).trim();
                                                            String hs1=rs.getString(12).trim();
                                                                if(fn1.equalsIgnoreCase(fn) && ln1.equalsIgnoreCase(ln) && hs1.equalsIgnoreCase(hs))
                                                                 
                                                                       {    
                                                                            ch1=new Choice();
                                                                            ch1.setBounds(550,450,160,20);
                                                                            ch1.add(id);
                                                                            i++;
                                                                           
                                                                        }
                                                              
                                                                 
                                                                
                                                          }
                                                             if(i==0)
                                                            {
                                                             JOptionPane.showMessageDialog(f, 
                                                              "Sorry.No UID Found.","Error Message",                                       
                                                             JOptionPane.ERROR_MESSAGE);
                                                                    
                                                            }
          
                                                             else { p.add(ch1);p.add(b3);}
                                                      }
                                                          catch(SQLException e2)
                                                      {
                                                          System.out.println(e2.getMessage());
                                                      }


 

                                              
                                               }
 
                                                  
                                   
                                    } 
     
                         }          

                                    else if(ob==b3)
                               {
                                   long id=Long.parseLong(ch1.getSelectedItem());
                                   Sh_Form1 s2=new Sh_Form1();
                                   s2.show13(id);
                               }

                                    else if(ob==b4)
                               {
                                   f.setVisible(false);
                                   Sear s1=new Sear();
                                   s1.show12();                   
                                }
             } 


}

