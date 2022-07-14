package eshop.homedecor.shopapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import eshop.homedecor.shopapi.entity.Discount;

public interface DiscountRepository extends JpaRepository<Discount, String> {

}
