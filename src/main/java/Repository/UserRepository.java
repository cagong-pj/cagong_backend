package Repository;

import domain.User;

import java.util.Optional;

public interface UserRepository {
    Optional<User> findByUserId(String name);


}
