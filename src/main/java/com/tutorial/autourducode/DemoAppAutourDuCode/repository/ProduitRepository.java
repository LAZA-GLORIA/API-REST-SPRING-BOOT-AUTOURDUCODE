package com.tutorial.autourducode.DemoAppAutourDuCode.repository;

import com.tutorial.autourducode.DemoAppAutourDuCode.model.Produit;
import org.springframework.data.jpa.repository.JpaRepository;

//Représente notre DAO
public interface ProduitRepository extends JpaRepository<Produit, Long> {
}
