public class ProcessOfSum {

    private int layers;

    public ProcessOfSum(){
        layers = 0;
    }

    public ProcessOfSum(int layers){
        this.layers = layers;
    }

    public int getLayers(int layers){
        return layers;
    }

    public void setLayers(){
        this.layers = layers;
    }

    public void ProcessOfSum(){

        for (int i = 1; i <= this.layers; i++){

            int sum = 1;
            String out = "1";

            for (int j = 2; j <= i; j++){

                sum += j;
                out = out.concat("+" + j);
            }

            System.out.println(out.concat("=" + sum));
        }

    }



}
