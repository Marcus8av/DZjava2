import java.io.IOException; // Реализуйте алгоритм сортировки пузырьком числового массива результат после каждой итерации запишите в лог-файл.
import java.util.logging.*;

public class dz1 { 
    public static void main(String[] args) throws IOException {
        Logger logger = Logger.getLogger(dz1.class.getName());
        FileHandler fh = new FileHandler("loggerdz1.xml");
        logger.addHandler(fh);
        XMLFormatter xml = new XMLFormatter();
        fh.setFormatter(xml);
        int[] nums = {7, 9, 13, 67, 88, 2, 6, 14};
        int temp;
        boolean sorted = false;

        while (!sorted) {
            sorted = true;
            logger.log(Level.INFO, "Сообщение");

            for (int i = 0; i < nums.length - 1; i++) {
                if (nums[i] > nums[i+1]) {
                    temp = nums[i];
                    nums[i] = nums[i+1];
                    nums[i+1] = temp;
                    sorted = false;
                }
            }
       
        }
        for (int i : nums) {
            System.out.println(i);
        }
        

    }

}

