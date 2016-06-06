package biosphere.web.Vorobey.lab3;

/**
 * Created by VD on 09.10.2015.
 */
public class PerformanceComparator {
    DataGenerator object1 = new DataGenerator();
    //myArray contains numbers of collections of class DataGenerator
    int myArray[] = {1,2,3,4,5,6,7,8};
    double currentTime = 0, result = 0;

    public void smallPerformanceTest(int numberOfElements)
    {
        System.out.println("\n\n\nNumber of elements is " + numberOfElements);
        for( int i = 1; i < myArray.length + 1; i++){

            switch (i){
                case 1:
                    System.out.println("\nArray list");
                    break;
                case 2:
                    System.out.println("\nLink list");
                    break;
                case 3:
                    System.out.println("\nHash Map");
                    break;
                case 4:
                    System.out.println("\nLinked Hash Map");
                    break;
                case 5:
                    System.out.println("\nTree Map");
                    break;
                case 6:
                    System.out.println("\nHash Set");
                    break;
                case 7:
                    System.out.println("\nLinked Hash Set");
                    break;
                case 8:
                    System.out.println("\nTree Set");
                    break;
            }

            currentTime = System.currentTimeMillis();
            object1.add(numberOfElements,i);
            System.out.print("   " + (result = System.currentTimeMillis() - currentTime));

            currentTime = System.currentTimeMillis();
            object1.search(numberOfElements,i);
            System.out.print("   " + (result = System.currentTimeMillis() - currentTime));

            currentTime = System.currentTimeMillis();
            object1.deleteNumberOfElements(numberOfElements, i);
            System.out.print("   " + (result = System.currentTimeMillis() - currentTime));

            object1.cleanCollection(i);
        }
    }


    public void fullTestPerformance(int arrayOfNumberOfElements[])
    {
        for( int j = 0; j < arrayOfNumberOfElements.length; j++ )
        {
            smallPerformanceTest(arrayOfNumberOfElements[j]);
        }
    }
}


