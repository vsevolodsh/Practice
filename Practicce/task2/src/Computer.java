public class Computer {
    private Winchester winchester;
    private Memory memory;
    private Processor processor;

    public Computer(Winchester winchester, Memory memory, Processor processor) {
        this.winchester = winchester;
        this.memory = memory;
        this.processor = processor;
    }

    public Winchester getWinchester() {
        return winchester;
    }

    public void setWinchester(Winchester winchester) {
        this.winchester = winchester;
    }

    public Memory getMemory() {
        return memory;
    }

    public void setMemory(Memory memory) {
        this.memory = memory;
    }

    public Processor getProcessor() {
        return processor;
    }

    public void setProcessor(Processor processor) {
        this.processor = processor;
    }

    public void on() {
        System.out.println("Компьютер включён.");
    }

    public void off() {
        System.out.println("Компьютер выключен.");
    }

    public void checkVirus() {
        System.out.println("Проверка на вирусы проведена успешно.");
    }


    public void printCheckVirus() {
        int result = (int) (Math.random() * 2);
        if (result == 1) {
            System.out.println("Вирусы обнаружены!");
        } else {
            System.out.println("Вирусы не обнаружены");
        }
    }

}
