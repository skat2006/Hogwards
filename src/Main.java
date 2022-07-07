public class Main {
    public static void main(String[] args) {
        Griffindor[] griffindors = {
                new Griffindor("Гарри Поттер", 77, 56, 15,89,100),
                new Griffindor("Гермиона Грейнджер", 99, 98,97,96,95),
                new Griffindor("Рон Уизли", 88,14,48,91,23),
        };

        Slizerin[] slizerins = {
                new Slizerin("Драко Малфой", 66, 44,55,33,76,93),
                new Slizerin("Грэхэм Монтегю", 44,34,52, 57,66,57),
                new Slizerin("Грегори Гойл",73,67,48,69,54,44),
        };

        Puffenduy[] puffenduys = {
                new Puffenduy("Захария Смит", 66, 44,55,33,76),
                new Puffenduy("Седрик Диггори", 88,14,48,91,23),
                new Puffenduy("Джастин Финч-Флетчли",73,67,48,69,54),
        };

        Kogtevran[] kogtevrans = {
                new Kogtevran("Чжоу Чанг", 44,34,52, 57,66,57),
                new Kogtevran("Падма Патил", 77, 56, 15,89,49,88),
                new Kogtevran("Маркус Белби", 75,64,98,35,94,55),
        };

        for (int i = 0; i < griffindors.length; i++) {
            System.out.println(griffindors[i]);
        }

        System.out.println(griffindors[2].compare(puffenduys[0]));
    }

}