package com.caiobruno.dslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.caiobruno.dslist.entities.GameList;

public interface GameListRespository extends JpaRepository<GameList, Long> {

}
