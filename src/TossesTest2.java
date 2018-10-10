public class TossesTest2
{
    public static int[] getCubeTosses(
            NumberCube cube, int numTosses)
    {
        int[] tosses = new int[numTosses];
        for (int i = 0; i < numTosses; i++)
            tosses[i] = cube.toss();

        return tosses;
    }

    public static int getLengthOfLongestRun(int[] values)
    {
        int longestRunLen = 1;
        int currentRunLen = 1;

        for (int i = 1; i < values.length; i++)
        {
            if (values[i] == values[i - 1])
                currentRunLen++;

            else
            {
                if (currentRunLen > longestRunLen)
                {
                    longestRunLen = currentRunLen;
                }
                currentRunLen = 1;
            }
        } //end for

        if (currentRunLen > longestRunLen)
            longestRunLen = currentRunLen;

        return longestRunLen;

    }

    public static void main(String[] args)
    {
        System.out.println("test");
    }

   // public static List<Integer> getStartingIndexesOfLongestRun()
}
