package Task4Diary;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;

public class Diary {
    private HashSet<BusinessRecord> businessRecords = new HashSet<BusinessRecord>();


    public void setBuisinessRecords(HashSet<BusinessRecord> buisinessRecords) {
        this.businessRecords = buisinessRecords;
    }

    public HashSet<BusinessRecord> getBuisinessRecords() {
        return businessRecords;
    }

    public Diary(HashSet<BusinessRecord> buisinessRecords) {
        this.businessRecords = buisinessRecords;
    }

    public Diary(BusinessRecord buisinessRecord) {
        this.businessRecords.add(buisinessRecord);
    }

    public void showAll() {
        List<BusinessRecord> list = new ArrayList<BusinessRecord>();
        for (BusinessRecord buisinessRecord : list) {
            buisinessRecord.printRecord();
        }
    }

    public boolean searchByDateTime(String date) {
        BusinessRecord temp = new BusinessRecord();
        temp.setExecuteDate(date);
        for (BusinessRecord buisinessRecord : this.businessRecords) {
            if (buisinessRecord.hashCode() == temp.hashCode()) {
                buisinessRecord.printRecord();
                return true;
            }
        }
        return false;
    }

    public void correct(String date) {
        Scanner scan = new Scanner(System.in);
        String str;
        BusinessRecord temp = new BusinessRecord();
        boolean found = true;
        temp.setExecuteDate(date);

        for (BusinessRecord buisinessRecord : this.businessRecords) {
            if (buisinessRecord.hashCode() == temp.hashCode()) {
                found = false;
                System.out.println("Ваша запись:");
                buisinessRecord.printRecord();

                System.out.println("Введите текст, для изменения записи:");
                str = scan.nextLine();
                buisinessRecord = Main.makeRecord();

                System.out.println("Изменённая запись");
                buisinessRecord.printRecord();
            }
        }
        if (found) {
            System.out.println("Нужная запись не найдена, повторите попытку!");
            correct(scan.nextLine());
        }
    }

    public boolean delete (String date) {
        BusinessRecord temp = new BusinessRecord();
        temp.setExecuteDate(date);

        for (BusinessRecord buisinessRecord : this.businessRecords) {
            if (buisinessRecord.hashCode() == temp.hashCode()) {
                businessRecords.remove(buisinessRecord);
                return true;
            }
        }
        return false;
    }



}
