package com.company;

import java.util.ArrayList;

public class ProductManagerImpl implements InterfaceProductManager {
    ArrayList<Product> products = new ArrayList<>();

    @Override
    public boolean addProduct(Product product) {
        for (int i = 0; i < products.size(); i++) {
            if (products.get(i).getName().equals(product.getName())) {
                return false;
            }
        }
        products.add(product);
        return true;
    }

    @Override
    public void showProduct() {
        System.out.println("ID" + "\t" + "Name" + "\t" + "Description" + "\t" + "Price" + "\t" + "Satus");
        for (Product product : products) {
            System.out.println(product.getId() + "\t" +
                    product.getName() + "\t\t" +
                    product.getDescription() + "\t\t" +
                    product.getPrice() + "\t\t" +
                    product.getStatus() + "\n"

            );
        }
    }

    @Override
    public boolean editProduct(Product product) {
        for (int i = 0; i < products.size(); i++) {
            if (product.getId() == products.get(i).getId()) {
                products.set(i, product);
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean deleteProduct(int id) {
        for (int i = 0; i < products.size(); i++) {
            if (id == products.get(i).getId()) {
                products.remove(i);
                return true;
            }
        }
        return false;
    }

    @Override
    public void sortProduct() {
        Product temp;
        for (int i = 0; i < products.size() - 1; i++) {
            for (int j = i + 1; j < products.size(); j++) {
                if (products.get(i).getPrice() > products.get(j).getPrice()) {
                    temp = products.get(i);
                    products.set(i, products.get(j));
                    products.set(j, temp);
                }
            }
        }
    }
    @Override
    public void searchProduct(int id) {
        for (Product product:products){
            if (product.getId()==id){
                System.out.println(product.getId() + "\t" +
                        product.getName() + "\t\t" +
                        product.getDescription() + "\t\t" +
                        product.getPrice() + "\t\t" +
                        product.getStatus() + "\n"

                );
            }
        }

    }
}
