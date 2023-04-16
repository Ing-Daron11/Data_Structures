package model;

import java.util.Objects;
public class Data< T ,k > {
    private final T value;
    private k key ;

    public Data( T value) {
        this.value = value;
    }

    public Data( T value, k key) {
        this.value = value;
        this.key = key;
    }

    public T getValue() {
        return value;
    }

    public k getKey() {
        return key;
    }

    public void setKey(k  key) {
        this.key = key;
    }

    @Override
    public boolean equals(Object obj) {
        if(this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;

        Data data = (Data) obj;
        return Objects.equals(value, data.getValue());
    }


    public int hashCode() {
      return value.hashCode();
    }

    @Override
    public String toString() {
        return "model.Data{" +
                "name='" + value + '\'' +
                ", number=" + key +
                '}';
    }
}