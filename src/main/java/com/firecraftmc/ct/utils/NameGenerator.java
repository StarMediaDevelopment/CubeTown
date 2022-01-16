package com.firecraftmc.ct.utils;

import com.firecraftmc.ct.enums.Gender;
import com.starmediadev.utils.helper.StringHelper;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class NameGenerator {
    
    public static final String[] MALE_FIRST_NAMES, FEMALE_FIRST_NAMES, LAST_NAMES;
    
    static {
        List<String> names = new LinkedList<>();
        try (InputStream inputStream = NameGenerator.class.getResourceAsStream("/malefirstnames.txt"); BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream))) {
            String line;
            while ((line = reader.readLine()) != null) {
                names.add(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        MALE_FIRST_NAMES = new String[names.size()];
        for (int i = 0; i < MALE_FIRST_NAMES.length; i++) {
            MALE_FIRST_NAMES[i] = names.get(i);
        }
        names.clear();
        try (InputStream inputStream = NameGenerator.class.getResourceAsStream("/femalefirstnames.txt"); BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream))) {
            String line;
            while ((line = reader.readLine()) != null) {
                names.add(line);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        FEMALE_FIRST_NAMES = new String[names.size()];
        for (int i = 0; i < FEMALE_FIRST_NAMES.length; i++) {
            FEMALE_FIRST_NAMES[i] = names.get(i);
        }
        names.clear();
        try (InputStream inputStream = NameGenerator.class.getResourceAsStream("/lastnames.txt"); BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream))) {
            String line;
            while ((line = reader.readLine()) != null) {
                names.add(line);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        LAST_NAMES = new String[names.size()];
        for (int i = 0; i < LAST_NAMES.length; i++) {
            LAST_NAMES[i] = names.get(i);
        }
    }
    
    public static String generateRandomName(Gender gender) {
        String firstName, lastName;
        lastName = LAST_NAMES[new Random().nextInt(LAST_NAMES.length)];
        
        if (gender == Gender.UNSPECIFIED) {
            Gender[] randomGenders = {Gender.MALE, Gender.FEMALE};
            gender = randomGenders[new Random().nextInt(randomGenders.length)];
        }
        
        if (gender == Gender.MALE) {
            firstName = MALE_FIRST_NAMES[new Random().nextInt(MALE_FIRST_NAMES.length)];
        } else {
            firstName = FEMALE_FIRST_NAMES[new Random().nextInt(FEMALE_FIRST_NAMES.length)];
        }
        
        return StringHelper.capitalizeEveryWord(firstName + " " + lastName);
    }
}
