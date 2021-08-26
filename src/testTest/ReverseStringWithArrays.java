package testTest;

import java.lang.*;


public class ReverseStringWithArrays {

    //Converting String into Bytes: getBytes() method is used to convert the input string into bytes[].
    //Method:

    //1. Create a temporary byte[]  of length equal
    //   to the length of the input string.
    //2. Store the bytes (which we get by using
    //   getBytes() method) in reverse order into
    //   the temporary byte[] .
    //3. Create a new String abject using byte[] to
    //   store result.

        public static void main(String[] args)
        {
            String input = "we can do it";

            // getBytes() method to convert string
            // into bytes[].
            byte[] strAsByteArray = input.getBytes();

            byte[] result = new byte[strAsByteArray.length];

            // Store result in reverse order into the
            // result byte[]
            for (int i = 0; i < strAsByteArray.length; i++)
                result[i] = strAsByteArray[strAsByteArray.length - i - 1];

            System.out.println(new String(result));
        }
    }

