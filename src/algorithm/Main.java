package algorithm;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {


        ArrayList<PlayedMatch> playedMatches = new ArrayList<PlayedMatch>();
        playedMatches.add(new PlayedMatch(5,6,3));
        playedMatches.add(new PlayedMatch(15,20,6));
        playedMatches.add(new PlayedMatch(4,6,4));
        playedMatches.add(new PlayedMatch(1,8,0));
        playedMatches.add(new PlayedMatch(2,1,0));
        playedMatches.add(new PlayedMatch(3,0,0));

        for (int i = 0; i < playedMatches.size(); i++) {

            System.out.println(playedMatches.get(i).next());
        }
    }
}
