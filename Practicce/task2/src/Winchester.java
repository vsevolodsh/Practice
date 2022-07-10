public class Winchester {
    private int size;
    private String connection;
    private int speed;

    public Winchester(int size, String connection, int speed) {
        this.size = size;
        this.connection = connection;
        this.speed = speed;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public String getConnection() {
        return connection;
    }

    public void setConnection(String connection) {
        this.connection = connection;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }
}
