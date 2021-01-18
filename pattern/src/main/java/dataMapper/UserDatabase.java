package dataMapper;

public class UserDatabase {
  public User finder(int key){

    // Check for user object in IdentityMap
    User user = IdentityMapUtility.getUser(key);
    if(user == null){
      IdentityMapUtility.addUser(user);
    }
    return user;

  }
}
