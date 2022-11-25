public class BonusMilesService {

    public int calculate(int cost) {
        int minInMile = 20;
        int bonus = cost / minInMile;
        return bonus;
    }
}
