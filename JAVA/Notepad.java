


//How to open notepad in java Program


import java.io.IOException;

public class Notepad {
    public static void main(String[] args) {
        Runtime rs = Runtime.getRuntime();
        try{
            rs.exec("notepad");
        }
        catch(IOException e){
            System.out.println(e);
        }
    }
}
