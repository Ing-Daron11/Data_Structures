package model;

import model.Data;

public class HashTable<T> implements IHashTable<T> {
    private final Data[] table;

    public HashTable(int tableSize) {
        this.table = new Data[tableSize];
    }

    @Override
    public void placeData(Data data) {
        int index = Math.abs(data.hashCode() % (table.length-1));
        //System.out.println("Se quiere ubicar en: " + index);
        int number = 0;
        while (table[index] != null) {
            if(index >= table.length-1){
                index = 0; //Se reinicia
            }else{
                index++;
            }
            number++;
            //System.out.println("reubicando en: " + index);
            if (number > table.length) {
                throw new RuntimeException("Not enough space in the hastable");
            }
        }

        table[index] = data;
    }

    @Override
    public Data findData(T value) {

        return findData(new Data(value));
    }


    private Data findData(Data data) {
        int index = Math.abs(data.hashCode() % (table.length-1));
        int number = 0;
        boolean isfound = true;
        while (table[index] != null && !table[index].equals(data) && isfound) {
            if(index >= table.length-1){
                index = 0; //Se reinicia
            }else{
                index++;
            }
            number++;
            if (number > table.length) {
                isfound = false; //Se buscó en toda la tabla y no se encontró
            }
        }

        return table[index];
    }

    public int auxFind(T value){
        return auxFind(new Data(value));
    }

    private int auxFind(Data data){
        int index = Math.abs(data.hashCode() % (table.length-1));
        int number = 0;
        boolean isfound = true;
        while (table[index] != null && !table[index].equals(data) && isfound) {
            if(index >= table.length-1){
                index = 0; //Se reinicia
            }else{
                index++;
            }
            number++;
            if (number > table.length) {
                isfound = false; //Se buscó en toda la tabla y no se encontró
            }
        }
        if(!isfound){
            return -1;
        }else{
            return index;
        }
    }

    @Override
    public Data deleteData(T value){
        int index = auxFind(value);
        if(index == -1){
            return null;
        }else{
            Data dataDeleted = table[index];
            table[index] = null;
            return dataDeleted;
        }
    }
}
