package EHRAppointment;
/**
 * Vitals to map database 
*/
import java.util.Date;

/**
 *
 * @author songer
 */
public class Vitals  implements java.io.Serializable {
    private static final long serialVersionUID = 6439837777495048925L;
/**
 *
 * @author Austin, Olena, Daniel
 */
     private Integer vitalId;
     private Date dateTime;
     private float weight;
     private float height;
     private int bpSystolic;
     private int bpDiastolic;
     private int pulse;
     private int temperature;
     private String tempLocation;
     private int oxygenSaturation;
     private float bmi;
     private String notes;
     private int patientId;

    /**
     *
     */
    public Vitals() {
    }

    /**
     *
     * @param dateTime
     * @param weight
     * @param height
     * @param bpSystolic
     * @param bpDiastolic
     * @param pulse
     * @param temperature
     * @param tempLocation
     * @param oxygenSaturation
     * @param bmi
     * @param notes
     * @param patientId
     */
    public Vitals(Date dateTime, float weight, float height, int bpSystolic, int bpDiastolic, int pulse, int temperature, String tempLocation, int oxygenSaturation, float bmi, String notes, int patientId) {
       this.dateTime = dateTime;
       this.weight = weight;
       this.height = height;
       this.bpSystolic = bpSystolic;
       this.bpDiastolic = bpDiastolic;
       this.pulse = pulse;
       this.temperature = temperature;
       this.tempLocation = tempLocation;
       this.oxygenSaturation = oxygenSaturation;
       this.bmi = bmi;
       this.notes = notes;
       this.patientId = patientId;
    }
   
    /**
     *
     * @return
     */
    public Integer getVitalId() {
        return this.vitalId;
    }
    
    /**
     *
     * @param vitalId
     */
    public void setVitalId(Integer vitalId) {
        this.vitalId = vitalId;
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
    public float getWeight() {
        return this.weight;
    }
    
    /**
     *
     * @param weight
     */
    public void setWeight(float weight) {
        this.weight = weight;
    }

    /**
     *
     * @return
     */
    public float getHeight() {
        return this.height;
    }
    
    /**
     *
     * @param height
     */
    public void setHeight(float height) {
        this.height = height;
    }

    /**
     *
     * @return
     */
    public int getBpSystolic() {
        return this.bpSystolic;
    }
    
    /**
     *
     * @param bpSystolic
     */
    public void setBpSystolic(int bpSystolic) {
        this.bpSystolic = bpSystolic;
    }

    /**
     *
     * @return
     */
    public int getBpDiastolic() {
        return this.bpDiastolic;
    }
    
    /**
     *
     * @param bpDiastolic
     */
    public void setBpDiastolic(int bpDiastolic) {
        this.bpDiastolic = bpDiastolic;
    }

    /**
     *
     * @return
     */
    public int getPulse() {
        return this.pulse;
    }
    
    /**
     *
     * @param pulse
     */
    public void setPulse(int pulse) {
        this.pulse = pulse;
    }

    /**
     *
     * @return
     */
    public int getTemperature() {
        return this.temperature;
    }
    
    /**
     *
     * @param temperature
     */
    public void setTemperature(int temperature) {
        this.temperature = temperature;
    }

    /**
     *
     * @return
     */
    public String getTempLocation() {
        return this.tempLocation;
    }
    
    /**
     *
     * @param tempLocation
     */
    public void setTempLocation(String tempLocation) {
        this.tempLocation = tempLocation;
    }

    /**
     *
     * @return
     */
    public int getOxygenSaturation() {
        return this.oxygenSaturation;
    }
    
    /**
     *
     * @param oxygenSaturation
     */
    public void setOxygenSaturation(int oxygenSaturation) {
        this.oxygenSaturation = oxygenSaturation;
    }

    /**
     *
     * @return
     */
    public float getBmi() {
        return this.bmi;
    }
    
    /**
     *
     * @param bmi
     */
    public void setBmi(float bmi) {
        this.bmi = bmi;
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

     @Override
   public String toString(){
        return dateTime.toString();
    }


}


