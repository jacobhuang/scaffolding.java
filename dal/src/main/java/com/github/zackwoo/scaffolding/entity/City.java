package com.github.zackwoo.scaffolding.entity;

public class City {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column CITY.ID
     *
     * @mbg.generated Sat Apr 15 10:37:50 CST 2017
     */
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column CITY.NAME
     *
     * @mbg.generated Sat Apr 15 10:37:50 CST 2017
     */
    private String name;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column CITY.COUNTRYCODE
     *
     * @mbg.generated Sat Apr 15 10:37:50 CST 2017
     */
    private String countrycode;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column CITY.DISTRICT
     *
     * @mbg.generated Sat Apr 15 10:37:50 CST 2017
     */
    private String district;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column CITY.POPULATION
     *
     * @mbg.generated Sat Apr 15 10:37:50 CST 2017
     */
    private Integer population;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column CITY.ID
     *
     * @return the value of CITY.ID
     *
     * @mbg.generated Sat Apr 15 10:37:50 CST 2017
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column CITY.ID
     *
     * @param id the value for CITY.ID
     *
     * @mbg.generated Sat Apr 15 10:37:50 CST 2017
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column CITY.NAME
     *
     * @return the value of CITY.NAME
     *
     * @mbg.generated Sat Apr 15 10:37:50 CST 2017
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column CITY.NAME
     *
     * @param name the value for CITY.NAME
     *
     * @mbg.generated Sat Apr 15 10:37:50 CST 2017
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column CITY.COUNTRYCODE
     *
     * @return the value of CITY.COUNTRYCODE
     *
     * @mbg.generated Sat Apr 15 10:37:50 CST 2017
     */
    public String getCountrycode() {
        return countrycode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column CITY.COUNTRYCODE
     *
     * @param countrycode the value for CITY.COUNTRYCODE
     *
     * @mbg.generated Sat Apr 15 10:37:50 CST 2017
     */
    public void setCountrycode(String countrycode) {
        this.countrycode = countrycode == null ? null : countrycode.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column CITY.DISTRICT
     *
     * @return the value of CITY.DISTRICT
     *
     * @mbg.generated Sat Apr 15 10:37:50 CST 2017
     */
    public String getDistrict() {
        return district;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column CITY.DISTRICT
     *
     * @param district the value for CITY.DISTRICT
     *
     * @mbg.generated Sat Apr 15 10:37:50 CST 2017
     */
    public void setDistrict(String district) {
        this.district = district == null ? null : district.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column CITY.POPULATION
     *
     * @return the value of CITY.POPULATION
     *
     * @mbg.generated Sat Apr 15 10:37:50 CST 2017
     */
    public Integer getPopulation() {
        return population;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column CITY.POPULATION
     *
     * @param population the value for CITY.POPULATION
     *
     * @mbg.generated Sat Apr 15 10:37:50 CST 2017
     */
    public void setPopulation(Integer population) {
        this.population = population;
    }
}