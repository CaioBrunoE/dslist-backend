package com.caiobruno.dslist.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.caiobruno.dslist.dto.GameMinDTO;
import com.caiobruno.dslist.entities.Game;
import com.caiobruno.dslist.repositories.GameRepository;

@Service
public class GameService {

	@Autowired	
	private GameRepository gamerepository;
	
	
	public List<GameMinDTO> findAll(){
		List<Game> obj = gamerepository.findAll();
		List<GameMinDTO> dto = obj.stream().map(x -> new GameMinDTO(x)).toList();
		return dto ;
		
	}
	
}
