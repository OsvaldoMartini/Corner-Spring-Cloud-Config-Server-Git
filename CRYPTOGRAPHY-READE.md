### Cryptography Steps

  Rename the files in the folder:
  
  C:\Program Files\Java\jdk1.8.0_162\jre\lib\security
  
  'local_policy.jar'  Rename to 'local_policy-OLD.jar'
  
  'US_export_policy.jar'  Rename to 'US_export_policy-OLD.jar'
  
  Download "jce_policy-8.zip" from:
  
  https://www.oracle.com/technetwork/java/javase/downloads/index.html
  
  'Java Cryptography Extension (JCE) Unlimited Strength'
  'Jurisdiction Policy Files for JDK/JRE'
  
  Unzip the file:
  and copy and paste the files into the folder above:
  
  'local_policy.jar'
  'US_export_policy.jar'

 
 Restart the Server and : 
 Execute a 'POST' Request do Encrypt and Decrypt
 
 Url
 
 'localhost:8888/encrypt'
 
 Body
 ````
  connectionstring=server123;user=root;password=pass@word1
  
 ````

It generates random encrypted string:

````
 27baedce4fa80f69e94a3617954501422931f77c1f879faa3dd0c763d803d32ab57aca8cb941761a3c0c28efd0fdbf9dcd5cfa52c009040a4f2db4f390b4436843e418ab87e94e250c93189193fc7bcc
```` 

Use the same to Decrypt:

Url

 'localhost:8888/decrypt'
 
 Body
````
 27baedce4fa80f69e94a3617954501422931f77c1f879faa3dd0c763d803d32ab57aca8cb941761a3c0c28efd0fdbf9dcd5cfa52c009040a4f2db4f390b4436843e418ab87e94e250c93189193fc7bcc
```` 
