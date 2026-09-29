import java.util.*;

public class Coba {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//        System.out.print("Masukkan jumlahnya array: ");
//        int arr = scanner.nextInt();
//        while (arr > 5 || arr <= 0) {
//            System.out.println("jumlahnya array tidak valid ");
//
//            System.out.print("Masukkan jumlahnya array: ");
//            arr = scanner.nextInt();
//        }
//        int[] data = new int[arr];
//        for (int i = 0; i < arr; i++) {
//            System.out.printf("Masukkan array ke-%d:", i);
//            data[i] = scanner.nextInt();
//        }
//        for (int i : data) {
//            System.out.println(i);
//        }
//        HashSet<Object> blood=new HashSet<>();
//        blood.add("A");
//        blood.add("D");
//        blood.add("B");
//        blood.add("B");
//        blood.add("BD");
//        System.out.println(blood);
        ArrayList<Person> full = new ArrayList<>();
        boolean lop=true;
        String Chose;
        do{
            System.out.println("firts name: ");
            String firtsname=scanner.nextLine();
            System.out.println("firts last: ");
            String lastname=scanner.nextLine();
            full.add(new Person(firtsname,lastname));
            System.out.println("tambah orang:");
            Chose=scanner.nextLine();
            if (Chose.equalsIgnoreCase("n")){
                lop=false;
                Collections.sort(full);
                System.out.println(full);
            }
        }while (lop);


    }
}
