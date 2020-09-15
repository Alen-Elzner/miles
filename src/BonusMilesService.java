public class BonusMilesService {
    public int calculate(int price){
        int coefficient = 20 ;
        int miles = price / coefficient ;
        return miles;
    }
}
