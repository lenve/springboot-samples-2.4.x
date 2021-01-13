package org.javaboy.test.model;

import java.util.Date;

public class AppTabs{

                /**
                * 
                */
                private Integer id;
                /**
                * Tab名称
                */
                private String name;
                /**
                * Tab活跃图标
                */
                private String activeIcon;
                /**
                * Tab不活跃图标
                */
                private String inactiveIcon;
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
                * 0 立即生效；1 定时活动
                */
                private Integer type;
                /**
                * 说明
                */
                private String description;
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
                public String getActiveIcon(){
                    return activeIcon;
                }
                public void setActiveIcon(String activeIcon){
                    this.activeIcon=activeIcon;
                }
                public String getInactiveIcon(){
                    return inactiveIcon;
                }
                public void setInactiveIcon(String inactiveIcon){
                    this.inactiveIcon=inactiveIcon;
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
                public Integer getType(){
                return type;
                }
                public void setType(Integer type){
                this.type=type;
                }
                public String getDescription(){
                    return description;
                }
                public void setDescription(String description){
                    this.description=description;
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