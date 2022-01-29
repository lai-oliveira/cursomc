package com.lai.dev.cursomc.repositories;

import com.lai.dev.cursomc.domain.Produto;
import org.springframework.data.jpa.repository.JpaRepository;



public  interface ProdutoRepository extends JpaRepository<Produto,Integer> {
}
