package module3_multithreading.classes;

public class SharedResource {
    private boolean itemAvailable = false;

    public synchronized void produceItem(){
        itemAvailable = true;
        System.out.println("Item produced by thread: " + Thread.currentThread().getName());
        notifyAll();
    }

    public synchronized void consumeItem(){
        System.out.println("Consume item function invoked by thread: " + Thread.currentThread().getName());

        while(!itemAvailable){
            try{
                System.out.println("No item available for consumption. " + Thread.currentThread().getName() + " is waiting.");
                wait();
            } catch(Exception e){

            }
        }
        itemAvailable = false;
        System.out.println("Item consumed by thread: " + Thread.currentThread().getName());
    }

}
