package cl.inacap.carroprod.dao;

import java.util.List;

import cl.inacap.carroprod.dto.Producto;

public interface ProductosDAO {

    List<Producto> getAll();
    Producto save(Producto p);
}
