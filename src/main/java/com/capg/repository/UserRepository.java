package com.capg.repository;



import org.springframework.data.jpa.repository.JpaRepository;

import com.capg.entity.Model;

public interface UserRepository extends JpaRepository<Model, Long> {
	/*@Query("from UserModel where name=:name And password=:password")*/
	public boolean existsByNameAndPassword(String name,String password);

}
