import java.io.*; //Написать метод, который распарсит строку используя StringBuilder.

public class dz2 {
    public static void main(String[] args) {
       File file = new File ("document.txt"); 
       String txt = new String();
        try{
            BufferedReader f = new BufferedReader(new FileReader(file));
            String s;
            while((s=f.readLine())!=null){
                txt+=s + " ";
            }
            f.close();
            
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }
        txt = txt.replace("\"", "");
        String[] ls = txt.split(" ");
        bild_str(ls);
        
    }
    static void bild_str(String[] arr){
        for (int i = 0; i < arr.length; i++) {
            StringBuilder show = new StringBuilder();
            String[] arr_new = arr[i].split(",");
            for (int j = 0; j < arr_new.length; j++) {
                if(j == 0)
                    show.append("Студент-" + arr_new[j].substring(8));
                if(j == 1)
                    show.append("-получил-" + arr_new[j].substring(7));
                if(j == 2)
                    show.append("-по предмету-" + arr_new[j].substring(8));
            }
            System.out.println(show);
        }
    }

}

