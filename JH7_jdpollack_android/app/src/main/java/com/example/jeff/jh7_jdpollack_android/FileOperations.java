package com.example.jeff.jh7_jdpollack_android;

/**
 * Created by Jeff on 11/25/2015.
 */
public interface FileOperations {
    // Commented out callbacks will be useful for JH4

    public void newFile(String category);
    public void open(String category);
    public void delete(String category);

    public void itemBought(int index, String value);
}

