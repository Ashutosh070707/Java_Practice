package module3_multithreading.classes;

public class ProduceItem implements Runnable { 
    SharedResource sharedResource;

    public ProduceItem(SharedResource sharedResource){
        this.sharedResource = sharedResource;
    }

    public void run(){
        try{
            Thread.sleep(5000);
        }
        catch(Exception e){

        }
        sharedResource.produceItem();
    }

}
