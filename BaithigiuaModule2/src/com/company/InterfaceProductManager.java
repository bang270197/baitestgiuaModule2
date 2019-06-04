package com.company;

public interface InterfaceProductManager {
    boolean addProduct(Product product);
    void showProduct();
    boolean editProduct(Product product);
    boolean deleteProduct(int id);
    void sortProduct();
    void searchProduct(int id);
}
