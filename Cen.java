import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;

class Cen implements ActionListener

{
   JFrame f;
   JPanel p;
   JLabel l1, l2, l3, l4,l5;
   JTextField tf1, tf2, tf3, tf4;
   Choice ch;
   JButton b1;
   String s=null;
                        
                  
                    public void display3()
              {
                  
                  Connection con1=null;
                  Statement st1;
                  ResultSet rs1;
                  String sex=null;
                  String qa=null;
                  int i=0,y=0,x=0,z=0;
                  String i1=null;
                  String y1=null;
                  String x1=null;
                  String z1=null;
 

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
                                                      
                                                   i++;  
                                                   sex=rs1.getString(4).trim();
                                                   if(sex.equalsIgnoreCase("Male"))
                                                   {y++;}
                                                   else
                                                   {z++;}
                                                   qa=rs1.getString(11).trim();
                                                   if(!qa.equalsIgnoreCase("Other"))
                                                   x++;   
                                              }
                                      

                                        i1=Integer.toString(i);
                                        y1=Integer.toString(y);
                                        z1=Integer.toString(z);
                                        x1=Integer.toString(x);
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
                  tf1.setText(i1);
                  p.add(tf1);
                  l3=new JLabel("Male \n");
                  l3.setFont(new Font("Arial",Font.BOLD,16));
                  l3.setBounds(350,200,100,20);
                  p.add(l3);
                  tf2=new JTextField(10);
                  tf2.setBounds(550,200,50,20);
                  tf2.setFont(new Font("Arial",Font.PLAIN,16));
                  tf2.setText(y1);
                  p.add(tf2);
                  l4=new JLabel("Female \n");
                  l4.setFont(new Font("Arial",Font.BOLD,16));
                  l4.setBounds(350,250,140,20);
                  p.add(l4);
                  tf3=new JTextField(10);
                  tf3.setFont(new Font("Arial",Font.PLAIN,16));
                  tf3.setBounds(550,250,50,20);
                  tf3.setText(z1);
                  p.add(tf3);
                  l5=new JLabel("Educated \n");
                  l5.setFont(new Font("Arial",Font.BOLD,16));
                  l5.setBounds(350,300,140,20);
                  p.add(l5);
                  tf4=new JTextField(10);
                  tf4.setFont(new Font("Arial",Font.PLAIN,16));
                  tf4.setBounds(550,300,50,20);
                  tf4.setText(x1);
                  p.add(tf4);
                  ch=new Choice();
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
                  ch.setBounds(350,350,160,20);
                  p.add(ch);    
                  b1= new JButton("Check");
                  b1.setFont(new Font("Arial",Font.BOLD,16));
                  b1.setBounds(550,350,120,25);
                  p.add(b1);
                  b1.addActionListener(this);
 
           
             }
         

               public void actionPerformed(ActionEvent e)

             {
               Object ob=e.getSource();
                 
                         if(ob==b1)
                 
                      {  
                                                    
                               s=ch.getSelectedItem();
                               Cen1 c2=new Cen1();
                               c2.display4(s);
                                 

                      }
                 
             }

}

