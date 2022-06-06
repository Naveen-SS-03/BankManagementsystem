package com.capg.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.capg.entity.Recipient;

@Repository
public interface RecipientRepository extends JpaRepository<Recipient, Integer>{

}
