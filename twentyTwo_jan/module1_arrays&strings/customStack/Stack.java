package twentyTwo_jan.module1.customStack;

public class Stack {
    private int[] arr;
    private int capacity;
    private int pointer;

    public Stack(int capacity) {
        this.capacity = capacity;
        this.arr = new int[capacity];
        this.pointer = -1;
    }

    public int getPointer(){
        return pointer;
    }

    public void decreasePointer(){
        pointer--;
    }
    public void increasePointer(){
        pointer++;
    }

    public int getCapacity(){
        return capacity;
    }

    public void addElement(int val){
        arr[pointer] = val;
    }

    public int getPeek(){
        return arr[pointer];
    }

}
