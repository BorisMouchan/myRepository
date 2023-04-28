import CLasses.*;
import Exceptions.*;
import enums.CurrencyType;
import enums.DriveCategory;
import enums.ProjectType;

import java.util.ArrayList;
import java.util.logging.Logger;

public class BuldingCompany {

    private final static Logger LOGGER = Logger.getLogger(BuldingCompany.class.getName());

    public static void main(String[] args) {

        Crane crane = new Crane();
        try {
            crane.build(0);
        } catch (IncorectLevelBuilding e) {
            System.out.println(e.getMessage());
            LOGGER.info(e.getMessage());
        }
//
//        try {Employee emp1 = new Employee("semen", 28);
//            emp1.printPersonalInfo(null);
//        } catch (PrintNullException | AgeException e) {
//            System.out.println(e.getMessage());
//        }
//
//        try {
//            Bulldozer bull2 = new Bulldozer("AZ",2005,true,4);
//            Bulldozer bull3 = new Bulldozer("MAZ",-2005,true,5);
//        } catch (NegativePurchaseYear e) {
//            System.out.println(e.getMessage());
//        }
//
//        try {
//            Employee emp1 = new Employee("Dima",-20);
//        } catch (AgeException e) {
//            System.out.println(e.getMessage());
//        }

//        Transaction trns = new Transaction("213","Warsaw","aqa11","ALFA", CurrencyType.USD,"Pay",-500,30141111);
//        try {
//            trns.makePayments();
//        } catch (TransactionException e) {
//            e.printStackTrace();
//        }
    }
}
