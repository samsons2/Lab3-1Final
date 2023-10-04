import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        System.out.println("Hello! Welcome to my Maze game. In this game, you will have to figure out what the program can read. If you guess correctly, you will be able to progress through the maze. The first challenge is to go in a direction. Hint: Example would be 'Go right'.");
        System.out.println("Enter your move");
        Scanner scanner = new Scanner(System.in);
        String response = scanner.nextLine();
        if (response.equals("Go right")) {
            goRight();
            System.out.println("Enter your move");
            String response2 = scanner.nextLine();
            if(!response2.equals("Go forward") && !response2.equals("Go left")){
                youLose();
            }else if (response2.equals("Go forward")) {
                goForward();  //end
            } else if (response2.equals("Go left")) {
                goLeftHole();
                System.out.println("Enter your move");
                String response4 = scanner.nextLine();
                if(!response4.equals("Talk") && !response4.equals("Fight")){
                    youLose();
                }else if (response4.equals("Talk")) {
                    talkWizard();
                } else if (response4.equals("Fight")) {
                    fightWizard();
                    System.out.println("Enter the combination");
                    int response5 = Integer.parseInt(scanner.nextLine());
                    if (response5 == 1101) {
                        correctCombination();
                    } else if (response5 != 1101) {
                        wrongCombination();
                    }
                } else {
                    youLose();
                }
            }
        } else if (response.equals("Go left")) {
            goLeft();
            System.out.println("Attack his weak spot with 'Hit (body part)'");
            String response3 = scanner.nextLine();
            if(!response3.equals("Hit head") && !response3.equals("Hit belly")){
                youLose();
            }else if (response3.equals("Hit head") || response3.equals("Hit belly")) {
                attackMonster();
                System.out.println("Enter your move");
                String response6 = scanner.nextLine();
                if(!response6.equals("Go fast") && !response6.equals("Go slow")){
                    youLose();
                } else if (response6.equals("Go fast")) {
                    goFast();
                    System.out.println("Enter your answer");
                    int response7 = Integer.parseInt(scanner.nextLine());
                    if (response7 == 4) {
                        goodMath();
                        System.out.println("Enter the combination");
                        int response8=Integer.parseInt(scanner.nextLine());
                        if(response8==1101){
                            correctCombination();
                        }else if(response8!=1101){
                            wrongCombination();
                        }
                    } else if (response7 != 4) {
                        badMath();
                    }
                }else if(response6.equals("Go slow")){
                    goSlow();
                }
            }
        } else {
            youLose();
        }
    }


    public static String goRight() {
        System.out.println("Good job! You have went right. There is a large hole infront of you and a path to your left.");
        return "gg";
    }

    public static String goLeft() {
        System.out.println("Good job! You have went left. There is a monster infront you.");
        return "gg";
    }

    public static String youLose() {
        System.out.println("Computer does not understand this command. You lose.");
        return "gg";
    }

    public static String goForward() {
        System.out.println("You jump down the hole and die of fall damage. GG");
        return "gg";
    }

    public static String goLeftHole() {
        System.out.println("Good job! You went left. There is a wizard infront of you. Hint: 'Fight' or 'Talk'");
        return "gg";
    }

    public static String attackMonster() {
        System.out.println("Good job! You have found the monster's weak spot and knocked him out. You can go past him. You are now faced with a parkour course. Hint: 'Go slow' or 'Go fast'");
        return "gg";
    }

    public static String talkWizard() {
        System.out.println("The wizard does not want to talk. He blast you with energy and you are dead. GG");
        return "gg";
    }

    public static String fightWizard() {
        System.out.println("Good job! You react quicker than the wizard and defeat him with one blow. You are now faced with a 4 digit combination lock. Hint: There are 3 1s and 1 0.");
        return "gg";
    }

    public static String correctCombination() {
        System.out.println("Good job! You entered the correct combination and have escaped the maze. You won GG.");
        return "gg";
    }

    public static String wrongCombination() {
        System.out.println("Wrong combination. You have activated the explosive and you get blown to pieces. GG");
        return "gg";
    }

    public static String goFast() {
        System.out.println("You speed through the course but slip on the last jump. The Grim Reaper appears and offers you a chance at survival if you solve the math problem 2(4+4)/4");
        return "gg";
    }

    public static String goodMath() {
        System.out.println("Good job! The Grim Reaper spares you and brings you to the end of the parkour course. You are now faced with a 4 digit combination lock. Hint: There are 3 1s and 1 0.");
        return "gg";
    }

    public static String badMath() {
        System.out.println("You are bad at math. You will pay with your life. GG");
        return "gg";
    }
    public static String goSlow(){
        System.out.println("Slow and steady wins the race! Just kidding... You take too long and the monster wakes up and kills you. GG");
        return "gg";
    }
}




