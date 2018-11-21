public class Merge {
    public static void mergeSort(int[] elements)
    {
        int n = elements.length;
        int[] temp = new int[n];
        mergeSortHelper(elements,0,n-1,temp);
    }

    public static void mergeSortHelper(int[] elements, int from, int to, int[] temp)
    {
        if (from < to)
        {
            int middle = (from + to)/2;
            mergeSortHelper(elements,from,middle,temp);
            mergeSortHelper(elements,middle + 1,to,temp);
            merge(elements,from,middle,to,temp);
        }
    }

    public static void merge(int[] arr, int left, int middle, int right, int[] temp)
    {
        int i = left;
        int j = middle + 1;
        int k = left;
        while (i <= middle && j <= right)
        {
            if (arr[i] < arr[j])
            {
                temp[k] = arr[i];
                i++;
            }
            else
            {
                temp[k] = arr[j];
                j++;
            }
            k++;
        }
        while(i <= middle)
        {
            temp[k] = arr[i];
            i++;
            k++;
        }
        while(j <= right)
        {
            temp[k] = arr[j];
            j++;
            k++;
        }
        for (int x = left; x <= right; x++)
        {
            arr[x] = temp[x];
        }
    }

    public int[] randomIntArr(int count)
    {
        int[] arr1 = new int[count];
        for (int i = 0; i < arr1.length; i++)
        {
            arr1[i] = (int)(Math.random()*100);
            if (i == arr1.length-1) System.out.println(arr1[i]);
            else System.out.print(arr1[i] + ",");
        }
        return arr1;
    }
}
