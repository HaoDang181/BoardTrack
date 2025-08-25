package com.project.boardtrack.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.project.boardtrack.Model.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
}
