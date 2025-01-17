package com.ruoyi.system.domain;

import com.ruoyi.common.core.domain.BaseEntity;

import java.util.Date;

/**
 * @author Dewily
 * @date 2022-07-13 22:19
 */
public class KmsSecretKey extends BaseEntity {

    private static final long serialVersionUID = 1L;

    private Long id;

    private String serialNumber;

    private String issureDn;

    private String keyAlg;

    private Date createTime;

    private Integer length;

    private String savePath;

    public KmsSecretKey() {
    }

    public KmsSecretKey(Long id, String serialNumber, String issureDn, String keyAlg, Date createTime, Integer length, String savePath) {
        this.id = id;
        this.serialNumber = serialNumber;
        this.issureDn = issureDn;
        this.keyAlg = keyAlg;
        this.createTime = createTime;
        this.length = length;
        this.savePath = savePath;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    public String getIssureDn() {
        return issureDn;
    }

    public void setIssureDn(String issureDn) {
        this.issureDn = issureDn;
    }

    public String getKeyAlg() {
        return keyAlg;
    }

    public void setKeyAlg(String keyAlg) {
        this.keyAlg = keyAlg;
    }

    @Override
    public Date getCreateTime() {
        return createTime;
    }

    @Override
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Integer getLength() {
        return length;
    }

    public void setLength(Integer length) {
        this.length = length;
    }

    public String getSavePath() {
        return savePath;
    }

    public void setSavePath(String savePath) {
        this.savePath = savePath;
    }

    @Override
    public String toString() {
        return "Key{" +
                "id=" + id +
                ", serialNumber='" + serialNumber + '\'' +
                ", issureDn='" + issureDn + '\'' +
                ", keyAlg='" + keyAlg + '\'' +
                ", createTime=" + createTime +
                ", length=" + length +
                ", savePath='" + savePath + '\'' +
                '}';
    }
}
