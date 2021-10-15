package com.epl.minileague.service.club;

import com.epl.minileague.model.Club;
import com.epl.minileague.request.ClubDTO;

import java.util.List;

public interface ClubService {

    Club createClub(ClubDTO clubDTO);

    List<Club> getAllClubs();

}
