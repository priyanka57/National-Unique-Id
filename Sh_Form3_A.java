import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;

class Sh_Form3_A implements ActionListener

{
   
   long id3;
   JFrame f;
   JPanel p;
   JLabel l1, l2, l3, l4, l5, l6, l7, l8, l9,l10,l11,l12,l13,l14,l15,l16,l17,l18,l19,l20,l21,l22,l23;
   JButton b1,b2,b3;
   JTextField tf1, tf2, tf3, tf4, tf5,tf6,tf7,tf8, tf9, tf10, tf11,tf12,tf13,tf14, tf15, tf16, tf17;
   Checkbox c1,c2,c3,c4,c5,c6;
   CheckboxGroup cg1,cg2,cg3;
   
                   
                       

                    public void show15(long id2)
              {
                  id3=id2;
                  long val;
                  Connection con1=null;
                  Statement st1;
                  ResultSet rs1;
                         String ba=null;
                         String bak1=null;
                         String bak2=null;
                         String bak3=null;
                         String bak4=null;
                         String acc1=null;
                         String acc2=null;
                         String acc3=null;
                         String acc4=null;
                         String pr=null;
                         String ca1=null;
                         String ca2=null;
                         String ca3=null;
                         String ve=null;
                         String ty1=null;
                         String ty2=null;
                         String ty3=null;
                         String vn1=null;
                         String vn2=null;
                         String vn3=null;
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
                                           rs1=st1.executeQuery("select * from formIIIA");
                                               while(rs1.next())
                                             {
                                                      val=rs1.getLong(1);
                                                      if(id3==val)
                                               {      
                                                      ba=rs1.getString(2).trim();
                                                      bak1=rs1.getString(3).trim();
                                                      acc1=rs1.getString(4).trim();
                                                      bak2=rs1.getString(5).trim();
                                                      acc2=rs1.getString(6).trim();
                                                      bak3=rs1.getString(7).trim();
                                                      acc3=rs1.getString(8).trim();
                                                      bak4=rs1.getString(9).trim();
                                                      acc4=rs1.getString(10).trim();
                                                      pr=rs1.getString(11).trim();
                                                      ca1=rs1.getString(12).trim();
                                                      ca2=rs1.getString(13).trim();
                                                      ca3=rs1.getString(14).trim();
                                                      ve=rs1.getString(15).trim();
                                                      ty1=rs1.getString(16).trim();
                                                      vn1=rs1.getString(17).trim();
                                                      ty2=rs1.getString(18).trim();
                                                      vn2=rs1.getString(19).trim();
                                                      ty3=rs1.getString(20).trim();
                                                      vn3=rs1.getString(21).trim();
                                                      
                                                }

                                             }
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
                  l1=new JLabel("FORM III A \n");
                  l1.setFont(new Font("Arial",Font.BOLD,22));
                  l1.setBounds(450,70,150,20);
                  p.add(l1);
                  l2=new JLabel("Do you have Bank Account? \n");
                  l2.setFont(new Font("Arial",Font.BOLD,16));
                  l2.setBounds(100,150,800,20);
                  p.add(l2);
                  if(ba.equalsIgnoreCase("yes"))
               {

                  cg1=new CheckboxGroup();
                  c1=new Checkbox("YES",cg1,true);
                  c1.setBounds(350,152,50,20);
                  p.add(c1);
                  c2=new Checkbox("NO",cg1,false);
                  c2.setBounds(410,152,50,20);
                  p.add(c2);
               }
                 else
               {
                  cg1=new CheckboxGroup();
                  c1=new Checkbox("YES",cg1,false);
                  c1.setBounds(350,152,50,20);
                  p.add(c1);
                  c2=new Checkbox("NO",cg1,true);
                  c2.setBounds(410,152,50,20);
                  p.add(c2);
               }  
                 l3=new JLabel("If 'YES' then please specify: \n");
                  l3.setFont(new Font("Arial",Font.BOLD,16));
                  l3.setBounds(520,150,800,20);
                  p.add(l3);
                  l4=new JLabel("Bank");
                  l4.setFont(new Font("Arial",Font.BOLD,16));
                  l4.setBounds(790,120,100,20);
                  p.add(l4);
                  l5=new JLabel("A/c No.");
                  l5.setFont(new Font("Arial",Font.BOLD,16));
                  l5.setBounds(890,120,100,20);
                  p.add(l5);
                  l6=new JLabel("1.");
                  l6.setFont(new Font("Arial",Font.BOLD,16));
                  l6.setBounds(735,150,20,20);
                  p.add(l6);
                  tf1=new JTextField(10);
                  tf1.setFont(new Font("Arial",Font.BOLD,16));
                  tf1.setBounds(760,150,100,20);
                  tf1.setText(bak1);
                  p.add(tf1);
                  tf2=new JTextField(10);
                  tf2.setFont(new Font("Arial",Font.BOLD,16));
                  tf2.setBounds(870,150,100,20);
                  tf2.setText(acc1);
                  p.add(tf2);                
                  l7=new JLabel("2.");
                  l7.setFont(new Font("Arial",Font.BOLD,16));
                  l7.setBounds(735,180,20,20);
                  p.add(l7);
                  tf3=new JTextField(10);
                  tf3.setFont(new Font("Arial",Font.BOLD,16));
                  tf3.setBounds(760,180,100,20);
                  tf3.setText(bak2);
                  p.add(tf3);
                  tf4=new JTextField(10);
                  tf4.setFont(new Font("Arial",Font.BOLD,16));
                  tf4.setBounds(870,180,100,20);
                  tf4.setText(acc2);
                  p.add(tf4);                
                  l8=new JLabel("3.");
                  l8.setFont(new Font("Arial",Font.BOLD,16));
                  l8.setBounds(735,210,20,20);
                  p.add(l8);
                  tf5=new JTextField(10);
                  tf5.setFont(new Font("Arial",Font.BOLD,16));
                  tf5.setBounds(760,210,100,20);
                  tf5.setText(bak3);
                  p.add(tf5);
                  tf6=new JTextField(10);
                  tf6.setFont(new Font("Arial",Font.BOLD,16));
                  tf6.setBounds(870,210,100,20);
                  tf6.setText(acc3);
                  p.add(tf6);                
                  l9=new JLabel("4.");
                  l9.setFont(new Font("Arial",Font.BOLD,16));
                  l9.setBounds(735,240,20,20);
                  p.add(l9);
                  tf7=new JTextField(10);
                  tf7.setFont(new Font("Arial",Font.BOLD,16));
                  tf7.setBounds(760,240,100,20);
                  tf7.setText(bak4);
                  p.add(tf7);
                  tf8=new JTextField(10);
                  tf8.setFont(new Font("Arial",Font.BOLD,16));
                  tf8.setBounds(870,240,100,20);
                  tf8.setText(acc4);
                  p.add(tf8);
                  l11=new JLabel("Do you own any property? \n");
                  l11.setFont(new Font("Arial",Font.BOLD,16));
                  l11.setBounds(100,300,800,20);
                  p.add(l11);
                  if(pr.equalsIgnoreCase("yes")) 
                {
                  cg2=new CheckboxGroup();
                  c3=new Checkbox("YES",cg2,true);
                  c3.setBounds(350,302,50,20);
                  p.add(c3);
                  c4=new Checkbox("NO",cg2,false);
                  c4.setBounds(410,302,50,20);
                  p.add(c4);
                }
                  else
                {
                  cg2=new CheckboxGroup();
                  c3=new Checkbox("YES",cg2,false);
                  c3.setBounds(350,302,50,20);
                  p.add(c3);
                  c4=new Checkbox("NO",cg2,true);
                  c4.setBounds(410,302,50,20);
                  p.add(c4);
                }
                  l12=new JLabel("If 'YES' then please specify: \n");
                  l12.setFont(new Font("Arial",Font.BOLD,16));
                  l12.setBounds(520,300,800,20);
                  p.add(l12);
                  l4=new JLabel("Complete Address");
                  l4.setFont(new Font("Arial",Font.BOLD,16));
                  l4.setBounds(800,275,150,20);
                  p.add(l4);
                  l13=new JLabel("1.");
                  l13.setFont(new Font("Arial",Font.BOLD,16));
                  l13.setBounds(735,300,20,20);
                  p.add(l13);
                  tf9=new JTextField(25);
                  tf9.setFont(new Font("Arial",Font.BOLD,16));
                  tf9.setBounds(760,300,215,20);
                  tf9.setText(ca1);
                  p.add(tf9);
                  l14=new JLabel("2.");
                  l14.setFont(new Font("Arial",Font.BOLD,16));
                  l14.setBounds(735,330,20,20);
                  p.add(l14);
                  tf10=new JTextField(25);
                  tf10.setFont(new Font("Arial",Font.BOLD,16));
                  tf10.setBounds(760,330,215,20);
                  tf10.setText(ca2);
                  p.add(tf10);
                  l15=new JLabel("3.");
                  l15.setFont(new Font("Arial",Font.BOLD,16));
                  l15.setBounds(735,360,20,20);
                  p.add(l15);
                  tf11=new JTextField(25);
                  tf11.setFont(new Font("Arial",Font.BOLD,16));
                  tf11.setBounds(760,360,215,20);
                  tf11.setText(ca3);
                  p.add(tf11);
                  l16=new JLabel("Do you own any Vechile? \n");
                  l16.setFont(new Font("Arial",Font.BOLD,16));
                  l16.setBounds(100,420,800,20);
                  p.add(l16);
                  if(ve.equalsIgnoreCase("yes"))
                {
                  cg3=new CheckboxGroup();
                  c5=new Checkbox("YES",cg3,true);
                  c5.setBounds(350,422,50,20);
                  p.add(c5);
                  c6=new Checkbox("NO",cg3,false);
                  c6.setBounds(410,422,50,20);
                  p.add(c6);
                }
                  else
                {
                  cg3=new CheckboxGroup();
                  c5=new Checkbox("YES",cg3,false);
                  c5.setBounds(350,422,50,20);
                  p.add(c5);
                  c6=new Checkbox("NO",cg3,true);
                  c6.setBounds(410,422,50,20);
                  p.add(c6);
                }

                  l17=new JLabel("If 'YES' then please specify: \n");
                  l17.setFont(new Font("Arial",Font.BOLD,16));
                  l17.setBounds(520,420,800,20);
                  p.add(l17);
                  l18=new JLabel("Type");
                  l18.setFont(new Font("Arial",Font.BOLD,16));
                  l18.setBounds(790,390,100,20);
                  p.add(l18);
                  l19=new JLabel("Vehicle No.");
                  l19.setFont(new Font("Arial",Font.BOLD,16));
                  l19.setBounds(875,390,150,20);
                  p.add(l19);
                  l20=new JLabel("1.");
                  l20.setFont(new Font("Arial",Font.BOLD,16));
                  l20.setBounds(735,420,20,20);
                  p.add(l20);
                  tf12=new JTextField(10);
                  tf12.setFont(new Font("Arial",Font.BOLD,16));
                  tf12.setBounds(760,420,100,20);
                  tf12.setText(ty1);
                  p.add(tf12);
                  tf13=new JTextField(10);
                  tf13.setFont(new Font("Arial",Font.BOLD,16));
                  tf13.setBounds(870,420,100,20);
                  tf13.setText(vn1);
                  p.add(tf13);                
                  l21=new JLabel("2.");
                  l21.setFont(new Font("Arial",Font.BOLD,16));
                  l21.setBounds(735,450,20,20);
                  p.add(l21);
                  tf14=new JTextField(10);
                  tf14.setFont(new Font("Arial",Font.BOLD,16));
                  tf14.setBounds(760,450,100,20);
                  tf14.setText(ty2);
                  p.add(tf14);
                  tf15=new JTextField(10);
                  tf15.setFont(new Font("Arial",Font.BOLD,16));
                  tf15.setBounds(870,450,100,20);
                  tf15.setText(vn2);
                  p.add(tf15);                
                  l22=new JLabel("3.");
                  l22.setFont(new Font("Arial",Font.BOLD,16));
                  l22.setBounds(735,480,20,20);
                  p.add(l22);
                  tf16=new JTextField(10);
                  tf16.setFont(new Font("Arial",Font.BOLD,16));
                  tf16.setBounds(760,480,100,20);
                  tf16.setText(ty3);
                  p.add(tf16);
                  tf17=new JTextField(10);
                  tf17.setFont(new Font("Arial",Font.BOLD,16));
                  tf17.setBounds(870,480,100,20);
                  tf17.setText(vn3);
                  p.add(tf17);
                  b3= new JButton("Next");
                  b3.setFont(new Font("Arial",Font.BOLD,16));
                  b3.setBounds(480,600,80,25);
                  p.add(b3);
                  b3.addActionListener(this);
 

            }



                public void actionPerformed(ActionEvent e)

             {
               Object ob=e.getSource();
                 
                     if(ob==b3)
                 
                      { 
                          f.setVisible(false);
                          Sh_Form3_B s1=new Sh_Form3_B();
                          s1.show16(id3);                                                 

                     }

                             
             }



}
            
                  
