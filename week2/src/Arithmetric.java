public class Arithmetric {
    public static void main(String[] args){
        int data[] = {78,65,78,21,93,45,33,55,22,81};
        int sum=0;

        int max = data[0];
        int min = data[0];

        for(int i=0; i<data.length; i++){
            sum += data[i];
            if(data[i] > max)
                max = data[i];
            if(data[i] < min)
                min = data[i];
        }

        float avg = (float)sum/data.length;

        System.out.println("Sum of array: " + sum);
        System.out.println("Average of array: " + avg);
        System.out.println("Max of array: " + max);
        System.out.println("Min of array: " + min);
    }
}
