package org.linlinjava.litemall.db.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.linlinjava.litemall.db.domain.DiningHall;
import org.linlinjava.litemall.db.domain.DiningHallExample;

public interface DiningHallMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dining_hall
     *
     * @mbg.generated
     */
    long countByExample(DiningHallExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dining_hall
     *
     * @mbg.generated
     */
    int deleteByExample(DiningHallExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dining_hall
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dining_hall
     *
     * @mbg.generated
     */
    int insert(DiningHall record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dining_hall
     *
     * @mbg.generated
     */
    int insertSelective(DiningHall record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dining_hall
     *
     * @mbg.generated
     */
    DiningHall selectOneByExample(DiningHallExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dining_hall
     *
     * @mbg.generated
     */
    DiningHall selectOneByExampleSelective(@Param("example") DiningHallExample example, @Param("selective") DiningHall.Column ... selective);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dining_hall
     *
     * @mbg.generated
     */
    DiningHall selectOneByExampleWithBLOBs(DiningHallExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dining_hall
     *
     * @mbg.generated
     */
    List<DiningHall> selectByExampleSelective(@Param("example") DiningHallExample example, @Param("selective") DiningHall.Column ... selective);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dining_hall
     *
     * @mbg.generated
     */
    List<DiningHall> selectByExampleWithBLOBs(DiningHallExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dining_hall
     *
     * @mbg.generated
     */
    List<DiningHall> selectByExample(DiningHallExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dining_hall
     *
     * @mbg.generated
     */
    DiningHall selectByPrimaryKeySelective(@Param("id") Integer id, @Param("selective") DiningHall.Column ... selective);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dining_hall
     *
     * @mbg.generated
     */
    DiningHall selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dining_hall
     *
     * @mbg.generated
     */
    int updateByExampleSelective(@Param("record") DiningHall record, @Param("example") DiningHallExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dining_hall
     *
     * @mbg.generated
     */
    int updateByExampleWithBLOBs(@Param("record") DiningHall record, @Param("example") DiningHallExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dining_hall
     *
     * @mbg.generated
     */
    int updateByExample(@Param("record") DiningHall record, @Param("example") DiningHallExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dining_hall
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(DiningHall record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dining_hall
     *
     * @mbg.generated
     */
    int updateByPrimaryKeyWithBLOBs(DiningHall record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dining_hall
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(DiningHall record);
}