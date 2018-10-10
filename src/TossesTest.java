public class TossesTest
{
    public static int[] getCubeTosses(
            NumberCube cube, int numTosses)
    {
        int[] tosses = new int[numTosses];
        for (int i = 0; i < numTosses; i++)
            tosses[i] = cube.toss();

        return tosses;
    }

    /** Returns the starting index of a longest run of two or more consecutive repeated values
     * in the array of values
     * @param values an array of integer values representing a series of number cube tosses
     *        Precondition: values.length > 0
     * @return the starting index of a run of maximum size;
     *          -1 if there is no run
     */
    public static int getLongestRun(int[] values)
    {
        int longestRunLen = 1;
        int currentRunLen = 1;
        int startOfLongestRun = 0;
        int startOfCurrentRun = 0;

        for (int i = 1; i < values.length; i++)
        {
            if (values[i] == values[i - 1])
                currentRunLen++;

            else
            {
                if (currentRunLen > longestRunLen)
                {
                    longestRunLen = currentRunLen;
                    startOfLongestRun = startOfCurrentRun;
                }
                startOfCurrentRun = i;
                currentRunLen = 1;
            }
        } //end for

        if (currentRunLen > longestRunLen)
        {
            longestRunLen = currentRunLen;
            startOfLongestRun = startOfCurrentRun;
        }
        if (longestRunLen == 1)
            return -1;

        return startOfLongestRun;
    }

    public static void main(String[] args)
    {
        NumberCube cube = new NumberCube();
        int[] theTosses = getCubeTosses(cube,25);
        printArrayWithIndex(theTosses);

        int startOfLongestRun = getLongestRun(theTosses);
        System.out.println("longest run starts at index " +
                startOfLongestRun);
        System.out.println();

        int[] test1 = {2,2,2,2,1,3,5,4,8,2,2,3,3};
        startOfLongestRun = getLongestRun(test1);
        printArrayWithIndex(test1);
        System.out.println("longest run starts at index " +
                startOfLongestRun);
        System.out.println();

        int[] test2 = {2,2,2,1,3,5,4,4,4,4,8,2,2,3,3};
        startOfLongestRun = getLongestRun(test2);
        printArrayWithIndex(test2);
        System.out.println("longest run starts at index " +
                startOfLongestRun);
        System.out.println();

        int[] test3 = {2,5,2,1,3,5,4,1,4,6,2,3,2,6,3};
        startOfLongestRun = getLongestRun(test3);
        printArrayWithIndex(test3);
        System.out.println("longest run starts at index " +
                startOfLongestRun);
        System.out.println();

        int[] test4 = {2,2,2,1,3,5,4,4,4,4,3,3,3,3,3};
        startOfLongestRun = getLongestRun(test4);
        printArrayWithIndex(test4);
        System.out.println("longest run starts at index " +
                startOfLongestRun);
        System.out.println();

        int[] test5 = {5,2,2,2,3,5,4,4,4,2,3,3,3,6,3};
        startOfLongestRun = getLongestRun(test5);
        printArrayWithIndex(test5);
        System.out.println("longest run starts at index " +
                startOfLongestRun);
        System.out.println();
    }

    public static void printArrayWithIndex(int[] arr)
    {
        for (int i = 0; i < arr.length; i++)
        {
            System.out.print(arr[i] + ",");
            if (i > 9)
                System.out.print(" ");
        }
        System.out.println();

        for (int i = 0; i < arr.length; i++)
            System.out.print(i + " ");
        System.out.println();
    }
}
