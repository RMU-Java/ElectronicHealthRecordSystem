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

    /**
     *
     */
    public Prescription() {
    }

    /**
     *
     * @param patientId
     * @param dateTime
     * @param notes
     */
    public Prescription(int patientId, Date dateTime, String notes) {
       this.patientId = patientId;
       this.dateTime = dateTime;
       this.notes = notes;
    }
   
    /**
     *
     * @return
     */
    public Integer getPrescriptionId() {
        return this.prescriptionId;
    }
    
    /**
     *
     * @param prescriptionId
     */
    public void setPrescriptionId(Integer prescriptionId) {
        this.prescriptionId = prescriptionId;
    }

    /**
     *
     * @return
     */
    public int getPatientId() {
        return this.patientId;
    }
    
    /**
     *
     * @param patientId
     */
    public void setPatientId(int patientId) {
        this.patientId = patientId;
    }

    /**
     *
     * @return
     */
    public Date getDateTime() {
        return this.dateTime;
    }
    
    /**
     *
     * @param dateTime
     */
    public void setDateTime(Date dateTime) {
        this.dateTime = dateTime;
    }

    /**
     *
     * @return
     */
    public String getNotes() {
        return this.notes;
    }
    
    /**
     *
     * @param notes
     */
    public void setNotes(String notes) {
        this.notes = notes;
    }

     @Override
     public String toString(){
    return dateTime.toString();
}


}


