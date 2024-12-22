package com.siham;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PersonTest {

    @Test
    public void testPersonSorting() {
        // Création d'une liste de personnes avec des noms modifiés
        List<Person> people = new ArrayList<>();
        people.add(new Person("Wazani", "Siham"));
        people.add(new Person("Said", "Meryem"));
        people.add(new Person("Brrani", "Fatimazahra"));

        // Tri de la liste
        Collections.sort(people);

        // Vérification de l'ordre attendu
        assertEquals("Said, Meryem", people.get(0).toString());
        assertEquals("Wazani, Siham", people.get(1).toString());
        assertEquals("Brrani, Fatimazahra", people.get(2).toString());
    }
}