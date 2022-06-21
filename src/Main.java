import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StepTracker stepTracker = new StepTracker();
        printMenu();
        int userInput = scanner.nextInt();

        while (userInput != 4) {
            // обработка разных случаев
            if (userInput == 1) {
                System.out.println("Какой месяц, братик?");
                int mouthToSet = scanner.nextInt();
                System.out.println("Какой день, братик?");
                int dayToSet = scanner.nextInt();
                System.out.println("Скока прошел, братик?");
                int steps = scanner.nextInt();
                StepTracker.MonthData[] monthToData = stepTracker.getMonthToData();
                monthToData[mouthToSet].setDayData()[dayToSet].setSteps(steps);
                System.out.println("Записал");
                printMenu();
                userInput = scanner.nextInt(); // повторное считывание данных от пользователя
            } else if  (userInput == 2) {
                System.out.println("Какой месяц, братик?");
                int mouthStat = scanner.nextInt();

            } else if (userInput == 3) {
                System.out.println("Какая дневная цель, братик?");
                int userInputTarget = scanner.nextInt();
                stepTracker.setTarget(userInputTarget);
                printMenu();
                new StepTracker();// печатаем меню ещё раз перед завершением предыдущего действия
                userInput = scanner.nextInt(); // повторное считывание данных от пользователя
            }
        }
        System.out.println("Программа завершена");
    }

    private static void printMenu() {
        System.out.println("|----------------------------------------------------------------------------------|");
        System.out.println("| Привет, username! Это фитнес приложение, что ты хочешь сделать? Выбери от 1 до 4 |");
        System.out.println("| 1 - Ввести количество шагов за определённый день                                 |");
        System.out.println("| 2 - Напечатать статистику за определённый месяц                                  |");
        System.out.println("| 3 - Изменить цель по количеству шагов в день                                     |");
        System.out.println("| 4 - Выйти из приложения                                                          |");
        System.out.println("|----------------------------------------------------------------------------------|");
    }
} 
