package com.haiyue.sbm.service;

import java.util.List;

/**
 * @author liuhaiming
 */
public interface DictService {
    List<String> getKeywordsByPinyin(String pinyin, String nature) throws Exception;
}
