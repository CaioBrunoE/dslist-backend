package com.caiobruno.dslist.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.caiobruno.dslist.dto.GameListDTO;
import com.caiobruno.dslist.entities.GameList;
import com.caiobruno.dslist.repositories.GameListRespository;

@Service
public class GameListService {
	@Autowired	
	private GameListRespository gameListrepository;
	
	
	@Transactional(readOnly=true)
	public List<GameListDTO> findAll(){
		List<GameList> obj = gameListrepository.findAll();
		List<GameListDTO> dto = obj.stream().map(x -> new GameListDTO(x)).toList();
		return dto ;
		
	}

}
