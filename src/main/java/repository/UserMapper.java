package repository;

import domain.User;
import org.springframework.stereotype.Repository;

@Repository
public interface UserMapper {
    //@Select(value = "select now()")
    public String getTime();

    void insertUser(User user);
    void deleteUser(User user);

    User getUserById(Long id);
}
