package com.generator.mapper;

import com.generator.pojo.CardboardLoan;
import com.generator.pojo.ComplexQuery;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface CardboardLoanMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cardboard_loan
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(Integer cardboardLoanId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cardboard_loan
     *
     * @mbggenerated
     */
    int insert(CardboardLoan record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cardboard_loan
     *
     * @mbggenerated
     */
    int insertSelective(CardboardLoan record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cardboard_loan
     *
     * @mbggenerated
     */
    CardboardLoan selectByPrimaryKey(Integer cardboardLoanId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cardboard_loan
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(CardboardLoan record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cardboard_loan
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(CardboardLoan record);

    /**
     *
     * @param list
     * @return
     */
    int addCarLoanS(List<CardboardLoan> list);

    /**
     * 查询所有的库存借调记录   分页查询
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
    List<CardboardLoan> findByCardLoan(@Param("cur") int cur,@Param("rows") int rows,@Param("sort") String sort,@Param("order") String order,@Param("list") List<ComplexQuery> queryList,@Param("startTime") String startTime,@Param("endTime") String endTime,@Param("orderAccount") String orderAccount);

    /**
     * 查询所有的库存借调记录   查询所有
     * @param queryList
     * @param startTime
     * @param endTime
     * @param orderAccount
     * @return
     */
    List<CardboardLoan> findByCardLoanAll(@Param("list") List<ComplexQuery> queryList,@Param("startTime") String startTime,@Param("endTime") String endTime,@Param("orderAccount") String orderAccount);
}