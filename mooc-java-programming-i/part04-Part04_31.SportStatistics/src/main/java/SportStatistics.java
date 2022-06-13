
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SportStatistics {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("File:");
        String file = scan.nextLine();

        System.out.println("Team:");
        String team = scan.nextLine();

        Integer games = 0;
        Integer wins = 0;
        Integer losses = 0;

        try (Scanner fileScanner = new Scanner(Paths.get(file))){
            while (fileScanner.hasNextLine()) {
                String row = fileScanner.nextLine();
                String team1 = row.split(",")[0];
                String team2 = row.split(",")[1];
                Integer team1Score = Integer.valueOf(row.split(",")[2]);
                Integer team2Score = Integer.valueOf(row.split(",")[3]);

                if (team.equals(team1) || team.equals(team2)) {
                    games++;
                    if ((team.equals(team1) && team1Score > team2Score) || (team.equals(team2) && team2Score > team1Score)) {
                        wins++;
                    } else losses++;
                }
            }
        } catch (Exception e) {
            throw new RuntimeException();
        }

        System.out.println("Games: " + games);
        System.out.println("Wins: " + wins);
        System.out.println("Losses: " + losses);
    }

}
