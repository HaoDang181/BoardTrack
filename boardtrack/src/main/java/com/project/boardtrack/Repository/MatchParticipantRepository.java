package com.project.boardtrack.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.project.boardtrack.Model.MatchParticipant;

@Repository
public interface MatchParticipantRepository extends JpaRepository<MatchParticipant, Long> {
}
