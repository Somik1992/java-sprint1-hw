import java.util.Arrays;

public class StepTracker {
    int targetSteps = 10000;
    MonthData[] monthToData;

    public StepTracker() {
        monthToData = new MonthData[12];
        for (int i = 0; i < monthToData.length; i++) {
            monthToData[i] = new MonthData();
        }
    }

    class MonthData {
        DayData[] dayData;

        public MonthData() {
            dayData = new DayData[31];
            for (int i = 1; i < dayData.length; i++) {
                dayData[i] = new DayData();
            }
        }

        class DayData {
            private int step;
            public void setSteps(int step) {
                if (step >= 0) {
                    this.step = step;
                }
                System.out.println("Не, братик так нельзя, число должно быть положительное, давай снова");
            }

        }

        public DayData[] setDayData() {
            return dayData;
        }

        public DayData[] getDayData() {
            return dayData;
        }
    }

    public void setMonthToData(MonthData[] monthToData) {
        this.monthToData = monthToData;
    }

    public MonthData[] getMonthToData() {
        return monthToData;
    }


    public int setTarget(int steps) {
        if (steps <= 0) {
            System.out.println("Нет братик, так не пойдет, накину тебе двойную норму");
            return targetSteps = 20000;
        }
        return targetSteps = steps;
    }

    public int calcMonthSteps(int month) {
        int steps = 0;
        for (int i = 1; i < monthToData[month].dayData.length; i++) {
            steps+=monthToData[month].dayData[i].step;
        }
        return steps;
    }

    public String stepsInDay(int month) {
        String result = "";
        for (int i = 1; i < monthToData[month].dayData.length; i++) {
            result += i + " День: " + String.valueOf(monthToData[month].dayData[i].step) + ", ";
        }
        return result;
    }

    public int meanStepsInMonth(int month) {
        int steps = 0;
        for (int i = 1; i < monthToData[month].dayData.length; i++) {
            steps+=monthToData[month].dayData[i].step;
        }
        return steps / monthToData[month].dayData.length;
    }

    public int maxStepsInMonth(int month) {
        int max = 0;
        for (int i = 1; i < monthToData[month].dayData.length; i++) {
            if (monthToData[month].dayData[i].step >= monthToData[month].dayData[1].step) {
                max =  monthToData[month].dayData[i].step;
            }
        }
        return max;
    }

    public int maxSeries(int month) {
        int count = 0, max =0;
        int i = 1;
        while (i < monthToData[month].dayData.length) {
            if (monthToData[month].dayData[i].step >= targetSteps) count++;
            else count = 0;
            if (count > max) max = count;
            i++;
        }
        return max;
    }
}
