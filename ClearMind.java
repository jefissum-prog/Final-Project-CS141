import java.util.Scanner;

public class ClearMind {

  // class variables
  static Scanner scanner = new Scanner(System.in);
  static int testCounter = 0; 

  public static void main(String[] args) {
    // title
    System.out.println("▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄\n" +
            "██ ▄▄▀█ ██ ▄▄█ ▄▄▀█ ▄▄▀████ ▄▀▄ ██▄██ ▄▄▀█ ▄▀██\n" +
            "██ ████ ██ ▄▄█ ▀▀ █ ▀▀▄████ █ █ ██ ▄█ ██ █ █ ██\n" +
            "██ ▀▀▄█▄▄█▄▄▄█▄██▄█▄█▄▄████ ███ █▄▄▄█▄██▄█▄▄███\n" +
            "▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀");

    while (true) {
        printMenu();

        int choice = scanner.nextInt();
        scanner.nextLine(); // consume leftover newline

        switch (choice) {
            case 1:
                System.out.println("Case 1 works");
                break;
            case 2:
                System.out.println("Placeholder");
                break;
            case 3:
                AffirmationGenerator.printAffirmation();
                break;
            case 4:
                System.out.println("Case 4 works");
                break;
            case 6:
                System.out.println("Goodbye.");
                return;
            default:
                System.out.println("Invalid input. Please try again.");
        }
    }
  }
  public static void printMenu() {
    System.out.println("\n================== Main Menu ==================\n");
    System.out.println("1. Take Mental Health Quiz");
    System.out.println("2. View Personalized Recommendations");
    System.out.println("3. Daily Affirmation, random from array.");
    System.out.println("4. View Activity Summary & Stress Score");
    System.out.println("5. Browse Support Resources");
    System.out.println("6. Exit");
    System.out.print("\nEnter your choice: ");
  }

  public static void checklastScores() {
    if (testCounter == 0){
      System.out.println("\nNo Quiz tests have been taken yet.");
    }
    else {
    System.out.println("\nYou have taken "+ testCounter + " test(s) so far.\nThe last "+
      "score:\nStress Score - " + MentalHealthQuiz.stressScore + "\nAnxiety Score - " + 
      MentalHealthQuiz.anxietyScore + "\nDepression Score - "+ MentalHealthQuiz.anxietyScore);
    }
  }
}

