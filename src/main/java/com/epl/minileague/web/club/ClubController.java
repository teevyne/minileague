package com.epl.minileague.web.club;

import com.epl.minileague.model.Club;
import com.epl.minileague.request.ClubDTO;
import com.epl.minileague.service.club.ClubService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("club/")
public class ClubController {

    @Autowired
    private ClubService clubService;

    @PostMapping("create")
    public Club createClub(ClubDTO clubDTO) {
        return clubService.createClub(clubDTO);
    }

    @GetMapping("all")
    public List<Club> allClubs() {
        return clubService.getAllClubs();
    }
}
