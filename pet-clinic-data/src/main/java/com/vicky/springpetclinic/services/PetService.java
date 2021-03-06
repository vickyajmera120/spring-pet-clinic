package com.vicky.springpetclinic.services;

import com.vicky.springpetclinic.model.Pet;

import java.util.Set;

public interface PetService {

  Pet findById(Long id);

  Pet save(Pet Pet);

  Set<Pet> findAll();
  
}
