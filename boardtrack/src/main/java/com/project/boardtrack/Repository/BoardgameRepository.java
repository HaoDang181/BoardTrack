package com.project.boardtrack.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.project.boardtrack.Model.Boardgame;

@Repository
public interface BoardgameRepository extends JpaRepository<Boardgame, Long> {
}
