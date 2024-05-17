import org.apache.commons.lang3.StringUtils;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class TodoBusinessImpl {
    public static void main(String[] args) {
        String  hoganBranchNumber = "123";
        int hoganNumber = Integer.valueOf(hoganBranchNumber);
        String kid = "123456";
        //ArrayList<String> myFam = new ArrayList<>("");
        List<String> list= Arrays.asList("87654","4567","12345678","87659","1234567");
        //StringBuilder stringBuilder = new StringBuilder();
        var newKids = StringUtils.leftPad(kid,8,'0');
        System.out.println("terminal id padded with strings "+ newKids);
        System.out.println("converted terminal id into int " + Integer.valueOf(newKids));
        var amo = newKids.substring(0,5);
        System.out.println("derived cost centre "+ amo);
        var amoInt = Integer.valueOf(amo);
        System.out.println("convert the derived cost centre into INT" + amoInt);

        if (amoInt == hoganNumber){
            System.out.println("true they match");
        }


    }


        private TodoService todoService;//create an instance of todo

    public TodoBusinessImpl(TodoService todoService) {
            this.todoService = todoService;
        }

        public List<String> retrieveTodosRelatedToSpring (String user){

            return null;
        }



}
