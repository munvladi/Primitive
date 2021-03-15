import java.sql.PreparedStatement;

public class Task2419 {
    public static void main(String[] args) {
        String[] roles = {"Городничий", "Аммос Федорович", "Артемий Филиппович", "Лука Лукич", "Лука", "Чувак без слов"};
        String[] testLines = {"Городничий: ну ничеси задание какое",
                "Аммос Федорович: меня к этому жизнь не готовила",
                "Артемий Филиппович: а че ты хотел вон Лука: он вообще немой",
                "Лука Лукич: вот так и живем",
                "Аммос Федорович: ну ладно прорвемся",
                "Артемий Филиппович: я тебе прорвусь - для этого туалет есть",
                "Лука: эээээ"};

        System.out.println(printTextPerRole(roles, testLines));

    }

    public static String printTextPerRole(String[] roles, String[] textLines) {

        StringBuilder output = new StringBuilder();
        int noOfRoles = roles.length;
        int noOfLines = textLines.length;
        int a = 0;
        int b = 0;

        while (a < noOfRoles) {
            output.append(roles[a] + ":\n");

            while (b < noOfLines) {
                if (textLines[b].startsWith(roles[a])) {
                    textLines[b] = textLines[b].substring(textLines[b].indexOf(":")+1);
                    textLines[b] = String.valueOf(b + 1).concat(")").concat(textLines[b]);
                    output.append(textLines[b]).append("\n");
                }
                b++;
            }
            output.append("\n");
            a++;
            b = 0;
        }

        String result = new String(output);

        return result;
    }
}
