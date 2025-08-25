package com.project.boardtrack.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.project.boardtrack.Model.Match;

@Repository
public interface MatchRepository extends JpaRepository<Match, Long> {
}
