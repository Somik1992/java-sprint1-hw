import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StepTracker stepTracker = new StepTracker();
        Converter converter = new Converter();
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
                printMenu();
                userInput = scanner.nextInt();
            } else if  (userInput == 2) {
                System.out.println("Какой месяц, братик?");
                int mouthStat = scanner.nextInt();
                System.out.println("Шагов за " + mouthStat + " Месяц " + stepTracker.calcMonthSteps(mouthStat));
                System.out.println(stepTracker.stepsInDay(mouthStat));
                System.out.println("Среднее количество шагов за день ~ " + stepTracker.meanStepsInMonth(mouthStat));
                System.out.println("Максимальное количество шагов за день " + stepTracker.maxStepsInMonth(mouthStat));
                System.out.println("Пройденная дистанция в км ~ " + converter.converStepsInDist(stepTracker.calcMonthSteps(mouthStat)));
                System.out.println("Соженных килокалорий ~ " + converter.converStepsIneEnergy(stepTracker.calcMonthSteps(mouthStat)));
                System.out.println("Лучшая серия: максимальное количество подряд идущих дней, в течение которых количество шагов за день было равно или выше целевого " + stepTracker.maxSeries(mouthStat));
                printMenu();
                userInput = scanner.nextInt();
            } else if (userInput == 3) {
                System.out.println("Какая дневная цель, братик?");
                int userInputTarget = scanner.nextInt();
                stepTracker.setTarget(userInputTarget);
                printMenu();
                userInput = scanner.nextInt();
            } else {
                System.out.println("Такой команды не существует, братик, давай сначала");
                printMenu();
                userInput = scanner.nextInt();
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
