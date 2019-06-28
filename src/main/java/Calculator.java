import java.util.HashMap;
import java.util.Scanner;

public class Calculator {
    HashMap<String, Arithmetic> m;


    public Calculator() {
        m = new HashMap<>();
        initOp();
        run();
    }

    public void initOp(){
        m.put("+", (x, y) -> x + y);
        m.put("-", (x, y) -> x - y);
        m.put("*", (x, y) -> x * y);
        m.put("/", (x, y) -> x / y);
        m.put("%", (x, y) -> x % y);
        m.put("^", (x, y) -> {
            Double product = 1.0;
            for (Double i = 0.0; i < y; i++){
                product *= x;
            }
            return product;
        });
    }



    public void run(){
        Scanner sc = new Scanner(System.in);
        Boolean flag = true;

        while(flag){
            String s = sc.nextLine();
            String[] arg = s.split(" ");
            if(s.equals("x")){
                flag = false;
            } else {
                Double x = Double.parseDouble(arg[0]);
                Double y = Double.parseDouble(arg[2]);
                String op =  arg[1];
                System.out.println(m.get(op).calculate(x, y));
            }
        }
    }





}
