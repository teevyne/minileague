package com.epl.minileague.service.club;

import com.epl.minileague.model.Club;
import com.epl.minileague.repository.ClubDAO;
import com.epl.minileague.request.ClubDTO;
import net.bytebuddy.utility.RandomString;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class ClubServiceImpl  implements ClubService {

    @Autowired
    private ClubDAO clubDAO;

    @Override
    public Club createClub(ClubDTO clubDTO) {

        Club club = new Club();

        club.setClubName(clubDTO.getClub());
        club.setClubReference(RandomString.make(7).toUpperCase());
        return clubDAO.save(club);
    }

    @Override
    public List<Club> getAllClubs() {
        return clubDAO.findAll();
    }
}
