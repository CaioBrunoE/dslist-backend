package com.caiobruno.dslist.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.caiobruno.dslist.dto.GameMinDTO;
import com.caiobruno.dslist.entities.Game;
import com.caiobruno.dslist.services.GameService;

@RestController
@RequestMapping(value="/games")
public class GameController {

	@Autowired
	private GameService gameservice;
	
	@GetMapping
	public List<GameMinDTO> findAll(){
		List<GameMinDTO> list = gameservice.findAll();
		return list ;
	}
	
	
}
