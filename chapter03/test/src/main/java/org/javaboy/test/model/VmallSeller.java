package org.javaboy.test.model;

import java.util.Date;

public class VmallSeller{

                /**
                * 用户数字ID
                */
                private Long id;
                /**
                * 用户nick
                */
                private String sellerNick;
                /**
                * 
                */
                private String customerRemark;
                /**
                * 用户密码
                */
                private String password;
                /**
                * app_key
                */
                private Long appKey;
                /**
                * 用户app_secret
                */
                private String appSecret;
                /**
                * 
                */
                private String callbackUrl;
                /**
                * 
                */
                private String refreshToken;
                /**
                * 短授权有效时间（单位：秒）
                */
                private Long w2ExpiresIn;
                /**
                * 
                */
                private String avatar;
                /**
                * 手机号码
                */
                private String mobile;
                /**
                * 电子邮箱
                */
                private String email;
                /**
                * 父账号nick
                */
                private String parentNick;
                /**
                * 用户版本号
                */
                private Integer subscribeVersion;
                /**
                * 到期时间
                */
                private Date deadLine;
                /**
                * 用户类型 0表示普通用户 1表示高级用户 9表示vip
                */
                private Integer type;
                /**
                * 赠送时间
                */
                private Date plusTime;
                /**
                * 赠送版本
                */
                private Integer giftVersion;
                /**
                * 
                */
                private Date lastLoginTime;
                /**
                * 
                */
                private String lastLoginIp;
                /**
                * 结算类型 0表示时结算 1表示月结算
                */
                private Integer settlementType;
                /**
                * 创建时间
                */
                private Date createTime;
                /**
                * 修改时间
                */
                private Date modifyTime;
                /**
                * 用户名
                */
                private String username;
                /**
                * 
                */
                private Boolean accountNonExpired;
                /**
                * 
                */
                private Boolean accountNonLocked;
                /**
                * 
                */
                private Boolean credentialsNonExpired;
                /**
                * 
                */
                private Boolean enabled;
                public Long getId(){
                return id;
                }
                public void setId(Long id){
                this.id=id;
                }
                public String getSellerNick(){
                    return sellerNick;
                }
                public void setSellerNick(String sellerNick){
                    this.sellerNick=sellerNick;
                }
                public String getCustomerRemark(){
                    return customerRemark;
                }
                public void setCustomerRemark(String customerRemark){
                    this.customerRemark=customerRemark;
                }
                public String getPassword(){
                    return password;
                }
                public void setPassword(String password){
                    this.password=password;
                }
                public Long getAppKey(){
                return appKey;
                }
                public void setAppKey(Long appKey){
                this.appKey=appKey;
                }
                public String getAppSecret(){
                    return appSecret;
                }
                public void setAppSecret(String appSecret){
                    this.appSecret=appSecret;
                }
                public String getCallbackUrl(){
                    return callbackUrl;
                }
                public void setCallbackUrl(String callbackUrl){
                    this.callbackUrl=callbackUrl;
                }
                public String getRefreshToken(){
                    return refreshToken;
                }
                public void setRefreshToken(String refreshToken){
                    this.refreshToken=refreshToken;
                }
                public Long getW2ExpiresIn(){
                return w2ExpiresIn;
                }
                public void setW2ExpiresIn(Long w2ExpiresIn){
                this.w2ExpiresIn=w2ExpiresIn;
                }
                public String getAvatar(){
                    return avatar;
                }
                public void setAvatar(String avatar){
                    this.avatar=avatar;
                }
                public String getMobile(){
                    return mobile;
                }
                public void setMobile(String mobile){
                    this.mobile=mobile;
                }
                public String getEmail(){
                    return email;
                }
                public void setEmail(String email){
                    this.email=email;
                }
                public String getParentNick(){
                    return parentNick;
                }
                public void setParentNick(String parentNick){
                    this.parentNick=parentNick;
                }
                public Integer getSubscribeVersion(){
                return subscribeVersion;
                }
                public void setSubscribeVersion(Integer subscribeVersion){
                this.subscribeVersion=subscribeVersion;
                }
                public Date getDeadLine(){
                return deadLine;
                }
                public void setDeadLine(Date deadLine){
                this.deadLine=deadLine;
                }
                public Integer getType(){
                return type;
                }
                public void setType(Integer type){
                this.type=type;
                }
                public Date getPlusTime(){
                return plusTime;
                }
                public void setPlusTime(Date plusTime){
                this.plusTime=plusTime;
                }
                public Integer getGiftVersion(){
                return giftVersion;
                }
                public void setGiftVersion(Integer giftVersion){
                this.giftVersion=giftVersion;
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
                public Integer getSettlementType(){
                return settlementType;
                }
                public void setSettlementType(Integer settlementType){
                this.settlementType=settlementType;
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
                public String getUsername(){
                    return username;
                }
                public void setUsername(String username){
                    this.username=username;
                }
                public Boolean getAccountNonExpired(){
                return accountNonExpired;
                }
                public void setAccountNonExpired(Boolean accountNonExpired){
                this.accountNonExpired=accountNonExpired;
                }
                public Boolean getAccountNonLocked(){
                return accountNonLocked;
                }
                public void setAccountNonLocked(Boolean accountNonLocked){
                this.accountNonLocked=accountNonLocked;
                }
                public Boolean getCredentialsNonExpired(){
                return credentialsNonExpired;
                }
                public void setCredentialsNonExpired(Boolean credentialsNonExpired){
                this.credentialsNonExpired=credentialsNonExpired;
                }
                public Boolean getEnabled(){
                return enabled;
                }
                public void setEnabled(Boolean enabled){
                this.enabled=enabled;
                }
}