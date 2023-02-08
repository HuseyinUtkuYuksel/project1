package project1;

public class maxminclass {

public maxminclass()
{

}


    public int minfinder(int[] minfindersarray)
{
    int min=101;
    for(int i=0;i<minfindersarray.length;i++)
    {
        if(min>minfindersarray[i])
        {
            min=minfindersarray[i];
        }
    }
return min;
}


public int maxfinder(int[] maxfindersarray)
{

int max=-1;
    for(int i=0;i<maxfindersarray.length;i++)
    {
        if(max<maxfindersarray[i])
        {
            max=maxfindersarray[i];
        }
    }
return max;
} 
}
