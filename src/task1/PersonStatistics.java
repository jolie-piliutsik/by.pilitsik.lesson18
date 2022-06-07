package task1;


public class PersonStatistics {
    private int personCount;
    private int ageSum;


    double getAvgAge() {
        return ageSum / personCount;
    }

    public int getPersonCount() {
        return personCount;
    }

    public int getAgeSum() {
        return ageSum;
    }

    public void setPersonCount(int personCount) {
        this.personCount = personCount;
    }

    public void setAgeSum(int ageSum) {
        this.ageSum = ageSum;
    }

    @Override
    public String toString() {
        return "PersonStatistics{" +
                "personCount=" + personCount +
                ", ageSum=" + ageSum +
                '}';
    }
}
