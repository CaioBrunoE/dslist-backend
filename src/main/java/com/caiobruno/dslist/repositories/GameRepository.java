package com.caiobruno.dslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.caiobruno.dslist.entities.Game;

public interface GameRepository extends JpaRepository<Game , Long> {


}
