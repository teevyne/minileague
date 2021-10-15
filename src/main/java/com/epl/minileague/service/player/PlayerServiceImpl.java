package com.epl.minileague.service.player;

import com.epl.minileague.model.Player;
import com.epl.minileague.repository.PlayerDAO;
import com.epl.minileague.request.PlayerDTO;
import net.bytebuddy.utility.RandomString;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
@Transactional
public class PlayerServiceImpl implements PlayerService {

    @Autowired
    private PlayerDAO playerDAO;

    @Override
    public Player createPlayer(PlayerDTO playerDTO) {

        Player player = new Player();
        player.setPlayerName(playerDTO.getPlayer());
        player.setClubName("No club yet");
        player.setPlayerReference(playerDTO.getPlayer().substring(0, 3) + RandomString.make(4).toUpperCase());

        return playerDAO.save(player);
    }
}
