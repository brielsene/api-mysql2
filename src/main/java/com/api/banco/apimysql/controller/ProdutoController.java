package com.api.banco.apimysql.controller;

import com.api.banco.apimysql.produto.Marca;
import com.api.banco.apimysql.produto.Produto;
import com.api.banco.apimysql.repository.ProdutoRepository;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
public class ProdutoController {

    private ProdutoRepository repository;

    @GetMapping("/produto")
    public List<Produto> getAllProdutos(){

        return repository.findAll();
    }

    //Arrumar a inserção da marca no produto!!!
    @PostMapping("/produto")
    public Produto adicionaProduto(@RequestBody Produto produto){

        return repository.save(produto);
    }
}
