/**
 * Created by 章杰 on 2018/3/14.
 */
public class test {
    public static void main(String args[]) {
        int n = -1;
        try {
            n = Integer.parseInt(args[0]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("shuruchengji");
            return;
        }
        grade(n);
    }
    private  static void grade(int n){
        if (n>100||n<0){
            System.out.println("error");
        }else {
            String string =(n>=90)?"分，属于A等":((n>60)?"分，属于B等":"分，属于c等");
            System.out.println(n+string);
        }
    }
}
