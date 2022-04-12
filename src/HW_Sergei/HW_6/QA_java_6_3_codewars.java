package HW_Sergei.HW_6;

public class QA_java_6_3_codewars {

    public static String declareWinner(Fighter fighter1, Fighter fighter2, String firstAttacker) {
        // Your code goes here. Have fun!
        String winner = "";
        while (fighter1.health >= 0 || fighter2.health >= 0) {
            if (fighter1.name.equals(firstAttacker)) {
            fighter2.health -= fighter1.damagePerAttack;
                if (fighter2.health <=0) {
                winner = fighter1.name;
                break;
                }else {
                    firstAttacker = fighter2.name;
                }
            }else {
                fighter1.health -= fighter2.damagePerAttack;
                if (fighter1.health <=0) {
                    winner = fighter2.name;
                    break;
                }else {
                    firstAttacker = fighter1.name;
                }
            }
        }
        return winner;
    }

    public static void main(String[] args) {
        Fighter fighter1 = new Fighter("Lew", 15, 5);
        Fighter fighter2 = new Fighter("Harry", 30, 4);
        String attac = "Lew";

        System.out.println(declareWinner(fighter1, fighter2, attac));
    }
}

    class Fighter {
    public String name;
    public int health, damagePerAttack;
    public Fighter(String name, int health, int damagePerAttack) {
        this.name = name;
        this.health = health;
        this.damagePerAttack = damagePerAttack;
    }
}

