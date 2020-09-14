public class Main {
    public static void main(String[] args) {
        int ticket_price = 2090;  //цена с копейками
        int coefficient = 20;
        int bonus = ticket_price / coefficient / 100;
        System.out.println(bonus);
    }
}
