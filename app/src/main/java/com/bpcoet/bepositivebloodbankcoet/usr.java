package com.bpcoet.bepositivebloodbankcoet;

import com.google.firebase.database.IgnoreExtraProperties;


@IgnoreExtraProperties
public class usr {

    public String name;
    public String btype;
    public String town;

    public usr() {
        //
    }

    public usr(String name, String btype, String town) {
        this.name = name;
        this.btype=btype;
        this.town=town;
    }

}
