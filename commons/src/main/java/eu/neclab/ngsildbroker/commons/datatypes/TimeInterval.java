package eu.neclab.ngsildbroker.commons.datatypes;

public class TimeInterval {

    private Long startAt;
    private Long stop;

    public TimeInterval() {

    }

    public Long getStartAt() {
        return startAt;
    }

    public void setStartAt(Long startAt) {
        this.startAt = startAt;
    }

    public Long getStop() {
        return stop;
    }

    public void setStop(Long stop) {
        this.stop = stop;
    }

    public void finalize() throws Throwable {

    }

}
