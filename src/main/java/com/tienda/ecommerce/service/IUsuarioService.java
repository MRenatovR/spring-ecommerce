package com.tienda.ecommerce.service;

import java.util.Optional;

import com.tienda.ecommerce.model.Usuario;

public interface IUsuarioService {
  Optional<Usuario> findById(Integer id);
}
