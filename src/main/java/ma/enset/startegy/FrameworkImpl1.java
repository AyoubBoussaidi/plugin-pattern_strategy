package ma.enset.startegy;

public class FrameworkImpl1 implements Framework {

    @Override
    public int[] operation(int[] data) {
        System.out.println("L'implementation qui fait la somme ");
        int sum=0;
        for (int i=0;i<data.length;i++){
            data[i]+=data[i];
        }
        return data;
    }
}
