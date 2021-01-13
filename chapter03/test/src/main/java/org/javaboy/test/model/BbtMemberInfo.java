package org.javaboy.test.model;

import java.util.Date;

public class BbtMemberInfo{

                /**
                * 
                */
                private Long id;
                /**
                * 
                */
                private Long customerId;
                /**
                * 企业ID
                */
                private String corpId;
                /**
                * 企业会员id
                */
                private String corpUserId;
                /**
                * 
                */
                private String mobile;
                /**
                * 
                */
                private String name;
                /**
                * 密码
                */
                private String passWord;
                /**
                * 昵称
                */
                private String nick;
                /**
                * 头像
                */
                private String avatar;
                /**
                * 性别
                */
                private String sex;
                /**
                * 
                */
                private Integer age;
                /**
                * 出生日期
                */
                private Date birthday;
                /**
                * 
                */
                private String openId;
                /**
                * 身高
                */
                private Double height;
                /**
                * 体重
                */
                private Double weight;
                /**
                * 职业
                */
                private String profession;
                /**
                * 省份
                */
                private Long province;
                /**
                * 城市
                */
                private Long city;
                /**
                * 地区
                */
                private Long area;
                /**
                * 街道
                */
                private Long street;
                /**
                * 详细地址
                */
                private String address;
                /**
                * 
                */
                private String provinceName;
                /**
                * 
                */
                private String streetName;
                /**
                * 
                */
                private String areaName;
                /**
                * 
                */
                private String cityName;
                /**
                * 
                */
                private Date lastLoginTime;
                /**
                * 
                */
                private String lastLoginIp;
                /**
                * 是否授权获取ip地址
                */
                private Integer authorizeIp;
                /**
                * 1表示有权限
                */
                private Integer proxyPower;
                /**
                * 企业微信用户ID
                */
                private String qiyeWxUserId;
                /**
                * 淘宝用户ID
                */
                private String tbUserId;
                /**
                * 淘宝用户生效时间
                */
                private Date tbUserValidTime;
                /**
                * 微信用户唯一标识
                */
                private String wxUnionId;
                /**
                * 工号
                */
                private String jobNumber;
                /**
                * 用户状态 1正常 2 冻结
                */
                private Integer status;
                /**
                * 运营商用户
                */
                private Integer carrierType;
                /**
                * 
                */
                private Date createTime;
                /**
                * 
                */
                private Date modifyTime;
                public Long getId(){
                return id;
                }
                public void setId(Long id){
                this.id=id;
                }
                public Long getCustomerId(){
                return customerId;
                }
                public void setCustomerId(Long customerId){
                this.customerId=customerId;
                }
                public String getCorpId(){
                    return corpId;
                }
                public void setCorpId(String corpId){
                    this.corpId=corpId;
                }
                public String getCorpUserId(){
                    return corpUserId;
                }
                public void setCorpUserId(String corpUserId){
                    this.corpUserId=corpUserId;
                }
                public String getMobile(){
                    return mobile;
                }
                public void setMobile(String mobile){
                    this.mobile=mobile;
                }
                public String getName(){
                    return name;
                }
                public void setName(String name){
                    this.name=name;
                }
                public String getPassWord(){
                    return passWord;
                }
                public void setPassWord(String passWord){
                    this.passWord=passWord;
                }
                public String getNick(){
                    return nick;
                }
                public void setNick(String nick){
                    this.nick=nick;
                }
                public String getAvatar(){
                    return avatar;
                }
                public void setAvatar(String avatar){
                    this.avatar=avatar;
                }
                public String getSex(){
                    return sex;
                }
                public void setSex(String sex){
                    this.sex=sex;
                }
                public Integer getAge(){
                return age;
                }
                public void setAge(Integer age){
                this.age=age;
                }
                public Date getBirthday(){
                return birthday;
                }
                public void setBirthday(Date birthday){
                this.birthday=birthday;
                }
                public String getOpenId(){
                    return openId;
                }
                public void setOpenId(String openId){
                    this.openId=openId;
                }
                public Double getHeight(){
                return height;
                }
                public void setHeight(Double height){
                this.height=height;
                }
                public Double getWeight(){
                return weight;
                }
                public void setWeight(Double weight){
                this.weight=weight;
                }
                public String getProfession(){
                    return profession;
                }
                public void setProfession(String profession){
                    this.profession=profession;
                }
                public Long getProvince(){
                return province;
                }
                public void setProvince(Long province){
                this.province=province;
                }
                public Long getCity(){
                return city;
                }
                public void setCity(Long city){
                this.city=city;
                }
                public Long getArea(){
                return area;
                }
                public void setArea(Long area){
                this.area=area;
                }
                public Long getStreet(){
                return street;
                }
                public void setStreet(Long street){
                this.street=street;
                }
                public String getAddress(){
                    return address;
                }
                public void setAddress(String address){
                    this.address=address;
                }
                public String getProvinceName(){
                    return provinceName;
                }
                public void setProvinceName(String provinceName){
                    this.provinceName=provinceName;
                }
                public String getStreetName(){
                    return streetName;
                }
                public void setStreetName(String streetName){
                    this.streetName=streetName;
                }
                public String getAreaName(){
                    return areaName;
                }
                public void setAreaName(String areaName){
                    this.areaName=areaName;
                }
                public String getCityName(){
                    return cityName;
                }
                public void setCityName(String cityName){
                    this.cityName=cityName;
                }
                public Date getLastLoginTime(){
                return lastLoginTime;
                }
                public void setLastLoginTime(Date lastLoginTime){
                this.lastLoginTime=lastLoginTime;
                }
                public String getLastLoginIp(){
                    return lastLoginIp;
                }
                public void setLastLoginIp(String lastLoginIp){
                    this.lastLoginIp=lastLoginIp;
                }
                public Integer getAuthorizeIp(){
                return authorizeIp;
                }
                public void setAuthorizeIp(Integer authorizeIp){
                this.authorizeIp=authorizeIp;
                }
                public Integer getProxyPower(){
                return proxyPower;
                }
                public void setProxyPower(Integer proxyPower){
                this.proxyPower=proxyPower;
                }
                public String getQiyeWxUserId(){
                    return qiyeWxUserId;
                }
                public void setQiyeWxUserId(String qiyeWxUserId){
                    this.qiyeWxUserId=qiyeWxUserId;
                }
                public String getTbUserId(){
                    return tbUserId;
                }
                public void setTbUserId(String tbUserId){
                    this.tbUserId=tbUserId;
                }
                public Date getTbUserValidTime(){
                return tbUserValidTime;
                }
                public void setTbUserValidTime(Date tbUserValidTime){
                this.tbUserValidTime=tbUserValidTime;
                }
                public String getWxUnionId(){
                    return wxUnionId;
                }
                public void setWxUnionId(String wxUnionId){
                    this.wxUnionId=wxUnionId;
                }
                public String getJobNumber(){
                    return jobNumber;
                }
                public void setJobNumber(String jobNumber){
                    this.jobNumber=jobNumber;
                }
                public Integer getStatus(){
                return status;
                }
                public void setStatus(Integer status){
                this.status=status;
                }
                public Integer getCarrierType(){
                return carrierType;
                }
                public void setCarrierType(Integer carrierType){
                this.carrierType=carrierType;
                }
                public Date getCreateTime(){
                return createTime;
                }
                public void setCreateTime(Date createTime){
                this.createTime=createTime;
                }
                public Date getModifyTime(){
                return modifyTime;
                }
                public void setModifyTime(Date modifyTime){
                this.modifyTime=modifyTime;
                }
}