public class Jawaban  {
    public static void main(String[] args) {
        // Tipe data primitif
        byte tipeByte = 127; // range -128 to 127
        short tipeShort = 32000; // range -32,768 to 32,767
        int tipeInt = 100000; // range -2^31 to 2^31-1
        long tipeLong = 10000000000L; // range -2^63 to 2^63-1
        float tipeFloat = 10.5f; // 32-bit floating point
        double tipeDouble = 99.99; // 64-bit floating point
        char tipeChar = 'A'; // character
        boolean tipeBoolean = true; // true or false

        // Output setiap tipe data beserta nilainya
        System.out.println("Tipe byte: " + tipeByte);
        System.out.println("Tipe short: " + tipeShort);
        System.out.println("Tipe int: " + tipeInt);
        System.out.println("Tipe long: " + tipeLong);
        System.out.println("Tipe float: " + tipeFloat);
        System.out.println("Tipe double: " + tipeDouble);
        System.out.println("Tipe char: " + tipeChar);
        System.out.println("Tipe boolean: " + tipeBoolean);

        // Tipe data non-primitif (referensi)
        String tipeString = "Halo, Saya Ariyanto";
        Integer tipeInteger = 200000; // menggunakan class Integer
        Double tipeRefDouble = 123.45; // menggunakan class Double
        
        // Output tipe data referensi
        System.out.println("Tipe String: " + tipeString);
        System.out.println("Tipe Integer (referensi): " + tipeInteger);
        System.out.println("Tipe Double (referensi): " + tipeRefDouble);
    }
}
