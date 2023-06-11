package conversiondata;

public class HexaToBinary {
    
    
    
    static int rawDecimalToBinary(int num){ 

        if(num == 0){
            return 0;
        }

        // int quotient = num / 2;
        int remainder = num % 2;
        int result = 10*rawDecimalToBinary(num / 2) + remainder;
        return result;
        
    }

    static int countBinaryStrings(int num){ // This method for counting the number of binary digits in a binary string
        if(num == 0){
            return 0;
        }

        int count = countBinaryStrings(num/10);
        return ++count;

    }

    static StringBuilder formattedBinary(int rawBinary , int count){ // This method for providing a 4 digit-format binary into string
        if(count == 0){
            return new StringBuilder(""+rawBinary);
        }

        StringBuilder result = formattedBinary(rawBinary, count - 1).insert(0,"0");
        return result;
    }
    
    static StringBuilder properDeciamlToBinary(int num){    // method where all these 3 above methods work together
        // int rawBinary = rawDecimalToBinary(num);
        int count = countBinaryStrings(rawDecimalToBinary(num));
        if(count % 4 == 0){
            count = 0;
        }
        else{
            count = 4 - (count % 4);
        }
        return formattedBinary(rawDecimalToBinary(num), count);
    }

    /*-------THESE SMALL FUNCTIONS ABOVE ARE COLLECTIVELY TREATED AS A SINGLE UNIT FOR HAVING 4-DIGIT FORMAT OF BINARIES------*/
    static StringBuilder convertHexaToBinary(String hexaDecimalString){
        return  hexaToBinary(new StringBuilder(hexaDecimalString).reverse().toString());
    }

    static StringBuilder hexaToBinary(String hexaDecimalNum){

        if(hexaDecimalNum.length() == 0){
            return new StringBuilder("");
        }
        
        int firstCharAscii = hexaDecimalNum.charAt(0);
        int hexaToDecimal = 0;
        if(firstCharAscii  >= 97 && firstCharAscii <= 102){
             hexaToDecimal = firstCharAscii - 97 + 10;
        }

        else if(firstCharAscii  >= 48 && firstCharAscii <= 57){
             hexaToDecimal = Integer.parseInt(""+hexaDecimalNum.charAt(0));
        }
        StringBuilder eachBitBinary = new StringBuilder(properDeciamlToBinary(hexaToDecimal));
        StringBuilder smallResult = hexaToBinary(hexaDecimalNum.substring(1)).append(eachBitBinary+" ");
        return smallResult;
    }

    public static void main(String[] args) {
        System.out.println("Corresponding Hexa-decimal conversion : "+convertHexaToBinary("24e"));
    }
}
