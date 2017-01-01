package kyu6;

/**
 * Created by Dell on 1/1/2017.
 */
public class SalesmansTravel {

    /**
     * A traveling salesman has to visit clients. He got each client's address e.g. "432 Main Long Road St. Louisville OH 43071" as a list.
     The basic zipcode format usually consists of two capital letters followed by a white space and five digits.
     The list of clients to visit was given as a string of all addresses, each separated from the others by a comma, e.g. :
     "123 Main Street St. Louisville OH 43071,432 Main Long Road St. Louisville OH 43071,786 High Street Pollocksville NY 56432".
     To ease his travel he wants to group the list by zipcode.
     Task
     The function travel will take two parameters r (list of all clients' addresses) and zipcode and returns a string in the following format:
     zipcode:street and town,street and town,.../house number,house number,...
     The street numbers must be in the same order as the streets where they belong.
     If a given zipcode doesn't exist in the list of clients' addresses return "zipcode:/"
     Examples
     r = "123 Main Street St. Louisville OH 43071,432 Main Long Road St. Louisville OH 43071,786 High Street Pollocksville NY 56432"
     travel(r, "OH 43071") --> "OH 43071:Main Street St. Louisville,Main Long Road St. Louisville/123,432"
     travel(r, "NY 56432") --> "NY 56432:High Street Pollocksville/786"
     travel(r, "NY 5643") --> "NY 5643:/"
     Note: You can see the list of all addresses and zipcodes in the test cases.
     */
     public static String travel(String r, String zipcode) {

         String[] strList = r.split(",");
         String strStreet = "" ;
         String strHouseNum = "" ;

         for(String s1 : strList){
             String zipcodeInStr = s1.substring(s1.length() - 8, s1.length());
             if(zipcodeInStr.equals(zipcode)){
                 String strTemp = s1.replaceAll(" "+zipcode, "");

                 strHouseNum = strHouseNum + getHouseNumString(strTemp) + ",";
                 strTemp = strTemp.replaceAll(getHouseNumString(strTemp) + " ", "");
                 strStreet = strStreet + strTemp +",";
             }
         }
         if(strStreet.length()>1) {
             strStreet = strStreet.substring(0, strStreet.length() - 1); //remove last coma from string
             strHouseNum = strHouseNum.substring(0, strHouseNum.length() - 1);
         }
         String result = zipcode + ":" + strStreet+ "/" + strHouseNum;
     return result;
     }

    private static String getHouseNumString(String str){
        String strHouseNum = "";
        String[] tempList = str.split(" ");
        for(String s2 : tempList){
            if(s2.matches("\\d+")){
                strHouseNum =  s2;
                break;
            }
        }
        return strHouseNum;
    }

}
