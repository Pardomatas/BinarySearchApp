import java.io.*;

public class ordArray 
{
	private double[] a;
	private int nElems;
//--------------------------------------------------------------------------------------------------
	public ordArray(int max)
	{
		a = new double[max];
		nElems = 0;
	}
//--------------------------------------------------------------------------------------------------
	public int size()
	{ return nElems; }
//----------------------------------------------------------------------------------------------------
	public int find(double searchKey)
	{
		return recFind(searchKey, 0, nElems-1);
	}
//--------------------------------------------------------------------------------------------------
	private int recFind(double searchKey, int lowerBound, int upperBound)
	{
		int curIn;
		curIn = (lowerBound + upperBound) / 2;
		if(a[curIn]==searchKey)
			return curIn;
		else if (lowerBound > upperBound)
			return nElems;
		else
		{
			if(a[curIn] < searchKey)
				return recFind(searchKey, curIn+1, upperBound);
			else
				return recFind(searchKey, lowerBound, curIn-1);
		}
	}
//------------------------------------------------------------------------------------------------------
	public void insert(double value)
	{
		int j;
		for(j=0; j<nElems; j++)
			if(a[j] > value)
				break;
		for(int k=nElems; k>j; k--)
			a[k] = a[k-1];
		a[j] = value;
		nElems++;
	}
//-----------------------------------------------------------------------------------------------------
	public void display()
	{
		for(int j=0; j<nElems; j++)
			System.out.print(a[j] + " ");
		System.out.println("");
	}
//---------------------------------------------------------------------------------------------------
	public void derp()
	{
		
	}
}