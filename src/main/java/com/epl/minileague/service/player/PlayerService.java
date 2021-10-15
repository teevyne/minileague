package com.epl.minileague.service.player;

import com.epl.minileague.model.Player;
import com.epl.minileague.request.PlayerDTO;

public interface PlayerService {

    Player createPlayer(PlayerDTO playerDTO);
}
