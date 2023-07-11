package com.edson.dslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.edson.dslist.entities.Game;

public interface GameRepository extends JpaRepository<Game, Long>{

}
