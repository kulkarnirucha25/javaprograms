public class Result extends Test implements Sports {
    public void set() {
        System.out.println("Sports Marks: " + sMarks);
    }

    void displayResult() {
        int total = sub1 + sub2 + sMarks;
        System.out.println("Roll No: " + getRollNo());
        getMarks();
        set();
        System.out.println("Total Marks: " + total);
    }
}