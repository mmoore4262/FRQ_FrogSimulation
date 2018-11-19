import com.sun.deploy.util.SyncAccess;

public class FrogSimulation {
    private int goalDistance;
    private int maxHops;
    public int iter;
    public int[] hops;
    public int failReturn;

    public FrogSimulation(int goalDistance, int maxHops)
    {
        goalDistance=this.goalDistance;
        maxHops=this.maxHops;
        iter=0;
        hops[]= new int[];
    }

    public int hopDistances()
    {
        int n=goalDistance*-1;
        hops[iter]=(int)(Math.random() * ((goalDistance + n) + 1)) + n;
        iter++;
        //return (int)(Math.random() * ((goalDistance + n) + 1)) + n;
        return hops[iter--];

        //Negative tests

        //return (int)(Math.random()*(-20)+1);
    }
    public void returnHops()
    {
        System.out.println(this.hops.toString());
    }
    public boolean simulate()
    {
        int progress=0;
        int max=this.maxHops;
        while (progress!=goalDistance)
        {
            if (max==0)
            {
                return false;
            }
            if (progress<0)
            {
                return false;
            }
            if (progress>=goalDistance)
            {
                return true;
            }

            progress+=hopDistances();
            max--;
        }
        return true;
    }

    public double runSimulations(int num)
    {
        int successes=0;
        for (int i=0; i<num; i++)
        {
            if (simulate())
            {
                successes++;
            }
        }
        failReturn=1-successes/num;
        return successes/num;
    }
}
