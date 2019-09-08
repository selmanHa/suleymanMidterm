package algorithm;


public class Sort {

    long executionTime = 0;
	/*
	 * Please implement all the sorting algorithm. Feel free to add helper methods.
	 * Store all the sorted data into one of the databases.
	 */


    public int[] selectionSort(int [] array){
        final long startTime = System.currentTimeMillis();
        int [] list = array;

        for(int j=0; j<array.length-1; j++){
            int min = j;
            for(int i=j+1; i<array.length; i++) {
                if (array[i] < array[min])
                    min = i;
            }

            int temp = array[min];
            array[min] = array[j];
            array[j] = temp;
        }

        final long endTime = System.currentTimeMillis();
        final long executionTime = endTime - startTime;
        this.executionTime = executionTime;
        return list;
    }

    public int[] insertionSort(int [] array){
        final long startTime = System.currentTimeMillis();
        int [] list = array;
        //implement here
        for (int i = 0; i<list.length; i++){
            int numToSort = list[i];
            int temp;

            for (temp = i; temp>0 && list[temp-1]>numToSort; temp--){
                list[temp] = list[temp-1];
            }

            list[temp] = numToSort;
            Sorted(list);
        }



        final long endTime = System.currentTimeMillis();
        final long executionTime = endTime - startTime;
        this.executionTime = executionTime;
        return list;
    }

    public int[] bubbleSort(int [] array){
        int [] list = array;
        //implement here
        int temp;
        for (int i = 0; i < list.length; i++){
            for (int k = 0; k<list.length-1-i; k++){
                if (list[k]>list[k+1]){
                    temp = list[k];
                    list[k] = list[k+1];
                    list[k+1] = temp;
                }
            }
            Sorted(list);
        }

        return list;
    }


    public int [] mergeSort(int [] array){
        int [] list = array;
        //implement here


        return list;
    }
    
//quick sort
    private static int arr[];
    public int [] quickSort(int [] array){
        int [] list = array;
        //implement here
        if (list == null || list.length == 0){return list;}

        arr = list;
        sortIt(0, arr.length-1);

        return list;
    }

    public static void sortIt(int numInLeft, int numInRight){
        int pivot = arr[numInLeft+(numInRight-numInLeft)/2];

        while (arr[numInLeft]<pivot){
            numInLeft++;
        }
        while (arr[numInRight]>pivot){
            numInRight--;

            if (numInLeft<=numInRight){
                int temp = arr[numInLeft];
                arr[numInLeft] = arr[numInRight];
                arr[numInRight] = temp;
                numInLeft++;
                numInRight--;
            }
        }
    }

   //heap sort
    public int [] heapSort(int [] array){
        int [] list = array;
        //implement here
        int sizeNum = list.length-1;

        for (int i = sizeNum; i>0; i--){
            switchIt(list, 0, i);
            sizeNum = sizeNum-1;
            sortHeap(list, 0, sizeNum);
        }

        return list;
    }

    public static void switchIt(int []arr, int a, int b){
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }

    public static void sortHeap(int[] arr, int a, int b){
        int leftNumber = 2*a+1;
        int rightNumber = 2*a+2;
        int maxNum;

        if (leftNumber<= b && arr[leftNumber]>arr[a]){
            maxNum = leftNumber;
        }else {
            maxNum = a;
        }
        if (leftNumber <= b && arr[rightNumber]>arr[maxNum]){
            maxNum = rightNumber;
        }

        if (maxNum != a){
            switchIt(arr, a, maxNum);
            sortHeap(arr, maxNum, b);
        }
    }


    //bucket sort
    public int [] bucketSort(int [] array, int maxNumber){
        int [] list = array;
        //implement here
        int[] ArrayBucket = new int[maxNumber + 1];
        int[] sorted = new int[list.length];

        for (int a=0; a<list.length; a++){
            ArrayBucket[list[a]]++;
            int temp = 0;

            for (int i=0; i<ArrayBucket.length; i++){
                for (int b=0; b<ArrayBucket[i]; b++){
                    sorted[temp++]=i;
                }
            }
        }

        maximum(list);

        return list;
    }

    public static int maximum(int[] numbers){
        int maximumValue =0;
        for (int i=0; i<numbers.length; i++){
            if (numbers[i]>maximumValue){
                maximumValue = numbers[i];
            }
        }
        return maximumValue;
    }

    //shell sort
    public int [] shellSort(int [] array){
        int [] list = array;
        //implement here

        int num = 1;
        while (num<=list.length/3){
            num = 3 * num + 1;
        }

        while (num>0){
            for (int i = 0; i < list.length; i++){
                int temp = list[i];
                int a;
                for (a = i; a>num-1 && list[a - num]>=temp; a = a-num){
                    list[a] = list[a-num];
                }
                list[a] = temp;
            }
            num = (num - 1)/3;
        }
        

        return list;
    }

    //printing the sorted array
    public static void Sorted(int array[]){
        for (int i = 0; i<array.length; i++){
            System.out.println(array[i]+" ");
        }
        System.out.println();
    }


    /*public static void printSortedArray(int [] array){
        for(int i=0; i<array.length; i++){
            System.out.println(array[i]);
        }
    }*/
}
