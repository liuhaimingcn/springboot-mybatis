package com.haiyue.sbm.service.impl;


import com.haiyue.sbm.mapper.DictMapper;
import com.haiyue.sbm.service.DictService;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author liuhaiming
 */
@Service
public class DictServiceImpl implements DictService {

    @Autowired
    private DictMapper dictMapper;


    @Override
    public List<String> getKeywordsByPinyin(String pinyin, String nature) throws Exception {
        Logger log = LogManager.getLogger(DictServiceImpl.class.getName());
        Map<String, String> map = new HashMap<>();
        map.put("keyword", pinyin);
        map.put("nature", nature);
        log.debug(map);
        log.info(map);
        log.warn(map);
        log.error(map);
//        Long sum = dictMapper.getSum();
//        System.out.println(sum + "");
        return dictMapper.getLtsKeywordsByPinyin(map);
    }

}

