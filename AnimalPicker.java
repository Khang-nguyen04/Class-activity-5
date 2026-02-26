import java.util.Scanner;

public class AnimalPicker {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String choice;
        while (true) {
            System.out.print("Which animal would you like to see? (dog/cat): ");
            choice = in.nextLine().trim();
            if (choice.equalsIgnoreCase("dog")) {
                System.out.println(
"           ___\n       .-\'`   `\'-.\n   _,.\'.===   ===.\'.,_\n  / /  .___. .___.  \\ \\\n / /   ( o ) ( o )   \\ \\                                            _\n: /|    \'-\'___\'-\'    |\\ ;                                          (_)\n| |`\\_,.-\'`   `\"-.,_/\'| |                                          /|\n| |  \\             /  | |                                         /\\;\n| |   \\           /   | | _                              ___     /\\/\n| |    \\   __    /\\   | |\' `\\-.-.-.-.-.-.-.-.-.-.-.-.-./`   `\"-,/\\/ \n| |     \\ (__)  /\\ `-\'| |    `\\ \\ \\ \\ \\ \\ \\ \\ \\ \\ \\ \\ \\`\\       \\/\n| |      \\-...-/  `-,_| |      \\`\\ \\ \\ \\ \\ \\ \\ \\ \\ \\ \\ \\ \\       \\\n| |       \'---\'    /  | |       | | | | | | | | | | | | | |       |\n| |               |   | |       | | | | | | | | | | | | | |       |\n\\_/               |   \\_/       | | | | | | | | | | | | | | .--.  ;Dog House\n                  |       .--.  | | | | | | | | | | | | | | |  | /\n                   \\      |  | / / / / / / / / / / / / / /  |  |/\n               jgs |`-.___|  |/-\'-\'-\'-\'-\'-\'-\'-\'-\'-\'-\'-\'-\'`--|  |\n            ,.-----\'~~;   |  |                  (_(_(______)|  |\n           (_(_(_______)  |  |                        ,-----`~~~\\\n                    ,-----`~~~\\                      (_(_(_______)\n                   (_(_(_______)\n"
);
                break;
            } else if (choice.equalsIgnoreCase("cat")) {
                System.out.println(
"            /)\n           //\n          //\n         ((\n          \\\\\n           ))\n          //\n      _,-\'\"._\n     /_  ,   \\\n     |   \'   /\n     \\)    ,\\\'\n     \'|      \\\n     /   |   )\n    /_   ,  /\n   /  _  % (\n   ) /    \' \\\n  /        \\_)\n  ),    )_   \\_  ,\n _/    _/%     \\/)\n(\'  __/ \\ ___    \\,\n \\   (   `\"-  __  /\n  \'\\  \\   ((   >  \\\n    )  \\   \'-.-,_=\'~~~  ~\n   (\'  /         \' ~~ ~  ~~ ~~ b\'ger\n   \" \"\"\n"
);
                break;
            } else {
                System.out.println("Error: invalid option. Please choose 'dog' or 'cat'.");
            }
        }
        in.close();
    }
}
