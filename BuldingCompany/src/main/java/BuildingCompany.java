import CLasses.*;
import Exceptions.*;
import enums.CurrencyType;
import enums.DriveCategory;
import enums.ProjectType;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class BuildingCompany {

    private static final Logger LOGGER = LogManager.getLogger(BuildingCompany.class);

    public static void main(String[] args) {

        Crane crane = new Crane();
        try {
            crane.build(0);
        } catch (IncorectLevelBuildingException e) {
            System.out.println(e.getMessage());
            LOGGER.info(e.getMessage());
        }

        try {Employee emp1 = new Employee("semen", 28);
            emp1.printPersonalInfo(null);
        } catch (PrintNullException | AgeException e) {
            System.out.println(e.getMessage());
            LOGGER.info(e.getMessage());
        }

        try {
            Bulldozer bull2 = new Bulldozer("AZ",2005,true,4);
            Bulldozer bull3 = new Bulldozer("MAZ",-2005,true,5);
        } catch (NegativePurchaseYearException e) {
            System.out.println(e.getMessage());
            LOGGER.info(e.getMessage());
        }

        try {
            Employee emp1 = new Employee("Dima",40);
        } catch (AgeException e) {
            System.out.println(e.getMessage());
            LOGGER.info(e.getMessage());
        }

        Transaction trns = new Transaction("213","Warsaw","aqa11","ALFA", CurrencyType.USD,"Pay",-500);
        try {
            trns.makePayments();
        } catch (TransactionException e) {
            System.out.println(e.getMessage());
            LOGGER.info(e.getMessage());
        }

        File file = new File(System.getProperty("user.dir") + "/src/main/resources/input.txt");
        String str = "";
        try (Scanner scanner = new Scanner(file)) {
            while (scanner.hasNextLine()) {
                str = scanner.nextLine();
            }
        } catch (FileNotFoundException e) {
            LOGGER.info("File Not Found Exception caught!");
        }

    }
}

