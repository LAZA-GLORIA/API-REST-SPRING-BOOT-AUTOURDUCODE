package com.tutorial.autourducode.DemoAppAutourDuCode.controller;

import com.tutorial.autourducode.DemoAppAutourDuCode.model.Produit;
import com.tutorial.autourducode.DemoAppAutourDuCode.service.ProduitService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/produit")
@AllArgsConstructor
public class ProduitController {
    //Ici on injecte notre service
    //C'est une inversion de controle: on passe par l'interface
    //pour appeler les méthodes de services implements
    private final ProduitService produitService;

    @PostMapping("/create")
    //Pour que Spring puisse envoyer les données
    //au niveau du body de la requête on utilise @RequestBody
    //Et l'objet json va être envoyé au niveau du body
    public Produit create(@RequestBody Produit produit) {
        return produitService.creer(produit);
    }

    @GetMapping("/read")
    public List<Produit> read() {
        return produitService.lire();
    }

    @PutMapping("/update/{id}")
    public Produit update(@PathVariable Long id, @RequestBody Produit produit) {
        return produitService.modifier(id, produit);
    }

    @DeleteMapping("/delete/{id}")
    public String delete(@PathVariable Long id) {
        return produitService.supprimer(id);
    }

}
