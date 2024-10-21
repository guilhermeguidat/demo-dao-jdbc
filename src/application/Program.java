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

    }
}
