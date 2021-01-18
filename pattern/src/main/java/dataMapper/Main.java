package dataMapper;

import java.util.Optional;

public class Main {

  public static void main(final String...args) {

    final UserDataMapper mapper = new UserDataMapperImpl();

    // create
    User user = new User(1, "Ivan", 'A');
    mapper.insert(user);
    System.out.println("user : " + user + ", is inserted");

    //find
    final Optional<User> userToBeFound = mapper.find(user.getUserId());
    System.out.println("user : " + userToBeFound + ", is searched");

    //update
    user = new User(user.getUserId(), "IvanUpdated", 'A');

    mapper.update(user);
    System.out.println("user : " + user + ", is updated");

    //delete
    mapper.delete(user);
  }
}
