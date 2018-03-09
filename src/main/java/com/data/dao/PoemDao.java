package com.data.dao;

import com.data.entity.Poem;

/**
 * 诗词数据操作接口
 * @author https://github.com/zhdh
 */
public interface PoemDao {

    /**
     * 插入诗词数据
     * @param poem 诗词对象
     * @return 受影响行数
     */
    Integer insertPoem(Poem poem);

}
