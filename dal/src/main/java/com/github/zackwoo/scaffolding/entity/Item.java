package com.github.zackwoo.scaffolding.entity;

import java.math.BigDecimal;

public class Item {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ITEM.ITEMID
     *
     * @mbg.generated Mon Apr 10 18:49:55 CST 2017
     */
    private String itemid;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ITEM.PRODUCTID
     *
     * @mbg.generated Mon Apr 10 18:49:55 CST 2017
     */
    private String productid;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ITEM.LISTPRICE
     *
     * @mbg.generated Mon Apr 10 18:49:55 CST 2017
     */
    private BigDecimal listprice;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ITEM.UNITCOST
     *
     * @mbg.generated Mon Apr 10 18:49:55 CST 2017
     */
    private BigDecimal unitcost;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ITEM.SUPPLIER
     *
     * @mbg.generated Mon Apr 10 18:49:55 CST 2017
     */
    private Integer supplier;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ITEM.STATUS
     *
     * @mbg.generated Mon Apr 10 18:49:55 CST 2017
     */
    private String status;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ITEM.ATTR1
     *
     * @mbg.generated Mon Apr 10 18:49:55 CST 2017
     */
    private String attr1;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ITEM.ATTR2
     *
     * @mbg.generated Mon Apr 10 18:49:55 CST 2017
     */
    private String attr2;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ITEM.ATTR3
     *
     * @mbg.generated Mon Apr 10 18:49:55 CST 2017
     */
    private String attr3;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ITEM.ATTR4
     *
     * @mbg.generated Mon Apr 10 18:49:55 CST 2017
     */
    private String attr4;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ITEM.ATTR5
     *
     * @mbg.generated Mon Apr 10 18:49:55 CST 2017
     */
    private String attr5;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ITEM.ITEMID
     *
     * @return the value of ITEM.ITEMID
     *
     * @mbg.generated Mon Apr 10 18:49:55 CST 2017
     */
    public String getItemid() {
        return itemid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ITEM.ITEMID
     *
     * @param itemid the value for ITEM.ITEMID
     *
     * @mbg.generated Mon Apr 10 18:49:55 CST 2017
     */
    public void setItemid(String itemid) {
        this.itemid = itemid == null ? null : itemid.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ITEM.PRODUCTID
     *
     * @return the value of ITEM.PRODUCTID
     *
     * @mbg.generated Mon Apr 10 18:49:55 CST 2017
     */
    public String getProductid() {
        return productid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ITEM.PRODUCTID
     *
     * @param productid the value for ITEM.PRODUCTID
     *
     * @mbg.generated Mon Apr 10 18:49:55 CST 2017
     */
    public void setProductid(String productid) {
        this.productid = productid == null ? null : productid.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ITEM.LISTPRICE
     *
     * @return the value of ITEM.LISTPRICE
     *
     * @mbg.generated Mon Apr 10 18:49:55 CST 2017
     */
    public BigDecimal getListprice() {
        return listprice;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ITEM.LISTPRICE
     *
     * @param listprice the value for ITEM.LISTPRICE
     *
     * @mbg.generated Mon Apr 10 18:49:55 CST 2017
     */
    public void setListprice(BigDecimal listprice) {
        this.listprice = listprice;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ITEM.UNITCOST
     *
     * @return the value of ITEM.UNITCOST
     *
     * @mbg.generated Mon Apr 10 18:49:55 CST 2017
     */
    public BigDecimal getUnitcost() {
        return unitcost;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ITEM.UNITCOST
     *
     * @param unitcost the value for ITEM.UNITCOST
     *
     * @mbg.generated Mon Apr 10 18:49:55 CST 2017
     */
    public void setUnitcost(BigDecimal unitcost) {
        this.unitcost = unitcost;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ITEM.SUPPLIER
     *
     * @return the value of ITEM.SUPPLIER
     *
     * @mbg.generated Mon Apr 10 18:49:55 CST 2017
     */
    public Integer getSupplier() {
        return supplier;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ITEM.SUPPLIER
     *
     * @param supplier the value for ITEM.SUPPLIER
     *
     * @mbg.generated Mon Apr 10 18:49:55 CST 2017
     */
    public void setSupplier(Integer supplier) {
        this.supplier = supplier;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ITEM.STATUS
     *
     * @return the value of ITEM.STATUS
     *
     * @mbg.generated Mon Apr 10 18:49:55 CST 2017
     */
    public String getStatus() {
        return status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ITEM.STATUS
     *
     * @param status the value for ITEM.STATUS
     *
     * @mbg.generated Mon Apr 10 18:49:55 CST 2017
     */
    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ITEM.ATTR1
     *
     * @return the value of ITEM.ATTR1
     *
     * @mbg.generated Mon Apr 10 18:49:55 CST 2017
     */
    public String getAttr1() {
        return attr1;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ITEM.ATTR1
     *
     * @param attr1 the value for ITEM.ATTR1
     *
     * @mbg.generated Mon Apr 10 18:49:55 CST 2017
     */
    public void setAttr1(String attr1) {
        this.attr1 = attr1 == null ? null : attr1.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ITEM.ATTR2
     *
     * @return the value of ITEM.ATTR2
     *
     * @mbg.generated Mon Apr 10 18:49:55 CST 2017
     */
    public String getAttr2() {
        return attr2;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ITEM.ATTR2
     *
     * @param attr2 the value for ITEM.ATTR2
     *
     * @mbg.generated Mon Apr 10 18:49:55 CST 2017
     */
    public void setAttr2(String attr2) {
        this.attr2 = attr2 == null ? null : attr2.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ITEM.ATTR3
     *
     * @return the value of ITEM.ATTR3
     *
     * @mbg.generated Mon Apr 10 18:49:55 CST 2017
     */
    public String getAttr3() {
        return attr3;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ITEM.ATTR3
     *
     * @param attr3 the value for ITEM.ATTR3
     *
     * @mbg.generated Mon Apr 10 18:49:55 CST 2017
     */
    public void setAttr3(String attr3) {
        this.attr3 = attr3 == null ? null : attr3.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ITEM.ATTR4
     *
     * @return the value of ITEM.ATTR4
     *
     * @mbg.generated Mon Apr 10 18:49:55 CST 2017
     */
    public String getAttr4() {
        return attr4;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ITEM.ATTR4
     *
     * @param attr4 the value for ITEM.ATTR4
     *
     * @mbg.generated Mon Apr 10 18:49:55 CST 2017
     */
    public void setAttr4(String attr4) {
        this.attr4 = attr4 == null ? null : attr4.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ITEM.ATTR5
     *
     * @return the value of ITEM.ATTR5
     *
     * @mbg.generated Mon Apr 10 18:49:55 CST 2017
     */
    public String getAttr5() {
        return attr5;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ITEM.ATTR5
     *
     * @param attr5 the value for ITEM.ATTR5
     *
     * @mbg.generated Mon Apr 10 18:49:55 CST 2017
     */
    public void setAttr5(String attr5) {
        this.attr5 = attr5 == null ? null : attr5.trim();
    }
}