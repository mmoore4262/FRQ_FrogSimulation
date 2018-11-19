public class Runner
{
    public static void main(String[] args)
    {
        FrogSimulation frog1= new FrogSimulation(30,5);
        FrogSimulation frog2= new FrogSimulation(50,10);
        FrogSimulation frog3= new FrogSimulation(15,2);


        double hopNum=frog1.runSimulations(550);
        System.out.print("Goal: 30 "+ "Hops: ");
        System.out.println(frog1.returnHops());
        //System.out.println(frog1.hops.toString());
        //for (int i=0; i<frog1.hops.length; i++)
        //{
          //  System.out.print(frog1.hops[i]+"");
        //}
       // System.out.print("  Failed Final Distance: "+ frog1.failReturn);
        System.out.println("Frog 1 Success Rate: "+ hopNum);

      /**  System.out.print("Goal: 50 "+ "Hops: ");
        for (int i=0; i<frog2.hops.length; i++)
        {
            System.out.print(frog2.hops[i]+"");
        }
        System.out.print("  Failed Final Distance: "+ frog2.failReturn);
        System.out.println("Frog 2 Success Rate: "+ frog2.runSimulations(550));

        System.out.print("Goal: 15 "+ "Hops: ");
        for (int i=0; i<frog3.hops.length; i++)
        {
            System.out.print(frog3.hops[i]+"");
        }
        System.out.print("  Failed Final Distance: "+ frog3.failReturn);
        System.out.println("Frog 3 Success Rate: "+ frog3.runSimulations(550));
       **/
    }
}
