package com.zhuhai.community.mapper;

import com.zhuhai.community.pojo.DiscussPost;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface DiscussPostMapper {
    /**
     * 查询帖子
     * @param userId
     * @param offset 每页起始行号
     * @param limit  每页的行数
     * @return
     */
    List<DiscussPost> selectDiscussPost(int userId, int offset, int limit);

    //@Param注解用于给参数取别名
    //如果只有一个参数，并且在<if>里使用，必须加别名

    /**
     * 查询表中数据个数
     * @param userId
     * @return
     */
    int selectDiscussPostRows(@Param("userId") int userId);
}
