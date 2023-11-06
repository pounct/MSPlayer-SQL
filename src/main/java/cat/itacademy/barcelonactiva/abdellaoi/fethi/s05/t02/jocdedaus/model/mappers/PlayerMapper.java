package cat.itacademy.barcelonactiva.abdellaoi.fethi.s05.t02.jocdedaus.model.mappers;

import java.sql.Date;
import java.time.Instant;

import cat.itacademy.barcelonactiva.abdellaoi.fethi.s05.t02.jocdedaus.model.dto.PlayerDTO;
import cat.itacademy.barcelonactiva.abdellaoi.fethi.s05.t02.jocdedaus.model.entities.Player;

public class PlayerMapper {

	public static PlayerDTO toDTO(Player player) {

		return PlayerDTO.builder().id(player.getId()).username(player.getUsername())

				.build();
	}

	public static Player fromDTO(PlayerDTO dto) {

		return Player.builder()
				.id(dto.getId())
				.username(dto.getUsername())
				.registrationDate(dto.getRegistrationDate())
				.build();
	}

}
