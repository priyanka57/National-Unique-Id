import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;
import java.io.*;

class Sh_Form1 extends JFrame implements ActionListener

{
   long id1;
   JFrame f;
   JPanel p;
   JLabel l1, l2, l3, l4, l5, l6, l7, l8, l9, l10,l11,l12,l13,l14;
   JButton b1, b2,b3,b4;
   JTextField tf1, tf2, tf3, tf4, tf5,tf6,tf7,tf8,tf9,tf10,tf11;
   Choice ch1, ch2,ch3,ch4,ch5;
   JButton b6 = new JButton("Upload");
    	
   JTextField tf12=new JTextField(10);
		public Sh_Form1()
		{									
			b6.addActionListener(new ActionListener() 
			{
   
		   		public void actionPerformed(ActionEvent ae) 
				{
     
   					JFileChooser chooser = new JFileChooser();
    
   					chooser.setMultiSelectionEnabled(true);
    
    					int option = chooser.showOpenDialog(Sh_Form1.this);
      
  					if (option == JFileChooser.APPROVE_OPTION)
				 	{
       
   						File file = chooser.getSelectedFile();
						tf12.setText(file.getAbsolutePath()+"/"+file.getName());
 
    					}
    
   					else 
					{
        
 						 tf12.setText("You canceled.");
      
 				 	}
    
  				}
  
 		 	});


		}
                     
                  
                    public void show13(long id)
              {
                  id1=id;
                  Connection con1=null;
                  Statement st1;
                  ResultSet rs1;
                  long val;
                  String fn=null;
                  String ln=null;
                  String sex=null;
                  int dd=0;
                  int mm=0;
                  int y=0;
                  String fan=null;
                  String mn=null;
                  String cd=null;
                  String qa=null;
                  String hs=null;
                  String dd1=null;
                  String mm1=null;
                  String y1=null;


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
                                                      val=rs1.getLong(1);
                                                      if(id1==val)
                                               {      
                                                      fn=rs1.getString(2).trim();
                                                      ln=rs1.getString(3).trim();
                                                      sex=rs1.getString(4).trim();
                                                      dd=rs1.getInt(5);
                                                      mm=rs1.getInt(6);
                                                      y=rs1.getInt(7);
                                                      dd1=Integer.toString(dd);
                                                      mm1=Integer.toString(mm);
                                                      y1=Integer.toString(y);
                                                      fan=rs1.getString(8).trim();
                                                      mn=rs1.getString(9).trim();
                                                      cd=rs1.getString(10).trim();
                                                      qa=rs1.getString(11).trim();
                                                      hs=rs1.getString(12).trim();
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
                  l1=new JLabel("FORM I \n");
                  l1.setFont(new Font("Arial",Font.BOLD,22));
                  l1.setBounds(470,70,100,20);
                  p.add(l1);
                  l2=new JLabel("First Name \n");
                  l2.setFont(new Font("Arial",Font.BOLD,16));
                  l2.setBounds(200,150,100,20);
                  p.add(l2);
                  tf1=new JTextField(10);
                  tf1.setFont(new Font("Arial",Font.PLAIN,16));
                  tf1.setBounds(400,150,100,20);
                  tf1.setText(fn);
                  p.add(tf1);
                  l3=new JLabel("Last Name \n");
                  l3.setFont(new Font("Arial",Font.BOLD,16));
                  l3.setBounds(200,200,100,20);
                  p.add(l3);
                  tf2=new JTextField(10);
                  tf2.setBounds(400,200,100,20);
                  tf2.setFont(new Font("Arial",Font.PLAIN,16));
                  tf2.setText(ln);
                  p.add(tf2);
                  l4=new JLabel("Sex \n");
                  l4.setFont(new Font("Arial",Font.BOLD,16));
                  l4.setBounds(200,250,100,20);
                  p.add(l4);
                  tf7=new JTextField(5);
                  tf7.setBounds(400,250,70,20);
                  tf7.setFont(new Font("Arial",Font.PLAIN,16));
                  tf7.setText(sex);
                  p.add(tf7);
                  l5=new JLabel("D.O.B ");
                  l5.setBounds(200,300,100,20);
                  l5.setFont(new Font("Arial",Font.BOLD,16));
                  p.add(l5);
                  l6=new JLabel("dd");
                  l6.setBounds(400,300,30,20);
                  l6.setFont(new Font("Arial",Font.BOLD,16));
                  p.add(l6);
                  tf8=new JTextField(5);
                  tf8.setBounds(430,300,40,20);
                  tf8.setFont(new Font("Arial",Font.PLAIN,16));
                  tf8.setText(dd1);
                  p.add(tf8);
                  l7=new JLabel("mm");
                  l7.setBounds(480,300,50,20);
                  l7.setFont(new Font("Arial",Font.BOLD,16));
                  p.add(l7);
                  tf9=new JTextField(5);
                  tf9.setBounds(510,300,40,20);
                  tf9.setFont(new Font("Arial",Font.PLAIN,16));
                  tf9.setText(mm1);
                  p.add(tf9);
                  l8=new JLabel("yyyy");
                  l8.setBounds(560,300,60,20);
                  l8.setFont(new Font("Arial",Font.BOLD,16));
                  p.add(l8);
                  tf3 =new JTextField(4);
                  tf3.setFont(new Font("Arial",Font.PLAIN,16));
                  tf3.setBounds(600,300,70,20);
                  tf3.setText(y1);
                  p.add(tf3);
                  l9=new JLabel("Father's Name \n");
                  l9.setFont(new Font("Arial",Font.BOLD,16));
                  l9.setBounds(200,350,140,20);
                  p.add(l9);
                  tf4=new JTextField(10);
                  tf4.setFont(new Font("Arial",Font.PLAIN,16));
                  tf4.setBounds(400,350,100,20);
                  tf4.setText(fan);
                  p.add(tf4);
                  l10=new JLabel("Mother's Name \n");
                  l10.setFont(new Font("Arial",Font.BOLD,16));
                  l10.setBounds(200,400,140,20);
                  p.add(l10);
                  tf5=new JTextField(10);
                  tf5.setFont(new Font("Arial",Font.PLAIN,16));
                  tf5.setBounds(400,400,100,20);
                  tf5.setText(mn);
                  p.add(tf5);
                  l11=new JLabel("Current Address \n");
                  l11.setFont(new Font("Arial",Font.BOLD,16));
                  l11.setBounds(200,500,150,20);
                  p.add(l11);
                  tf6=new JTextField(10);
                  tf6.setFont(new Font("Arial",Font.PLAIN,16));
                  tf6.setBounds(400,500,100,20);
                  tf6.setText(cd);
                  p.add(tf6);
                  l12=new JLabel("Qualification \n");
                  l12.setFont(new Font("Arial",Font.BOLD,16));
                  l12.setBounds(200,550,150,20);
                  p.add(l12);
                  tf10=new JTextField(10);
                  tf10.setFont(new Font("Arial",Font.PLAIN,16));
                  tf10.setBounds(400,550,100,20);
                  tf10.setText(qa);
                  p.add(tf10);
                  l13=new JLabel("Home State \n");
                  l13.setFont(new Font("Arial",Font.BOLD,16));
                  l13.setBounds(200,600,100,20);
                  p.add(l13);
                  tf11=new JTextField(10);
                  tf11.setFont(new Font("Arial",Font.PLAIN,16));
                  tf11.setBounds(400,600,100,20);
                  tf11.setText(hs);
                  p.add(tf11);
		  l14=new JLabel("Photo \n");
                  l14.setFont(new Font("Arial",Font.BOLD,16));
                  l14.setBounds(200,450,100,20);
                  p.add(l14);		  
                  tf12.setFont(new Font("Arial",Font.PLAIN,16));
                  tf12.setBounds(600,450,250,20);   
		  p.add(tf12);	  
                  b6.setFont(new Font("Arial",Font.BOLD,16));
                  b6.setBounds(400,450,90,25);
        	  p.add(b6);
                  b1= new JButton("Next");
                  b1.setFont(new Font("Arial",Font.BOLD,16));
                  b1.setBounds(420,650,80,25);
                  p.add(b1);
                  b2=new JButton("Cancel");
                  b2.setFont(new Font("Arial",Font.BOLD,16));
                  b2.setBounds(540,650,90,25);
                  p.add(b2);
                  b1.addActionListener(this);
                  b2.addActionListener(this);
 
           
             }
         

               public void actionPerformed(ActionEvent e)

             {
               Object ob=e.getSource();
                 
                         if(ob==b1)
                 
                      {  
                                                    
                               f.setVisible(false);
                               Sh_Form2 s2=new Sh_Form2();
                               s2.show14(id1);
                                 

                      }
                     
                       else if(ob==b2)
                 
                      {
                         f.setVisible(false);
                         Home h1=new Home();
                         h1.show();
                      }
                 
             }

}

