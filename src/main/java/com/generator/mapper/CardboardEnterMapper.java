package com.generator.mapper;

import com.generator.pojo.CardboardEnter;
import com.generator.pojo.ComplexQuery;
import com.generator.pojo.StorageLabel;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface CardboardEnterMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cardboard_enter
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(Integer purId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cardboard_enter
     *
     * @mbggenerated
     */
    int insert(CardboardEnter record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cardboard_enter
     *
     * @mbggenerated
     */
    int insertSelective(CardboardEnter record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cardboard_enter
     *
     * @mbggenerated
     */
    CardboardEnter selectByPrimaryKey(Integer purId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cardboard_enter
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(CardboardEnter record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cardboard_enter
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(CardboardEnter record);

    /**
     * 批量添加纸板入库记录
     * @param carList
     * @return
     */
    int addCarEnterRecordS(List<CardboardEnter> carList);

    /**
     * 纸板入库记录报表 分页查询
     * @param cur
     * @param rows
     * @param sort
     * @param order
     * @param queryList
     * @param startTime
     * @param endTime
     * @param orderAccount
     * @return
     */
    List<CardboardEnter> findByPurEnter(@Param("cur") int cur, @Param("rows") int rows, @Param("sort") String sort, @Param("order") String order, @Param("list") List<ComplexQuery> queryList, @Param("startTime") String startTime, @Param("endTime") String endTime,@Param("orderAccount") String orderAccount);

    /**
     * 纸板入库记录报表 查询全部记录
     * @param queryList
     * @param startTime
     * @param endTime
     * @param orderAccount
     * @return
     */
    List<CardboardEnter> findByPurEnterAll(@Param("list") List<ComplexQuery> queryList, @Param("startTime") String startTime, @Param("endTime") String endTime,@Param("orderAccount") String orderAccount);

    /**
     * 加载退货数不为0的 纸板入库记录 并且id降序查询
     * @param q
     * @return
     */
    List<CardboardEnter> dropSelectPurEnter(@Param("q") String q);

    /**
     * 根据采购单号和订单号查询出纸板入库记录
     * @param purchaseAccount
     * @param orderAccount
     * @return
     */
    List<CardboardEnter> findByPurOO(@Param("purchaseAccount") String purchaseAccount,@Param("orderAccount") String orderAccount);

    /**
     * 获取数据库中当天的最大入库批号
     * @param time1
     * @return
     */
    CardboardEnter getMaxEnterOrder(@Param("time1") String time1);

    /**
     * 根据入库id查找出多个入库标签数据
     * @param list
     * @return
     */
    List<StorageLabel> getListByPurId(List<CardboardEnter> list);
}