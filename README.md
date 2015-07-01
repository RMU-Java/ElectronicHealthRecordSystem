# ElectronicHealthRecordSystem

###MIS 525:  Object Oriented Programming   Final Project

_The goal of the project is to deploy the different object oriented concepts studied in class to build one integrated application that simulates a real world problem. The project will be implemented using the Java programming language._

_This is a Electronic Health Record System With Appointment Scheduler that manages patient records and tracks patient-doctor appointments. Information related to both tasks can be manipulated as well as queried. In this project, the different programming concepts learned in Java including files, arrays, loops, GUI, objects and classes will be used to address the functions performed by the medical information system._

##Files
*  _This project will use files to maintain the system and patient information._

<<<<<<< HEAD
##Arrays
=======
Using a MySQL Database for Data Input and Output

```XML
<?xml version="1.0" encoding="UTF-8"?>
<persistence version="2.1" xmlns="http://xmlns.jcp.org/xml/ns/persistence" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" xsi:schemaLocation="http://xmlns.jcp.org/xml/ns/persistence http://xmlns.jcp.org/xml/ns/persistence/persistence_2_1.xsd">
  <persistence-unit name="EHR-AppointmentPU" transaction-type="RESOURCE_LOCAL">
    <provider>org.eclipse.persistence.jpa.PersistenceProvider</provider>
    <properties>
      <property name="javax.persistence.jdbc.url" value="jdbc:mysql://ehrappointment.c2q69yirrq2s.us-west-2.rds.amazonaws.com:3306/EHRAppointment?zeroDateTimeBehavior=convertToNull"/>
      <property name="javax.persistence.jdbc.password" value="######!"/>
      <property name="javax.persistence.jdbc.driver" value="com.mysql.jdbc.Driver"/>
      <property name="javax.persistence.jdbc.user" value="EHRAppointment"/>
    </properties>
  </persistence-unit>
</persistence>
```

##Arrays
>>>>>>> origin/master

##Loops


##Objects and Classes

### Patient 
* Patient.java (Public Class) | implements java.io.Serializable |
```Java
     private Integer patientId;
     private String name;
     private Date birthday;
     private String sex;
     private String address;
     private String maritalStatus;
     private String job;
     private String phone;
```     

* Patient.hbm.xml
```XML
<?xml version="1.0" encoding="UTF-8"?>
<!DOCTYPE hibernate-mapping PUBLIC "-//Hibernate/Hibernate Mapping DTD 3.0//EN" "http://www.hibernate.org/dtd/hibernate-mapping-3.0.dtd">
<!-- Generated Jul 27, 2014 6:07:16 PM by Hibernate Tools 3.6.0 -->
<hibernate-mapping>
  <class catalog="EHRAppointment" name="GUI.Patient" table="patient">
    <id name="patientId" type="java.lang.Integer">
      <column name="patient_id"/>
      <generator class="identity"/>
    </id>
    <property name="name" type="string">
      <column length="60" name="name" not-null="true"/>
    </property>
    <property name="birthday" type="date">
      <column length="10" name="birthday" not-null="true"/>
    </property>
    <property name="sex" type="string">
      <column length="7" name="sex" not-null="true"/>
    </property>
    <property name="address" type="string">
      <column length="80" name="address" not-null="true"/>
    </property>
    <property name="maritalStatus" type="string">
      <column length="8" name="marital_status" not-null="true"/>
    </property>
    <property name="job" type="string">
      <column length="10" name="job" not-null="true"/>
    </property>
    <property name="phone" type="string">
      <column length="15" name="phone" not-null="true"/>
    </property>
  </class>
</hibernate-mapping>
```

### Hibernate Utility 
1. NewHibernateUtil.java

|  Public Class | Private Classes| Imports |
| ------------- |:--------------:| -------:|
|public class NewHibernateUtil|private static final SessionFactory sessionFactory|import org.hibernate.cfg.AnnotationConfiguration;|   
|               |                |import org.hibernate.SessionFactory|
|               |                |         |
|               |                |         |
|               |                |         | 

2. Exceptions
```Java
static {
        try {
            // Create the SessionFactory from standard (hibernate.cfg.xml) 
            // config file.
            sessionFactory = new AnnotationConfiguration().configure().buildSessionFactory();
        } catch (Throwable ex) {
            // Log the exception. 
            System.err.println("Initial SessionFactory creation failed." + ex);
            throw new ExceptionInInitializerError(ex);
        }
```
### Patient Info Export
* PatientInfoExport.java

> implements java.io.Serializable  
> use to serialize data of a patient and transfer

|  Public Class | Private Classes| Imports |
| ------------- |:--------------:| -------:|
|public class PatientInfoExport|private Patient patient |import java.util.|   
||private Insurance insuarenceInfo||
||private GeneralMedicalInfo generalMedicalInfo||
||private List (Prescription) pres||
||private List (Vitals) vitals|| 

Loops

Arrays

Exceptions


###  User Info
* Userinfo.java

|  Public Class | Private Classes| Imports |
| ------------- |:--------------:| -------:|
|public class Userinfo|private String username;|         |   
|               |private String type;|         |
|               |private String passwordhash;|         |
|               |private String question;|         |
|               |private String answer;|         | 

Strings:
```Java
    public Userinfo(String username, String type, String passwordhash, String question, String answer) {
       this.username = username;
       this.type = type;
       this.passwordhash = passwordhash;
       this.question = question;
       this.answer = answer;
    }
```
* Userinfo.hbm.xml

### User Password Match
1. UserPasswordMatch.java

>
>
|  Public Class | Private Classes| Imports |
| ------------- |:--------------:| -------:|
|public class UserPasswordMatch||import java.security.MessageDigest;|   
|               |                |import java.util.Arrays;|
|               |                |         |
|               |                |         |
|               |                |         | 

public static String getHash(Arrays/Exceptions) 
```Java
public static String getHash(String password) throws Exception {
        MessageDigest sha256=MessageDigest.getInstance("SHA-256");
        byte[] passBytes=password.getBytes();
        byte[] passHash=sha256.digest(passBytes);
        String hash=Arrays.toString(passHash);
        return hash;
}
```
public static boolean compareData (1st Arrays/Exceptions)
```Java
public static boolean compareData(Userinfo user,String password) throws Exception// returns true if username and password is a match
    {
        if(user.getPasswordhash().equals(getHash(password)))
            return true;
        else
            return false;
    }
```
public static boolean changePassword (2nd Arrays/Exceptions)
```Java
public static boolean changePassword(Userinfo user,String curPassword,String newPassword) throws Exception
    {
        if(compareData(user,curPassword))
        {
            user.setPasswordhash(getHash(newPassword));
            return true;
        }
        else
            return false;
    }
```
public static boolean compareQuestion (3rd Arrays/Exceptions)
```Java
public static boolean compareQuestion(Userinfo user,String answer) throws Exception// returns true if username and password is a match
    {
        if(user.getAnswer().equals(getHash(answer)))
            return true;
        else
            return false;
    }
```
### Schedule
* Schedule.java

>
>
|  Public Class | Private Classes| Imports |
| ------------- |:--------------:| -------:|
|               |                |         |   
|               |                |         |
|               |                |         |
|               |                |         |
|               |                |         | 

Loops

Arrays

Exceptions
* Schedule.hbm.xml

### Insurance
* Insurance.java

>
>
|  Public Class | Private Classes| Imports |
| ------------- |:--------------:| -------:|
|               |                |         |   
|               |                |         |
|               |                |         |
|               |                |         |
|               |                |         | 

Loops

Arrays

Exceptions
### Vitals
* Vitals.java

>
>
|  Public Class | Private Classes| Imports |
| ------------- |:--------------:| -------:|
|               |                |         |   
|               |                |         |
|               |                |         |
|               |                |         |
|               |                |         | 

Loops

Arrays

Exceptions          

* Vitals.hbm.xml

### Prescription
* Prescription.java

>
>
|  Public Class | Private Classes| Imports |
| ------------- |:--------------:| -------:|
|               |                |         |   
|               |                |         |
|               |                |         |
|               |                |         |
|               |                |         | 

Loops

Arrays

Exceptions
* Prescription.hbm.xml

### Chart Panel Draw
* ChartPanelDraw.java
```Java
|  Public Class | Private Classes| Imports |
| ------------- |:--------------:| -------:|
|       |     |     |
|       |     |     |
|       |     |     | 
```
### General Medical Info
* GeneralMedicalInfo.java
```Java
|  Public Class | Private Classes| Imports | Exceptions | Arrays  |  Loops |
| ------------- |:--------------:| -------:| ----------:|--------:| ------:|
|               |                |         |            |         |        |
|               |                |         |            |         |        |
|               |                |         |            |         |        |
|               |                |         |            |         |        |
|               |                |         |            |         |        |  
```
* GeneralMedicalInfo.hbm.xml 


## GUI InterFaces (Objects and Classes)

### WelcomeInterface
* WelcomeInterface.java
```Java
|  Public Class | Private Classes| Imports | Exceptions | Arrays  |  Loops |
| ------------- |:--------------:| -------:| ----------:|--------:| ------:|
|               |                |         |            |         |        |
|               |                |         |            |         |        |
|               |                |         |            |         |        |
|               |                |         |            |         |        |
|               |                |         |            |         |        |  
```
* WelcomeInterface.form

### Main Window
* mainWindow.java
```Java
|  Public Class | Private Classes| Imports | Exceptions | Arrays  |  Loops |
| ------------- |:--------------:| -------:| ----------:|--------:| ------:|
|               |                |         |            |         |        |
|               |                |         |            |         |        |
|               |                |         |            |         |        |
|               |                |         |            |         |        |
|               |                |         |            |         |        |  
```
* mainWindow.form

### Patient Info InterFace
* PatientInfoInterface.java
```Java
|  Public Class | Private Classes| Imports | Exceptions | Arrays  |  Loops |
| ------------- |:--------------:| -------:| ----------:|--------:| ------:|
|               |                |         |            |         |        |
|               |                |         |            |         |        |
|               |                |         |            |         |        |
|               |                |         |            |         |        |
|               |                |         |            |         |        |  
```
* PatientInfoInterFace.form

### General Medical Interface
* GeneralMedicalInterface.java
```Java
|  Public Class | Private Classes| Imports | Exceptions | Arrays  |  Loops |
| ------------- |:--------------:| -------:| ----------:|--------:| ------:|
|               |                |         |            |         |        |
|               |                |         |            |         |        |
|               |                |         |            |         |        |
|               |                |         |            |         |        |
|               |                |         |            |         |        |  
```
* GeneralMedicalInterface.form

### Demographics InterFace
* DemographicInterface.java
```Java
|  Public Class | Private Classes| Imports | Exceptions | Arrays  |  Loops |
| ------------- |:--------------:| -------:| ----------:|--------:| ------:|
|               |                |         |            |         |        |
|               |                |         |            |         |        |
|               |                |         |            |         |        |
|               |                |         |            |         |        |
|               |                |         |            |         |        |  
```
* DemographicInterface.form

### Insurance Interface
* InsuranceInterface.java
```Java
|  Public Class | Private Classes| Imports | Exceptions | Arrays  |  Loops |
| ------------- |:--------------:| -------:| ----------:|--------:| ------:|
|               |                |         |            |         |        |
|               |                |         |            |         |        |
|               |                |         |            |         |        |
|               |                |         |            |         |        |
|               |                |         |            |         |        |  
```
* InsuranceInterface.form

### Main Window
* mainWindow.java
```Java
|  Public Class | Private Classes| Imports | Exceptions | Arrays  |  Loops |
| ------------- |:--------------:| -------:| ----------:|--------:| ------:|
|               |                |         |            |         |        |
|               |                |         |            |         |        |
|               |                |         |            |         |        |
|               |                |         |            |         |        |
|               |                |         |            |         |        |  
```
* mainWindow.form

### Login
* Login.java
```Java
|  Public Class | Private Classes| Imports | Exceptions | Arrays  |  Loops |
| ------------- |:--------------:| -------:| ----------:|--------:| ------:|
|               |                |         |            |         |        |
|               |                |         |            |         |        |
|               |                |         |            |         |        |
|               |                |         |            |         |        |
|               |                |         |            |         |        |  
```
* Login.form

### More Interface
* MoreInterface.java
```Java
|  Public Class | Private Classes| Imports | Exceptions | Arrays  |  Loops |
| ------------- |:--------------:| -------:| ----------:|--------:| ------:|
|               |                |         |            |         |        |
|               |                |         |            |         |        |
|               |                |         |            |         |        |
|               |                |         |            |         |        |
|               |                |         |            |         |        |  
```
* MoreInterface.form

### Password Reset Interface
* PasswordResetInterface.java
```Java
|  Public Class | Private Classes| Imports | Exceptions | Arrays  |  Loops |
| ------------- |:--------------:| -------:| ----------:|--------:| ------:|
|               |                |         |            |         |        |
|               |                |         |            |         |        |
|               |                |         |            |         |        |
|               |                |         |            |         |        |
|               |                |         |            |         |        |  
```
* PasswordResetInterface.form

### Prescription Interface
* PrescriptionInterface.java
```Java
|  Public Class | Private Classes| Imports | Exceptions | Arrays  |  Loops |
| ------------- |:--------------:| -------:| ----------:|--------:| ------:|
|               |                |         |            |         |        |
|               |                |         |            |         |        |
|               |                |         |            |         |        |
|               |                |         |            |         |        |
|               |                |         |            |         |        |  
```
* PrescriptionInterface.form

### Previous Vitals Interface
* PreviousVitalsInterface.java
```Java
|  Public Class | Private Classes| Imports | Exceptions | Arrays  |  Loops |
| ------------- |:--------------:| -------:| ----------:|--------:| ------:|
|               |                |         |            |         |        |
|               |                |         |            |         |        |
|               |                |         |            |         |        |
|               |                |         |            |         |        |
|               |                |         |            |         |        |  
```
* PreviousVitalsInterface.form

### Schedule Interface
* ScheduleInterface.java
```Java
|  Public Class | Private Classes| Imports | Exceptions | Arrays  |  Loops |
| ------------- |:--------------:| -------:| ----------:|--------:| ------:|
|               |                |         |            |         |        |
|               |                |         |            |         |        |
|               |                |         |            |         |        |
|               |                |         |            |         |        |
|               |                |         |            |         |        |  
```
* ScheduleInterface.form

### Search Window
* SearchWindow.java
```Java
|  Public Class | Private Classes| Imports | Exceptions | Arrays  |  Loops |
| ------------- |:--------------:| -------:| ----------:|--------:| ------:|
|               |                |         |            |         |        |
|               |                |         |            |         |        |
|               |                |         |            |         |        |
|               |                |         |            |         |        |
|               |                |         |            |         |        |  
```
* SearchWindow.form

### Select PatientInterface
* SelectPatientInterface.java
```Java
|  Public Class | Private Classes| Imports | Exceptions | Arrays  |  Loops |
| ------------- |:--------------:| -------:| ----------:|--------:| ------:|
|               |                |         |            |         |        |
|               |                |         |            |         |        |
|               |                |         |            |         |        |
|               |                |         |            |         |        |
|               |                |         |            |         |        |  
```
* SelectPatientInterface.form

### Vitals Interface
* VitalsInterface.java
```Java
|  Public Class | Private Classes| Imports | Exceptions | Arrays  |  Loops |
| ------------- |:--------------:| -------:| ----------:|--------:| ------:|
|               |                |         |            |         |        |
|               |                |         |            |         |        |
|               |                |         |            |         |        |
|               |                |         |            |         |        |
|               |                |         |            |         |        |  
```
* VitalsInterface.form


##GUI
*  _Java GUI capabilities will be used to display windows to for input, modify patient information and display results of queries for retrieval of information._

### Main Window - Draft 1
![] (https://raw.githubusercontent.com/RMU-Java/ElectronicHealthRecordSystem/master/EHRAS/2015_07_01_10_47_44_EHRAS.png)

### Welcome InterFace - Draft 1
![] (https://raw.githubusercontent.com/RMU-Java/ElectronicHealthRecordSystem/master/EHRAS/WelcomeInterface%20-%20Draft%201.png)

### VitalsInterFace Part 1 - Draft 1
![] (https://raw.githubusercontent.com/RMU-Java/ElectronicHealthRecordSystem/master/EHRAS/VitalsInterFace Part1 - Draft 1.png)

### VitalsInterFace Part 2 - Draft 1
![] (https://raw.githubusercontent.com/RMU-Java/ElectronicHealthRecordSystem/master/EHRAS/VitalsInterFace%20Part2%20-%20Draft%201.png)

### Select Patient Window - Draft 1
![] (https://raw.githubusercontent.com/RMU-Java/ElectronicHealthRecordSystem/master/EHRAS/Select%20Patient%20Window%20-%20Draft%201.png)

### Schedule Interface - Draft 1
![] (https://raw.githubusercontent.com/RMU-Java/ElectronicHealthRecordSystem/master/EHRAS/Schedule%20InterFace%20-%20Draft%201.png)

### Prescriptions -  Draft 1
![] (https://raw.githubusercontent.com/RMU-Java/ElectronicHealthRecordSystem/master/EHRAS/Prescriptions%20-%20Draft%201.png)

### Patient Previous Vital Signs - Draft 1
![] (https://raw.githubusercontent.com/RMU-Java/ElectronicHealthRecordSystem/master/EHRAS/PatientPreviousVitalSigns%20-%20Draft%201.png)

### Patient Demographics InterFace - Draft 1
![] (https://raw.githubusercontent.com/RMU-Java/ElectronicHealthRecordSystem/master/EHRAS/PatientDemographicsInterFace%20-%20Draft%201.png)

###
![] (https://raw.githubusercontent.com/RMU-Java/ElectronicHealthRecordSystem/master/EHRAS/Password Reset Interface - Draft 1.png)

###
![] (https://raw.githubusercontent.com/RMU-Java/ElectronicHealthRecordSystem/master/EHRAS/MoreInterFace - Users - Draft 1.png)

###
![] (https://raw.githubusercontent.com/RMU-Java/ElectronicHealthRecordSystem/master/EHRAS/MoreInterFace - Settings - Draft 1.png)

###
![] (https://raw.githubusercontent.com/RMU-Java/ElectronicHealthRecordSystem/master/EHRAS/MoreInterFace - Reports - Draft 1.png)

###
![] (https://raw.githubusercontent.com/RMU-Java/ElectronicHealthRecordSystem/master/EHRAS/MoreInterFace - Remove - Draft 1.png)

###
![] (https://raw.githubusercontent.com/RMU-Java/ElectronicHealthRecordSystem/master/EHRAS/MoreInterFace - Export and Import Data - Draft 1.png)

###
![] (https://raw.githubusercontent.com/RMU-Java/ElectronicHealthRecordSystem/master/EHRAS/InsuranceInterFace -  Draft 1.png)




###Grading
![](http://i.imgur.com/uphy7DZ.png)




