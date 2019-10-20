package com.samsung;

import com.samsung.selections.Selections;
import com.samsung.users.Candidate;
import com.samsung.users.User;
import com.samsung.users.Voter;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Candidate candidateA = new Candidate("A", "passA", "Ivan");
        Candidate candidateB = new Candidate("B", "passB", "Pavel");
        Candidate candidateC = new Candidate("C", "passC", "Oleg");
        Candidate candidateD = new Candidate("D", "passD", "Kostya");

        Candidate[] candidates = {candidateA, candidateB, candidateC, candidateD};
        Selections selections = new Selections("Best clown", candidates);

        selections.addVoter(new Voter("Z", "passZ", "{OPIOHUGIYUFTDYRtxg"), 2);
        for (int i = 0; i < 1000; i++) {
            int id = new Random().nextInt(4);
            selections.addVoter(new Voter("A" + i, "passA" + i, "Name " + i), id);
        }

        Candidate[] result = selections.getResults();
        for (Candidate candidate : result) {
            System.out.println("Candidate " + candidate.name + " has " + candidate.getVotes() + " votes.");
        }
    }
}