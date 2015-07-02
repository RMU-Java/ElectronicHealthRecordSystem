
package EHRAppointment;

/**
 *
 * @author Austin, Olena, Daniel
 */

import java.util.Date;

/**
 * Patient to map database
 */
public class Patient  implements java.io.Serializable {
    private static final long serialVersionUID = 1931738403372388885L;


     private Integer patientId;
     private String name;
     private Date birthday;
     private String sex;
     private String address;
     private String maritalStatus;
     private String job;
     private String phone;

    /**
     *
     */
    public Patient() {
    }

    /**
     *
     * @param name
     * @param birthday
     * @param sex
     * @param address
     * @param maritalStatus
     * @param job
     * @param phone
     */
    public Patient(String name, Date birthday, String sex, String address, String maritalStatus, String job, String phone) {
       this.name = name;
       this.birthday = birthday;
       this.sex = sex;
       this.address = address;
       this.maritalStatus = maritalStatus;
       this.job = job;
       this.phone = phone;
    }
   
    /**
     *
     * @return
     */
    public Integer getPatientId() {
        return this.patientId;
    }
    
    /**
     *
     * @param patientId
     */
    public void setPatientId(Integer patientId) {
        this.patientId = patientId;
    }

    /**
     *
     * @return
     */
    public String getName() {
        return this.name;
    }
    
    /**
     *
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     *
     * @return
     */
    public Date getBirthday() {
        return this.birthday;
    }
    
    /**
     *
     * @param birthday
     */
    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    /**
     *
     * @return
     */
    public String getSex() {
        return this.sex;
    }
    
    /**
     *
     * @param sex
     */
    public void setSex(String sex) {
        this.sex = sex;
    }

    /**
     *
     * @return
     */
    public String getAddress() {
        return this.address;
    }
    
    /**
     *
     * @param address
     */
    public void setAddress(String address) {
        this.address = address;
    }

    /**
     *
     * @return
     */
    public String getMaritalStatus() {
        return this.maritalStatus;
    }
    
    /**
     *
     * @param maritalStatus
     */
    public void setMaritalStatus(String maritalStatus) {
        this.maritalStatus = maritalStatus;
    }

    /**
     *
     * @return
     */
    public String getJob() {
        return this.job;
    }
    
    /**
     *
     * @param job
     */
    public void setJob(String job) {
        this.job = job;
    }

    /**
     *
     * @return
     */
    public String getPhone() {
        return this.phone;
    }
    
    /**
     *
     * @param phone
     */
    public void setPhone(String phone) {
        this.phone = phone;
    }

     @Override
    public String toString(){
        return this.name;
    }


}
