package eshop.homedecor.shopapi.service;

import java.util.Collection;

import eshop.homedecor.shopapi.entity.Cart;
import eshop.homedecor.shopapi.entity.ProductInOrder;
import eshop.homedecor.shopapi.entity.User;


public interface CartService {
    Cart getCart(User user);

    void mergeLocalCart(Collection<ProductInOrder> productInOrders, User user);

    void delete(String itemId, User user);

    void checkout(User user);
}
