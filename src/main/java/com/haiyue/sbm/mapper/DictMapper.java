package com.haiyue.sbm.mapper;


import java.util.List;
import java.util.Map;

/**
 * @author liuhaiming
 */
public interface DictMapper {
    List<String> getLtsKeywordsByPinyin(Map<String, String> map) throws Exception;

    Long getSum() throws Exception;
}