package lesson_3;

// Класс "Сотрудник"
class Worker {
    private String fullName;
    private String position;
    private String email;
    private String phoneNumber;
    private int salary;
    private int age;

    // Конструктор класса
    public Worker(String fullName, String position, String email, String phoneNumber, int salary, int age) {
        this.fullName = fullName;
        this.position = position;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.salary = salary;
        this.age = age;
    }

    // Метод для вывода информации о сотруднике
    public void printInfo() {
        System.out.println("ФИО: " + fullName);
        System.out.println("Должность: " + position);
        System.out.println("Email: " + email);
        System.out.println("Телефон: " + phoneNumber);
        System.out.println("Зарплата: " + salary);
        System.out.println("Возраст: " + age);
        System.out.println();
    }

    // Геттер для возраста
    public int getAge() {
        return age;
    }
}

// Главный класс программы
public class Workers {
    public static void main(String[] args) {
        // Массив из 5 сотрудников
        Worker[] workers = new Worker[5];
        workers[0] = new Worker("Ivanov Ivan", "Frontend developer", "ivivan@mailbox.com", "892312311", 30000, 30);
        workers[1] = new Worker("Petrov Petr", "Backend developer", "petr@mailbox.com", "891112312", 40000, 45);
        workers[2] = new Worker("Denisov Denis", "Manual QA engineer", "den@mailbox.com", "893312313", 35000, 50);
        workers[3] = new Worker("Artemov Artem", "Full stack QA engineer", "artem@mailbox.com", "894412314", 33000, 60);
        workers[4] = new Worker("Borisov Boris", "Project Manager", "borya@mailbox.com", "895512315", 25000, 55);


        // Вывод информации о сотрудниках старше 40 лет
        System.out.println("Информация о сотрудниках старше 40 лет:");
        for (Worker worker : workers) {
            if (worker != null && worker.getAge() > 40) {
                worker.printInfo();
            }
        }
    }
}