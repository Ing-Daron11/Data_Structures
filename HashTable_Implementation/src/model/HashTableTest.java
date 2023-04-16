package model;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import static org.junit.jupiter.api.Assertions.*;


class HashTableTest {

    private int tableSize = 10;
    private HashTable hashTable1;

    @BeforeEach
    void init(){
        hashTable1 = new HashTable<>(tableSize);

    }
    @Test
    void placeDataTest1() {
        //Initialize
        Dog dog1 = new Dog("bruno");
        Data dt1 = new Data(dog1, 2);
        //Act
        hashTable1.placeData(dt1);
        //Assert
        assertEquals(dt1,hashTable1.findData(dog1));
    }
    @Test
    void placeDataTest2() {
        //Initialize
        String str = "Daron";
        String str2 = "Andrés";
        String str3 = "Mercado";
        Data dt1 = new Data(str, 'a');
        Data dt2 = new Data(str2, 'b');
        Data dt3 = new Data(str3, 'c');
        //Act
        hashTable1.placeData(dt1);
        hashTable1.placeData(dt2);
        hashTable1.placeData(dt3);
        //Assert
        assertEquals(dt1, hashTable1.deleteData(str)); //Ambos son los mismos
        assertEquals(dt1, dt1); //Se puede buscar de cualquier forma
    }
    @Test
    void placeDataTest3() {
        Data dat1 = new Data(9, 1);
        Data dat2 = new Data(10, 3);
        Data dat3 = new Data(11, 5);
        Data dat4 = new Data(12, "anyText");

        hashTable1.placeData(dat1);
        hashTable1.placeData(dat2);
        hashTable1.placeData(dat3);

        assertNotEquals(dat1, hashTable1.findData(10));
        assertEquals(dat1, hashTable1.findData(9));
    }
    @Test
    void findDataTest1() {
        Data dat1 = new Data(9, 1);
        Data dat2 = new Data(12, "anyText");

        hashTable1.placeData(dat1);
        hashTable1.placeData(dat2);

        assertNotEquals(dat1, hashTable1.findData(12));
        assertEquals(null, hashTable1.findData("anyText"));
    }
    @Test
    void findDataTest2() {
        char char1 = 'a';
        char char2 = 'b';
        char char3 = 'c';
        Data dta1 =  new Data(char1, "Rodolfo");
        Data dta2 =  new Data(char2, "Hernandez");
        Data dta3 =  new Data(char3, "Ingeniero");

        hashTable1.placeData(dta1);
        hashTable1.placeData(dta2);
        hashTable1.placeData(dta3);

        Data dataFound = hashTable1.findData(char1);
        Data dataFound3 = hashTable1.findData(char3);
        assertNotEquals(dataFound3,dataFound);
        assertEquals(dta3, dataFound3);


    }
    @Test
    void findDataTest3() {
        Dog dog1 = new Dog("bruno");
        Dog dog2 = new Dog("bruno");
        Data data1 = new Data("Daron", dog1);
        Data data2 = new Data("Andrés", dog2);

        hashTable1.placeData(data1);
        hashTable1.placeData(data2);

        assertEquals(data1, hashTable1.findData("Daron"));
        hashTable1.deleteData(data1);
        assertEquals(null, hashTable1.findData(data1));

    }
    @Test
    void deleteDataTest1() {
    }
    @Test
    void deleteDataTest2() {
    }
    @Test
    void deleteDataTest3() {
    }
}