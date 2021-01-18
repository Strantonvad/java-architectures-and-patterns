package dataMapper;

import java.io.Serializable;

public class User implements Serializable {
  private static final long serialVersionUID = 1L;

  private int userId;
  private String name;
  private char dept;

  public User(final int userId, final String name, final char dept) {
    this.userId = userId;
    this.name = name;
    this.dept = dept;
  }

  public int getUserId() {
    return userId;
  }

  public void setUserId(final int userId) {
    this.userId = userId;
  }

  public String getName() {
    return name;
  }

  public void setName(final String name) {
    this.name = name;
  }

  public char getDept() {
    return dept;
  }

  public void setDept(final char dept) {
    this.dept = dept;
  }

  @Override
  public boolean equals(final Object inputObject) {
    boolean isEqual = false;

    if (this == inputObject) {
      isEqual = true;
    } else if (inputObject != null && getClass() == inputObject.getClass()) {
      final User inputUser = (User) inputObject;
      if (this.getUserId() == inputUser.getUserId()) {
        isEqual = true;
      }
    }

    return isEqual;
  }

  @Override
  public int hashCode() {
    return this.getUserId();
  }

  @Override
  public String toString() {
    return "User [userId=" + userId + ", name=" + name + ", dep=" + dept + "]";
  }
}
