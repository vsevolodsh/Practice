public class Main {

    public static void main(String[] args) {
        Winchester baracuda = new Winchester(1024, "SATA 3", 7200);
        Memory kingston = new Memory(8, "DDR5");
        Processor i5 = new Processor(6, 2.9, 12);
        Computer comp = new Computer(baracuda, kingston, i5);

        comp.on();
        comp.checkVirus();
        comp.printCheckVirus();
        System.out.println("Размер винчестера: " + comp.getWinchester().getSize() + "Гб; Размер оперативной памяти: " + comp.getMemory().getSize() + "Гб");
        comp.off();
    }
}
