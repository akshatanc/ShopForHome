package eshop.homedecor.shopapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import eshop.homedecor.shopapi.entity.ProductInOrder;


public interface ProductInOrderRepository extends JpaRepository<ProductInOrder, Long> {

}
