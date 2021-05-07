package com.digitalinnovationone.java.kubernetes.persistence;

import com.digitalinnovationone.java.kubernetes.domain.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Long> {

}

