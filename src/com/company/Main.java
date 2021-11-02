package com.company;

import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
        Map<String, Integer> hm = new HashMap<>();
        String[] words = {
                "Deathcore", "Metalcore", "Ska",
                "Hardcore", "Thrash", "Punk",
                "Rock", "Industrial", "Doom",
                "Metal", "Deathcore", "Chaotic",
                "Thrash", "Chaotic", "Ska",
                "Punk", "Chaotic", "Ska", "Chaotic"
        };

        for (int i = 0; i < words.length; i++) {
            if (hm.containsKey(words[i]))
                hm.put(words[i], hm.get(words[i]) + 1);
            else
                hm.put(words[i], 1);
        }
        System.out.println(hm);


        PhoneStorage directory = new PhoneStorage();
        directory.add("biba", "8800535353");
        directory.add("kuka", "88002000600");
        directory.add("boba", "89176661313");
        directory.add("abobo", "8913455672");
        directory.add("boba", "899999999");
        directory.add("biba", "899111111");
        directory.add("G-gurda", "89923231999");
        directory.add("kluv", "88888888888");
        directory.add("maloi", "86661366613");

        System.out.println(directory.get("biba"));
        System.out.println(directory.get("boba"));
        System.out.println(directory.get("G-gurda"));
        System.out.println(directory.get("maloi"));
    }
}

