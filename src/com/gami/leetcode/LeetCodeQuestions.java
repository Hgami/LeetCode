package com.gami.leetcode;

import java.util.*;

class Q1 {

    public static void main(String[] args) {

        Map<Character, Integer> aCharacter = new HashMap<>();
        String a = "ZZ";
        String b = "zZ";
        int total = 0 ;

        char [] aChar = a.toCharArray();
        char [] bChar = b.toCharArray();

        for (char ac : aChar){
            if (aCharacter.containsKey(ac)){
                aCharacter.put(ac,aCharacter.get(ac) + 1) ;
            }else {
                aCharacter.put(ac, 1);
            }
        }

        for (char jwels : bChar){
            if (aCharacter.containsKey(jwels)) {
                total = total + (aCharacter.get(jwels));
            }
        }

        System.out.print(total);

        for (Map.Entry<Character,Integer> dup : aCharacter.entrySet()){
            char keyValue = dup.getKey();
            int value = dup.getValue();
            System.out.println (" [ Key is " +keyValue+ " ] Value is [ " +value+ " ]");
        }

    }
}

class Q2{
    public static void main(String[] args){

        String [] emails = new String[]{
                "test.email+alex@leetcode.com",
                "test.e.mail+bob.cathy@leetcode.com",
                "testemail+david@lee.tcode.com"
        };
        Set<String> result =  numUniqueEmails(emails);
        System.out.print(result);
    }

    private static Set<String> numUniqueEmails(String[] emails) {
        Set<String> seen = new HashSet();
        for (String email: emails) {
            int i = email.indexOf('@');

            String local = email.substring(0, i);
            String rest = email.substring(i,email.length());

            if (local.contains("+")){
                local = local.substring(0,local.indexOf('+'));
            }
            local = local.replaceAll("\\.", "");
            seen.add(local + rest);
        }
        return seen;
    }
}

class Q3{

    public static void main (String[] args) {
        int[] integerNumbers = new int[]{3, 2, 1, 0, 5};

/*        ArrayList<Integer> result = getSquareOfList(integerNumbers);
        System.out.print(result);
    }

    private static ArrayList<Integer> getSquareOfList(int[] integerNumbers) {
        ArrayList<Integer> resultList = new ArrayList<>();
        for (int numberArray : integerNumbers){
            resultList.add(numberArray*numberArray);
        }
        Collections.sort(resultList);
        return resultList;
    }
}*/

    int [] resultSet = getSquareofList(integerNumbers);
    for ( int output : resultSet){
        System.out.print("[ " +output+ ", ]" );
    } }

    private static int[] getSquareofList(int[] integerNumbers) {
        int count = 0;
        int[] resultList = new int[integerNumbers.length];
        for (int numberArray : integerNumbers){
            int result = (numberArray*numberArray);
            resultList[count]=result;
            count++;
        }
        Arrays.sort(resultList);
        return resultList;
    }
}

