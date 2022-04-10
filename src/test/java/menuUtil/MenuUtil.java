package menuUtil;

import service.ReadFileService;

import java.util.HashMap;
import java.util.Scanner;

public class MenuUtil extends ReadFileService {

    public static void menu(HashMap lists) {
        Scanner sc1 = new Scanner(System.in);
        System.out.print("Sual İngilis dilində soruşulsun yoxsa Azərbaycan dilində?\n" +
                "1.Azerbaijan\n" +
                "2.English\n" +
                ":");
        int gstn = sc1.nextInt();
        if (gstn == 1) {
            MenuUtil.azWords(lists);
        } else if (gstn == 2) {
            MenuUtil.engWords(lists);
        }
    }

    public static void azWords(HashMap lists) {
        int f = 0;
        int t= 0;
        while (true) {
            Scanner sc = new Scanner(System.in);
            for (Object i : lists.keySet()) {
                System.out.println("Azərbaycan dilində " + "{"+lists.get(i)+"}" + " nə deməkdir");
                String question = sc.nextLine();
                if (question.equals(i)) {
                    System.out.println("Düzgün");
                    t++;
                } else {
                    System.out.println("Yanlış\n----------------------");
                    f++;
                    if (f == 3) {
                        System.out.println("Haqqınız bitdi \nSizin doğru cavablarınızın sayı:"+t);
                        Scanner sc2 = new Scanner(System.in);
                        System.out.println("1.yenidən oyna\n" +
                                "2.Menyuya get\n" +
                                "3.Çıxış");
                        int question2 = sc2.nextInt();
                        if (question2 == 1) {
                            azWords(lists);
                        } else if (question2 == 2) {
                            menu(lists);
                        } else {
                            System.exit(1);
                        }
                    }
                }
            }
        }
    }

    public static void engWords(HashMap lists) {
        int f=0;
        int t=0;
        while (true) {
            Scanner sc = new Scanner(System.in);
            for (Object i : lists.keySet()) {
                System.out.println();
                System.out.println("What does "+"{" +i+"}" +" mean in English?");
                String question = sc.nextLine();
                if (question.equals(lists.get(i))) {
                    System.out.println("True");
                    t++;
                } else {
                    System.out.println("False\n----------------------");
                    f++;
                    if (f == 3) {
                        System.out.println("Your right is over\n" +
                                "Number of your correct answers:"+t);
                        Scanner sc2 = new Scanner(System.in);
                        System.out.println("1.Restart game\n" +
                                "2.Main menu\n" +
                                "3.Exit");
                        int question2 = sc2.nextInt();
                        if (question2 == 1) {
                            engWords(lists);
                        } else if (question2 == 2) {
                            menu(lists);
                        } else {
                            System.exit(1);
                        }
                    }
                }
            }
        }
    }
}
