package com.dazt.products.domain.services;

import com.dazt.ms.products.dto.ProductDto;
import com.dazt.products.persistence.entity.Product;
import java.util.List;

/**
 * ProductService.
 *
 * @author David Alvarez.
 * @version 1.0.0, 21-09-2022
 */
public interface ProductService {

    /**
     * Return a list of products.
     *
     * @return list {@link Product}
     * */
    List<ProductDto> getAll();

    /**
     * Return a product queried by id.
     *
     * @return product {@link Product}
     * */
    ProductDto getById(String id);

    /**
     * Return a product queried by category code.
     *
     * @return product {@link Product}
     * */
    List<ProductDto> getByCategory(String categoryCode);

    /**
     * Save a new product.
     *
     * @return list {@link Product}
     * */
    ProductDto save(ProductDto product);

    /**
     * Update a existing product
     *
     * @return list {@link Product}
     * */
    ProductDto update(String id, ProductDto product);

    /**
     * Delete a product
     *
     * @return list {@link Boolean}
     * */
    boolean delete(String id);
}