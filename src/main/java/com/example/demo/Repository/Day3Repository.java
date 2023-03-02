package com.example.demo.Repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.Entity.Day3Entity;
@Repository
public interface Day3Repository extends JpaRepository<Day3Entity,Integer>
{
}
