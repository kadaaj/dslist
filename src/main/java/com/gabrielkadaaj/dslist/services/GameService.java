package com.gabrielkadaaj.dslist.services;

import com.gabrielkadaaj.dslist.dto.GameMinDTO;
import com.gabrielkadaaj.dslist.entities.Game;
import com.gabrielkadaaj.dslist.repositories.GameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GameService {

    @Autowired
    private GameRepository gameRepository;

    public List<GameMinDTO> findAll() {
        List<Game> result = gameRepository.findAll();
        return result.stream().map(GameMinDTO::new).toList();
    }
}

