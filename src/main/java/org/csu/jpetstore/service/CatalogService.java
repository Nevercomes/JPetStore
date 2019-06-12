package org.csu.jpetstore.service;

import org.csu.jpetstore.domain.Category;
import org.csu.jpetstore.domain.Item;
import org.csu.jpetstore.domain.Product;

import java.util.List;

/**
 * @author: sun
 * @date: 2019/6/12
 */
public interface CatalogService {

    List<Category> getCategoryList();

    Category getCategory(String categoryId);

    Product getProduct(String productId);

    List<Product> getProductListByCategory(String categoryId);

    // TODO enable using more than one keyword
    List<Product> searchProductList(String keyword) ;

    List<Item> getItemListByProduct(String productId);

    Item getItem(String itemId) ;

    boolean isItemInStock(String itemId);
}
