package com.github.zackwoo.scaffolding.mapper;

import com.github.zackwoo.scaffolding.entity.City;
import com.github.zackwoo.scaffolding.entity.CityExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CityMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table CITY
     *
     * @mbg.generated Sat Apr 15 10:37:50 CST 2017
     */
    long countByExample(CityExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table CITY
     *
     * @mbg.generated Sat Apr 15 10:37:50 CST 2017
     */
    int deleteByExample(CityExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table CITY
     *
     * @mbg.generated Sat Apr 15 10:37:50 CST 2017
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table CITY
     *
     * @mbg.generated Sat Apr 15 10:37:50 CST 2017
     */
    int insert(City record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table CITY
     *
     * @mbg.generated Sat Apr 15 10:37:50 CST 2017
     */
    int insertSelective(City record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table CITY
     *
     * @mbg.generated Sat Apr 15 10:37:50 CST 2017
     */
    List<City> selectByExample(CityExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table CITY
     *
     * @mbg.generated Sat Apr 15 10:37:50 CST 2017
     */
    City selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table CITY
     *
     * @mbg.generated Sat Apr 15 10:37:50 CST 2017
     */
    int updateByExampleSelective(@Param("record") City record, @Param("example") CityExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table CITY
     *
     * @mbg.generated Sat Apr 15 10:37:50 CST 2017
     */
    int updateByExample(@Param("record") City record, @Param("example") CityExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table CITY
     *
     * @mbg.generated Sat Apr 15 10:37:50 CST 2017
     */
    int updateByPrimaryKeySelective(City record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table CITY
     *
     * @mbg.generated Sat Apr 15 10:37:50 CST 2017
     */
    int updateByPrimaryKey(City record);
}