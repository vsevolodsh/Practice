package Task4Diary;
import java.util.*;

public class Main {


    public static void main(String[] args) {
        HashSet<BusinessRecord> businessRecords = new HashSet<BusinessRecord>();
        menu(businessRecords);
    }

    public static void menu(HashSet<BusinessRecord> buisinessRecords) {
        Diary diary = new Diary(buisinessRecords);
        System.out.println("Выберите, куда хотите перейти");
        System.out.println("1. Сделать запись в ежедневнике");
        System.out.println("2. Посмотреть все записи в ежедневнике");
        System.out.println("3. Изменить запись");
        System.out.println("4. Показать конкретную запись");
        System.out.println("5. Удалить");
        System.out.println("6. Выход");
        Scanner scn = new Scanner(System.in);
        switch (scn.nextInt()) {
            case 1:
                buisinessRecords.add(makeRecord());
                menu(buisinessRecords);
                break;
            case 2:
                diary.showAll();
                break;
            case 3:
                System.out.println("Введите дату записи для редактирования в формате (dd-MM-yyyy/HH:mm:ss):");
                diary.showAll();
                Scanner scnSttr = new Scanner(System.in);
                diary.correct(scnSttr.nextLine());
                break;
            case 4:
                System.out.println("Напишите дату события в формате dd.MM.yy; HH:mm");
                Scanner scnDate = new Scanner(System.in);
                String str = scnDate.nextLine();
                System.out.println("Запись найдена:");

                System.out.println("Hello world");
//                if (!diary.searchByDateTime(scnDate.nextLine())) {
//                    System.out.println("Записи с такой датой не существует");
//                }
                menu(buisinessRecords);
                break;
            case 5:
                System.out.println("Введите дату записи для удаления в формате (dd-MM-yyyy/HH:mm:ss):");
                diary.showAll();
                int ans;
                int x = 0;
                Scanner strDel = new Scanner(System.in);
                if (!diary.delete(strDel.nextLine())) {
                    System.out.println("Такой записи не существутет не существует");
                }
                break;
            case 6:
                System.exit(0);
            default:
                System.out.println("Вводите цифры от 1 до 7");

                menu(buisinessRecords);
        }
    }

    public static BusinessRecord getTimeRecord(BusinessRecord businessRecord) {
        System.out.println("Введите дату запланированного дела в фортмае dd.MM.yy; HH:mm");
        Scanner exDate = new Scanner(System.in);
        businessRecord.setExecuteDate(exDate.nextLine());
        businessRecord.setCreatedWhen();
        return businessRecord;
    }

    public static BusinessRecord makeRecord() {
        System.out.println("Сделайте запись: ");
        Scanner record = new Scanner(System.in);
        String[] strArr = record.nextLine().split(" ");
        BusinessRecord businessRecord = new BusinessRecord(strArr);
        return getTimeRecord(businessRecord);
    }

}

