package ui;
import model.HashTable;
import model.Data;

public class Main {
    public static void main(String[] args) {
        int sizeArray = 10;
        HashTable hashTable = new HashTable(sizeArray);

        Data data = new Data(7, "3");
        Data data2 = new Data("Daron", 11);
        Data data3 = new Data("Esteban", 11);
        Data data4 = new Data("Andrés", 11);
        Data data5 = new Data("Sara", 11);
        Data data6 = new Data("Isabella", 11);
        Data data7 = new Data("Sofía", 11);
        Data data8 = new Data("Violeta", 'c');
        Data data9 = new Data("Alejandra", 11);
        Data data10 = new Data('c', 11);
        //model.Data data11 = new model.Data("Sophy", 11);
        //model.Data data12 = new model.Data("Jessica", 11);


        hashTable.placeData(data2);
        hashTable.placeData(data3);
        hashTable.placeData(data4);
        hashTable.placeData(data);
        hashTable.placeData(data5);
        hashTable.placeData(data6);
        hashTable.placeData(data7);
        hashTable.placeData(data8);
        hashTable.placeData(data9);
        hashTable.placeData(data10);
        //hashTable.placeData(data11);
        //hashTable.placeData(data12);



        Data objectFound = hashTable.findData(7);
        Data objectFound2 = hashTable.findData("Daron");
        Data objectFound3 = hashTable.findData("Esteban");
        Data objectFound4 = hashTable.findData("Andrés");
        Data objectFound5 = hashTable.findData("Sofía");

            System.out.println(objectFound);
            System.out.println(objectFound2);
            System.out.println(objectFound3);
            System.out.println(objectFound4);
            System.out.println(objectFound5);

        Data datadeleted = hashTable.deleteData("Daron");
        System.out.println("removing: "+datadeleted);
        hashTable.placeData(data10);




    }
}