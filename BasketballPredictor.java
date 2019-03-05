/**
 * Denver Wolfe
 * NCAA Basketball Tournament Predictor
 * Programming III - AP CS
 * 2/21/19
 */

import java.util.ArrayList;
import java.util.Random;

public class BasketballPredictor {

    public static void main(String[] args) {
        
        //Create West Region Array List
        ArrayList<Team> west = new ArrayList();

        //Create Teams For The West Region
        Team tw1 = new Team("Xavier", "mascot", 1, "west", 1);
        Team tw2 = new Team("Texas Southern", "mascot2", 1, "west", 16);
        Team tw3 = new Team("Missouri", "mascot3", 1, "west", 8);
        Team tw4 = new Team("Florida State", "mascot4", 1, "west", 9);
        Team tw5 = new Team("Ohio State", "mascot5", 1, "west", 5);
        Team tw6 = new Team("South Dakota State", "mascot6", 1, "west", 12);
        Team tw7 = new Team("Gonzaga", "mascot7", 1, "west", 4);
        Team tw8 = new Team("UNC Greensboro", "mascot8", 1, "west", 13);
        Team tw9 = new Team("Houston", "mascot9", 1, "west", 6);
        Team tw10 = new Team("San Diego State", "mascot10", 1, "west", 11);
        Team tw11 = new Team("Michigan", "mascot11", 1, "west", 3);
        Team tw12 = new Team("Montana", "mascot12", 1, "west", 14);
        Team tw13 = new Team("Texas A&M", "mascot13", 1, "west", 17);
        Team tw14 = new Team("Providence", "mascot14", 1, "west", 10);
        Team tw15 = new Team("North Carolina", "mascot15", 1, "west", 2);
        Team tw16 = new Team("Lipscomb", "mascot16", 1, "west", 15);

        //Add Teams To The West Region
        west.add(tw1);
        west.add(tw2);
        west.add(tw3);
        west.add(tw4);
        west.add(tw5);
        west.add(tw6);
        west.add(tw7);
        west.add(tw8);
        west.add(tw9);
        west.add(tw10);
        west.add(tw11);
        west.add(tw12);
        west.add(tw13);
        west.add(tw14);
        west.add(tw15);
        west.add(tw16);

        //Print Out Teams In The First Round of The West Region
        System.out.println("------------------------------");
        System.out.println("\tWest");
        System.out.println("------------------------------");

        for (int x = 0; x < west.size(); x++) {
            System.out.println(west.get(x).getName()
                    + " - " + west.get(x).getMascot());
        }

        //Create South Region Array List
        ArrayList<Team> south = new ArrayList();

        //Create Teams For The South Region
        Team ts1 = new Team("Virginia", "mascot", 1, "south", 1);
        Team ts2 = new Team("UMBC", "mascot2", 1, "south", 16);
        Team ts3 = new Team("Creighton", "mascot3", 1, "south", 8);
        Team ts4 = new Team("Kansas State", "mascot4", 1, "south", 9);
        Team ts5 = new Team("Kentucky", "mascot5", 1, "south", 5);
        Team ts6 = new Team("Davidson", "mascot6", 1, "south", 12);
        Team ts7 = new Team("Arizona", "mascot7", 1, "south", 4);
        Team ts8 = new Team("Buffalo", "mascot8", 1, "south", 13);
        Team ts9 = new Team("Miami", "mascot9", 1, "south", 6);
        Team ts10 = new Team("Loyola-Chicago", "mascot10", 1, "south", 11);
        Team ts11 = new Team("Tennessee", "mascot11", 1, "south", 3);
        Team ts12 = new Team("Wright State", "mascot12", 1, "south", 14);
        Team ts13 = new Team("Nevada", "mascot13", 1, "south", 17);
        Team ts14 = new Team("Texas", "mascot14", 1, "south", 10);
        Team ts15 = new Team("Cincinnati", "mascot15", 1, "south", 2);
        Team ts16 = new Team("Georgia State", "mascot16", 1, "south", 15);

        //Add Teams To The South Region
        south.add(ts1);
        south.add(ts2);
        south.add(ts3);
        south.add(ts4);
        south.add(ts5);
        south.add(ts6);
        south.add(ts7);
        south.add(ts8);
        south.add(ts9);
        south.add(ts10);
        south.add(ts11);
        south.add(ts12);
        south.add(ts13);
        south.add(ts14);
        south.add(ts15);
        south.add(ts16);

        //Print Out Teams In The First Round of The South Region
        System.out.println("------------------------------");
        System.out.println("\tSouth");
        System.out.println("------------------------------");

        for (int x = 0; x < south.size(); x++) {
            System.out.println(south.get(x).getName()
                    + " - " + south.get(x).getMascot());
        }

        //Create East Region Array List
        ArrayList<Team> east = new ArrayList();

        //Create Teams For The East Region
        Team te1 = new Team("Villanova", "mascot", 1, "east", 1);
        Team te2 = new Team("Radford", "mascot2", 1, "east", 16);
        Team te3 = new Team("Virginia Tech", "mascot3", 1, "east", 8);
        Team te4 = new Team("Alabama", "mascot4", 1, "east", 9);
        Team te5 = new Team("West Virginia", "mascot5", 1, "east", 5);
        Team te6 = new Team("Murray State", "mascot6", 1, "east", 12);
        Team te7 = new Team("Wichita State", "mascot7", 1, "east", 4);
        Team te8 = new Team("Marshall", "mascot8", 1, "east", 13);
        Team te9 = new Team("Florida", "mascot9", 1, "east", 6);
        Team te10 = new Team("Texas Tech", "mascot10", 1, "east", 11);
        Team te11 = new Team("SF Austin", "mascot11", 1, "east", 3);
        Team te12 = new Team("Arkansas", "mascot12", 1, "east", 14);
        Team te13 = new Team("Butler", "mascot13", 1, "east", 17);
        Team te14 = new Team("Purdue", "mascot14", 1, "east", 10);
        Team te15 = new Team("CSU Fullerton", "mascot15", 1, "east", 2);
        Team te16 = new Team("team16", "mascot16", 1, "east", 15);

        //Add Teams To The East Region
        east.add(te1);
        east.add(te2);
        east.add(te3);
        east.add(te4);
        east.add(te5);
        east.add(te6);
        east.add(te7);
        east.add(te8);
        east.add(te9);
        east.add(te10);
        east.add(te11);
        east.add(te12);
        east.add(te13);
        east.add(te14);
        east.add(te15);
        east.add(te16);

        //Print Out Teams In The First Round of The East Region
        System.out.println("------------------------------");
        System.out.println("\tEast");
        System.out.println("------------------------------");

        for (int x = 0; x < east.size(); x++) {
            System.out.println(east.get(x).getName()
                    + " - " + east.get(x).getMascot());
        }

        //Create Midwest Region Array List
        ArrayList<Team> midwest = new ArrayList();

        //Create Teams For The Midwest Region
        Team tmw1 = new Team("Kansas", "mascot", 1, "midwest", 1);
        Team tmw2 = new Team("Penn", "mascot2", 1, "midwest", 16);
        Team tmw3 = new Team("Seton Hall", "mascot3", 1, "midwest", 8);
        Team tmw4 = new Team("NC State", "mascot4", 1, "midwest", 9);
        Team tmw5 = new Team("Clemson", "mascot5", 1, "midwest", 5);
        Team tmw6 = new Team("New Mexico State", "mascot6", 1, "midwest", 12);
        Team tmw7 = new Team("Auburn", "mascot7", 1, "midwest", 4);
        Team tmw8 = new Team("Charleston", "mascot8", 1, "midwest", 13);
        Team tmw9 = new Team("TCU", "mascot9", 1, "midwest", 6);
        Team tmw10 = new Team("Syracuse", "mascot10", 1, "midwest", 11);
        Team tmw11 = new Team("Michigan State", "mascot11", 1, "midwest", 3);
        Team tmw12 = new Team("Bucknell", "mascot12", 1, "midwest", 14);
        Team tmw13 = new Team("Rhode Island", "mascot13", 1, "midwest", 17);
        Team tmw14 = new Team("Oklahoma", "mascot14", 1, "midwest", 10);
        Team tmw15 = new Team("Duke", "mascot15", 1, "midwest", 2);
        Team tmw16 = new Team("Iona", "mascot16", 1, "midwest", 15);

        //Add Teams To The Midwest Region
        midwest.add(tmw1);
        midwest.add(tmw2);
        midwest.add(tmw3);
        midwest.add(tmw4);
        midwest.add(tmw5);
        midwest.add(tmw6);
        midwest.add(tmw7);
        midwest.add(tmw8);
        midwest.add(tmw9);
        midwest.add(tmw10);
        midwest.add(tmw11);
        midwest.add(tmw12);
        midwest.add(tmw13);
        midwest.add(tmw14);
        midwest.add(tmw15);
        midwest.add(tmw16);

        //Print Out Teams In The First Round of The Midwest Region
        System.out.println("------------------------------");
        System.out.println("      Midwest");
        System.out.println("------------------------------");

        for (int x = 0; x < midwest.size(); x++) {
            System.out.println(midwest.get(x).getName()
                    + " - " + midwest.get(x).getMascot());
        }

        //Create Array Lists For Each Round
        ArrayList<Team> westR2 = new ArrayList();
        ArrayList<Team> southR2 = new ArrayList();
        ArrayList<Team> eastR2 = new ArrayList();
        ArrayList<Team> midwestR2 = new ArrayList();

        ArrayList<Team> westR3 = new ArrayList();
        ArrayList<Team> southR3 = new ArrayList();
        ArrayList<Team> eastR3 = new ArrayList();
        ArrayList<Team> midwestR3 = new ArrayList();

        ArrayList<Team> westR4 = new ArrayList();
        ArrayList<Team> southR4 = new ArrayList();
        ArrayList<Team> eastR4 = new ArrayList();
        ArrayList<Team> midwestR4 = new ArrayList();

        ArrayList<Team> leftFinal = new ArrayList();
        ArrayList<Team> rightFinal = new ArrayList();
        
        ArrayList<Team> final2 = new ArrayList();

        //Check Winners For The First Round
        for (int x = 0; x < west.size(); x += 2) {
            westR2.add(checkWinner(west.get(x), west.get(x + 1)));
        }

        for (int x = 0; x < south.size(); x += 2) {
            southR2.add(checkWinner(south.get(x), south.get(x + 1)));
        }

        for (int x = 0; x < east.size(); x += 2) {
            eastR2.add(checkWinner(east.get(x), east.get(x + 1)));
        }

        for (int x = 0; x < midwest.size(); x += 2) {
            midwestR2.add(checkWinner(midwest.get(x), midwest.get(x + 1)));
        }

        //Print Out Teams In The Second Round of The West Region
        System.out.println("------------------------------");
        System.out.println("\tWest - Round 2");
        System.out.println("------------------------------");

        for (int x = 0; x < westR2.size(); x++) {
            System.out.println(westR2.get(x).getName());
        }

        //Print Out Teams In The Second Round of The South Region
        System.out.println("------------------------------");
        System.out.println("\tSouth - Round 2");
        System.out.println("------------------------------");

        for (int x = 0; x < southR2.size(); x++) {
            System.out.println(southR2.get(x).getName());
        }

        //Print Out Teams In The Second Round of The East Region
        System.out.println("------------------------------");
        System.out.println("\tEast - Round 2");
        System.out.println("------------------------------");

        for (int x = 0; x < eastR2.size(); x++) {
            System.out.println(eastR2.get(x).getName());
        }

        //Print Out Teams In The Second Round of The Midwest Region
        System.out.println("------------------------------");
        System.out.println("\tMidwest - Round 2");
        System.out.println("------------------------------");

        for (int x = 0; x < midwestR2.size(); x++) {
            System.out.println(midwestR2.get(x).getName());
        }

        //Check Winners For The Third Round
        for (int x = 0; x < westR2.size(); x += 2) {
            westR3.add(checkWinner(west.get(x), west.get(x + 1)));
        }

        for (int x = 0; x < southR2.size(); x += 2) {
            southR3.add(checkWinner(south.get(x), south.get(x + 1)));
        }

        for (int x = 0; x < eastR2.size(); x += 2) {
            eastR3.add(checkWinner(east.get(x), east.get(x + 1)));
        }

        for (int x = 0; x < midwestR2.size(); x += 2) {
            midwestR3.add(checkWinner(midwest.get(x), midwest.get(x + 1)));
        }

        //Print Out Teams In The Third Round of The West Region
        System.out.println("------------------------------");
        System.out.println("\tWest - Round 3");
        System.out.println("------------------------------");

        for (int x = 0; x < westR3.size(); x++) {
            System.out.println(westR3.get(x).getName());
        }

        //Print Out Teams In The Third Round of The South Region
        System.out.println("------------------------------");
        System.out.println("\tSouth - Round 3");
        System.out.println("------------------------------");

        for (int x = 0; x < southR3.size(); x++) {
            System.out.println(southR3.get(x).getName());
        }

        //Print Out Teams In The Third Round of The East Region
        System.out.println("------------------------------");
        System.out.println("\tEast - Round 3");
        System.out.println("------------------------------");

        for (int x = 0; x < eastR3.size(); x++) {
            System.out.println(eastR3.get(x).getName());
        }

        //Print Out Teams In The Third Round of The Midwest Region
        System.out.println("------------------------------");
        System.out.println("\tMidwest - Round 3");
        System.out.println("------------------------------");

        for (int x = 0; x < midwestR3.size(); x++) {
            System.out.println(midwestR3.get(x).getName());
        }

        //Check Winners For The Fourth Round
        for (int x = 0; x < westR3.size(); x += 2) {
            westR4.add(checkWinner(west.get(x), west.get(x + 1)));
        }

        for (int x = 0; x < southR3.size(); x += 2) {
            southR4.add(checkWinner(south.get(x), south.get(x + 1)));
        }

        for (int x = 0; x < eastR3.size(); x += 2) {
            eastR4.add(checkWinner(east.get(x), east.get(x + 1)));
        }

        for (int x = 0; x < midwestR3.size(); x += 2) {
            midwestR4.add(checkWinner(midwest.get(x), midwest.get(x + 1)));
        }

        //Print Out Teams In The Fourth Round of The West Region
        System.out.println("------------------------------");
        System.out.println("\tWest - Round 4");
        System.out.println("------------------------------");

        for (int x = 0; x < westR4.size(); x++) {
            System.out.println(westR4.get(x).getName());
        }

        //Print Out Teams In The Fourth Round of The South Region
        System.out.println("------------------------------");
        System.out.println("\tSouth - Round 4");
        System.out.println("------------------------------");

        for (int x = 0; x < southR4.size(); x++) {
            System.out.println(southR4.get(x).getName());
        }

        //Print Out Teams In The Fourth Round of The East Region
        System.out.println("------------------------------");
        System.out.println("\tEast - Round 4");
        System.out.println("------------------------------");

        for (int x = 0; x < eastR4.size(); x++) {
            System.out.println(eastR4.get(x).getName());
        }

        //Print Out Teams In The Fourth Round of The Midwest Region
        System.out.println("------------------------------");
        System.out.println("\tMidwest - Round 4");
        System.out.println("------------------------------");

        for (int x = 0; x < midwestR4.size(); x++) {
            System.out.println(midwestR4.get(x).getName());
        }

        //Check Winners For The Left Final
        for (int x = 0; x < eastR4.size(); x += 2) {
            leftFinal.add(checkWinner(eastR4.get(x), eastR4.get(x + 1)));
        }

        for (int x = 0; x < southR4.size(); x += 2) {
            leftFinal.add(checkWinner(southR4.get(x), southR4.get(x + 1)));
        }
        
        //Print Out Teams In The Left Final
        System.out.println("------------------------------");
        System.out.println("\tLeft Final");
        System.out.println("------------------------------");
        for (int x = 0; x < leftFinal.size(); x++){
            System.out.println(leftFinal.get(x).getName());
        }
        
        //Check Winners For The Right Final
        for (int x = 0; x < westR4.size(); x += 2) {
            rightFinal.add(checkWinner(westR4.get(x), westR4.get(x + 1)));
        }
        
        for (int x = 0; x < midwestR4.size(); x += 2) {
            rightFinal.add(checkWinner(midwestR4.get(x), midwestR4.get(x + 1)));
        }
        
        //Print Out Teams In The Right Final
        System.out.println("------------------------------");
        System.out.println("\tRight Final");
        System.out.println("------------------------------");
        for (int x = 0; x < rightFinal.size(); x++) {
            System.out.println(rightFinal.get(x).getName());
        }
        
        //Check Winners For The Final Two
        for (int x = 0; x < leftFinal.size(); x += 2) {
            final2.add(checkWinner(leftFinal.get(x), leftFinal.get(x + 1)));
        }
        
        for (int x = 0; x < rightFinal.size(); x += 2) {
            final2.add(checkWinner(rightFinal.get(x), rightFinal.get(x + 1)));
        }
        
        //Print Out Teams In The Final Round
        System.out.println("------------------------------");
        System.out.println("\tFinal Round");
        System.out.println("------------------------------");
        for (int x = 0; x < final2.size(); x++){
            System.out.println(final2.get(x).getName());
        }
        
        //Check And Print Out Winner
        System.out.println("------------------------------");
        System.out.println("\tWinner");
        System.out.println("------------------------------");
        ArrayList<Team> winner = new ArrayList();
        for (int x = 0; x < final2.size(); x += 2) {
            winner.add(checkWinner(final2.get(x), final2.get(x + 1)));
        }
        System.out.println(winner.get(0).getName());
    }
    public static Team checkWinner(Team one, Team two) {
        //Compare and return the winner
        if (one.getPowerRanking() > two.getPowerRanking()) {
            return two;
        } else if (two.getPowerRanking() > one.getPowerRanking()) {
            return one;
        } else {
            
            //Create Random Thing
            Random random = new Random();
            
            //Generate Random Number
            int r;
            r = random.nextInt(10)+0;
            
            //Return Winner In Event of Tie
            if (r == 1 || r == 3 || r == 5 || r == 7 || r == 9){
                return one;
            } else {
                return two;
            }
        }
    }
}