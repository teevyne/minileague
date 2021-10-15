package com.epl.minileague.repository;

import com.epl.minileague.model.Transfer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TransferDAO extends JpaRepository<Transfer, Long> {
}
