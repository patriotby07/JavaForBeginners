package HW_Sergei.HW_6;

public class QA_java_6_2_codewars {

    int width;
    int length;
    int height;

    QA_java_6_2_codewars(int[] array) {
        this.width = array[0];
        this.length = array[1];
        this.height = array[2];
    }

    int getWidth(){
        return this.width;
    }
    int getLength(){
        return this.length;
    }
    int getHeight(){
        return this.height;
    }
    int getVolume(){
        return this.width * this.length * this.height;
    }
    int getSurfaceArea(){
        return 2 * this.width * this.length + 2 * this.length * this.height + 2 * this.width * this.height;
    }

    public static void main(String[] args) {

        QA_java_6_2_codewars block = new QA_java_6_2_codewars(new int[] {2, 2, 2});

        System.out.println(block.getWidth());
        System.out.println(block.getHeight());
        System.out.println(block.getLength());
        System.out.println(block.getSurfaceArea());
        System.out.println(block.getVolume());
    }
}



