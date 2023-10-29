package com.netclan.task.models;

import java.io.Serializable;

public class HomeModel implements Serializable {
    public String id = "";
    public String status = "";
    public String name = "";
    public String location = "";
    public String progressBar = "";
    public String type = "";
    public String desc = "";
    public Integer profileImg = 0;

    public HomeModel(String id, String status, String name, String location, String progressBar, String type, String desc, int profileImg) {
        this.id=id;
        this.status=status;
        this.name=name;
        this.location=location;
        this.progressBar=progressBar;
        this.type=type;
        this.desc=desc;
        this.profileImg=profileImg;
    }

}
