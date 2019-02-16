package hdu.cn.hziee.dao;

import hdu.cn.hziee.model.SetMeal;
import org.springframework.stereotype.Repository;

@Repository
public interface SetMealMapper {
    int deleteByPrimaryKey(Integer smNumber);

    int insert(SetMeal record);

    int insertSelective(SetMeal record);

    SetMeal selectByPrimaryKey(Integer smNumber);

    int updateByPrimaryKeySelective(SetMeal record);

    int updateByPrimaryKey(SetMeal record);
}