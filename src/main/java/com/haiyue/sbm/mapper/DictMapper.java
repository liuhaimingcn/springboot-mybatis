package com.haiyue.sbm.mapper;


import org.apache.ibatis.annotations.Select;

import java.util.List;
import java.util.Map;

/**
 * @author liuhaiming
 */
public interface DictMapper {
    List<String> getLtsKeywordsByPinyin(Map<String, String> map) throws Exception;

    @Select("select count(id) from tb_lts_dict")
    Long getSum() throws Exception;
}