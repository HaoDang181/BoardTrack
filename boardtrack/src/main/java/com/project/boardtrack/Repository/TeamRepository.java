package com.project.boardtrack.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.project.boardtrack.Model.Team;

public interface TeamRepository extends JpaRepository<Team, Long> {
}
