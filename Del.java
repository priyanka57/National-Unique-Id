import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;


class Del implements ActionListener

{

         JFrame f;
         JPanel p;
         JLabel l;
         JTextField tf;
         JButton b,b1;
         long id;

                        public void Delm()
             {          
                        Connection con=null;
                        PreparedStatement st;
                                      
                                            try
                                         {
                                            Class.forName("com.mysql.jdbc.Driver");
                                            con=DriverManager.getConnection("jdbc:mysql://localhost:3306/project2","root","vbnm2357");

                                         }
                                            catch(Exception e1)
                                         {
                                            System.out.println(e1.getMessage());
                                         }

                                            try
                                         {
                                         
                                           st=con.prepareStatement("delete from formI where UID=?");
                                           st.setLong(1,id);
                                           st.executeUpdate();
                                           st=con.prepareStatement("delete from formII where UID=?");
                                           st.setLong(1,id);
                                           st.executeUpdate();
                                           st=con.prepareStatement("delete from formIIIA where UID=?");
                                           st.setLong(1,id);
                                           st.executeUpdate();
                                           st=con.prepareStatement("delete from formIIIB where UID=?");
                                           st.setLong(1,id);
                                           st.executeUpdate();

                                           JOptionPane.showMessageDialog(f, 
                                                    "UID is Deleted.");

                                         }
                                             catch(SQLException e2)
                                         {
                                               System.out.println(e2.getMessage());
                                         }



             }
                        public void show11()
             {
             
                  f=new JFrame();
                  p=new JPanel();
                  f.setSize(1024,768);
                  f.setVisible(true);
                  f.add(p);
                  p.setLayout(null);
                  l=new JLabel("Enter UID:");
                  l.setFont(new Font("Arial",Font.BOLD,16));
                  l.setBounds(380,300,100,30);
                  p.add(l);
                  tf=new JTextField(20);
                  tf.setBounds(485,300,120,25);
                  tf.setFont(new Font("Arial",Font.BOLD,16));
                  p.add(tf);
                  b=new JButton("Delete");
                  b.setFont(new Font("Arial",Font.BOLD,18));
                  b.setBounds(650,300,120,30);
                  p.add(b);
                  b.addActionListener(this);
                  b1=new JButton("Back");
                  b1.setFont(new Font("Arial",Font.BOLD,18));
                  b1.setBounds(100,100,115,45);
                  p.add(b1);
                  b1.addActionListener(this);
 
             }

                         public void actionPerformed(ActionEvent e)
               
             {
                  
               Object ob =e.getSource();
                     
                           if(ob==b)
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
                                                           
                                                           Delm();
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



                                        else if(ob==b1)
                                {
                                  f.setVisible(false);
                                  Im a2=new Im();
                                  a2.show1();
                                 }

                                         
             } 



                      
                        
} 



