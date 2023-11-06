package cat.itacademy.barcelonactiva.abdellaoi.fethi.s05.t02.jocdedaus.model.services;

import org.springframework.stereotype.Service;

import cat.itacademy.barcelonactiva.abdellaoi.fethi.s05.t02.jocdedaus.model.dto.PlayerDTO;
import cat.itacademy.barcelonactiva.abdellaoi.fethi.s05.t02.jocdedaus.model.entities.Player;
import cat.itacademy.barcelonactiva.abdellaoi.fethi.s05.t02.jocdedaus.model.mappers.PlayerMapper;
import cat.itacademy.barcelonactiva.abdellaoi.fethi.s05.t02.jocdedaus.model.repositories.PlayerRepository;
import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class PlayerService {
	
	PlayerRepository playerRepository;

	public void add(PlayerDTO pdto) {
		Player player = PlayerMapper.fromDTO(pdto);		
		playerRepository.save(player);		
	}

}
