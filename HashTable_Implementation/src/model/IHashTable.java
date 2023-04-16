package model;

import model.Data;

public interface IHashTable<T> {

    void placeData(Data data);

    Data findData(T value);

    Data deleteData(T data);

}
