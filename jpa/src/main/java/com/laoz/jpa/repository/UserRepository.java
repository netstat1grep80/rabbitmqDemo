package com.laoz.jpa.repository;

import com.laoz.jpa.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @author: laoz
 * @Time: 2022/7/29  09:42
 * @description:
 */
@Repository
public interface UserRepository extends JpaRepository<User, Long> {

}
