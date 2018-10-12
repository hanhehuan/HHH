package com.hhh.repository;

import com.hhh.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

/**created hanhehuan 20181010
 * Repository 表操作接口
 */

@Repository
public interface UserRepositoty extends JpaRepository<User,Long> {
    @Query("select t from User t where t.name=:name")
    User findByUsername(@Param("name")String name);
}
