package com.haiyue.sbm.controller;

import com.haiyue.sbm.service.DictService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author liuhaiming
 */
@RestController
@RequestMapping("/dicts")
public class DictController {

    @Autowired
    private DictService dictService;

    /**
     * 根据拼音和其nature获取对应的keywords
     *
     * @throws Exception
     */
    @RequestMapping(value = "/pinyin", method = RequestMethod.GET)
    public List<String> getKeywordsByPinyin(@RequestParam String pinyin, @RequestParam String nature) throws Exception {
        return dictService.getKeywordsByPinyin(pinyin, nature);
    }
}