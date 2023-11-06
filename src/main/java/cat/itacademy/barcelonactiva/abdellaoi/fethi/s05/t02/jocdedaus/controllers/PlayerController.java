package cat.itacademy.barcelonactiva.abdellaoi.fethi.s05.t02.jocdedaus.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import cat.itacademy.barcelonactiva.abdellaoi.fethi.s05.t02.jocdedaus.model.dto.PlayerDTO;
import cat.itacademy.barcelonactiva.abdellaoi.fethi.s05.t02.jocdedaus.model.services.PlayerService;
import lombok.AllArgsConstructor;


@RestController
@RequestMapping("/players")
@AllArgsConstructor
public class PlayerController {
	
	PlayerService playerService;
	
//	@PostMapping("")
//	public ResponseEntity<PlayerDTO> create(@RequestBody PlayerDTO pdto){
//		playerService.add(pdto);
//		return new ResponseEntity<>(pdto,HttpStatus.CREATED);		
//	}
	

}
