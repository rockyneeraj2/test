package org.example.Encapsulation;

public class CreateBox {

    public static void main(String[] args) {
        common c = new common();
        c.setLength(10);
        c.setHeight(20);
        c.setWidth(30);

        c.SetBoxDimension(10,20,30);
        System.out.println(c.getLength());





    }
}
