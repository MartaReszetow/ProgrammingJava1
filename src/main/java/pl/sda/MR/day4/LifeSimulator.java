package pl.sda.MR.day4;

import java.util.HashSet;
import java.util.List;
import java.util.Random;
import java.util.Set;

public class LifeSimulator {

    public static void Simulate(List<Programmer> list, int numberOfDays) {

        for (int i = 0; i < numberOfDays; i++) {
            for (Programmer singleProgrammer : list
            ) {
                if (singleProgrammer.isAlive()) {
                    work(singleProgrammer)
                    ;
                }
                if (singleProgrammer.isAlive()) {
                    play(singleProgrammer);
                }
                rest(singleProgrammer);
            }
        }
        Set<Programmer> aliveSet = new HashSet<>();
        Set<Programmer> deadSet = new HashSet<>();


        for (Programmer resultProgrammer: list){

            if (resultProgrammer.isAlive()){aliveSet.add(resultProgrammer);}
            else {deadSet.add(resultProgrammer);}
        }
        System.out.println("Alive programmers:" + aliveSet);
        System.out.println("Dead programmers:" + deadSet);
    }

    private static void work(Programmer programmer) {
        System.out.println(programmer.getFirstName() + " is working");
        checkPulse(programmer, 10);

    }

    private static void play(Programmer programmer) {
        System.out.println(programmer.getFirstName() + " is playing");
        checkPulse(programmer, 20);
    }

    private static void rest(Programmer programmer) {
        System.out.println(programmer.getFirstName() + " is resting");
        checkPulse(programmer, 3);
    }

    private static void checkPulse(Programmer programmer, int chanceToDie) {
        int randomNumber = new Random().nextInt(1000);
        if (randomNumber <= chanceToDie) {
            programmer.setAlive(false);
        }


    }
}