import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Random;
import java.sql.*;
import java.io.*;
import java.net.UnknownHostException;
import javax.swing.text.*;
import javax.swing.event.*;
import com.mongodb.*;
import com.mongodb.gridfs.*;

import java.lang.*;

public class Form1 extends JFrame implements ActionListener

{

   JFrame f;
   JPanel p;
   JLabel l1, l2, l3, l4, l5, l6, l7, l8, l9, l10,l11,l12,l13,l14;
   JButton b1, b2;
   static JTextField tf1, tf2, tf3, tf4, tf5,tf6;
   Choice ch1, ch2,ch3,ch4,ch5;
   JButton b6 = new JButton("Open");
 
   JButton uploadButton = new JButton("Upload");   	
   final JLabel statusbar = 
new JLabel("Selected photo will appear here");

    	
   final JLabel uploadStatus = new JLabel("");

	public static String photo = "";

		public Form1()
		{									
			b6.addActionListener(new ActionListener() 
			{
   
		   		public void actionPerformed(ActionEvent ae) 
				{
     
   					JFileChooser chooser = new JFileChooser();
    
   					chooser.setMultiSelectionEnabled(true);
    
    					int option = chooser.showOpenDialog(Form1.this);
      
  					if (option == JFileChooser.APPROVE_OPTION)
				 	{
       
   						File file = chooser.getSelectedFile();
						statusbar.setText(file.getAbsolutePath());
 
						photo = file.getAbsolutePath();
    					}
    
   					else 
					{
        
 						 statusbar.setText("You canceled.");
      
 				 	}
    
  				}
  
 		 	});


		
		uploadButton.addActionListener(new ActionListener() 
		{
   
   			public void actionPerformed(ActionEvent ae) 
			{
     
   				int n=-1;
				if(statusbar.getText() != "Selected photo will appear here")
					try {
						n = uploadImage(statusbar.getText());	
					}
					catch(Exception e)
					{ System.out.println("Exception - "+e); }
				if(n==-1)
					uploadStatus.setText("File cannot be uploaded!!");
				else
					uploadStatus.setText("File uploaded successfully!!");
  			}
  
 		 });

 
	}
	public static byte[] LoadImage(String filePath) throws Exception {
        	File file = new File(filePath);
        	int size = (int)file.length();
       		byte[] buffer = new byte[size];
        	FileInputStream in = new FileInputStream(file);
        	in.read(buffer);
        	in.close();
        	return buffer;
	}
		
	public static int uploadImage(String file_name) throws Exception
	{
			byte[] imageBytes = LoadImage(file_name);
			Mongo mongo = new Mongo("localhost", 27017);
			DB db = mongo.getDB("project2"); 
			System.out.println("Connected to Mongo database successfully");
	
			String newFileName = tf1.getText();
			String secondFileName = tf2.getText();	
			
        		GridFS gfsPhoto = new GridFS(db, "photo");

			GridFSInputFile gfsFile = gfsPhoto.createFile(imageBytes);		

			gfsFile.setFilename(newFileName+"_"+secondFileName);
			
			gfsFile.save();

        		GridFSDBFile out = gfsPhoto.findOne(new BasicDBObject( "_id", gfsFile.getId() ));
			
			File directory = new File("C:/Users/Priyanka Goyal/Desktop/new project2/new project2/source/photos");			
			File fullPath = new File(directory, newFileName+"_"+secondFileName);
        		FileOutputStream outputImage = new FileOutputStream(fullPath+".jpg");
        		
			out.writeTo( outputImage );
       			outputImage.close();
			return 1;

	}	
                   public long generate(long s)
                {
                       
                     final long i[]=new long[1000];
                     int l=0;
                     Random r=new Random();
                     int number=r.nextInt(899999);
                     long v=100000+number;
                     s=s*1000000+v;
                     if(i[0]==0)
                  {
                     i[0]=s;
                     return s;
                  }
                    else   

                  {
                    for(int z=0;z<i.length;z++)
                     {
                       if(i[z]!=0)
                        l++;
                       else 
                       break;
                      }
                      for( int y=0;y<l;y++)
                     {
                        if(s==i[y])
                        {
                          generate(s);
                        }
                     }
                  }
                    i[l]=s;
                    return s;
              
                }
                        
                  
                    public void show2()
              {
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
                  p.add(tf1);
                  l3=new JLabel("Last Name \n");
                  l3.setFont(new Font("Arial",Font.BOLD,16));
                  l3.setBounds(200,200,100,20);
                  p.add(l3);
                  tf2=new JTextField(10);
                  tf2.setBounds(400,200,100,20);
                  tf2.setFont(new Font("Arial",Font.PLAIN,16));
                  p.add(tf2);
                  l4=new JLabel("Sex \n");
                  l4.setFont(new Font("Arial",Font.BOLD,16));
                  l4.setBounds(200,250,100,20);
                  p.add(l4);
                  ch1=new Choice();
                  ch1.add("Male");
                  ch1.add("Female");
                  ch1.setBounds(400,250,70,20);
                  p.add(ch1);
                  l5=new JLabel("D.O.B ");
                  l5.setBounds(200,300,100,20);
                  l5.setFont(new Font("Arial",Font.BOLD,16));
                  p.add(l5);
                  l6=new JLabel("dd");
                  l6.setBounds(400,300,30,20);
                  l6.setFont(new Font("Arial",Font.BOLD,16));
                  p.add(l6);
                  ch2=new Choice();
                  ch2.add("1");
                  ch2.add("2");
                  ch2.add("3");
                  ch2.add("4");
                  ch2.add("5");
                  ch2.add("6");
                  ch2.add("7");
                  ch2.add("8");
                  ch2.add("9");
                  ch2.add("10");
                  ch2.add("11");
                  ch2.add("12");
                  ch2.add("13");
                  ch2.add("14");
                  ch2.add("15");
                  ch2.add("16");
                  ch2.add("17");
                  ch2.add("18");
                  ch2.add("19");
                  ch2.add("20");
                  ch2.add("21");
                  ch2.add("22");
                  ch2.add("23");
                  ch2.add("24");
                  ch2.add("25");
                  ch2.add("26");
                  ch2.add("27");
                  ch2.add("28");
                  ch2.add("29");
                  ch2.add("30");
                  ch2.add("31");
                  ch2.setBounds(430,300,40,20);
                  p.add(ch2);
                  l7=new JLabel("mm");
                  l7.setBounds(480,300,50,20);
                  l7.setFont(new Font("Arial",Font.BOLD,16));
                  p.add(l7);
                  ch3=new Choice();
                  ch3.add("1");
                  ch3.add("2");
                  ch3.add("3");
                  ch3.add("4");
                  ch3.add("5");
                  ch3.add("6");
                  ch3.add("7");
                  ch3.add("8");
                  ch3.add("9");
                  ch3.add("10");
                  ch3.add("11");
                  ch3.add("12");
                  ch3.setBounds(510,300,40,20);
                  p.add(ch3);
                  l8=new JLabel("yyyy");
                  l8.setBounds(560,300,60,20);
                  l8.setFont(new Font("Arial",Font.BOLD,16));
                  p.add(l8);
                  tf3 =new JTextField(4);
                  tf3.setFont(new Font("Arial",Font.PLAIN,16));
                  tf3.setBounds(600,300,70,20);
                  p.add(tf3);
                  l9=new JLabel("Father's Name \n");
                  l9.setFont(new Font("Arial",Font.BOLD,16));
                  l9.setBounds(200,350,140,20);
                  p.add(l9);
                  tf4=new JTextField(10);
                  tf4.setFont(new Font("Arial",Font.PLAIN,16));
                  tf4.setBounds(400,350,100,20);
                  p.add(tf4);
                  l10=new JLabel("Mother's Name \n");
                  l10.setFont(new Font("Arial",Font.BOLD,16));
                  l10.setBounds(200,400,140,20);
                  p.add(l10);
                  tf5=new JTextField(10);
                  tf5.setFont(new Font("Arial",Font.PLAIN,16));
                  tf5.setBounds(400,400,100,20);
                  p.add(tf5);
                  l11=new JLabel("Current Address \n");
                  l11.setFont(new Font("Arial",Font.BOLD,16));
                  l11.setBounds(200,500,150,20);
                  p.add(l11);
                  tf6=new JTextField(10);
                  tf6.setFont(new Font("Arial",Font.PLAIN,16));
                  tf6.setBounds(400,500,100,20);
                  p.add(tf6);
                  l12=new JLabel("Qualification \n");
                  l12.setFont(new Font("Arial",Font.BOLD,16));
                  l12.setBounds(200,550,150,20);
                  p.add(l12);
                  ch4=new Choice();
                  ch4.add("Aviation");
                  ch4.add("B.A");
                  ch4.add("B.Arch");
                  ch4.add("B.B.A");
                  ch4.add("BCA");
                  ch4.add("B.Com");
                  ch4.add("BDS");
                  ch4.add("B.E/B.Tech");
                  ch4.add("B.Ed");
                  ch4.add("BHM");
                  ch4.add("BL/LLB");
                  ch4.add("B.Pharm");
                  ch4.add("B.Sc");
                  ch4.add("CA");
                  ch4.add("Class 12");
                  ch4.add("Class 10");
                  ch4.add("CS");
                  ch4.add("Diploma");
                  ch4.add("ICWA");
                  ch4.add("M.A");
                  ch4.add("M.Arch");
                  ch4.add("MBA");
                  ch4.add("MBBS");
                  ch4.add("MCA");
                  ch4.add("M.Com");
                  ch4.add("MD/MS");
                  ch4.add("M.Ed");
                  ch4.add("M.E/M.Tech/MS");
                  ch4.add("ML/LLM");
                  ch4.add("M.Pharm");
                  ch4.add("Mphil");
                  ch4.add("M.Sc");   
                  ch4.add("PGDCA");
                  ch4.add("PG Diploma");
                  ch4.add("PGDM");     
                  ch4.add("Phd");
                  ch4.add("other");
                  ch4.setBounds(400,550,100,20);
                  p.add(ch4);                  
                  l13=new JLabel("Home State \n");
                  l13.setFont(new Font("Arial",Font.BOLD,16));
                  l13.setBounds(200,600,150,20);
                  p.add(l13);
                  ch5=new Choice();
                  ch5.add("Andhra Pradesh");
                  ch5.add("Arunachal Pradesh");
                  ch5.add("Assam");
                  ch5.add("Bihar");
                  ch5.add("Chhattisgarh");
                  ch5.add("Goa");
                  ch5.add("Gujarat");
                  ch5.add("Haryana");
                  ch5.add("Himachal Pradesh");
                  ch5.add("Jammu & Kashmir");
                  ch5.add("Jharkhand");
                  ch5.add("Karnataka");
                  ch5.add("Kerala");
                  ch5.add("Madhya Pradesh");
                  ch5.add("Maharashtra");
                  ch5.add("Manipur");
                  ch5.add("Meghalaya");
                  ch5.add("Mizoram");
                  ch5.add("Nagaland");
                  ch5.add("Orissa");
                  ch5.add("Punjab");
                  ch5.add("Rajasthan");
                  ch5.add("Sikkim");
                  ch5.add("Tamil Nadu");
                  ch5.add("Tripura");
                  ch5.add("Uttar Pradesh");
                  ch5.add("Uttarakhand");
                  ch5.add("West Bengal");
                  ch5.add("Andaman & Nicobar Island");
                  ch5.add("Chandigarh");
                  ch5.add("Dadra & Nagar Haveli");
                  ch5.add("Daman & Diu");
                  ch5.add("Lakshadweep");
                  ch5.add("Delhi");
                  ch5.add("Puducherry");
                  ch5.setBounds(400,600,160,20);
                  p.add(ch5);   
		  l14=new JLabel("Photo \n");
                  l14.setFont(new Font("Arial",Font.BOLD,16));
                  l14.setBounds(200,450,100,20);
                  p.add(l14);		  
                  statusbar.setFont(new Font("Arial",Font.PLAIN,16));
                  statusbar.setBounds(400,450,250,20);   
		  p.add(statusbar);	  
                  b6.setFont(new Font("Arial",Font.BOLD,16));
                  b6.setBounds(300,450,90,25);
        	  p.add(b6);
		  uploadButton.setFont(new Font("Arial",Font.BOLD,16));
                  uploadButton.setBounds(650,450,90,25);
        	  p.add(uploadButton);
		  uploadStatus.setFont(new Font("Arial",Font.PLAIN,16));
                  uploadStatus.setBounds(750,450,250,20);   
		  p.add(uploadStatus);
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
                         String fn=tf1.getText();
                         String ln=tf2.getText();
                         String sex=ch1.getSelectedItem();
                         int dd=Integer.parseInt(ch2.getSelectedItem());
                         int mm=Integer.parseInt(ch3.getSelectedItem());
                         String y=tf3.getText();
                         String fan=tf4.getText();
                         String mn=tf5.getText();
                         String cd=tf6.getText();
                         String qa=ch4.getSelectedItem();
                         String hs=ch5.getSelectedItem();
			String po=uploadStatus.getText();
                         int i=0,z=0;
                         
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
                                    
                                         else if((y.equals(null))||(y.equals("")))
                                   {
                                              JOptionPane.showMessageDialog(f, 
                                              "Sorry.Birth Year is not filled.","Error Message",                                       
                                              JOptionPane.ERROR_MESSAGE);
                                    z++;
                                   }
                                         
                                         else if((fan.equals(null))||(fan.equals("")))
                                   {
                                              JOptionPane.showMessageDialog(f, 
                                              "Sorry.Father's Name is not filled.","Error Message",                                       
                                              JOptionPane.ERROR_MESSAGE);
                                    z++;
                                   }
                                          
                                         else if((mn.equals(null))||(mn.equals("")))
                                   {
                                              JOptionPane.showMessageDialog(f, 
                                              "Sorry.Mother's Name is not filled.","Error Message",                                       
                                              JOptionPane.ERROR_MESSAGE);
                                    z++;
                                   }
                                          
                                         else if((cd.equals(null))||(cd.equals("")))
                                   {
                                              JOptionPane.showMessageDialog(f, 
                                              "Sorry.Address is not filled.","Error Message",                                       
                                              JOptionPane.ERROR_MESSAGE);
                                    z++;
                                   }
                                     	else if (po != "File uploaded successfully!!")
                                   {
                                              JOptionPane.showMessageDialog(f, 
                                              "Sorry. Photo is not upoladed.","Error Message",                                       
                                              JOptionPane.ERROR_MESSAGE);
                                    z++;
				    }
                                         else if(((i=Integer.parseInt(tf3.getText()))>2011) || ((i=Integer.parseInt(tf3.getText()))<1900))
                                        
                                   {
                                              JOptionPane.showMessageDialog(f, 
                                              "Sorry.Please Check Birth Year.","Error Message",                                       
                                              JOptionPane.ERROR_MESSAGE);
                                    z++;
                                   }
                                        else if(z==0)
                                    
                                   {
                                        long uid=91;
                                        int hs1=ch5.getSelectedIndex();
                                        int y1=Integer.parseInt(tf3.getText());
                                        uid=uid*100+hs1+1;

                                             if(sex.equals("Male"))
                                          {  
                                             uid=uid*100+10;
                                          }
                                             else
                                          {
                                             uid=uid*100+11;
                
                                          }
                                             long id=generate(uid);
                 
                                      Connection con=null;
                                      PreparedStatement st;
                                      
                                            try
                                         {
                                            Class.forName("com.mysql.jdbc.Driver");
                                            con=DriverManager.getConnection("jdbc:mysql://localhost:3306/project2","root","vbnm2357");
					    System.out.println("Connected to SQL database successfully");

                                         }
                                            catch(Exception e1)
                                         {
                                            System.out.println(e1.getMessage());
                                         }

                                            try
                                         {
                                         
                                           st=con.prepareStatement("insert into formI values(?,?,?,?,?,?,?,?,?,?,?,?)");
                                           st.setLong(1,id);
                                           st.setString(2,fn);
                                           st.setString(3,ln);
                                           st.setString(4,sex);
                                           st.setInt(5,dd);
                                           st.setInt(6,mm);
                                           st.setInt(7,y1);
                                           st.setString(8,fan);
                                           st.setString(9,mn);
                                           st.setString(10,cd);
                                           st.setString(11,qa);
                                           st.setString(12,hs);
                                           int  r1= st.executeUpdate();
                                           System.out.println(r1+" "+" Row Inserted");

                                         }
                                             catch(SQLException e2)
                                         {
                                               System.out.println(e2.getMessage());
                                         }

                                                                           
                           
                                               f.setVisible(false);
                                               Form2 f2=new Form2();
                                               f2.show3(id);
                                   }

                      }
			 else if(ob==b2)
                 
                      {
                         f.setVisible(false);
                         Im Im1=new Im();
                         Im1.show1();
                      }
             }

}
