package com.gabrielkadaaj.dslist.services;

import com.gabrielkadaaj.dslist.dto.GameListDTO;
import com.gabrielkadaaj.dslist.entities.GameList;
import com.gabrielkadaaj.dslist.repositories.GameListRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class GameListService {

    @Autowired
    private GameListRepository gameListRepository;

    @Transactional(readOnly = true)
    public List<GameListDTO> findAll() {
        List<GameList> result = gameListRepository.findAll();
        return result.stream().map(GameListDTO::new).toList();
    }
}

