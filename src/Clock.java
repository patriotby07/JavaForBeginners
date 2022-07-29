class MyNumber {
    public static void main(String[] args) {


        int hours = (74000 % 86400) / 3600;
        int min = (74000 % 3600) / 60;
        int sec = 74000 % 3600 % 60;

        System.out.format("%02d" + ":" + "%02d" + ":" + "%02d", hours, min, sec);
    }
}