package com.haiyue.sbm.model;

import java.io.Serializable;
import java.util.Date;

/**
 * @ Created by liuhaiming on 16/3/16.
 */
public class Dict implements Serializable {

    private static final long serialVersionUID = 2709671603163733196L;

    private String id;
    private String keyword;
    private String nature;
    private Integer freq;
    private Float value;
    private Date createdOn;
    private Date updatedOn;
    private Integer delStatus;
    private String pinyin;
    private String conversionAll;
    private String conversionSpace;
    private Mapping mapping;

    public Float getValue() {
        return value;
    }

    public void setValue(Float value) {
        this.value = value;
    }

    public String getPinyin() {
        return pinyin;
    }

    public void setPinyin(String pinyin) {
        this.pinyin = pinyin;
    }

    public Mapping getMapping() {
        return mapping;
    }

    public void setMapping(Mapping mapping) {
        this.mapping = mapping;
    }

    public String getConversionAll() {
        return conversionAll;
    }

    public void setConversionAll(String conversionAll) {
        this.conversionAll = conversionAll;
    }

    public String getConversionSpace() {
        return conversionSpace;
    }

    public void setConversionSpace(String conversionSpace) {
        this.conversionSpace = conversionSpace;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getKeyword() {
        return keyword;
    }

    public void setKeyword(String keyword) {
        this.keyword = keyword;
    }

    public String getNature() {
        return nature;
    }

    public void setNature(String nature) {
        this.nature = nature;
    }

    public Integer getFreq() {
        return freq;
    }

    public void setFreq(Integer freq) {
        this.freq = freq;
    }

    public Date getCreatedOn() {
        return createdOn;
    }

    public void setCreatedOn(Date createdOn) {
        this.createdOn = createdOn;
    }

    public Date getUpdatedOn() {
        return updatedOn;
    }

    public void setUpdatedOn(Date updatedOn) {
        this.updatedOn = updatedOn;
    }

    public Integer getDelStatus() {
        return delStatus;
    }

    public void setDelStatus(Integer delStatus) {
        this.delStatus = delStatus;
    }


    @Override
    public String toString() {
        return "Dict{" +
                "id='" + id + '\'' +
                ", keyword='" + keyword + '\'' +
                ", nature='" + nature + '\'' +
                ", freq=" + freq +
                ", value=" + value +
                ", createdOn=" + createdOn +
                ", updatedOn=" + updatedOn +
                ", delStatus=" + delStatus +
                ", pinyin='" + pinyin + '\'' +
                ", conversionAll='" + conversionAll + '\'' +
                ", conversionSpace='" + conversionSpace + '\'' +
                ", mapping=" + mapping +
                '}';
    }
}
