package exeptions;

public class IsNotANum extends NumberFormatException {
    public int  i;
    public int j;


    public IsNotANum(int i, int j){
        this.i=i;
        this.j=j;
    }

    public IsNotANum(String s ,int i, int j){
        super(s);
        this.i = i;
        this.j = j;
    }

    public String getCord(){

        return "[" + i + "]" + "["+ j +"]";
    }




}
