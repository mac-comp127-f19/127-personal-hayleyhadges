//package comp127;
//
//import java.util.Scanner;
//
//public class ClassPractice {
//
//    boolean newToaster;
//    boolean isOn;
//    int capacity;
//    int heatSetting;
//    boolean isPluggedIn;
//    boolean isInUse;
//    String foodItem = "";
//    int itemsInToaster;
//    boolean isEmpty;
//
//
//    public ClassPractice() {
//        newToaster = true;
//        capacity = 2;
//        isPluggedIn = true;
//        isOn = true;
//        isEmpty = true;
//        isInUse = false;
//        itemsInToaster = 0;
//    }
//
//    public boolean toastThings(String item, int num, int heat) {
//        if (num > capacity) {
//            return false;
//        }
//        foodItem = item;
//        itemsInToaster = num;
//        heatSetting = heat;
//        isInUse = true;
//        return true;
//    }
//    public void resetToaster() {
//        itemsInToaster = 0;
//        isInUse = false;
//        foodItem = "";
//
//    }
//    public class ObjectsMain {
//        public static <Toaster> void main(String[] args){
//            Toaster terry = new Toaster;
//            Scanner sc = new Scanner(System.in);
//
//            System.out.println("what to toast?");
//            String item = sc.nextLine();
//            System.out.println("How many?");
//            int num = sc.nextInt();
//            System.out.println("How hot?");
//            int heat = sc.nextInt();
//
//            boolean toasted = terry.toastThings(item,num,heat);
//
//        }
//    }
//}
//
