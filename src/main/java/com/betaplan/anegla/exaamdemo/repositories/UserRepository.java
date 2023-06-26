package com.betaplan.anegla.exaamdemo.repositories;

import java.util.List;
import java.util.Optional;

import com.betaplan.anegla.exaamdemo.models.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface UserRepository extends CrudRepository<User, Long> {

    List<User> findAll();
    Optional<User> findByEmail(String email);
}
