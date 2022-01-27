package Lesson_8_Strings;

/*1. Ввести с консоли строку. Показать номера символов, совпадающих с последним символом строки.
        2. Ввести n строк с консоли. Вывести на консоль те строки, в которых встречается слово cat или dog.
            Подсчитать длину этих строк. Вывести на экран количество строк, которые не соответствуют критерию.
        3. Ввести с консоли строку в программу:
        "На вопрос "Откуда?" - От верблюда! На вопрос "Зачем?" - Затем! На вопрос "Что?"- Цирк Шапито! На вопрос "Как?"- На тебя напал столбняк!"
        Во введенной строке удалить пробелы между вторым и третьим вопросительным знаком.*/

import java.util.ArrayList;
import java.util.Scanner;

public class Lesson_8_Strings {
    public static void main(String[] args) {
        System.out.println("1. Ввести с консоли строку. Показать номера символов, совпадающих с последним символом строки.");
        System.out.println("Enter your string:");
        Scanner scanner = new Scanner(System.in);
        String dasdasds = scanner.nextLine();
        for (int i = 0; i < dasdasds.length(); i++) {
            if (dasdasds.charAt(i) == dasdasds.charAt(dasdasds.length() - 1))
                System.out.print(i + 1 + " ");
        }

        System.out.println("\n\n2. Ввести n строк с консоли. Вывести на консоль те строки, в которых встречается слово cat или dog.\n" +
                "Подсчитать длину этих строк. Вывести на экран количество строк, которые не соответствуют критерию.");
        System.out.println("Enter your strings. For exit - enter '-1'");
        ArrayList<String> arrayList = new ArrayList<>();
        int counter = 0;
        do{
            arrayList.add(counter, scanner.nextLine());
            counter++;
        }while (!arrayList.get(counter - 1).equals("-1"));
        arrayList.remove(counter - 1);
        System.out.println("Строки, содержащие слова cat и dog и их длина:");
        counter = 0;
        for (String s: arrayList){
            if (s.contains("cat") || s.contains("dog")) {
                System.out.println(s + "\tдлина этой строки " + s.length() + " символов");
                counter++;
            }
        }
        System.out.println((arrayList.size() - counter) + " строк не содержат слов cat или dog");

        System.out.println("\n\n3. Ввести с консоли строку в программу:\n" +
                "        \"На вопрос \"Откуда?\" - От верблюда! На вопрос \"Зачем?\" - Затем! На вопрос \"Что?\"- Цирк Шапито! На вопрос \"Как?\"- На тебя напал столбняк!\"\n" +
                "        Во введенной строке удалить пробелы между вторым и третьим вопросительным знаком.");
        System.out.println("Enter our string:");
        int secondIndex = 0, thirdIndex = 0;
        counter = 0;
        StringBuilder ourSubString = new StringBuilder();
        StringBuilder ourString = new StringBuilder(scanner.nextLine());
        for (int i = 0; i < ourString.length(); i++) {
            if (ourString.charAt(i) == '?') {
                counter++;
                if (counter == 2) secondIndex = i;
                if (counter == 3) thirdIndex = i;
            }
            if (counter == 2 && ourString.charAt(i) != ' '){
                ourSubString.append(ourString.charAt(i));
            }
        }
        ourString.delete(secondIndex, thirdIndex);
        ourString.insert(secondIndex, ourSubString);
        System.out.println(ourString);
    }
}
