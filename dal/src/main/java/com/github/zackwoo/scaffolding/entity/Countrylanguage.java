package com.github.zackwoo.scaffolding.entity;

public class Countrylanguage extends CountrylanguageKey {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column COUNTRYLANGUAGE.ISOFFICIAL
     *
     * @mbg.generated Sat Apr 15 10:37:50 CST 2017
     */
    private String isofficial;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column COUNTRYLANGUAGE.PERCENTAGE
     *
     * @mbg.generated Sat Apr 15 10:37:50 CST 2017
     */
    private Double percentage;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column COUNTRYLANGUAGE.ISOFFICIAL
     *
     * @return the value of COUNTRYLANGUAGE.ISOFFICIAL
     *
     * @mbg.generated Sat Apr 15 10:37:50 CST 2017
     */
    public String getIsofficial() {
        return isofficial;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column COUNTRYLANGUAGE.ISOFFICIAL
     *
     * @param isofficial the value for COUNTRYLANGUAGE.ISOFFICIAL
     *
     * @mbg.generated Sat Apr 15 10:37:50 CST 2017
     */
    public void setIsofficial(String isofficial) {
        this.isofficial = isofficial == null ? null : isofficial.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column COUNTRYLANGUAGE.PERCENTAGE
     *
     * @return the value of COUNTRYLANGUAGE.PERCENTAGE
     *
     * @mbg.generated Sat Apr 15 10:37:50 CST 2017
     */
    public Double getPercentage() {
        return percentage;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column COUNTRYLANGUAGE.PERCENTAGE
     *
     * @param percentage the value for COUNTRYLANGUAGE.PERCENTAGE
     *
     * @mbg.generated Sat Apr 15 10:37:50 CST 2017
     */
    public void setPercentage(Double percentage) {
        this.percentage = percentage;
    }
}