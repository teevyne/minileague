package com.epl.minileague.web.transfer;

import com.epl.minileague.request.TransferDTO;
import com.epl.minileague.service.transfer.TransferService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("transfer/")
public class TransferController {

    @Autowired
    private TransferService transferService;

    @PostMapping("create")
    public String createPlayer(TransferDTO transferDTO) {
        return transferService.transferPlayer(transferDTO);
    }
}
