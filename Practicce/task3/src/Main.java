import java.util.Arrays;
import java.util.Scanner;

public class Main {

    static Teapot teapot = new Teapot("Чайник");
    static Fridge fridge = new Fridge("Холодильник");
    static Mixer mixer = new Mixer("Миксер");
    static Hoover hoover = new Hoover("Пылеосос");
    static Tv tv = new Tv("Телевизор");
    static Conditioner conditioner = new Conditioner("Кондиционер");


    public static void main(String[] args) {
        menu();
    }

    public static void menu() {
        System.out.println("1.Перейти к электроприборам. ");
        System.out.println("2.Установить максимально допустимую нагрузку и рассчитать общую нагрузку на электрическую цепь.");
        System.out.println("3.Выход");
        System.out.println("\n Примечание: если прибор выключен, то он не нагружает электрическую сеть");
        switch (entrance()) {
            case 1:
                menuForAppliance();
                break;
            case 2:
                int[] appliancePower = {teapot.getPower(), fridge.getPower(), mixer.getPower(), hoover.getPower(), tv.getPower(), conditioner.getPower()};
                sumAllPowerAndRemove(appliancePower);
                break;
            case 3:
                System.exit(0);
            default:
                System.out.println("Неправильный ввод. Введите цифру от 1 до 3");
                menu();
        }
    }

    public static void sumAllPowerAndRemove(int[] appliancePower){
        Arrays.sort(appliancePower);
        int maxLoadAmper = maxLoad();
        double sumPower =0;
        for (int i = 0; i < appliancePower.length ; i++) {
             sumPower =+ appliancePower[i];
        }
        int numberToDelete = appliancePower[appliancePower.length-1];
        double loadAmper = sumPower / 220;
        System.out.printf("Текущая нагрузка на сеть %f А, при максимально возможной %d A", loadAmper, maxLoadAmper);
         int[] newAppliabcePower = new int[appliancePower.length-1];
        if (maxLoadAmper < loadAmper) {
            System.out.println(" Для снижения нагрузки сейчас будет выключен наиболее подходящий прибор" );
            System.arraycopy(appliancePower,0,newAppliabcePower,0,appliancePower.length-1);
            offAppliance(teapot,numberToDelete);
            offAppliance(fridge,numberToDelete);
            offAppliance(mixer,numberToDelete);
            offAppliance(hoover,numberToDelete);
            offAppliance(tv,numberToDelete);
            offAppliance(conditioner,numberToDelete);
            sumAllPowerAndRemove(newAppliabcePower);

        }
    }

    public static void offAppliance (ElectricalAppliance electricalAppliance, int numberToDelete){
        if (electricalAppliance.getPower() == numberToDelete)
        {
            System.out.println("Прибор "+ electricalAppliance.getName()+ " выключен.");
            electricalAppliance.setActive(false);
        }

    }

    public static void menuForAppliance() {
        System.out.println("1.Чайник. ");
        System.out.println("2.Холодильник.");
        System.out.println("3.Миксер");
        System.out.println("4.Пылесос");
        System.out.println("5.Телевизор");
        System.out.println("6.Кондиционер");
        System.out.println("7.Назад");
        switch (entrance()) {
            case 1:
                menuForCurrentAppliance(teapot);
                break;
            case 2:
                menuForCurrentAppliance(fridge);
                break;
            case 3:
                menuForCurrentAppliance(mixer);
                break;
            case 4:
                menuForCurrentAppliance(hoover);
                break;
            case 5:
                menuForCurrentAppliance(tv);
                break;
            case 6:
                menuForCurrentAppliance(conditioner);
                break;
            case 7:
                menu();
                break;
            default:
                System.out.println("Неправильный ввод. Введите цифру от 1 до 7");
                menuForAppliance();
        }
    }

    public static void menuForCurrentAppliance(ElectricalAppliance electricalAppliance) {
        System.out.println("Прибор - " + electricalAppliance.getName());
        System.out.println("1.Включить прибор");
        System.out.println("2.Задать мощность прибора в Ватт");
        System.out.println("3.Выключить прибор");
        System.out.println("4.Назад");
        switch (entrance()) {
            case 1:
                electricalAppliance.setActive(true);
                System.out.println("Прибор включён");
                menuForCurrentAppliance(electricalAppliance);
                break;
            case 2:
                System.out.println("Напишите мощность прибора в Ватт");
                Scanner in = new Scanner(System.in);
                electricalAppliance.setPower(in.nextInt());
                menuForCurrentAppliance(electricalAppliance);
                break;
            case 3:
                electricalAppliance.setActive(false);
                System.out.println("Прибор выключен");
                menuForCurrentAppliance(electricalAppliance);
                break;
            case 4:
                menu();
        }
    }

    public static int maxLoad() {
        System.out.println("Введите максимально допустимую нагрузку на электропроводку помещения (Амепр)");
        Scanner scn = new Scanner(System.in);
        return scn.nextInt();
    }

//    public static int sumPower(ElectricalAppliance teapot, ElectricalAppliance fridge, ElectricalAppliance mixer,
//                               ElectricalAppliance hoover, ElectricalAppliance tv, ElectricalAppliance conditioner) {
//        return teapot.getPower() + fridge.getPower() + mixer.getPower() + hoover.getPower() + tv.getPower() + conditioner.getPower();
//    }

    public static int entrance() {
        System.out.println("\nНажмите цифру, куда хотите перейти: ");
        Scanner in = new Scanner(System.in);
        return in.nextInt();
    }
}
