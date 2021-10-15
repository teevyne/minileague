package com.epl.minileague.repository;

import com.epl.minileague.model.Club;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClubDAO extends JpaRepository<Club, Long> {
}
