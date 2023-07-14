package com.intesivospringsuperior.springlist.services;


import com.intesivospringsuperior.springlist.dto.GameMinDTO;
import com.intesivospringsuperior.springlist.entities.Game;
import com.intesivospringsuperior.springlist.respositories.GameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GameService {

        @Autowired
        private  GameRepository gameRepository;
        public List<GameMinDTO> findAll() {
            List<Game> result = gameRepository.findAll();
            List<GameMinDTO> dto = result.stream().map(x -> new GameMinDTO(x)).toList();
            return dto;
        }
}
