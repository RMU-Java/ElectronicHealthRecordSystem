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
_Functions performed by the medical information system_

### Patient
* Patient.java
* Patient.hbm.xml

### Hibernate Utility 
* NewHibernateUtil.java
* 
### Patient Info Export
* PatientInfoExport.java

### User Info
* Userinfo.java
* Userinfo.hbm.xml


### User Password Match
* UserPasswordMatch.java

### Schedule
* Schedule.java
* Schedule.hbm.xml

### Insurance
* Insurance.java

### Vitals
* Vitals.java
* Vitals.hbm.xml

### Prescription
* Prescription.java
* Prescription.hbm.xml

### Chart Panel Draw
* ChartPanelDraw.java

### General Medical Info
* GeneralMedicalInfo.java
* GeneralMedicalInfo.hbm.xml 


## GUI InterFaces (Objects and Classes)

### WelcomeInterface
* WelcomeInterface.java
* WelcomeInterface.form

### Main Window
* mainWindow.java
* mainWindow.form

### Patient Info InterFace
* PatientInfoInterface.java
* PatientInfoInterFace.form

### General Medical Interface
* GeneralMedicalInterface.java
* GeneralMedicalInterface.form

### Demographics InterFace
* DemographicInterface.java
* DemographicInterface.form

### Insurance Interface
* InsuranceInterface.java
* InsuranceInterface.form

### Main Window
* mainWindow.java
* mainWindow.form

### Login
* Login.java
* Login.form

### More Interface
* MoreInterface.java
* MoreInterface.form

### Password Reset Interface
* PasswordResetInterface.java
* PasswordResetInterface.form

### Prescription Interface
* PrescriptionInterface.java
* PrescriptionInterface.form

### Previous Vitals Interface
* PreviousVitalsInterface.java
* PreviousVitalsInterface.form

### Schedule Interface
* ScheduleInterface.java
* ScheduleInterface.form

### Search Window
* SearchWindow.java
* SearchWindow.form

### Select PatientInterface
* SelectPatientInterface.java
* SelectPatientInterface.form

### Vitals Interface
* VitalsInterface.java
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




