package com.vicky.springpetclinic.services;

import com.vicky.springpetclinic.model.Vet;

import java.util.Set;

public interface VetService {

  Vet findById(Long id);

  Vet save(Vet Vet);

  Set<Vet> findAll();
  
}
