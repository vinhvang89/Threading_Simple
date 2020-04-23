public class NumberGenerator implements Runnable {
    private String name;
    public NumberGenerator(String name){
        this.name = name;
    }
    @Override
    public void run() {
        for (int i = 0; i < 10 ; i++) {
            System.out.println(name + i +" , " + hashCode());
        }
        try{
            Thread.sleep(500);
        } catch (Exception e){
            System.out.println("Hehe");
        }
    }
}
