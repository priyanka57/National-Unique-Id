import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;

class U_Form3_B implements ActionListener

{
   int i=0;
   long id4;
   JFrame f;
   JPanel p;
   JLabel l1, l2, l3, l4, l5, l6, l7, l8, l9,l10,l11,l12,l13,l14,l15,l16,l17,l18,l19,l20,l21;
   JButton b1,b2;
   JTextField tf1, tf2, tf3, tf4, tf5,tf6,tf7,tf8, tf9, tf10, tf11,tf12,tf13;
   Checkbox c1,c2,c3,c4,c5,c6,c7,c8;
   CheckboxGroup cg1,cg2,cg3,cg4;
   Choice ch;
                   
                       

                    public void show10(long id3)
              {
                  id4=id3;
                  long val;
                  Connection con1=null;
                  Statement st1;
                  ResultSet rs1;
                         String bu=null;
                         String ty=null;
                         String add=null;
                         String org=null;
                         String orgn=null;
                         String desig=null;
                         String ip=null;
                         String co1=null;
                         String co2=null;
                         String co3=null;
                         String co4=null; 
                         String pno1=null;
                         String pno2=null;
                         String pno3=null;
                         String pno4=null;                         
                         String mar=null;
                         String ac=null;
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
                                           rs1=st1.executeQuery("select * from formIIIB");
                                               while(rs1.next())
                                             {
                                                      val=rs1.getLong(1);
                                                      if(id3==val)
                                               {      
                                                      bu=rs1.getString(2).trim();
                                                      ty=rs1.getString(3).trim();
                                                      add=rs1.getString(4).trim();
                                                      org=rs1.getString(5).trim();
                                                      orgn=rs1.getString(6).trim();
                                                      desig=rs1.getString(7).trim();
                                                      ip=rs1.getString(8).trim();
                                                      co1=rs1.getString(9).trim();
                                                      pno1=rs1.getString(10).trim();
                                                      co2=rs1.getString(11).trim();
                                                      pno2=rs1.getString(12).trim();
                                                      co3=rs1.getString(13).trim();
                                                      pno3=rs1.getString(14).trim();
                                                      co4=rs1.getString(15).trim();
                                                      pno4=rs1.getString(16).trim();
                                                      mar=rs1.getString(17).trim();
                                                      ac=rs1.getString(18).trim();
                                                      if((co1.equals(null))||(co1.equals("")))
                                                      { i=0;}
                                                      else if((co2.equals(null))||(co2.equals("")))
                                                      { i=1;}
                                                      else if((co3.equals(null))||(co3.equals("")))
                                                      { i=2;}
                                                      else if((co4.equals(null))||(co4.equals("")))
                                                      { i=3;}
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
                  l1=new JLabel("FORM III B \n");
                  l1.setFont(new Font("Arial",Font.BOLD,22));
                  l1.setBounds(450,70,150,20);
                  p.add(l1);
                  l2=new JLabel("Do you own any Buisness? \n");
                  l2.setFont(new Font("Arial",Font.BOLD,16));
                  l2.setBounds(70,150,800,20);
                  p.add(l2);
                  
                  if(bu.equalsIgnoreCase("yes"))
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
                  l4=new JLabel("Type");
                  l4.setFont(new Font("Arial",Font.BOLD,16));
                  l4.setBounds(790,120,100,20);
                  p.add(l4);
                  l5=new JLabel("Address");
                  l5.setFont(new Font("Arial",Font.BOLD,16));
                  l5.setBounds(890,120,100,20);
                  p.add(l5);
                  tf1=new JTextField(10);
                  tf1.setFont(new Font("Arial",Font.BOLD,16));
                  tf1.setBounds(760,150,100,20);
                  tf1.setText(ty);
                  p.add(tf1);
                  tf2=new JTextField(10);
                  tf2.setFont(new Font("Arial",Font.BOLD,16));
                  tf2.setBounds(870,150,100,20);
                  tf2.setText(add);
                  p.add(tf2);                
                  l6=new JLabel("Do you work in any organisation? \n");
                  l6.setFont(new Font("Arial",Font.BOLD,16));
                  l6.setBounds(70,200,800,20);
                  p.add(l6);
                  if(org.equalsIgnoreCase("yes"))
                {
                  cg2=new CheckboxGroup();
                  c3=new Checkbox("YES",cg2,true);
                  c3.setBounds(350,202,50,20);
                  p.add(c3);
                  c4=new Checkbox("NO",cg2,false);
                  c4.setBounds(410,202,50,20);
                  p.add(c4);
                }
                  else
                {
                  cg2=new CheckboxGroup();
                  c3=new Checkbox("YES",cg2,false);
                  c3.setBounds(350,202,50,20);
                  p.add(c3);
                  c4=new Checkbox("NO",cg2,true);
                  c4.setBounds(410,202,50,20);
                  p.add(c4); 
                }
                  l7=new JLabel("If 'YES' then please specify: \n");
                  l7.setFont(new Font("Arial",Font.BOLD,16));
                  l7.setBounds(520,200,800,20);
                  p.add(l7);
                  l8=new JLabel("Organisation Name");
                  l8.setFont(new Font("Arial",Font.BOLD,16));
                  l8.setBounds(800,175,150,20);
                  p.add(l8);
                  l9=new JLabel("Your Designation");
                  l9.setFont(new Font("Arial",Font.BOLD,16));
                  l9.setBounds(800,225,150,20);
                  p.add(l9);
                  tf3=new JTextField(25);
                  tf3.setFont(new Font("Arial",Font.BOLD,16));
                  tf3.setBounds(760,200,215,20);
                  tf3.setText(orgn);
                  p.add(tf3);
                  tf4=new JTextField(25);
                  tf4.setFont(new Font("Arial",Font.BOLD,16));
                  tf4.setBounds(760,250,215,20);
                  tf4.setText(desig);
                  p.add(tf4);
                  l10=new JLabel("Do you have any Insurance Policy? \n");
                  l10.setFont(new Font("Arial",Font.BOLD,16));
                  l10.setBounds(70,300,800,20);
                  p.add(l10);
                  if(ip.equalsIgnoreCase("yes"))
                {
                  cg3=new CheckboxGroup();
                  c5=new Checkbox("YES",cg3,true);
                  c5.setBounds(350,302,50,20);
                  p.add(c5);
                  c6=new Checkbox("NO",cg3,false);
                  c6.setBounds(410,302,50,20);
                  p.add(c6);
                }
                  else
                {
                  cg3=new CheckboxGroup();
                  c5=new Checkbox("YES",cg3,false);
                  c5.setBounds(350,302,50,20);
                  p.add(c5);
                  c6=new Checkbox("NO",cg3,true);
                  c6.setBounds(410,302,50,20);
                  p.add(c6);   
                }
                  l11=new JLabel("If 'YES' then please specify: \n");
                  l11.setFont(new Font("Arial",Font.BOLD,16));
                  l11.setBounds(520,300,800,20);
                  p.add(l11);
                  l12=new JLabel("Company");
                  l12.setFont(new Font("Arial",Font.BOLD,16));
                  l12.setBounds(780,275,100,20);
                  p.add(l12);
                  l13=new JLabel("Policy No.");
                  l13.setFont(new Font("Arial",Font.BOLD,16));
                  l13.setBounds(880,275,150,20);
                  p.add(l13);
                  l14=new JLabel("1.");
                  l14.setFont(new Font("Arial",Font.BOLD,16));
                  l14.setBounds(735,300,20,20);
                  p.add(l14);
                  tf5=new JTextField(10);
                  tf5.setFont(new Font("Arial",Font.BOLD,16));
                  tf5.setBounds(760,300,100,20);
                  tf5.setText(co1);
                  p.add(tf5);
                  tf6=new JTextField(10);
                  tf6.setFont(new Font("Arial",Font.BOLD,16));
                  tf6.setBounds(870,300,100,20);
                  tf6.setText(pno1);
                  p.add(tf6);                
                  l15=new JLabel("2.");
                  l15.setFont(new Font("Arial",Font.BOLD,16));
                  l15.setBounds(735,330,20,20);
                  p.add(l15);
                  tf7=new JTextField(10);
                  tf7.setFont(new Font("Arial",Font.BOLD,16));
                  tf7.setBounds(760,330,100,20);
                  tf7.setText(co2);
                  p.add(tf7);
                  tf8=new JTextField(10);
                  tf8.setFont(new Font("Arial",Font.BOLD,16));
                  tf8.setBounds(870,330,100,20);
                  tf8.setText(pno2);
                  p.add(tf8);                
                  l16=new JLabel("3.");
                  l16.setFont(new Font("Arial",Font.BOLD,16));
                  l16.setBounds(735,360,20,20);
                  p.add(l16);
                  tf9=new JTextField(10);
                  tf9.setFont(new Font("Arial",Font.BOLD,16));
                  tf9.setBounds(760,360,100,20);
                  tf9.setText(co3);
                  p.add(tf9);
                  tf10=new JTextField(10);
                  tf10.setFont(new Font("Arial",Font.BOLD,16));
                  tf10.setBounds(870,360,100,20);
                  tf10.setText(pno3);
                  p.add(tf10);
                  l17=new JLabel("4.");
                  l17.setFont(new Font("Arial",Font.BOLD,16));
                  l17.setBounds(735,390,20,20);
                  p.add(l17);
                  tf11=new JTextField(10);
                  tf11.setFont(new Font("Arial",Font.BOLD,16));
                  tf11.setBounds(760,390,100,20);
                  tf11.setText(co4);
                  p.add(tf11);
                  tf12=new JTextField(10);
                  tf12.setFont(new Font("Arial",Font.BOLD,16));
                  tf12.setBounds(870,390,100,20);
                  tf12.setText(pno4);
                  p.add(tf12);
                  l18=new JLabel("Company Name");
                  l18.setFont(new Font("Arial",Font.BOLD,16));
                  l18.setBounds(515,330,150,20);
                  p.add(l18);
                  ch=new Choice();
                  ch.add("Bajaj Allianz Life Insurance Company Limited"); 
                  ch.add("Birla Sun Life Insurance Co. Ltd"); 
                  ch.add("HDFC Standard Life Insurance Co. Ltd"); 
                  ch.add("ICICI Prudential Life Insurance Co. Ltd."); 
                  ch.add("ING Vysya Life Insurance Company Ltd."); 
                  ch.add("Life Insurance Corporation of India"); 
                  ch.add("Max New York Life Insurance Co. Ltd"); 
                  ch.add("Met Life India Insurance Company Ltd."); 
                  ch.add("Kotak Mahindra Old Mutual Life Insurance Limited"); 
                  ch.add("SBI Life Insurance Co. Ltd"); 
                  ch.add("Tata AIG Life Insurance Company Limited"); 
                  ch.add("Reliance Life Insurance Company Limited."); 
                  ch.add("Aviva Life Insurance Co. India Pvt. Ltd."); 
                  ch.add("Sahara India Life Insurance Co, Ltd."); 
                  ch.add("Shriram Life Insurance Co, Ltd.");
                  ch.add("Bharti AXA Life Insurance Company Ltd."); 
                  ch.add("Future Generali Life Insurance Company Ltd."); 
                  ch.add("IDBI Fortis Life Insurance Company Ltd."); 
                  ch.add("Canara HSBC Oriental Bank of Commerce Life Insurance Co. Ltd"); 
                  ch.add("AEGON Religare Life Insurance Company Limited."); 
                  ch.add("DLF Pramerica Life Insurance Co. Ltd."); 
                  ch.add("Star Union Dai-ichi Life Insurance Comp. Ltd."); 
                  ch.setBounds(520,350,200,20);
                  p.add(ch);
                  b1=new JButton("Add");
                  b1.setFont(new Font("Arial",Font.BOLD,16));
                  b1.setBounds(575,375,70,30);
                  p.add(b1);
                  b1.addActionListener(this);
                  l19=new JLabel("Do you Invest in Market? \n");
                  l19.setFont(new Font("Arial",Font.BOLD,16));
                  l19.setBounds(70,450,800,20);
                  p.add(l19);
                  if(mar.equalsIgnoreCase("yes"))
                {
                  cg4=new CheckboxGroup();
                  c7=new Checkbox("YES",cg4,true);
                  c7.setBounds(350,452,50,20);
                  p.add(c7);
                  c8=new Checkbox("NO",cg4,false);
                  c8.setBounds(410,452,50,20);
                  p.add(c8);
                }
                  else
                {
                  cg4=new CheckboxGroup();
                  c7=new Checkbox("YES",cg4,false);
                  c7.setBounds(350,452,50,20);
                  p.add(c7);
                  c8=new Checkbox("NO",cg4,true);
                  c8.setBounds(410,452,50,20);
                  p.add(c8); 
                }
                  l20=new JLabel("If 'YES' then please specify: \n");
                  l20.setFont(new Font("Arial",Font.BOLD,16));
                  l20.setBounds(520,450,800,20);
                  p.add(l20);
                  l21=new JLabel("Demat A/c No.");
                  l21.setFont(new Font("Arial",Font.BOLD,16));
                  l21.setBounds(810,425,150,20);
                  p.add(l21);
                  tf13=new JTextField(25);
                  tf13.setFont(new Font("Arial",Font.BOLD,16));
                  tf13.setBounds(760,450,200,20);
                  tf13.setText(ac);
                  p.add(tf13);
                  b2= new JButton("Submit");
                  b2.setFont(new Font("Arial",Font.BOLD,16));
                  b2.setBounds(470,600,100,30);
                  p.add(b2);
                  b2.addActionListener(this);
 

            }



                public void actionPerformed(ActionEvent e)

             {
               Object ob=e.getSource();
                 
                     if(ob==b1)
                 
                      { 
                         String s=null;
                                           if(i==0)
                                     { 
                                           s=ch.getSelectedItem();
                                           tf5.setText(s);
                                           i++;
                                     }
                     
                                                                                      
                                            else if(i==1)
                                     { 
                                           s=ch.getSelectedItem();
                                           tf7.setText(s);
                                           i++;
                                     }

                                               
                                             else if(i==2)
                                     { 
                                           s=ch.getSelectedItem();
                                           tf9.setText(s);
                                           i++;
                                     }   


                                             else if(i==3)
                                     { 
                                           s=ch.getSelectedItem();
                                           tf11.setText(s);
                                           i=0;
                                     }   

                                     

                       }

                         else if(ob==b2)
                 
                      { 

                         String bu=cg1.getSelectedCheckbox().getLabel();
                         String ty=tf1.getText();
                         String add=tf2.getText();
                         String org=cg2.getSelectedCheckbox().getLabel();
                         String orgn=tf3.getText();
                         String desig=tf4.getText();
                         String ip=cg3.getSelectedCheckbox().getLabel();
                         String co1=tf5.getText();
                         String co2=tf7.getText();
                         String co3=tf9.getText();
                         String co4=tf11.getText(); 
                         String pno1=tf6.getText();
                         String pno2=tf8.getText();
                         String pno3=tf10.getText();
                         String pno4=tf12.getText();                         
                         String mar=cg3.getSelectedCheckbox().getLabel();
                         String ac=tf13.getText();
                        
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
                                         
                                           st=con.prepareStatement("update formIIIB set Buis=?,Type=?,addr=?,Org=?,OrgName=?,Desig=?,insurp=?,comp1=?,pno1=?,comp2=?,pno2=?,comp3=?,pno3=?,comp4=?,pno4=?,Mar=?,Deemac=? where UID=?");
                                           st.setString(1,bu);
                                           st.setString(2,ty);
                                           st.setString(3,add);
                                           st.setString(4,org);
                                           st.setString(5,orgn);
                                           st.setString(6,desig);
                                           st.setString(7,ip);
                                           st.setString(8,co1);
                                           st.setString(9,pno1);
                                           st.setString(10,co2);
                                           st.setString(11,pno2);
                                           st.setString(12,co3);
                                           st.setString(13,pno3);
                                           st.setString(14,co4);
                                           st.setString(15,pno4);
                                           st.setString(16,mar);
                                           st.setString(17,ac);
                                           st.setLong(18,id4);
                                           st.executeUpdate();
                                           f.setVisible(false);
                                           Notif1 n1=new Notif1();
                                           n1.display1();

                                         }
                                             catch(SQLException e2)
                                         {
                                               System.out.println(e2.getMessage());
                                         }
                              
                                 
                             
                      }
          

             }



}
            
                  
