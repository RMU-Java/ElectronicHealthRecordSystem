package EHRAppointment;
// Generated Jul 27, 2014 6:07:15 PM by Hibernate Tools 3.6.0



/**
 *
 * @author Austin, Olena, Daniel
 */
public class Userinfo  implements java.io.Serializable {
    private static final long serialVersionUID = 865678066585201102L;


     private String username;
     private String type;
     private String passwordhash;
     private String question;
     private String answer;

    /**
     *
     */
    public Userinfo() {
    }

    /**
     *
     * @param username
     * @param type
     * @param passwordhash
     * @param question
     * @param answer
     */
    public Userinfo(String username, String type, String passwordhash, String question, String answer) {
       this.username = username;
       this.type = type;
       this.passwordhash = passwordhash;
       this.question = question;
       this.answer = answer;
    }
   
    /**
     *
     * @return
     */
    public String getUsername() {
        return this.username;
    }
    
    /**
     *
     * @param username
     */
    public void setUsername(String username) {
        this.username = username;
    }

    /**
     *
     * @return
     */
    public String getType() {
        return this.type;
    }
    
    /**
     *
     * @param type
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     *
     * @return
     */
    public String getPasswordhash() {
        return this.passwordhash;
    }
    
    /**
     *
     * @param passwordhash
     */
    public void setPasswordhash(String passwordhash) {
        this.passwordhash = passwordhash;
    }

    /**
     *
     * @return
     */
    public String getQuestion() {
        return this.question;
    }
    
    /**
     *
     * @param question
     */
    public void setQuestion(String question) {
        this.question = question;
    }

    /**
     *
     * @return
     */
    public String getAnswer() {
        return this.answer;
    }
    
    /**
     *
     * @param answer
     */
    public void setAnswer(String answer) {
        this.answer = answer;
    }

     @Override
    public String toString(){
        return this.username;
    }


}


