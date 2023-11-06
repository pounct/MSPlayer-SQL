package cat.itacademy.barcelonactiva.abdellaoi.fethi.s05.t02.jocdedaus.model.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import cat.itacademy.barcelonactiva.abdellaoi.fethi.s05.t02.jocdedaus.model.entities.Game;
import cat.itacademy.barcelonactiva.abdellaoi.fethi.s05.t02.jocdedaus.model.entities.Player;

@RepositoryRestResource
public interface GameRepository extends JpaRepository<Game, Long> {
	List<Game> findByPlayer(Player player);

}
