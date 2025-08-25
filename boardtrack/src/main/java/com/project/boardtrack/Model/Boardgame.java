package com.project.boardtrack.Model;

import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "boardgames")
public class Boardgame {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, unique = true)
    private String name;

    @Column(name = "min_players")
    private int minPlayers;

    @Column(name = "max_players")
    private int maxPlayers;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private BoardgameType type;

    @Column(name="created_at", updatable = false)
    private LocalDateTime createdAt;

    public enum BoardgameType {
        SCORE,
        TEAM,
        SOLO
    }
}
