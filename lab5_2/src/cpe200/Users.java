package cpe200;


import java.util.ArrayList;

/**
 * Created by pruet on 12/9/2559.
 */
public class Users {
    public ArrayList<User> userList;
    public Users(){
        userList = new ArrayList<>();
    }

    public void addUser(User user)
    {
        userList.add(user);
    }

    public void addUser(String userName, String password) throws Exception {
        User user = new User();
        user.setUserName(userName);
        user.setPassword(password);
        if(user != null)
            userList.add(user);

    }

    public void deleteUser(User user) throws Exception {
        if(!exists(user)||count() == 0)
            throw new RuntimeException();
        try
        {userList.remove(user);}
        catch (RuntimeException ex){

        }

    }

    public boolean exists(User user)
    {
        return userList.contains(user);
    }

    public boolean usernameExists(String username)
    {
        for(User user : userList){
            if(user.getUserName().equals(username))
                return true;
                  }
        return false;


    }

    /* This method should return null when the user with username is not in the list */
    public User getUserByUsername(String userName)
    {
        for(User user : userList){
                  if(user.getUserName().equals(userName)) return user;
              }
        return null;


    }

    public int count()
    {
        return userList.size();
    }

    public User[] getUserArray()
    {
        return userList.toArray(new User[0]);
    }
}
