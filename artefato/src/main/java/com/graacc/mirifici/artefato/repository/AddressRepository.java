package com.graacc.mirifici.artefato.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.graacc.mirifici.artefato.entity.AddressEntity;

@Repository
public interface AddressRepository extends JpaRepository<AddressEntity, Long>{

}
