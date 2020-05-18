package HT_1;

public class Test {
    public static void main(String[] args) {

        Participant[] participants = {
                new Cat("Tommy", 500, 6),
                new Human("Anatoliy", 700, 2),
                new Robot("Jumper3000", 52, 18)
        };

        participants[0].runInfo();
        participants[2].jumpInfo();

        Barrier[] barriers = {
                new RunningTrack(300),
                new Wall(1),
                new RunningTrack(600),
                new Wall(5)
        };


        for (Participant participant : participants) {
            for (Barrier barrier : barriers) {
                barrier.doIt(participant);
                if (!participant.isTakePart())
                    break;

            }
        }

    }
}
