import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Directory {

    protected Map<String, Set<String>> directoryPersonNumbers;

    public Directory() {
        directoryPersonNumbers = new HashMap<>();
    }

    public Set<String> getPhones(String surname) {
        Set<String> phones = directoryPersonNumbers.getOrDefault(surname, new HashSet<>());
        if (phones.isEmpty()) {
            directoryPersonNumbers.put (surname, phones);
        }
        return phones;
    }

    public void addPerson (String surname, String phoneNumber) {
        Set<String> phones = getPhones(surname);
        phones.add(phoneNumber);

    }

    public Set<String> get(String surname) {
        return getPhones(surname);
    }

    public Set<String> getAllSurnames() {
        return directoryPersonNumbers.keySet();
    }



}
