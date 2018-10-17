package com.mohammadramadan.android.contactlist;

public class items {
    private String mContactName;
    private int mImageResId;
    private String mContactNumber;


public items (String ContactName, String ContactNumber, int ImageResId){
    mContactName = ContactName;
    mImageResId = ImageResId;
    mContactNumber = ContactNumber;
}

public String getContactName () {
    return  mContactName;
}
public String getContactNumber (){
    return  mContactNumber;
}
public int hasImageResId (){
    return  mImageResId;
}
}