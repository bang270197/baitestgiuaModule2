package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ProductManagerImpl productManager=new ProductManagerImpl();
        int choice;
        do {
          menu();
          choice=sc.nextInt();
          switch (choice){
              case 1:
                  productManager.showProduct();
                  break;
              case 2:
                  Product product=inputProduct();
                 boolean addResult= productManager.addProduct(product);
                 if (addResult){
                     System.out.println("Them thanh cong");
                 }else {
                     System.out.println("Ten bi trung");
                 }
                 break;
              case 3:
                  Product product1 =inputProduct();
                 boolean greatResults= productManager.editProduct(product1);
                 if (greatResults){
                     System.out.println("Sua thanh cong");
                 }else {
                     System.out.println("id khong dung,Khong sua duoc");
                 }
                 break;
              case 4:
                  System.out.println("Nhap id can xoa");
                  int id=sc.nextInt();
                  boolean deleteResults=productManager.deleteProduct(id);
                  if (deleteResults){
                      System.out.println("Xoa thanh cong");
                  }else {
                      System.out.println("Khong xoa duoc");
                  }
                  break;
              case 5:
                  System.out.println("Nhap id can tim kiem");
                  int idd=sc.nextInt();
                  productManager.searchProduct(idd);
              case 6:
                  productManager.sortProduct();
                  break;
              case 7:

          }
        }while (choice!=7);
    }

    public static void menu() {
        System.out.println("/************************Menu***********************/");
        System.out.println("1.Hien thi danh sach san pham.");
        System.out.println("2.Them san pham.");
        System.out.println("3.Sua thong tin san pham.");
        System.out.println("4.Xoa san pham.");
        System.out.println("5.Tim kiem san pham theo ma.");
        System.out.println("6.Sap xep cac san pham theo gia tang hoac giam dan.");
        System.out.println("Moi ban nhap lua chon");
        System.out.println("/***********************End************************/");
    }

    public static Product inputProduct() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap id:");
        int id = sc.nextInt();
        sc.nextLine();
        System.out.println("Nhap ten san pham");
        String name = sc.nextLine();
        System.out.println("Nhap mo ta san pham");
        String description = sc.nextLine();
        System.out.println("Nhap gia cho san pham");
        float price = sc.nextFloat();
        sc.nextLine();
        System.out.println("Nhap trang thai san pham");
        String status = sc.nextLine();

        Product product = new Product(id, name, description, price, status);

        return product;

    }
}
