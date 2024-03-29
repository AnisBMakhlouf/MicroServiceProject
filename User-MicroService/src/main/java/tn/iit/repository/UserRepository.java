package tn.iit.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import tn.iit.entity.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long>{

}
