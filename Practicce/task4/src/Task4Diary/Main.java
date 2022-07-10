package Task4Diary;


import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.*;

public class Main {


    public static void main(String[] args) {
        Word word = new Word(" ");


        HashSet<BusinessRecord> buisinessRecords = new HashSet<BusinessRecord>();

        BusinessRecord businessRecord = new BusinessRecord(makeRecord());
        getTimeRecord(businessRecord);
        }

//        BusinessRecord businessRecord = new BusinessRecord(strArr);
//        System.out.println(businessRecord.getExecuteDate());
//        BusinessRecord businessRecord1 = new BusinessRecord(strArr).getRecord();
//        System.out.println(businessRecord1.getOriginalSentence());
//        System.out.println(businessRecord1.getExecuteDate());
//        System.out.println(businessRecord.getWordsCount());
//        String str = businessRecord.getOriginalSentence();
//        System.out.println(str);
//        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd.MM.yy H:mm");
//        String text = dtf.format( LocalDateTime.now() );
//        System.out.println(text);
//        String date = dtf.format(LocalDateTime.of(2001, 12 , 3, 12, 14));
//        System.out.println(date);
//        if (text.equals(date)){
//            System.out.println("yes");
//        }

    }

    public static BusinessRecord getTimeRecord(BusinessRecord businessRecord) {
        System.out.println("Введите дату запланированного дела в фортмае dd.MM.yy; HH:mm");
        Scanner exDate = new Scanner(System.in);
        businessRecord.setExecuteDate(exDate.nextLine());
        businessRecord.setCreatedWhen();
        return businessRecord;
    }

    public static String[] makeRecord() {
        System.out.println("Сделайте запись: ");
        Scanner record = new Scanner(System.in);
        return record.nextLine().split(" ");
    }

}

