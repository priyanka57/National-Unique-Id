# National-Unique-Id

I created an application, “Unique ID” using Java core as the programming language and MySQL as relational database and MongoDB as NoSQL database. The application asks admin to insert details regarding citizens of a country by filling four different forms and in the end generates a 12 digit UNIQUE ID for that citizen. The admin can then update/search/delete/add new entries. The application provides census and show ID features too. The first form is mandatory to fill and asks admin to enter the citizen’s basic information and image to proceed further. The first two digits of the ID shows country code, next two digits show state code, next two digits shows male/female and remaining digits are generated random. The String and Numeric data types are stored in MySQL whereas Images are stored in MongoDB as binary data using GridFS feature. Both the databases sync with each other to store the complete information of the citizen through this application. 

I selected MongoDB for storing the images for its GridFS feature. It stores the content as binary files collection, called chunks and the file metadata is stored in a separate collection called files. GridFS also stores and retrieves the file with more than 16 MB BSON document which will provide ease in this application. No particular relational schema is required prior to store the images in the MongoDB which made it suitable to use. As I am not in need for storing any relational content, MongoDB fit in. I used MySQL to store the string/numeric data types as I need to properly establish a schema to store the content and the values entered are related to each other with ID generated as the primary key. As I am searching/updating/showing/deleting entries by using ID as the primary key, it was mandatory to establish a relation between the contents of different tables and how they are associated with one ID. Moreover, I need to create tables before storing the values entered by the admin through the application whereas in MongoDB, I do not need any table/collection to create. MongoDB creates on its own (as chunks and files collection) to store the image. 

I did not store images in MySQL for many reasons. As images are generally >1 MB, it will take extra hits for transactions to complete. Also, if I use MySQL as database for storing the images, it would require me to define a schema which is not required while storing the image in MongoDB. MongoDB reduces over head to store images easily in chunks and can be retrieved fast as compared to MySQL. Moreover, storing images in MySQL will give scaling problems. If images are <250K then save the image as BLOB in the MySQL database or else save the image file to the filesystem and store the link to that image in the MySQL. These conditions are not necessary to mandate in MongoDB and scaling is easy. There is no restriction to store any large binary file using GridFS. Similarly, I did not place the MySQL data in MongoDB as I need to define a relational schema to combine the primary key, ID with other columns of the four tables defined in this project. 

The interesting concept in this project is to synchronize the application with two different databases. Some part of the data is stored in MySQL and other part is stored in MongoDB which I am entering through the application. DNS of this project is “project2” which is shared among the application, MySQL queries and MongoDB database. Moreover, I have defined the semantic in MySQL and the application coding. The application first intakes the data and through MySQL-JDBC and Mongo-JDBC drivers, the data is stored in the respective databases. Mongo’s intuitive architecture did not require to define the shared semantic. SQL queries are needed to execute prior to run this project. And, there are particular parts in the application coding where the relational and non-relational data is synchronizing. Including appropriate Java packages for SQL and Mongo makes these three to work together. 



##To run the project: 

Create a database in SQL using queries.txt. Setup MongoDB. Make sure you have all the JDBC and ODBC drivers and java-Mongo and java-SQL drivers installed in your system. Complile and run Home.java to start the application. 


1. The programming is done using java core and MySQL act as relational database for storing the string and numeric values for this project.
 
2. MongoDB acts as non relational database for storing the images of the entries for this project.

3. Name of DNS of this project is "project2".

4. Please execute all the queries of txt file queries.txt before executing java files.

5. Include MYSQL and MongoDB jar files while compiling and running the project. 

5. Run the project using command java Home.


Thank You.
