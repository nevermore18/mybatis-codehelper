package pers.xzj.springboot.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;
import pers.xzj.springboot.pojo.User;

/**
 * @Description mapper
 * @Author xzj (x378042733@gmail.com)
 * @Date 2021-01-15 9:01
 * @Version 1.0.0
 */
public interface UserMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(User record);

    int insertOrUpdate(User record);

    int insertOrUpdateSelective(User record);

    int insertSelective(User record);

    User selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);

    int updateBatch(List<User> list);

    int updateBatchSelective(List<User> list);

    int batchInsert(@Param("list") List<User> list);

    /**
     * 分页查询
     *
     * @param params
     * @return
     */
    List<User> findByPager(Map<String, Object> params);

    Integer count();


}
