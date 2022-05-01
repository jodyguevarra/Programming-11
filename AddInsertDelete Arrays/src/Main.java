public class Main
{
    public static int[] addArray(int [] p, int value)
    {
        int[] added = new int[p.length + 1];

        for(int i = 0; i < p.length; i++)
        {
                added[i] = p[i];
        }

        added[added.length - 1] = value;

        return added;
    }

    public static int[] delArray(int[] p)
    {
        int[] deleted = new int[p.length - 1];

        for(int i = 0; i < p.length; i++)
        {
            if(i < deleted.length)
            {
                deleted[i] = p[i];
            }
        }

        return deleted;
    }

    public static int[] editArray(int[] p, int index, int value)
    {
        int[] edited = new int[p.length + 1];

        for(int i = 0; i < p.length; i++)
        {
            edited[i] = p[i];
        }

        edited[index] = value;

        return edited;
    }
}
