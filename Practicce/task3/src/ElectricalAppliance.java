public class ElectricalAppliance {
    private int power;
    private boolean active;
    private String name;


    public ElectricalAppliance(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getPower() {
        if (!active) {
            power = 0;
        }
        return power;
    }

    public void setPower(int power) {
        try {
            if (power < 0) {
                throw new Exception("Значение потребляемой мощности не может быть отрицательным");
            }
            this.power = power;
            System.out.println("Мощность прибора установлена");
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }
}
