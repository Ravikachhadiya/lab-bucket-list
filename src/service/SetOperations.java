package service;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

import model.TouristPlace;


public class SetOperations 
{
	HashSet<TouristPlace> hashset=new HashSet<TouristPlace>();

	public HashSet<TouristPlace> add(TouristPlace places)
	{
		hashset.add(places);

		return hashset;

	}
	public HashSet<TouristPlace> remove(TouristPlace places)
	{
		hashset.remove(places);
		return hashset;

	}
	public Object sortByDestination(Set<TouristPlace> set)
	{
		TreeSet<TouristPlace> treeset =  
                new TreeSet<TouristPlace>((o1, o2) -> o1.getDestination().compareTo(o2.getDestination()));
		for(TouristPlace p:set)
		{
			treeset.add(p);
		}



		return treeset;

	}
	public Object sortByRank(Set<TouristPlace> places)
	{

		TreeSet<TouristPlace> treeset =  
                new TreeSet<TouristPlace>((o1, o2) -> o1.getRank().compareTo(o2.getRank()));
		for(TouristPlace p:places)
		{
			treeset.add(p);
		}


		return treeset;


	}
	public Object reset(Set<TouristPlace> places)
	{
		places.clear();
		return  places;

	}
}