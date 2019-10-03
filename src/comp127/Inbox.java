package comp127;

public class Inbox {
    //public int num = 0;
    private int num = 0;
    private boolean isEmpty = true;
    public Inbox(int num){ //constructor
        this.num = num;
        if (this.num > 0){
            isEmpty = false;
        }
    }
    public int getTasks(){
        return num;

    }
    public void setTask(int num){
        this.num = num;
    }
    public void addTask(){
        num++;
        isEmpty = false;
    }
    public void resolveTask(){
        num--;
        if(this.num == 0){
            isEmpty = true;
        }
    }
    public boolean isEmpty(){
        return isEmpty;
    }
}
