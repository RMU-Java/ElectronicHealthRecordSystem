package EHRAppointment;
/**
 * Schedule to map database 
*/
import java.util.Date;

/**
 *
 * @author songer
 */
public class Schedule  implements java.io.Serializable {
    private static final long serialVersionUID = 6947165903813644064L;
/**
 *
 * @author Austin, Olena, Daniel
 */
     private Integer scheduleId;
     private int patientId;
     private Date date;
     private int startTime;
     private int endTime;
     private String location;

    /**
     *
     */
    public Schedule() {
    }

    /**
     *
     * @param patientId
     * @param date
     * @param startTime
     * @param endTime
     * @param location
     */
    public Schedule(int patientId, Date date, int startTime, int endTime, String location) {
       this.patientId = patientId;
       this.date = date;
       this.startTime = startTime;
       this.endTime = endTime;
       this.location = location;
    }
   
    /**
     *
     * @return
     */
    public Integer getScheduleId() {
        return this.scheduleId;
    }
    
    /**
     *
     * @param scheduleId
     */
    public void setScheduleId(Integer scheduleId) {
        this.scheduleId = scheduleId;
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
    public Date getDate() {
        return this.date;
    }
    
    /**
     *
     * @param date
     */
    public void setDate(Date date) {
        this.date = date;
    }

    /**
     *
     * @return
     */
    public int getStartTime() {
        return this.startTime;
    }
    
    /**
     *
     * @param startTime
     */
    public void setStartTime(int startTime) {
        this.startTime = startTime;
    }

    /**
     *
     * @return
     */
    public int getEndTime() {
        return this.endTime;
    }
    
    /**
     *
     * @param endTime
     */
    public void setEndTime(int endTime) {
        this.endTime = endTime;
    }

    /**
     *
     * @return
     */
    public String getLocation() {
        return this.location;
    }
    
    /**
     *
     * @param location
     */
    public void setLocation(String location) {
        this.location = location;
    }

    @Override
    public String toString(){
        return this.location;
    }
    


}


