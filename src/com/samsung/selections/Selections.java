package com.samsung.selections;

import com.samsung.users.Candidate;
import com.samsung.users.Voter;

public class Selections {
    String name;
    Candidate[] candidates;

    public Selections(String name, Candidate[] candidates) {
        this.name = name;
        this.candidates = candidates;
    }

    public void addVoter(Voter voter, int idCandidate) {
        Candidate myCandidate = candidates[idCandidate];

        myCandidate.addVote(voter);
        voter.vote(myCandidate);
    }

    public Candidate[] getResults() {
        return candidates;
    }
}
