package com.epl.minileague.repository;

import com.epl.minileague.model.Player;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PlayerDAO extends JpaRepository<Player, Long> {

    Player findByPlayerReference(String playerReference);

    List<Player> findPlayersByClubName(String clubName);
}
