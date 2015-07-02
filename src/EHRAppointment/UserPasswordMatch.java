package EHRAppointment;

import java.security.MessageDigest;
import java.util.Arrays;

/**
 *
 * @author songer
 */
public class UserPasswordMatch {
/**
 * @author Austin, Olena, Daniel
     * @param password
     * @return 
     * @throws java.lang.Exception
 */
    public static String getHash(String password) throws Exception {
        MessageDigest sha256=MessageDigest.getInstance("SHA-256");
        byte[] passBytes=password.getBytes();
        byte[] passHash=sha256.digest(passBytes);
        String hash=Arrays.toString(passHash);
        return hash;
    }
    
    /**
     *
     * @param user
     * @param password
     * @return
     * @throws Exception
     */
    public static boolean compareData(Userinfo user,String password) throws Exception// returns true if username and password is a match
    {
        return user.getPasswordhash().equals(getHash(password));
    }
    
    /**
     *
     * @param user
     * @param curPassword
     * @param newPassword
     * @return
     * @throws Exception
     */
    public static boolean changePassword(Userinfo user,String curPassword,String newPassword) throws Exception
    {
        if(compareData(user,curPassword))
        {
            user.setPasswordhash(getHash(newPassword));
            return true;
        }
        else
            return false;
    }
     
    /**
     *
     * @param user
     * @param answer
     * @return
     * @throws Exception
     */
    public static boolean compareQuestion(Userinfo user,String answer) throws Exception// returns true if username and password is a match
    {
        return user.getAnswer().equals(getHash(answer));
    }
}
