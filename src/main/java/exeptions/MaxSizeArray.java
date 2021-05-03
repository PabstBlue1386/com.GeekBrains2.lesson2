package exeptions;

public class MaxSizeArray extends ArrayStoreException{
    int maxSize;
    String messeage;
    public MaxSizeArray(String messeage, int maxSize){
        this.messeage = messeage;
        this.maxSize = maxSize;
    }

    public void getMesseage(){
        System.out.println(messeage + " " + maxSize);
    }



}
