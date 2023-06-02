
public class Account {

    private final String name;

    public Account(String name) {
        this.name = name;
    }

    public boolean checkNameToEmboss() {
        /*
             Этот метод должен проверять, что сохранённая через конструктор строка соответствует требованиям.
             Если строка удовлетворяет условиям, метод возвращает true, иначе — false.
         */
        int count = 0;
        for (int i = 0; i < name.length(); i++) {
            String symbol = String.valueOf(name.charAt(i));
            if (symbol.equals(" ")) {
                count++;
            }
            if (count >= 2) {
                return false;
            }
        }
        if (name.length() >= 3 && name.length() <= 19 && !name.endsWith(" ") && !name.startsWith(" ") && name.contains(" ")) {
            return true;
        }

        return false;
    }
}