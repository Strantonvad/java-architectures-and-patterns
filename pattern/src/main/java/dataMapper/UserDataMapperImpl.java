package dataMapper;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public final class UserDataMapperImpl implements UserDataMapper {
  private List<User> users = new ArrayList<>();

  @Override
  public Optional<User> find(int userId) {
    for (final User user: this.getUsers()) {
      if (user.getUserId() == userId) {
        return Optional.of(user);
      }
    }

    return Optional.empty();
  }

  @Override
  public void update(User user) throws DataMapperException {

    if (this.getUsers().contains(user)) {
      final int index = this.getUsers().indexOf(user);
      this.getUsers().set(index, user);
    } else {

      throw new DataMapperException("User [" + user.getName() + "] is not found");
    }
  }

  @Override
  public void insert(User user) throws DataMapperException {

    if (!this.getUsers().contains(user)) {
      this.getUsers().add(user);
    } else {
      throw new DataMapperException("User already [" + user.getName() + "] exists");
    }
  }

  @Override
  public void delete(User user) throws DataMapperException {

    if (this.getUsers().contains(user)) {
      this.getUsers().remove(user);
    } else {
      throw new DataMapperException("User [" + user.getName() + "] is not found");
    }
  }

  public List <User> getUsers() {
    return this.users;
  }
}
