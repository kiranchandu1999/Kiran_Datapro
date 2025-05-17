import java.io.FileNotFoundException;
import java.util.Scanner;

class ExceptionPropagationExample {
    // method throwing unchecked exception
    int getDetailsFromDB(String strId) {
        // prograting exception to caller method (if not handled here)
        int id = Integer.parseInt(strId);

        if(id > 0) {
            // getting data from database
            int[] data = {5, 8, 15, 20};
            int sum = 0;

            for(int i=0; i<data.length; i++) {
                sum += data[i];
            }
            return sum;
        }
        return 0;
    }

    // method throwing checked exception
    String getFile(String id) throws FileNotFoundException {
        if(id == "") {
            throw new FileNotFoundException();
        }
        return "File";
    }

    int authorize(String strId) {
        if(strId != "") {
            try {
                return getDetailsFromDB(strId);
            }
            catch(Exception e) {
                System.out.println(e);
            }
        }
        return 0;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ExceptionPropagationExample obj = new ExceptionPropagationExample();
        int res = obj.authorize("155");
        System.out.println(res);
        // exception case
        int r2 = obj.authorize("abc");
        System.out.println(r2);

        // propagated exception can be hanled here
        try {
            String fileName = obj.getFile("text");
            System.out.println(fileName);
        }
        catch(Exception e) {
            System.out.println(e);
        }
        finally {
            // to closing the opened resources
            sc.close();
        }
        System.out.println("Program end...");
    }
}