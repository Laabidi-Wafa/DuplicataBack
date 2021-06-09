package com.project.repository;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.project.model.Demandepermis;



@Repository
public interface Demandep extends  JpaRepository <Demandepermis,Long>{
      public List<Demandepermis> findAll();
      

}
