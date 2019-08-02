package com.example.lesson_3_1;

public interface ISharedStorage {

    void setBoolean(String key, boolean value);

    boolean getBoolean(String key, boolean defValue);

    boolean contains(String key);

    void remove(String key);

    void clear();
}
