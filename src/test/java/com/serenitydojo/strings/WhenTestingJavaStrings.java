package com.serenitydojo.strings;

import org.junit.Test;

public class WhenTestingJavaStrings {

    /**
     *
     *
     * Instead of passing the text "Hello World" as a parameter
     * to the String constructor, you can just write the text itself inside
     * the double quote characters.
     * This is called a String literal.
     */

    @Test
    public void creatingAString(){
        String myString = new String("Hello World");
        String myString1 = new String("Hello World");
        System.out.println(myString.equals(myString1));
    }
    /**
     * ava text blocks, also known as Java multi line strings,
     * is a feature that was added in Java 13 (in preview) which enables you
     * to more easily declare String literals that span multiple lines in your
     * Java code.
     * String textblock = """
     *                    This is a text inside a
     *                    text block
     *                    """;
     *          String textblock1 = """
     *                    This is a Java text block
     *                    """;
     *
     * String textblock2 = """
     *                    This is a Java text block
     *                  """;
     *
     * String textblock3 = """
     *                    This is a Java text block
     *                """;
     *
     * System.out.println(textblock1);
     * System.out.println(textblock2);
     * System.out.println(textblock3);
     * OutPut:-
     * This is a Java text block
     *
     *   This is a Java text block
     *
     *     This is a Java text block
     */
    @Test
    public void concatenatingStrings(){
    String one = "Hello";
    String two = "World";
    String three = one + " " + two;
    System.out.println(" concatenated String : "+three);

        String one1 = "Hello";
        String two1 = " World";

        String three1 = new StringBuilder(one).append(two).toString();
        System.out.println(" concatenated String : "+three1);

    }
    @Test
    public void stringBuffer(){
        String[] strings = new String[]{"one", "two", "three", "four", "five"};

        StringBuilder temp  = new StringBuilder();
        for(String string : strings) {
            temp.append(string).append("_");
        }
        String result = temp.toString();
        System.out.println(result);
    }
    /**
     * String Length
     * String string = "Hello World";
     * int length = string.length();
     *
     * String string1 = "Hello World";
     *
     * String substring = string1.substring(0,5);
     * After this code is executed the substring variable will contain
     * the string Hello.
     *
     *String string1 = "Hello World";
     *
     * int index = string1.indexOf("World");
     * The index variable will contain the value 6 after this code is executed.
     * The indexOf() method returns the index of where the first character
     * in the first matching substring is found.
     * the substring is not found within the string,
     * the indexOf() method returns -1;
     *
     * String theString = "is this good or is this bad?";
     * String substring = "is";
     *
     * int index = theString.indexOf(substring);
     * while(index != -1) {
     *     System.out.println(index);
     *     index = theString.indexOf(substring, index + 1);
     * }
     *
     *
     * String input = "Hey, \\n This is not normally a line break.";
     * System.out.println(input);
     *
     * String output = input.translateEscapes();
     * System.out.println(output);
     * The escape character \\ is interpreted to mean a single \ character by the Java compiler, so the input String ends up containing a \n as 2 text characters, not a line break.
     *
     * When calling the translateEscapes() method the \n part of the text will now be interpreted as a line break escape code.
     *
     */
    /**
     * Matching a String Against a Regular Expression With matches()
     * String text = "one two three two one";
     *
     * boolean matches = text.matches(".*two.*");
     *
     *
     *
     * String one   = "abc";
     * String two   = "def";
     * String three = "abc";
     * String four  = "ABC";
     *
     * System.out.println( one.equals(two) ); false
     * System.out.println( one.equals(three) ); true
     * System.out.println( one.equals(four) ); false
     *
     *equalsIgnoreCase()
     * The String class also has a method called equalsIgnoreCase()
     * which compares two strings but ignores the case of the characters.
     * Thus, uppercase characters are considered to be equal to their
     * lowercase equivalents.
     *
     * String one = "This is a good day to code";
     *
     * System.out.println( one.startsWith("This")    );
     * System.out.println( one.startsWith("This", 5) );
     *
     * System.out.println( one.endsWith  ("code")    );
     * System.out.println( one.endsWith  ("shower")  );
     *
     *
     *String one   = "abc";
     * String two   = "def";
     * String three = "abd";
     *
     * System.out.println( one.compareTo(two)   ); -3
     * System.out.println( one.compareTo(three) ); -1
     *
     * String text    = "  And he ran across the field   ";
     * String trimmed = text.trim();
     *
     * String source   = "123abc";
     * String replaced = source.replace('a', '@');
     *
     * String text = "one two three two one";
     *
     * String s = text.replaceFirst("two", "five");
     *
     * tring text = "one two three two one";
     *
     * String t = text.replaceAll("two", "five");
     *
     * String   source = "A man drove with a car.";
     * String[] occurrences = source.split("a");
     *
     * String   source = "A man drove with a car.";
     * int      limit  = 2;
     * String[] occurrences = source.split("a", limit);
     */

    /**
     *Converting Numbers to Strings With valueOf()
     * String intStr = String.valueOf(10);
     * System.out.println("intStr = " + intStr); 10
     *
     * String flStr = String.valueOf(9.99);
     * System.out.println("flStr = " + flStr); 9.99
     *
     *
     * Converting Objects to Strings
     * Integer integer = new Integer(123);
     *
     * String intStr = integer.toString();
     *
     *
     * Getting Characters and Bytes
     * String theString = "This is a good day to code";
     *
     * System.out.println( theString.charAt(0) ); T
     * System.out.println( theString.charAt(3) ); S
     *
     * String theString = "This IS a mix of UPPERcase and lowerCASE";
     *
     * String uppercase = theString.toUpperCase();
     * String lowercase = theString.toLowerCase();
     *
     *
     *
     * String input = "Hello %s";
     *
     * String output1 = input.formatted("World");
     * System.out.println(output1);
     *
     * String output2 = input.formatted("Jakob");
     * System.out.println(output2);
     * This example will first print out "Hello World" and then "Hello Jakob".
     * The parameter values passed to formatted() will be inserted into the
     * returned String at the %s location of the input String.
     *
     */
}
