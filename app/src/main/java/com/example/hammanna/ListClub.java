package com.example.hammanna;

import android.graphics.Bitmap;
import android.widget.ImageView;

public class ListClub {
    private final int img;
    private final String clubName;

    public ListClub(int img,String clubName) {
        this.img = img;
        this.clubName = clubName;
    }

    public int getImg() {
        return img;
    }

    public String getClubName() {
        return clubName;
    }
}
