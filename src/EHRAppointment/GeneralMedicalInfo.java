package EHRAppointment;
/**
 * GeneralMedicalInfo to map database
 */
public class GeneralMedicalInfo  implements java.io.Serializable {
    private static final long serialVersionUID = -9179837156953225633L;
/**
 *
 * @author Austin, Olena, Daniel
 */

     private int patientId;
     private String mainMedicalProblem;
     private String medicalProblems;
     private String allergies;
     private String immunizations;

    /**
     *
     */
    public GeneralMedicalInfo() {
    }

    /**
     *
     * @param patientId
     * @param mainMedicalProblem
     * @param medicalProblems
     * @param allergies
     * @param immunizations
     */
    public GeneralMedicalInfo(int patientId, String mainMedicalProblem, String medicalProblems, String allergies, String immunizations) {
       this.patientId = patientId;
       this.mainMedicalProblem = mainMedicalProblem;
       this.medicalProblems = medicalProblems;
       this.allergies = allergies;
       this.immunizations = immunizations;
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
    public String getMainMedicalProblem() {
        return this.mainMedicalProblem;
    }
    
    /**
     *
     * @param mainMedicalProblem
     */
    public void setMainMedicalProblem(String mainMedicalProblem) {
        this.mainMedicalProblem = mainMedicalProblem;
    }

    /**
     *
     * @return
     */
    public String getMedicalProblems() {
        return this.medicalProblems;
    }
    
    /**
     *
     * @param medicalProblems
     */
    public void setMedicalProblems(String medicalProblems) {
        this.medicalProblems = medicalProblems;
    }

    /**
     *
     * @return
     */
    public String getAllergies() {
        return this.allergies;
    }
    
    /**
     *
     * @param allergies
     */
    public void setAllergies(String allergies) {
        this.allergies = allergies;
    }

    /**
     *
     * @return
     */
    public String getImmunizations() {
        return this.immunizations;
    }
    
    /**
     *
     * @param immunizations
     */
    public void setImmunizations(String immunizations) {
        this.immunizations = immunizations;
    }




}


