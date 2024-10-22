package application;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

import java.util.Date;
import java.util.List;

public class Program {
    public static void main(String[] args) {

        SellerDao sellerdao = DaoFactory.createSellerDao();

        System.out.println("Seller by Id");
        Seller seller = sellerdao.findById(3);
        System.out.println(seller);

        System.out.println(" ");

        System.out.println("Seller By Department Id");
        Department department = new Department(2, null);
        List<Seller> list = sellerdao.finByDepartment(department);
        for (Seller s : list) {
            System.out.println(s);
        }

        System.out.println(" ");

        System.out.println("All sellers");
        List<Seller> allSellers = sellerdao.findAll();
        for (Seller s : allSellers) {
            System.out.println(s);
        }

        System.out.println(" ");

        Date data = new Date();
        Seller s = new Seller(8, "Guilherme Guida Torres", "gguilherme1@gmail.com", 2011, data, department);
         /*
        System.out.println("Insert");
        sellerdao.insert(s);
        sellerdao.insert(s);


        System.out.println(" ");

        System.out.println("Delete by id");
        sellerdao.deleteById(9);
        */

        System.out.println(" ");

        System.out.println("Update by id");
        sellerdao.update(s);

    }
}
