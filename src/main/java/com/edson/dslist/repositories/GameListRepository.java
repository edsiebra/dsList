package com.edson.dslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.edson.dslist.entities.GameList;

public interface GameListRepository extends JpaRepository<GameList, Long>{

}
