public class Analyzer {
    //linear search through dataSet to find element; returns index (-1 if not found)
    public static int linearSearch(String[] dataSet, String element) {
        for (int i = 0; i < dataSet.length; i++) {
            if (dataSet[i].contentEquals(element))
                return i;
        }
        return -1;
    }

    //binary search through dataSet to find element; returns index (-1 if not found)
    public static int binarySearch(String[] dataSet, String element) {
        int middle;
        int bottom = 0;
        int top = dataSet.length - 1;

        while (bottom <= top)
        {
            middle = (top + bottom)/2;
            int stringComparison = element.compareTo(dataSet[middle]);

            if (stringComparison == 0)
                return middle;
            if (stringComparison > 0)
                bottom = middle + 1;
            if (stringComparison < 0)
                top = middle - 1;
        }
        return -1;
    }

    //main method
    //accesses data set from StringData, searches for string with both algorithms, captures execution time
    //needed case uncommented for each run
    public static void main(String[] args) {
        String [] data = StringData.getData();
        long startTime = System.nanoTime();

        linearSearch(data, "not_here");
        System.out.println("Linear search runtime: " + (System.nanoTime() - startTime));
        System.out.println("The result is: " + linearSearch(data, "not_here"));
        binarySearch(data, "not_here");
        System.out.println("Binary search runtime: " + (System.nanoTime() - startTime));
        System.out.println("The result is: " + binarySearch(data, "not_here"));

//        linearSearch(data, "mzzzz");
//        System.out.println("Linear search runtime: " + (System.nanoTime() - startTime));
//        System.out.println("The result is: " + linearSearch(data, "mzzzz"));
//        binarySearch(data, "mzzzz");
//        System.out.println("Binary search runtime: " + (System.nanoTime() - startTime));
//        System.out.println("The result is: " + binarySearch(data, "mzzzz"));

//        linearSearch(data, "aaaaa");
//        System.out.println("Linear search runtime: " + (System.nanoTime() - startTime));
//        System.out.println("The result is: " + linearSearch(data, "aaaaa"));
//        binarySearch(data, "aaaaa");
//        System.out.println("Binary search runtime: " + (System.nanoTime() - startTime));
//        System.out.println("The result is: " + binarySearch(data, "aaaaa"));
    }
}