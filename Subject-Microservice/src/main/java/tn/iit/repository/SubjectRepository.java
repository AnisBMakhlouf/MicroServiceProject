package tn.iit.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import tn.iit.entity.Subject;

@Repository
public interface SubjectRepository extends JpaRepository<Subject, Long>{

}
