package cpe200;

/**
 * Created by pruet on 6/9/2559.
 */
public class User {
    private String userName = null;
    private String password;

    public User() {
    }

    public String setUserName(String name) throws Exception {
        String tmp = this.userName;
        String regex = "[A-Za-z][A-Za-z0-9]{7,}$";
        if(name.matches(regex)) {
            this.userName = name;
        }
        else
            throw new RuntimeException();
        try{
            return tmp;
        }
        catch (RuntimeException ex){


        }
        return null;
    }

    public int setPassword(String name) {
        String regex = "^(?=.*[a-z])(?=.*[A-Z])(?=.*[0-9])([a-zA-Z0-9]{12,})$";
        if(name.matches(regex)) {
            this.password = name;
        }
        else
            throw new RuntimeException();
        try{
            return  this.password.length();
        }
        catch (RuntimeException ex){

        }
        return 0;
    }

    public String getUserName() {

        return this.userName;
    }

    public String getPassword() {
        return this.password;
    }
}
