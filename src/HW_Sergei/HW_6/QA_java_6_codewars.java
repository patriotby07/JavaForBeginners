package HW_Sergei.HW_6;

public class QA_java_6_codewars {

    int side;

    void setSide (int side) {
        this.side = side;
    }

    int getSide () {
        return side;
    }

    public static void main(String[] args) {
        QA_java_6_codewars cube = new QA_java_6_codewars();

        cube.setSide(10);

        System.out.println(cube.getSide());
    }
}
