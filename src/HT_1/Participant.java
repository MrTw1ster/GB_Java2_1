package HT_1;

public interface Participant {
    void runInfo();

    void jumpInfo();

    void running(Barrier barriers);

    void jumping(Barrier barriers);

    boolean isTakePart();
}
