package StudentMarks;

public class StudentMarksModel {

    private int math;
    private int physics;
    private int chemistry;
    private int biology;

    public StudentMarksModel(int math, int physics, int chemistry, int biology) {
        this.math = math;
        this.physics = physics;
        this.chemistry = chemistry;
        this.biology = biology;
    }

    @Override
    public String toString() {
        return "Marks{" +
                "math=" + math +
                ", physics=" + physics +
                ", chemistry=" + chemistry +
                ", biology=" + biology +
                '}';
    }

    public int getMath() {
        return math;
    }

    public void setMath(int math) {
        this.math = math;
    }

    public int getPhysics() {
        return physics;
    }

    public void setPhysics(int physics) {
        this.physics = physics;
    }

    public int getChemistry() {
        return chemistry;
    }

    public void setChemistry(int chemistry) {
        this.chemistry = chemistry;
    }

    public int getBiology() {
        return biology;
    }

    public void setBiology(int biology) {
        this.biology = biology;
    }
}
