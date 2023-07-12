package com.edson.dslist.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.edson.dslist.dto.GameListDTO;
import com.edson.dslist.dto.GameMinDTO;
import com.edson.dslist.entities.Game;
import com.edson.dslist.entities.GameList;
import com.edson.dslist.repositories.GameListRepository;
import com.edson.dslist.repositories.GameRepository;

@Service
public class GameListService {
	
	@Autowired
	private GameListRepository gameListRepository;


	@Transactional(readOnly = true)
	public List<GameListDTO> findAll(){
		List<GameList> result = gameListRepository.findAll();
		List<GameListDTO> dto = result.stream().map(x -> new GameListDTO(x)).toList();
		return dto;
	}
}
