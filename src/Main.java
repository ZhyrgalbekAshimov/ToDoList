import java.text.ParseException;
import java.util.*;

public class Main {
    public static void main(String[] args) throws ParseException {

        // ***Создание ArrayList и добавление в список необходимых дел***
        ArrayList<ToDo> myToDoList = new ArrayList<>();

        myToDoList.add(new ToDo("Java lesson homeworks", "05-03-2021", "10-03-2021"));
        myToDoList.add(new ToDo("Learn new English words", "18-02-2021", "01-03-2021"));
        myToDoList.add(new ToDo("Send email to old friend", "02-03-2021", "03-08-2021"));
        myToDoList.add(new ToDo("Meet parents in airport", "20-03-2021", "21-03-2021"));


        // ***Пометка завершенного дела как "Завершено"***
        myToDoList.get(1).setStatus(Enums.COMPLETED);


        // ***Распечатка списка дел***
        // перед распечаткой, дела у которых дата меньше чем сегодня статус автоматически меняется на "EXPIRED"
        for (ToDo toDo : myToDoList) {
            if (toDo.getStatus().equals(Enums.OPEN) && toDo.getEndDate().before(new Date())) {
                toDo.setStatus(Enums.EXPIRED);
            }
        }

        // распечатка
        System.out.printf("%-30s %-15s %-14s %-14s %n", "DESCRIPTION", "START DATE", "END DATE", "STATUS");
        System.out.println("----------------------------------------------------------------------");
        for(ToDo order : myToDoList) {
            String desc = order.getDescription();
            String startDate = order.getStartDateStr();
            String endDate = order.getEndDateStr();
            Enums status = order.getStatus();
            System.out.printf("%-30s %-15s %-14s %s %n", desc, startDate, endDate, status);
        }

        }
}

