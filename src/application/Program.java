package application;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

import java.util.Date;

public class Program {
    public static void main(String[] args) {

        SellerDao sellerdao = DaoFactory.createSellerDao();

        System.out.println("Seller by Id");
        Seller seller = sellerdao.findById(3);
        System.out.println(seller);

    }
}
