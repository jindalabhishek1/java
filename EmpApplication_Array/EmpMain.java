import java.util.*;

class EmpMain
{
    public static void main(String [] args)
    {
        EmpDB objDB = new EmpDB();
        objDB.addRecord();
        objDB.addRecord();
        objDB.addRecord();
        objDB.showRecord(102);
        objDB.updateRecord(102);
        objDB.showRecord(102);
        objDB.removeRecord();
    }
}
