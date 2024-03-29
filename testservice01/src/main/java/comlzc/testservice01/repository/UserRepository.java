package comlzc.testservice01.repository;

import comlzc.testservice01.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface UserRepository extends JpaRepository<User,Integer> {
    @Query(value = "select * from user u where u.u_id=:uId",nativeQuery = true)
    User selectUserById(@Param("uId") Integer uId);
}
