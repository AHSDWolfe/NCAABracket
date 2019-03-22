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
        Team tw1 = new Team("Gonzaga", "mascot", 1, "west", 1);
        Team tw2 = new Team("F. Dickinson", "mascot2", 1, "west", 16);
        Team tw3 = new Team("Syracuse", "mascot3", 1, "west", 8);
        Team tw4 = new Team("Baylor", "mascot4", 1, "west", 25);
        Team tw5 = new Team("Marquette", "mascot5", 1, "west", 21);
        Team tw6 = new Team("Murray St.", "mascot6", 1, "west", 33);
        Team tw7 = new Team("Florida St.", "mascot7", 1, "west", 28);
        Team tw8 = new Team("Vermont", "mascot8", 1, "west", 13);
        Team tw9 = new Team("Buffalo", "mascot9", 1, "west", 19);
        Team tw10 = new Team("Arizona State", "mascot10", 1, "west", 43);
        Team tw11 = new Team("Texas Tech", "mascot11", 1, "west", 31);
        Team tw12 = new Team("Northern Ky.", "mascot12", 1, "west", 42);
        Team tw13 = new Team("Nevada", "mascot13", 1, "west", 23);
        Team tw14 = new Team("Florida", "mascot14", 1, "west", 37);
        Team tw15 = new Team("Michigan", "mascot15", 1, "west", 17);
        Team tw16 = new Team("Montana", "mascot16", 1, "west", 15);

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
        Team ts1 = new Team("Virginia", "mascot", 1, "south", 2);
        Team ts2 = new Team("Gardner-Webb", "mascot2", 1, "south", 48);
        Team ts3 = new Team("Mississippi", "mascot3", 1, "south", 30);
        Team ts4 = new Team("Oklahoma", "mascot4", 1, "south", 41);
        Team ts5 = new Team("Wisconsin", "mascot5", 1, "south", 36);
        Team ts6 = new Team("Oregon", "mascot6", 1, "south", 47);
        Team ts7 = new Team("Kansas St.", "mascot7", 1, "south", 45);
        Team ts8 = new Team("UC Irvine", "mascot8", 1, "south", 51);
        Team ts9 = new Team("Villanova", "mascot9", 1, "south", 16);
        Team ts10 = new Team("Saint Mary's", "mascot10", 1, "south", 20);
        Team ts11 = new Team("Purdue", "mascot11", 1, "south", 5);
        Team ts12 = new Team("Old Dominion", "mascot12", 1, "south", 14);
        Team ts13 = new Team("Cincinnati", "mascot13", 1, "south", 35);
        Team ts14 = new Team("Iowa", "mascot14", 1, "south", 15);
        Team ts15 = new Team("Tennessee", "mascot15", 1, "south", 3);
        Team ts16 = new Team("Colgate", "mascot16", 1, "south", 40);

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
        Team te1 = new Team("Duke", "mascot", 1, "east", 6);
        Team te2 = new Team("N. Dakota", "mascot2", 1, "east", 49);
        Team te3 = new Team("VCU", "mascot3", 1, "east", 53);
        Team te4 = new Team("UCF", "mascot4", 1, "east", 39);
        Team te5 = new Team("Mississippi St.", "mascot5", 1, "east", 14);
        Team te6 = new Team("Liberty", "mascot6", 1, "east", 38);
        Team te7 = new Team("Virginia Tech", "mascot7", 1, "east", 11);
        Team te8 = new Team("Saint Louis", "mascot8", 1, "east", 54);
        Team te9 = new Team("Maryland", "mascot9", 1, "east", 24);
        Team te10 = new Team("Belmont", "mascot10", 1, "east", 18);
        Team te11 = new Team("LSU", "mascot11", 1, "east", 10);
        Team te12 = new Team("Yale", "mascot12", 1, "east", 34);
        Team te13 = new Team("Louisville", "mascot13", 1, "east", 26);
        Team te14 = new Team("Minnesota", "mascot14", 1, "east", 10);
        Team te15 = new Team("Michigan St.", "mascot15", 1, "east", 4);
        Team te16 = new Team("Bradley", "mascot16", 1, "east", 15);

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
        Team tmw1 = new Team("North Carolina", "mascot", 1, "midwest", 7);
        Team tmw2 = new Team("Iona", "mascot2", 1, "midwest", 52);
        Team tmw3 = new Team("Utah St.", "mascot3", 1, "midwest", 27);
        Team tmw4 = new Team("Washington", "mascot4", 1, "midwest", 50);
        Team tmw5 = new Team("Auburn", "mascot5", 1, "midwest", 8);
        Team tmw6 = new Team("New Mexico State", "mascot6", 1, "midwest", 32);
        Team tmw7 = new Team("Kansas", "mascot7", 1, "midwest", 4);
        Team tmw8 = new Team("Northeastern", "mascot8", 1, "midwest", 60);
        Team tmw9 = new Team("Iowa St.", "mascot9", 1, "midwest", 9);
        Team tmw10 = new Team("Ohio St.", "mascot10", 1, "midwest", 44);
        Team tmw11 = new Team("Houston", "mascot11", 1, "midwest", 22);
        Team tmw12 = new Team("Georgia St.", "mascot12", 1, "midwest", 46);
        Team tmw13 = new Team("Wofford", "mascot13", 1, "midwest", 13);
        Team tmw14 = new Team("Seton Hall", "mascot14", 1, "midwest", 10);
        Team tmw15 = new Team("Kentucky", "mascot15", 1, "midwest", 12);
        Team tmw16 = new Team("Abilene Christ.", "mascot16", 1, "midwest", 15);

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
            westR3.add(checkWinner(westR2.get(x), westR2.get(x + 1)));
        }

        for (int x = 0; x < southR2.size(); x += 2) {
            southR3.add(checkWinner(southR2.get(x), southR2.get(x + 1)));
        }

        for (int x = 0; x < eastR2.size(); x += 2) {
            eastR3.add(checkWinner(eastR2.get(x), eastR2.get(x + 1)));
        }

        for (int x = 0; x < midwestR2.size(); x += 2) {
            midwestR3.add(checkWinner(midwestR2.get(x), midwestR2.get(x + 1)));
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
            westR4.add(checkWinner(westR3.get(x), westR3.get(x + 1)));
        }

        for (int x = 0; x < southR3.size(); x += 2) {
            southR4.add(checkWinner(southR3.get(x), southR3.get(x + 1)));
        }

        for (int x = 0; x < eastR3.size(); x += 2) {
            eastR4.add(checkWinner(eastR3.get(x), eastR3.get(x + 1)));
        }

        for (int x = 0; x < midwestR3.size(); x += 2) {
            midwestR4.add(checkWinner(midwestR3.get(x), midwestR3.get(x + 1)));
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

        for (int x = 0; x < westR4.size(); x += 2) {
            leftFinal.add(checkWinner(westR4.get(x), westR4.get(x + 1)));
        }
        
        //Print Out Teams In The Left Final
        System.out.println("------------------------------");
        System.out.println("\tLeft Final");
        System.out.println("------------------------------");
        for (int x = 0; x < leftFinal.size(); x++){
            System.out.println(leftFinal.get(x).getName());
        }
        
        //Check Winners For The Right Final
        for (int x = 0; x < southR4.size(); x += 2) {
            rightFinal.add(checkWinner(southR4.get(x), southR4.get(x + 1)));
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