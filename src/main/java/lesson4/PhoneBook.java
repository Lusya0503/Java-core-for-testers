package lesson4;

import java.util.ArrayList;
import java.util.HashMap;

public class PhoneBook {

    private HashMap<String, ArrayList<String>> phoneBook = new HashMap<>();

        public void add(String lastName, String phoneNumber) {

            ArrayList<String> phonesForLastName = phoneBook.getOrDefault(lastName, new ArrayList<>());

            phonesForLastName.add(phoneNumber);

            phoneBook.put(lastName, phonesForLastName);

                    }

                    public ArrayList<String> get(String lastName) {

            return phoneBook.get(lastName);

                                }

    public static void main(String[] args) {

            PhoneBook phoneBook = new PhoneBook();


        phoneBook.add("Petrov", "222222222");
        phoneBook.add("Petrova", "444444444");
        phoneBook.add("Petrov", "666666666");
        phoneBook.add("Sidorov", "555555555");

        System.out.println(phoneBook.get("Petrov"));

            }
}
