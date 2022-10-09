package Lab6;

public class lab6cham1 {
    public static void main(String[] args) {
        String hour = "2hrs and 5 minutes";
        String time = hour.replaceAll("[^2]", "");
        String time1 = hour.replaceAll("[^5]", "");
        System.out.println("Tổng cộng là: " + (Integer.parseInt(time1) + (Integer.parseInt(time))*60)+ " phút");
    }
}

