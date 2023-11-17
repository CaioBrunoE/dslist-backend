package com.caiobruno.dslist.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.caiobruno.dslist.dto.GameDTO;
import com.caiobruno.dslist.dto.GameMinDTO;
import com.caiobruno.dslist.entities.Game;
import com.caiobruno.dslist.projection.GameMinProjection;
import com.caiobruno.dslist.repositories.GameRepository;

@Service
public class GameService {

	@Autowired	
	private GameRepository gamerepository;
	
	@Transactional(readOnly=true)
	public GameDTO findById(Long id ) {
		Game result =gamerepository.findById(id).get();
		GameDTO gameDTO = new GameDTO(result);
		return gameDTO;
	}
	
	@Transactional(readOnly=true)
	public List<GameMinDTO> findAll(){
		List<Game> obj = gamerepository.findAll();
		List<GameMinDTO> dto = obj.stream().map(x -> new GameMinDTO(x)).toList();
		return dto ;
		
	}
	
	@Transactional(readOnly=true)
	public List<GameMinDTO> findByList(Long listId){
		List<GameMinProjection> result = gamerepository.searchByList(listId);
		List<GameMinDTO> dto = result.stream().map(x -> new GameMinDTO(x)).toList();
		return dto;
	}
}
