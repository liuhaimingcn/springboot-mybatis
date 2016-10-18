package com.haiyue.sbm.model;

import java.io.Serializable;

/**
 * @ Created by liuhaiming on 16/3/16.
 */
public class Mapping implements Serializable {

    private static final long serialVersionUID = 6054562321190311424L;
    private String id;
    private String mappingWord;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getMappingWord() {
        return mappingWord;
    }

    public void setMappingWord(String mappingWord) {
        this.mappingWord = mappingWord;
    }
}
