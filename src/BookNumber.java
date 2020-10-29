import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BookNumber {
    private Map<String, List<String>> bookNumber_hashMap = new HashMap<>();
    private List<String> phone_number_list;

    public void add(String surname, String phone_number) {
        if (bookNumber_hashMap.containsKey(surname)) {
            phone_number_list = bookNumber_hashMap.get(surname);
            phone_number_list.add(phone_number);
            bookNumber_hashMap.put(surname, phone_number_list);
        } else {
            phone_number_list = new ArrayList<>();
            phone_number_list.add(phone_number);
            bookNumber_hashMap.put(surname, phone_number_list);
        }
    }

    public List<String> get(String surname) {
        return bookNumber_hashMap.get(surname);
    }
}
