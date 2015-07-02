/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package EHRAppointment;

import java.util.*;

/**
 *
 * @author Austin, Olena, Daniel
 */
public class PatientInfoExport implements java.io.Serializable{  
    private static final long serialVersionUID = -959913511573951939L;
//use to serialize data of a patient and transfer
    
    private final Patient patient;
    private final Insurance insuarenceInfo;
    private final GeneralMedicalInfo generalMedicalInfo;
    private final List<Prescription> pres;
    private final List<Vitals> vitals;

    /**
     *
     * @param patient
     * @param insuarenceInfo
     * @param generalInfo
     * @param pres
     * @param vitals
     */
    public PatientInfoExport(Patient patient, Insurance insuarenceInfo, GeneralMedicalInfo generalInfo, List<Prescription> pres, List<Vitals> vitals) {
        this.patient = patient;
        this.insuarenceInfo = insuarenceInfo;
        this.generalMedicalInfo = generalInfo;
        this.pres = pres;
        this.vitals = vitals;
    }

    /**
     *
     * @return
     */
    public Patient getPatient() {
        return patient;
    }

    /**
     *
     * @return
     */
    public Insurance getInsuarenceInfo() {
        return insuarenceInfo;
    }

    /**
     *
     * @return
     */
    public GeneralMedicalInfo getGeneralMedicalInfo() {
        return generalMedicalInfo;
    }

    /**
     *
     * @return
     */
    public List<Prescription> getPrescription() {
        return pres;
    }

    /**
     *
     * @return
     */
    public List<Vitals> getVitals() {
        return vitals;
    }
    
    
    
    
    
}
