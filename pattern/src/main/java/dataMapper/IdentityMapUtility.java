package dataMapper;

import jdk.internal.access.JavaSecurityAccess;

import java.util.HashMap;
import java.util.Map;

public class IdentityMapUtility {

  private static Map userMap = new HashMap();

  // Add user object to IdentityMap
  public static void addUser(User arg) {
    userMap.put(arg.getUserId(), arg);
  }

  // Retrieve user object from userMap
  public static User getUser(Long key) {
    return (User) userMap.get(key);
  }

  public static User getUser(long key) {
    return getUser(Long.valueOf(key));
  }
}
