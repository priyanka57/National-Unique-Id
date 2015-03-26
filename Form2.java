import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;



class Form2 implements ActionListener

{

   JFrame f;
   JPanel p;
   JLabel l1, l2, l3, l4, l5, l6, l7, l8, l9,l10;
   JButton b1;
   JTextField tf1, tf2, tf3, tf4, tf5,tf6,tf7,tf8;
   Choice ch1;
   long id1;
                  
                    public void show3(long id)
              {
                  id1=id;
                  f=new JFrame();
                  f.setSize(1024,768);
                  p=new JPanel();
                  f.setVisible(true);
                  f.add(p);
                  p.setLayout(null);
                  l1=new JLabel("FORM II \n");
                  l1.setFont(new Font("Arial",Font.BOLD,22));
                  l1.setBounds(490,70,100,20);
                  p.add(l1);
                  l2=new JLabel("Permanent Address \n");
                  l2.setFont(new Font("Arial",Font.BOLD,16));
                  l2.setBounds(350,150,200,20);
                  p.add(l2);
                  tf1=new JTextField(10);
                  tf1.setFont(new Font("Arial",Font.PLAIN,16));
                  tf1.setBounds(600,150,100,20);
                  p.add(tf1);
                  l3=new JLabel("Contact No. \n");
                  l3.setFont(new Font("Arial",Font.BOLD,16));
                  l3.setBounds(350,200,100,20);
                  p.add(l3);
                  tf2=new JTextField(10);
                  tf2.setBounds(600,200,100,20);
                  tf2.setFont(new Font("Arial",Font.PLAIN,16));
                  p.add(tf2);
                  l4=new JLabel("Email Id \n");
                  l4.setFont(new Font("Arial",Font.BOLD,16));
                  l4.setBounds(350,250,100,20);
                  p.add(l4);
                  tf3=new JTextField(10);
                  tf3.setBounds(600,250,100,20);
                  tf3.setFont(new Font("Arial",Font.PLAIN,16));
                  p.add(tf3);
                  l5=new JLabel("Blood Group ");
                  l5.setBounds(350,300,150,20);
                  l5.setFont(new Font("Arial",Font.BOLD,16));
                  p.add(l5);
                  ch1=new Choice();
                  ch1.add(" ");
                  ch1.add("A+");
                  ch1.add("A-");
                  ch1.add("B+");
                  ch1.add("B-");
                  ch1.add("AB+");
                  ch1.add("AB-");
                  ch1.add("O+");
                  ch1.add("O-");
                  ch1.setBounds(600,300,40,20);
                  p.add(ch1);
                  l6=new JLabel("PAN No.");
                  l6.setBounds(350,350,80,20);
                  l6.setFont(new Font("Arial",Font.BOLD,16));
                  p.add(l6);
                  tf4=new JTextField(10);
                  tf4.setBounds(600,350,100,20);
                  tf4.setFont(new Font("Arial",Font.PLAIN,16));
                  p.add(tf4);                  
                  l7=new JLabel("Driving License No.");
                  l7.setBounds(350,400,180,20);
                  l7.setFont(new Font("Arial",Font.BOLD,16));
                  p.add(l7);
                  tf5 =new JTextField(10);
                  tf5.setFont(new Font("Arial",Font.PLAIN,16));
                  tf5.setBounds(600,400,100,20);
                  p.add(tf5);
                  l8=new JLabel("Ration Card No. \n");
                  l8.setFont(new Font("Arial",Font.BOLD,16));
                  l8.setBounds(350,450,140,20);
                  p.add(l8);
                  tf6=new JTextField(10);
                  tf6.setFont(new Font("Arial",Font.PLAIN,16));
                  tf6.setBounds(600,450,100,20);
                  p.add(tf6);
                  l9=new JLabel("Voter ID \n");
                  l9.setFont(new Font("Arial",Font.BOLD,16));
                  l9.setBounds(350,500,140,20);
                  p.add(l9);
                  tf7=new JTextField(10);
                  tf7.setFont(new Font("Arial",Font.PLAIN,16));
                  tf7.setBounds(600,500,100,20);
                  p.add(tf7);
                  l10=new JLabel("Passport No. \n");
                  l10.setFont(new Font("Arial",Font.BOLD,16));
                  l10.setBounds(350,550,140,20);
                  p.add(l10);
                  tf8=new JTextField(10);
                  tf8.setFont(new Font("Arial",Font.PLAIN,16));
                  tf8.setBounds(600,550,100,20);
                  p.add(tf8);
                  b1= new JButton("Next");
                  b1.setFont(new Font("Arial",Font.BOLD,16));
                  b1.setBounds(480,600,80,25);
                  p.add(b1);
                  b1.addActionListener(this);
                  
           
             }
         

               public void actionPerformed(ActionEvent e)

             {
               Object ob=e.getSource();
                 
                     if(ob==b1)
                 
                      {
                        
                         String pa=tf1.getText();
                         String cn=tf2.getText();
                         String bg=ch1.getSelectedItem();
                         String eid=tf3.getText();
                         String pan=tf4.getText();
                         String dl=tf5.getText();
                         String rcn=tf6.getText();
                         String vin=tf7.getText();
                         String pas=tf8.getText();
                        
                          
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
                                         
                                           st=con.prepareStatement("insert into formII values(?,?,?,?,?,?,?,?,?,?)");
                                           st.setLong(1,id1);
                                           st.setString(2,pa);
                                           st.setString(3,cn);
                                           st.setString(4,eid);
                                           st.setString(5,bg);
                                           st.setString(6,pan);
                                           st.setString(7,dl);
                                           st.setString(8,rcn);
                                           st.setString(9,vin);
                                           st.setString(10,pas);
                                           int  r1= st.executeUpdate();
                                           System.out.println(r1+" "+" Row Inserted");

                                         }
                                             catch(SQLException e2)
                                         {
                                               System.out.println(e2.getMessage());
                                         }


   
                        f.setVisible(false);
                        Form3_A f1=new Form3_A();
                        f1.show4(id1);
                      }
             }

}

