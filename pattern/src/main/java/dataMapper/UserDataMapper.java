package dataMapper;

import java.util.Optional;

public interface UserDataMapper {
  Optional<User> find(int userId);

  void insert(User user) throws DataMapperException;

  void update(User user) throws DataMapperException;

  void delete(User user) throws DataMapperException;
}
