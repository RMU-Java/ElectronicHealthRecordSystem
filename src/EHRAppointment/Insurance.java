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

    /**
     *
     */
    public Insurance() {
    }

    /**
     *
     * @param provider
     * @param planName
     * @param effectiveDate
     * @param policyNumber
     * @param patientId
     */
    public Insurance(String provider, String planName, Date effectiveDate, String policyNumber, int patientId) {
       this.provider = provider;
       this.planName = planName;
       this.effectiveDate = effectiveDate;
       this.policyNumber = policyNumber;
       this.patientId = patientId;
    }
   
    /**
     *
     * @return
     */
    public Integer getInsuranceId() {
        return this.insuranceId;
    }
    
    /**
     *
     * @param insuranceId
     */
    public void setInsuranceId(Integer insuranceId) {
        this.insuranceId = insuranceId;
    }

    /**
     *
     * @return
     */
    public String getProvider() {
        return this.provider;
    }
    
    /**
     *
     * @param provider
     */
    public void setProvider(String provider) {
        this.provider = provider;
    }

    /**
     *
     * @return
     */
    public String getPlanName() {
        return this.planName;
    }
    
    /**
     *
     * @param planName
     */
    public void setPlanName(String planName) {
        this.planName = planName;
    }

    /**
     *
     * @return
     */
    public Date getEffectiveDate() {
        return this.effectiveDate;
    }
    
    /**
     *
     * @param effectiveDate
     */
    public void setEffectiveDate(Date effectiveDate) {
        this.effectiveDate = effectiveDate;
    }

    /**
     *
     * @return
     */
    public String getPolicyNumber() {
        return this.policyNumber;
    }
    
    /**
     *
     * @param policyNumber
     */
    public void setPolicyNumber(String policyNumber) {
        this.policyNumber = policyNumber;
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




}


