package org.javaboy.test.model;

import java.util.Date;

public class AppCategories{

                /**
                * 
                */
                private Integer id;
                /**
                * 类目名称
                */
                private String name;
                /**
                * 类目icon
                */
                private String icon;
                /**
                * 0--H5；1--分类
                */
                private Integer type;
                /**
                * 跳转地址（H5才有）
                */
                private String url;
                /**
                * 0待审核；1已上架；2已下架；3待开始；4使用中；5已结束
                */
                private Integer state;
                /**
                * 权重
                */
                private Integer weight;
                /**
                * 开始时间
                */
                private Date startTime;
                /**
                * 结束时间
                */
                private Date endTime;
                /**
                * 最后修改人
                */
                private String lastUpdate;
                /**
                * 最后修改时间
                */
                private Date lastUpdateTime;
                public Integer getId(){
                return id;
                }
                public void setId(Integer id){
                this.id=id;
                }
                public String getName(){
                    return name;
                }
                public void setName(String name){
                    this.name=name;
                }
                public String getIcon(){
                    return icon;
                }
                public void setIcon(String icon){
                    this.icon=icon;
                }
                public Integer getType(){
                return type;
                }
                public void setType(Integer type){
                this.type=type;
                }
                public String getUrl(){
                    return url;
                }
                public void setUrl(String url){
                    this.url=url;
                }
                public Integer getState(){
                return state;
                }
                public void setState(Integer state){
                this.state=state;
                }
                public Integer getWeight(){
                return weight;
                }
                public void setWeight(Integer weight){
                this.weight=weight;
                }
                public Date getStartTime(){
                return startTime;
                }
                public void setStartTime(Date startTime){
                this.startTime=startTime;
                }
                public Date getEndTime(){
                return endTime;
                }
                public void setEndTime(Date endTime){
                this.endTime=endTime;
                }
                public String getLastUpdate(){
                    return lastUpdate;
                }
                public void setLastUpdate(String lastUpdate){
                    this.lastUpdate=lastUpdate;
                }
                public Date getLastUpdateTime(){
                return lastUpdateTime;
                }
                public void setLastUpdateTime(Date lastUpdateTime){
                this.lastUpdateTime=lastUpdateTime;
                }
}