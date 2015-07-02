# ElectronicHealthRecordSystem
## Team Members
* Austin @austinvernsonger
* Olena @elenkapush
* Daniel @delreal2

### Javadoc  [For The Documentation Of the Objects, Classes, and Etc (Click Here)](http://rmu-java.github.io/ElectronicHealthRecordSystem/)


###MIS 525:  Object Oriented Programming   Final Project

> _The goal of the project is to deploy the different object oriented concepts studied in class to build one integrated application that simulates a real world problem. The project will be implemented using the Java programming language._

> _This is a Electronic Health Record System With Appointment Scheduler that manages patient records and tracks patient-doctor appointments. Information related to both tasks can be manipulated as well as queried. In this project, the different programming concepts learned in Java including files, arrays, loops, GUI, objects and classes will be used to address the functions performed by the medical information system._

##Files
*  _This project will use files to maintain the system and patient information._


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




