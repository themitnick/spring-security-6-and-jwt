package ci.app.springsecurity.repository;

import ci.app.springsecurity.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {

    User findByEmail(String email);

    void findByEmailAndPassword(String email, String password);
}
