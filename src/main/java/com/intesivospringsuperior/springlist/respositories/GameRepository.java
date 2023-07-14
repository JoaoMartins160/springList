package com.intesivospringsuperior.springlist.respositories;

import com.intesivospringsuperior.springlist.entities.Game;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GameRepository extends JpaRepository<Game, Long> {
}
