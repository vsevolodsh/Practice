public class Processor {
    private int cores;
    private double clockRate;
    private int streams;

    public int getCores() {
        return cores;
    }

    public void setCores(int cores) {
        this.cores = cores;
    }

    public double getClockRate() {
        return clockRate;
    }

    public void setClockRate(int clockRate) {
        this.clockRate = clockRate;
    }

    public int getStreams() {
        return streams;
    }

    public void setStreams(int streams) {
        this.streams = streams;
    }

    public Processor(int cores, double clockRate, int streams) {
        this.cores = cores;
        this.clockRate = clockRate;
        this.streams = streams;
    }
}
