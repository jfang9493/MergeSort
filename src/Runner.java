public class Runner {
    public static void main(String[] args)
    {
        Merge numbers = new Merge();

        int[] arr = numbers.randomIntArr(10);

        long start = System.nanoTime();
        numbers.mergeSort(arr);
        long elapsed = System.nanoTime() - start;
        //prints out finished array
        for (int i = 0; i < arr.length; i++)
        {
            if (i != arr.length-1) System.out.print(arr[i] + ",");
            else System.out.print(arr[i] + "\n");
        }
        System.out.println("Merge Sort took: " + elapsed + " nanoseconds." + "\n");
    }
}
