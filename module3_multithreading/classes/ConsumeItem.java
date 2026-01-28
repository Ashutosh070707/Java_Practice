package module3_multithreading.classes;

public class ConsumeItem implements Runnable {
    SharedResource sharedResource;

    public ConsumeItem(SharedResource sharedResource){
        this.sharedResource = sharedResource;
    }

    public void run(){
        sharedResource.consumeItem();
    }

}
