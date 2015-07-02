package EHRAppointment;

/**
 *
 * @author Austin, Olena, Daniel
 */

import java.util.Date;

/**
 * Prescription to map into database
 */
public class Prescription  implements java.io.Serializable {
    private static final long serialVersionUID = 8195630669106129173L;


     private Integer prescriptionId;
     private int patientId;
     private Date dateTime;
     private String notes;

    public Prescription() {
    }

    public Prescription(int patientId, Date dateTime, String notes) {
       this.patientId = patientId;
       this.dateTime = dateTime;
       this.notes = notes;
    }
   
    public Integer getPrescriptionId() {
        return this.prescriptionId;
    }
    
    public void setPrescriptionId(Integer prescriptionId) {
        this.prescriptionId = prescriptionId;
    }
    public int getPatientId() {
        return this.patientId;
    }
    
    public void setPatientId(int patientId) {
        this.patientId = patientId;
    }
    public Date getDateTime() {
        return this.dateTime;
    }
    
    public void setDateTime(Date dateTime) {
        this.dateTime = dateTime;
    }
    public String getNotes() {
        return this.notes;
    }
    
    public void setNotes(String notes) {
        this.notes = notes;
    }

     @Override
     public String toString(){
    return dateTime.toString();
}


}


