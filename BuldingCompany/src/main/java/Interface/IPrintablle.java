package Interface;

import Exceptions.PrintNullException;

public interface IPrintablle {

    void printPersonalInfo(String s) throws PrintNullException;
    void printPersonalInfo() throws PrintNullException;
}
