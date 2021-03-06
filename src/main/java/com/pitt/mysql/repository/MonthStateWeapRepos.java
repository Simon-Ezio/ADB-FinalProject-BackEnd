package com.pitt.mysql.repository;

import com.pitt.mysql.entity.MonthProvstateWeap;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.UUID;

public interface MonthStateWeapRepos extends JpaRepository<MonthProvstateWeap, UUID> {
    List<MonthProvstateWeap> findAllByCountryAndProvstateAndYearAndWeaptypeIn(String country, String state, int year, List<Integer> types);
    List<MonthProvstateWeap> findAllByCountryAndYearAndWeaptypeIn(String country,int year,List<Integer> types);
}
