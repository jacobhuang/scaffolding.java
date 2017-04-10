package com.github.zackwoo.scaffolding.entity;

import java.math.BigDecimal;

public class Lineitem extends LineitemKey {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column LINEITEM.ITEMID
     *
     * @mbg.generated Mon Apr 10 18:49:55 CST 2017
     */
    private String itemid;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column LINEITEM.QUANTITY
     *
     * @mbg.generated Mon Apr 10 18:49:55 CST 2017
     */
    private Integer quantity;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column LINEITEM.UNITPRICE
     *
     * @mbg.generated Mon Apr 10 18:49:55 CST 2017
     */
    private BigDecimal unitprice;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column LINEITEM.ITEMID
     *
     * @return the value of LINEITEM.ITEMID
     *
     * @mbg.generated Mon Apr 10 18:49:55 CST 2017
     */
    public String getItemid() {
        return itemid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column LINEITEM.ITEMID
     *
     * @param itemid the value for LINEITEM.ITEMID
     *
     * @mbg.generated Mon Apr 10 18:49:55 CST 2017
     */
    public void setItemid(String itemid) {
        this.itemid = itemid == null ? null : itemid.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column LINEITEM.QUANTITY
     *
     * @return the value of LINEITEM.QUANTITY
     *
     * @mbg.generated Mon Apr 10 18:49:55 CST 2017
     */
    public Integer getQuantity() {
        return quantity;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column LINEITEM.QUANTITY
     *
     * @param quantity the value for LINEITEM.QUANTITY
     *
     * @mbg.generated Mon Apr 10 18:49:55 CST 2017
     */
    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column LINEITEM.UNITPRICE
     *
     * @return the value of LINEITEM.UNITPRICE
     *
     * @mbg.generated Mon Apr 10 18:49:55 CST 2017
     */
    public BigDecimal getUnitprice() {
        return unitprice;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column LINEITEM.UNITPRICE
     *
     * @param unitprice the value for LINEITEM.UNITPRICE
     *
     * @mbg.generated Mon Apr 10 18:49:55 CST 2017
     */
    public void setUnitprice(BigDecimal unitprice) {
        this.unitprice = unitprice;
    }
}