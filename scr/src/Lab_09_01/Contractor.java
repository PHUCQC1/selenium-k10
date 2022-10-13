package Lab_09_01;

public class Contractor extends Emloyee {
    @Override
    public int getSalary() {
        return super.getSalary() + 40000;
    }
}
