package com.samsung.users;

public class Candidate extends User {
    Voter[] voters;

    public Candidate(String login, String password, String name) {
        super(login, password, name);
        voters = new Voter[0];
    }

    public void addVote(Voter voter) {
        //create new voters
        Voter[] newVoters = new Voter[voters.length + 1];

        //move old data
        for (int i = 0; i < voters.length; i++) {
            newVoters[i] = voters[i];
        }

        //set last voter
        newVoters[voters.length] = voter;
        voters = newVoters;
    }

    public int getVotes() {
        return voters.length;
    }
}
