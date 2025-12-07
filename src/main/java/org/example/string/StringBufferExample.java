package org.example.string;

public class StringBufferExample {
    public static void main(String args[]) {
        StringBuffer s1 = new StringBuffer("Hello");
        System.out.println(s1);
        s1.append(" World");
        System.out.println(s1);
        // we can also define the initial size of string
        int initialSize = 20;
        StringBuffer stringBuffer2 = new StringBuffer(initialSize); // initial size of string will be 20

        // string builder
        // it is also same as stringBuffer but it is not threadSafe
        // it is not suitable for parallel processing
        StringBuilder stringBuilder = new StringBuilder("Abinesh");

        // String buffer methods
        //append
        StringBuffer stringBuffer = new StringBuffer("Hello");
        stringBuffer.append(" World");
        System.out.println(stringBuffer);
        //insert
        StringBuffer stringBuffer1 = new StringBuffer("Hello world");
        stringBuffer1.insert(6, "Dear ");
        // dear will insert at 5 position
        System.out.println(stringBuffer1);
        // replace
        StringBuffer stringBuffer3 = new StringBuffer("Hello world");
        stringBuffer3.replace(6, 7, "Abinesh W");
        System.out.println(stringBuffer3);

        // delete
        stringBuffer3.delete(6, 14);
        System.out.println(stringBuffer3);
    }
}
