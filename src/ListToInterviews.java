import java.util.ArrayList;
import java.util.List;

public class ListToInterviews {
    public static void main(String[] args) {
        // Definition
        List<String> names = new ArrayList<>();
        List<Person> personList = new ArrayList<>();
        //Insertion
        names.add("Mart");
        personList.add(new Person("Mart"));
        System.out.println(names);
        System.out.println(personList);
        System.out.println();

        List<String > newUsers = List.of(
                "Toby",
                "Popy",
                "Elf"
        );
        //Insertion many(all)
        names.addAll(newUsers);
        //Insertion on the index
        names.add(3,"Amily");
        System.out.println(names);

        //Insertion - TC: o(1)
        //Insertion man/index - TC : o(n)

        //Remove TC : o(n)
        names.remove("Toby");
        System.out.println(names);
        personList.remove(mart);
        System.out.println(personList);
        //Remove multiple
        personList.removeAll(list.of(new Person("Amily")));
        //Clear
        personList.clear(); //o(1)

        System.out.println(names);
        System.out.println(personList);

        names.contain("Poppy");

    }

    private record Person(String name) {

    }
}
