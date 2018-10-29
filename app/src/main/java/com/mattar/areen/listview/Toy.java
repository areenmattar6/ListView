package com.mattar.areen.listview;

import android.graphics.Bitmap;

class Toy {



    private int price;

    private String title;

    private String subTitle;

    private String bitmap;//IT MUST BE Bitmap and not String

    public Toy(int price, String title, String subTitle, String bitmap)

    {



        this.price = price;

        this.title = title;

        this.subTitle = subTitle;

        this.bitmap = bitmap;

    }



    public int getPrice() {

        return price;

    }

    public void setPrice(int price) {

        this.price = price;

    }

    public String getTitle() {

        return title;

    }

    public void setTitle(String title) {

        this.title = title;

    }

    public String getSubTitle() {

        return subTitle;

    }

    public void setSubTitle(String subTitle) {

        this.subTitle = subTitle;

    }



    public String getBitmap() {

        return bitmap;

    }



    public void setBitmap(String bitmap) {

        this.bitmap = bitmap;

    }



}

