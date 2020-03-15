/**
 * Usually when you buy something, you're asked whether your credit card number,
 * phone number or answer to your most secret question is still correct.
 * However, since someone could look over your shoulder, you don't want that shown on your screen.
 * Instead, we mask it.
 * Your task is to write a function maskify, which changes all but the last four characters into '#'.
 */
public class Maskify {

    public static void main(String[] args) {
        System.out.println(maskify("4567300040005000"));

    }

    //Надо выделить подстроку от первого символа до ограничения.
    public static String maskify(String creditCardNumber){


        if(creditCardNumber == null || creditCardNumber.isEmpty()){
            return "";
        }

        if(creditCardNumber == "1"){
            return "1";
        }

        int cardLength = creditCardNumber.length();

        String subStr = creditCardNumber.substring(0, cardLength - 4);
        subStr = subStr.replaceAll("[0-9]", "#");
        subStr = subStr.replaceAll("[A-Z]", "#");
        subStr = subStr.replaceAll("[a-z]", "#");
        subStr = subStr.replaceAll(" ", "#");

        creditCardNumber = subStr + creditCardNumber.substring(cardLength - 4);
        return creditCardNumber;
    }
}
