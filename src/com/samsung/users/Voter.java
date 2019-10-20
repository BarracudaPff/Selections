package com.samsung.users;

public class Voter extends User {
    Candidate candidate;

    public Voter(String login, String password, String name) {
        super(login, password, name);
        candidate = null;//0, "", \u0000, false,
    }

    public void vote(Candidate newCandidate) {
        if (candidate == null) {
            candidate = newCandidate;
        } else {
            System.out.println("Error, voter already voted");
        }
    }
}
