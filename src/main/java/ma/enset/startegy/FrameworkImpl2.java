package ma.enset.startegy;

public class FrameworkImpl2 implements Framework {


    @Override
    public int[] operation(int[] data) {
        System.out.println("L'implementation qui fait le produit ");
        int sum=0;
        for (int i=0;i<data.length;i++){
            data[i]*=data[i];
        }
        return data;
    }
}
