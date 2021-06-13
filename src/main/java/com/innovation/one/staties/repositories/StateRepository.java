package com.innovation.one.staties.repositories;

import com.innovation.one.staties.entities.State;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StateRepository extends JpaRepository<State, Long> {
}
