package hdu.cn.hziee.dao;

import hdu.cn.hziee.model.SetmealInfomation;
import org.springframework.stereotype.Repository;

@Repository
public interface SetmealInfomationMapper {
    int deleteByPrimaryKey(Integer smId);

    int insert(SetmealInfomation record);

    int insertSelective(SetmealInfomation record);

    SetmealInfomation selectByPrimaryKey(Integer smId);

    int updateByPrimaryKeySelective(SetmealInfomation record);

    int updateByPrimaryKey(SetmealInfomation record);
}