import java.util.*;

public class Practice {
    public int sum_of_integers(List<Integer> numbers) {
        int total=0;
        Iterator<Integer> iterator = numbers.iterator();
        while(iterator.hasNext()){
            total+=iterator.next();
        }
        return total;
    }

    public int sum_of_list_of_lists(List<List<Integer>> numbers) {
        int total=0;
        for(List<Integer> i:numbers){
            for(Integer j:i){
                total+=j;
            }
        }
        return total;
    }

    public int sum_of_integers_from_one_to_hundred() {
        int total=0;
        for(int i=1; i<=100;i++){
            total+=i;
        }
        return total;

    }


    public List<String> filter_all_the_names_starting_with_h(List<String> names) {
        List<String> hNames = new ArrayList<>();
        for(String n:names){
            if(n.toLowerCase().startsWith("h")){
                hNames.add(n);
            }
        }
        return hNames;
    }

    public int find_max(List<Integer> numbers) {
        int max = numbers.get(0);
        for(int i:numbers){
            if(i>max){
                max=i;
            }
        }
        return max;
    }

    public int find_max_in_a_list_of_list(List<List<Integer>> numbers) {
        int max = numbers.get(0).get(0);
        for(List<Integer> i:numbers){
            for(int j:i){
                if(j>max){
                    max=j;
                }
            }
        }
        return max;
    }

    public String find_max_from_strings(List<String> numbers) {
        List<Integer> numInt = new ArrayList<>();
        for(String s:numbers){
            numInt.add(Integer.parseInt(s));
        }
        int max = numInt.get(0);
        for(int i:numInt){
            if(i>max){
                max=i;
            }
        }
        return String.valueOf(max);
    }

    public List<Integer> create_integer_list(int... numbers) {
        List<Integer> intList = new ArrayList<>();
        for(int i:numbers){intList.add(i);}
        return intList;

    }

    public List<String> create_string_list(List<Integer> numbersInt) {
        List<String> strList = new ArrayList<>();
        for(Integer i:numbersInt){strList.add(String.valueOf(i));}
        return  strList;
    }

    public int average_of_integers(List<Integer> numbers) {
        int sum=0;
        for (Integer i:numbers){
            sum+=i;
        }
        return sum/numbers.size();
    }

    public List<Person> sort_by_age(List<Person> persons) {
        Collections.sort(persons, new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                return o1.age>o2.age ? 1 : (o1.age<o2.age) ? -1:0;
            }
        });
        return persons;
    }

    public List<String> get_the_names(List<Person> persons) {
        List<String> names = new ArrayList<>();
        for (Person p:persons){
            names.add(p.name);
        }
        return names;
    }

    public List<Person> make_persons_younger(List<Person> persons, int age) {
        Iterator<Person> iterator = persons.iterator();
        while (iterator.hasNext()){
            iterator.next().age-=age;
        }
        return persons;

    }

    public List<Person> find_younger_than(List<Person> persons, int age) {
        List<Person> newPersons = new ArrayList<>();
        for (Person p:persons){
            if(p.age<age) newPersons.add(p);
        }
        return newPersons;

    }
}
