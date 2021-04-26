import java.util.*; 
import java.io.*;

class compare{
    String data = "";
    void insertdata(String data){
        this.data = data;
    }

    String comparedata(){
        String[] parts = this.data.split("\\=");
        String a = parts[0];
        String b = parts[1];
        System.out.println(a);
        Stack<String> stack = new Stack<String>();
        String validitas = "";
        for ( int i = 0; i < a.length() ; i++){
            if(Character.toString(a.charAt(i)).equals("-")){
                validitas = "tidak valid";
                break;
            }

            if(Character.toString(a.charAt(i)).equals("1"))
            {
                stack.push(Character.toString (a.charAt(i)));
                System.out.println("stack"+stack);
            }
        }
    
        for (int i = 0 ; i<b.length(); i++){
            
            if (Character.toString (b.charAt(i)).equals("1"))
                {
                if (Character.toString (b.charAt(i)).equals(stack.pop()))
                    {
                        validitas = "valid";
                    }
                else
                    {
                        validitas = "tidak valid";
                    }
                }
        }

        if (stack.size() != 0) 
            {
                validitas = "tidak valid";
            }
            return validitas;
        }
}   


public class perbandingan {
    public static void main(String[] args){
        String data = "";
        Scanner inputan = new Scanner(System.in);
        System.out.print("Input Data = ");
        data = inputan.nextLine();
        compare c = new compare();
        c.insertdata(data);
        System.out.println("Hasil = "+ c.comparedata());
    }
}