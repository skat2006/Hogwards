public class Main {
    public static void main(String[] args) {
        GriffindorStudent[] griffindorStudents = {
                new GriffindorStudent("Гарри Поттер", 77, 56, 15,89,100),
                new GriffindorStudent("Гермиона Грейнджер", 99, 98,97,96,95),
                new GriffindorStudent("Рон Уизли", 88,14,48,91,23),
        };

        SlizerinStudent[] slizerinStudents = {
                new SlizerinStudent("Драко Малфой", 66, 44,55,33,76,93),
                new SlizerinStudent("Грэхэм Монтегю", 44,34,52, 57,66,57),
                new SlizerinStudent("Грегори Гойл",73,67,48,69,54,44),
        };

        PuffenduyStudent[] puffenduyStudents = {
                new PuffenduyStudent("Захария Смит", 66, 44,55,33,76),
                new PuffenduyStudent("Седрик Диггори", 88,14,48,91,23),
                new PuffenduyStudent("Джастин Финч-Флетчли",73,67,48,69,54),
        };

        KogtevranStudent[] kogtevranStudents = {
                new KogtevranStudent("Чжоу Чанг", 44,34,52, 57,66,57),
                new KogtevranStudent("Падма Патил", 77, 56, 15,89,49,88),
                new KogtevranStudent("Маркус Белби", 75,64,98,35,94,55),
        };

        for (GriffindorStudent griffindorStudent : griffindorStudents) {
            griffindorStudent.getStudentInfo();
        }
        System.out.println();

        System.out.println(griffindorStudents[2].compare(griffindorStudents[0]));
        System.out.println(slizerinStudents[0].compare(slizerinStudents[1]));
        System.out.println(puffenduyStudents[1].compare(puffenduyStudents[2]));
        System.out.println(kogtevranStudents[0].compare(kogtevranStudents[2]));
        System.out.println();
        System.out.println(griffindorStudents[0].compare(slizerinStudents[0]));
    }

}