package EHRAppointment;
/**
 *
 * @author Austin, Olena, Daniel
 */

import java.util.Date;

/**
 * Insurance to map database
 */
public class Insurance  implements java.io.Serializable {
    private static final long serialVersionUID = 9204116864543496414L;


     private Integer insuranceID;
     private String provider;
     private String planName;
     private Date effectiveDate;
     private String policyNumber;
     private int patientId;
    private Integer insuranceId;

    public Insurance() {
    }

    public Insurance(String provider, String planName, Date effectiveDate, String policyNumber, int patientId) {
       this.provider = provider;
       this.planName = planName;
       this.effectiveDate = effectiveDate;
       this.policyNumber = policyNumber;
       this.patientId = patientId;
    }
   
    public Integer getInsuranceId() {
        return this.insuranceId;
    }
    
    public void setInsuranceId(Integer insuranceId) {
        this.insuranceId = insuranceId;
    }
    public String getProvider() {
        return this.provider;
    }
    
    public void setProvider(String provider) {
        this.provider = provider;
    }
    public String getPlanName() {
        return this.planName;
    }
    
    public void setPlanName(String planName) {
        this.planName = planName;
    }
    public Date getEffectiveDate() {
        return this.effectiveDate;
    }
    
    public void setEffectiveDate(Date effectiveDate) {
        this.effectiveDate = effectiveDate;
    }
    public String getPolicyNumber() {
        return this.policyNumber;
    }
    
    public void setPolicyNumber(String policyNumber) {
        this.policyNumber = policyNumber;
    }
    public int getPatientId() {
        return this.patientId;
    }
    
    public void setPatientId(int patientId) {
        this.patientId = patientId;
    }




}


