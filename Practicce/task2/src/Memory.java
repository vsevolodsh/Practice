public class Memory {
    private int size;
    private String type;


    public Memory(int size, String type) {
        this.size = size;
        this.type = type;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
