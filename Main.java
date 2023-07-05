import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to ab67766 Encoder: \n 1:Encode Text \t 2:Decode text");
        int option = sc.nextInt();
        sc.nextLine();
        if (option == 1){
            System.out.println("Write the text you want to Encode: ");
            String x = sc.nextLine();
            String encoded = encoder(x);
            System.out.println("Encoded Text: " + encoded);
        } else if (option == 2) {
            System.out.println("Write the text you want to Encode: ");
            String x = sc.nextLine();
            String decoded = decoder(x);
            System.out.println("Decoded Text " + decoded);
        }


    }
    public static String encoder(String text){
        String qeKthehet = "";
        for (int i = 0;i<text.length();i++){
            if(i%2 == 0){
                qeKthehet = qeKthehet + (char)(text.charAt(i) + 2);
            }
            try {
                qeKthehet = qeKthehet + (char)(text.charAt(i) + 1);
            }
                catch (StringIndexOutOfBoundsException x){

                }



        }
        return qeKthehet;
    }

    public static String decoder(String text){
        String qeKthehet = "";
        String simplified = "";

        int skip = 0;
        for (int i = 0;i<text.length();i++){
            try {


            if (!(skip%2==0)){
                i++;
            }
            simplified = simplified + text.charAt(i);
            skip++;
            }
            catch (StringIndexOutOfBoundsException x){

            }
        }

        for (int i = 0;i<simplified.length();i++){


            if(i%2 == 0){

                qeKthehet = qeKthehet + (char)(simplified.charAt(i) - 2);

            }
            else {
                    qeKthehet = qeKthehet + (char) (simplified.charAt(i) - 1);

            }

        }
        return qeKthehet;
    }
}
