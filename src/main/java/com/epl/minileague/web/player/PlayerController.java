package com.epl.minileague.web.player;

import com.epl.minileague.model.Player;
import com.epl.minileague.request.PlayerDTO;
import com.epl.minileague.service.player.PlayerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("player/")
public class PlayerController {

    @Autowired
    private PlayerService playerService;

    @PostMapping("create")
    public Player createPlayer(PlayerDTO playerDTO) {
        return playerService.createPlayer(playerDTO);
    }
}
