import CLasses.*;
import enums.ProjectType;

import java.awt.event.ActionListener;

public class BuldingCompany {
    public static void main(String[] args) {
//
        Bulldozer bull1 = new Bulldozer("A",12,true,2,3);
        Bulldozer bull2 = new Bulldozer("A",12,true,2,3);
        System.out.println(bull1.equals(bull2));
        System.out.println(bull1.hashCode());
        System.out.println(bull2.hashCode());
//
//        Employee electric1 = new Electric("Z",1,300,456,189,true,true,5);
//        electric1.printPersonInfo();

//        bull1.moveToService();

    }
}
