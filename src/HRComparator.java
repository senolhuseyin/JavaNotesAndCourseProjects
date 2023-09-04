import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class HRComparator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        Player[] player = new Player[n];

        for (int i = 0; i < n; i++) {
            player[i] = new Player(scan.next(), scan.nextInt());
        }
        scan.close();

        System.out.println();
        for (Player p : player) {
            System.out.println(p.toString());
        }

        System.out.println();
        Checker checker = new Checker();
        System.out.println(checker.compare(player[0], player[1]));
        System.out.println(checker.compare(player[0], player[2]));
        System.out.println(checker.compare(player[2], player[3]));
        System.out.println();


        Arrays.sort(player, checker); //playerları checkera göre sırala
        for (Player p : player) {
            //System.out.println(p.toString());
            System.out.println(p.name + " " + p.score);
        }
    }
}


class Checker implements Comparator<Player> { //önce puan sonra isme göre sıralama

    @Override
    public int compare(Player a, Player b) {
        if (a.score == b.score) {
            return a.name.compareTo(b.name);
        } else if (a.score > b.score)
            return -1;
        else {
            return 1;
        }
    }
}


class Player {
    String name;
    int score;

    public Player(String name, int score) {
        this.name = name;
        this.score = score;
    }

    public String toString() {
        return name + score;
    }
}


/*
        5
        amy 100
        david 100
        heraldo 50
        aakansha 75
        aleksa 150*/

