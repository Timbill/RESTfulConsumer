package com;

public class Country {
//
	    private String id;

	    private String countryName;

	    private String population;

	    public String getId ()
	    {
	        return id;
	    }

	    public void setId (String id)
	    {
	        this.id = id;
	    }

	    public String getCountryName ()
	    {
	        return countryName;
	    }

	    public void setCountryName (String countryName)
	    {
	        this.countryName = countryName;
	    }

	    public String getPopulation ()
	    {
	        return population;
	    }

	    public void setPopulation (String population)
	    {
	        this.population = population;
	    }

	    @Override
	    public String toString()
	    {
	        return "ClassPojo [id = "+id+", countryName = "+countryName+", population = "+population+"]";
	    }
	}
