package com.jiyun.helloworld.wude.bean;

import org.greenrobot.greendao.annotation.Entity;
import org.greenrobot.greendao.annotation.Id;
import org.greenrobot.greendao.annotation.Property;
import org.greenrobot.greendao.annotation.Generated;

/**
 * Created by ASAS on 2019/5/29.
 */
@Entity
public class Data {
    @Id
    @Property(nameInDb = "Iiid")
    private int Id;
    private String name;
    @Generated(hash = 327634994)
    public Data(int Id, String name) {
        this.Id = Id;
        this.name = name;
    }
    @Generated(hash = 2135787902)
    public Data() {
    }
    public int getId() {
        return this.Id;
    }
    public void setId(int Id) {
        this.Id = Id;
    }
    public String getName() {
        return this.name;
    }
    public void setName(String name) {
        this.name = name;
    }

   
    

}
