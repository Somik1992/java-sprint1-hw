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
        private DayData[] dayData;

        public MonthData() {
            dayData = new DayData[30];
            for (int i = 0; i < dayData.length; i++) {
                dayData[i] = new DayData();
            }
        }

        class DayData {
            private int step;
            public void setSteps(int step) {
                this.step = step;
            }
        }

        public void setDayData(DayData[] dayData) {
            this.dayData = dayData;
        }

        public DayData[] setDayData() {
            return dayData;
        }
    }

    public void setMonthToData(MonthData[] monthToData) {
        this.monthToData = monthToData;
    }

    public MonthData[] getMonthToData() {
        return monthToData;
    }


    int setTarget(int steps) {
        if (steps <= 0) {
            System.out.println("Нет братик, так не пойдет, накину тебе двойную норму");
            return targetSteps = 20000;
        }
        return targetSteps = steps;
    }

}
