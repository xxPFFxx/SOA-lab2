package com.pff.secondservice.repository;

import com.pff.secondservice.models.HumanBeingsInTeams;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.ArrayList;

public interface HumanBeingsInTeamsRepository extends JpaRepository<HumanBeingsInTeams, Long> {
    ArrayList<HumanBeingsInTeams> findAllByTeamId(Long team_id);
}
