package com.epl.minileague.service.transfer;

import com.epl.minileague.model.Player;
import com.epl.minileague.model.Transfer;
import com.epl.minileague.repository.PlayerDAO;
import com.epl.minileague.repository.TransferDAO;
import com.epl.minileague.request.TransferDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
@Transactional
public class TransferServiceImpl implements TransferService{

    @Autowired
    private TransferDAO transferDAO;

    @Autowired
    private PlayerDAO playerDAO;


    @Override
    public String transferPlayer(TransferDTO transferDTO) {

        Player player = playerDAO.findByPlayerReference(transferDTO.getPlayer());

        if (!(player == null)) {
            if (transferDTO.getFrom().equals(transferDTO.getTo())) {
                return "The player cannot be transferred to the same club. ";
            } else {
                Transfer transfer = new Transfer();

                transfer.setPlayerReference(transferDTO.getPlayer());
                transfer.setFromClub(transferDTO.getFrom());
                transfer.setToClub(transferDTO.getTo());

                transferDAO.save(transfer);

                player.setClubName(transferDTO.getTo());

                return "Player has been transferred from " + transferDTO.getFrom() + " to " + transferDTO.getTo();

            }
        } else {
            return "The player has not been registered in this league yet";
        }
    }
}
