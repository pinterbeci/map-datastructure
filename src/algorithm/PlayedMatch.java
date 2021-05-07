package algorithm;

import java.util.ArrayList;

public class PlayedMatch implements StatisticOfCurrentMatch {

    private int teamGoals;
    private int oppponentTeamGoals;
    private int myGoals;

    public PlayedMatch() {
    }


    public PlayedMatch(int teamGoals, int oppponentTeamGoals, int myGoals) {
        this.teamGoals = teamGoals;
        this.oppponentTeamGoals = oppponentTeamGoals;
        this.myGoals = myGoals;
    }



    public int getTeamGoals() {
        return teamGoals;
    }

    public void setTeamGoals(int teamGoals) {
        this.teamGoals = teamGoals;
    }

    public int getOppponentTeamGoals() {
        return oppponentTeamGoals;
    }

    public void setOppponentTeamGoals(int oppponentTeamGoals) {
        this.oppponentTeamGoals = oppponentTeamGoals;
    }

    public void setMyGoals(int myGoals) {
        this.myGoals = myGoals;
    }

    @Override
    public int getMyGoals() {
        return this.getMyGoals();
    }

    @Override
    public int getMyTeamGoals() {
        return this.getTeamGoals();
    }

    @Override
    public int getOppentsGoals() {
        return getOppponentTeamGoals();
    }

    @Override
    public StatisticOfCurrentMatch next() {

        return new PlayedMatch();
    }

}
