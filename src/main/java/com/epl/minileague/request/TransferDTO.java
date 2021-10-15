package com.epl.minileague.request;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class TransferDTO {

    private String player;

    private String from;

    private String to;
}
