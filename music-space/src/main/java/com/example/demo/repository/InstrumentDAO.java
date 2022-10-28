package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.model.Instrument;

@Repository
public interface InstrumentDAO extends JpaRepository<Instrument, Integer> {

}
