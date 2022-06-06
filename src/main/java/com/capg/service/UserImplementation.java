package com.capg.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.capg.entity.Model;
import com.capg.repository.UserRepository;

@Service
public class UserImplementation implements UserService {
	 @Autowired (required=true)
	 private UserRepository userRepository	;

	 @Override
	 public long save(Model user) {
		 return userRepository.save(user).getUserId();
	 }

	 @Override
	 public Model get(long id) {
		 return userRepository.findById(id).get();
	 }

	 @Override
	 public List<Model> list() {
		 return userRepository.findAll();
	 }

	 @Transactional
	 @Override
	 public Model update(long id, Model user) {
		 return userRepository.save(user);
	 }

	 @Transactional
	 @Override
	 public void delete(long id) {
		 userRepository.deleteById(id);
	 }
	 
	 @Override
	 public boolean existsByNameAndPassword(String name , String password) {
		 return userRepository.existsByNameAndPassword(name,password);
		
	 }
}
