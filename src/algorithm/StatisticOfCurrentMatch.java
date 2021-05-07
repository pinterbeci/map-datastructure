package algorithm;

import java.util.Date;

public interface StatisticOfCurrentMatch{

    Date dateOfTheMatch = null;
    public int getMyGoals();
    public int getMyTeamGoals();
    public int getOppentsGoals();

    StatisticOfCurrentMatch next();
}
