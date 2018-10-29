class Test {
    public static void main(String[] args) {
        Double x = 3.5;
        System.out.println(x.intValue());
        System.out.println(x.compareTo(4.5));

        java.math.BigInteger xD = new java.math.BigInteger("3");
        java.math.BigInteger y = new java.math.BigInteger("7");
        java.math.BigInteger z = xD.add(y);
        System.out.println("x is " + xD);
        System.out.println("y is " + y);
        System.out.println("z is " + z);

        String s = "Java";
        System.out.println(s);
        s = "HTML";
        System.out.println(s);


        String d = "3.5";
        System.out.println((Double.parseDouble(d)+2));

        char[] chars = {'j','a','v','a','2','3','4','5'};
        "CS3720".getChars(2,6,chars,4);
    } }

