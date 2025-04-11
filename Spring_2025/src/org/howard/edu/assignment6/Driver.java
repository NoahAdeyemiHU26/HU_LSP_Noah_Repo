/**Noah Adeyemi
 * Code is from You.com
 * Link: "https://you.com/search?q=In%20mathematics%2C%20a%20set%20is%20a%C2%A0collection%20of%20elements.%20The%20elements%20that%20make%20up%20a%20set%20can%20be%20any%20kind%20of%20mathematical%20objects%3A%20numbers%2C%20symbols%2C%20points%20in%20space%2C%20lines%2C%20other%20geometrical%20shapes%2C%20variables%2C%20or%20even%20other%20sets.%20The%20set%20with%20no%20element%20is%20the%20empty%20set%3B%20a%20set%20with%20a%20single%20element%20is%20a%20singleton.%20%20Additionally%2C%20a%20set%20cannot%20contain%20duplicates.%20%20Your%20task%20is%20to%0Aimplement%20a%20class%2C%20IntegerSet%2C%20that%20contains%20only%20integers%2C%20given%20the%20specification%20below.%20%0A%0ANote%3A%20You%20are%20not%20allowed%20to%20change%20anything%20below%20%0A%0Apublic%20class%20IntegerSet%20%20%7B%0A%09%2F%2F%20Store%20the%20set%20elements%20in%20an%20ArrayList.%0A%09private%20List%3CInteger%3E%20set%20%3D%20new%20ArrayList%3CInteger%3E()%3B%0A%0A%09%2F%2F%20Default%20Constructor%0A%09public%20IntegerSet()%20%7B%0A%09%7D%0A%0A%09%2F%2F%20Constructor%20if%20you%20want%20to%20pass%20in%20already%20initialized%0A%09public%20IntegerSet(ArrayList%3CInteger%3E%20set)%20%7B%0A%09%09this.set%20%3D%20set%3B%0A%09%7D%0A%0A%09%2F%2F%20Clears%20the%20internal%20representation%20of%20the%20set.%205%20pts.%0Apublic%20void%20clear()%20%7B%E2%80%A6%7D%3B%0A%0A%2F%2F%20Returns%20the%20length%20of%20the%20set.%205%20pts.%0Apublic%20int%20length()%20%7B%E2%80%A6%7D%3B%20%2F%2F%20returns%20the%20length%0A%0A%2F*%0A%20%20%20%20%20%20%20%20%20%20%20%20%20%20*%20Returns%20true%20if%20the%202%20sets%20are%20equal%2C%20false%20otherwise%3B%0A%20*%20Two%20sets%20are%20equal%20if%20they%20contain%20all%20of%20the%20same%20values%20in%20ANY%20order.%20%20This%20overrides%0A%20*%20the%20equal%20method%20from%20the%20Object%20class.%2010%20pts.%0A*%2F%0Apublic%20boolean%20equals(Object%20o)%20%7B%E2%80%A6%7D%3B%20%0A%0A%2F%2F%20Returns%20true%20if%20the%20set%20contains%20the%20value%2C%20otherwise%20false.%205%20pts.%0Apublic%20boolean%20contains(int%20value)%20%7B%E2%80%A6%7D%3B%20%20%20%20%0A%2F%2F%20Returns%20the%20largest%20item%20in%20the%20set.%205%20pts.%0Apublic%20int%20largest()%20%20%7B%E2%80%A6%7D%3B%20%0A%0A%2F%2F%20Returns%20the%20smallest%20item%20in%20the%20set.%205%20pts.%0Apublic%20int%20smallest()%20%20%7B%E2%80%A6%7D%3B%0A%0A%09%2F%2F%20Adds%20an%20item%20to%20the%20set%20or%20does%20nothing%20it%20already%20there.%205%20pts.%09%0A%20%09public%20void%20add(int%20item)%20%7B%E2%80%A6%7D%3B%20%2F%2F%20adds%20item%20to%20the%20set%20or%20does%20nothing%20if%20it%20is%20in%20set%0A%0A%09%2F%2F%20Removes%20an%20item%20from%20the%20set%20or%20does%20nothing%20if%20not%20there.%205%20pts.%0Apublic%20void%20remove(int%20item)%20%7B%E2%80%A6%7D%3B%20%0A%0A%2F%2F%20Set%20union.%2011%20pts.%0Apublic%20void%20union(IntegerSet%20intSetb)%20%7B%E2%80%A6%7D%3B%0A%0A%2F%2F%20Set%20intersection%2C%20all%20elements%20in%20s1%20and%20s2.%2012%20pts.%0Apublic%20void%20intersect(IntegerSet%20intSetb)%20%7B%E2%80%A6%7D%3B%20%0A%0A%2F%2F%20Set%20difference%2C%20i.e.%2C%20s1%20%E2%80%93s2.%2012%20pts.%0Apublic%20void%20diff(IntegerSet%20intSetb)%3B%20%2F%2F%20set%20difference%2C%20i.e.%20s1%20-%20s2%0A%0A%2F%2F%20Set%20complement%2C%20all%20elements%20not%20in%20s1.%2011%20pts.%0Apublic%20void%20complement(IntegerSet%20intSetb)%20%7B%20%E2%80%A6%7D%0A%0A%2F%2F%20Returns%20true%20if%20the%20set%20is%20empty%2C%20false%20otherwise.%205%20pts.%0Aboolean%20isEmpty()%3B%20%0A%0A%2F%2F%20Return%20String%20representation%20of%20your%20set.%20%20This%20overrides%20the%20equal%20method%20from%20%0A%2F%2F%20the%20Object%20class.%205%20pts.%0Apublic%20String%20toString()%20%7B%E2%80%A6%7D%3B%09%2F%2F%20return%20String%20representation%20of%20your%20set%0A%7D&fromSearchBar=true&tbm=youchat"
 */

import java.util.ArrayList;
public class Driver {
    public static void main(String[] args) {
        // Test case 1: Creating and adding elements to IntegerSet
        IntegerSet set1 = new IntegerSet();
        set1.add(1);
        set1.add(2);
        set1.add(3);

        System.out.println("Value of Set1 is: " + set1.toString());

        // Test smallest and largest
        System.out.println("Smallest value in Set1 is: " + set1.smallest());
        System.out.println("Largest value in Set1 is: " + set1.largest());

        // Test case 2: Creating another IntegerSet
        IntegerSet set2 = new IntegerSet();
        set2.add(3);
        set2.add(4);
        set2.add(5);

        System.out.println("Value of Set2 is: " + set2.toString());

        // Test union of set1 and set2
        System.out.println("Union of Set1 and Set2");
        System.out.println("Value of Set1 is: " + set1.toString());
        System.out.println("Value of Set2 is: " + set2.toString());
        set1.union(set2);
        System.out.println("Result of union of Set1 and Set2: " + set1.toString());

        // Test intersection
        IntegerSet set3 = new IntegerSet();
        set3.add(2);
        set3.add(3);
        System.out.println("Value of Set3 is: " + set3.toString());
        set1.intersect(set3);
        System.out.println("Result of intersection of Set1 and Set3: " + set1.toString());

        // Test difference
        IntegerSet set4 = new IntegerSet();
        set4.add(1);
        set4.add(4);
        System.out.println("Value of Set4 is: " + set4.toString());
        set1.diff(set4);
        System.out.println("Result of difference of Set1 and Set4: " + set1.toString());

        // Test complement
        IntegerSet set5 = new IntegerSet();
        set5.add(1);
        set5.add(2);
        set5.add(3);
        set5.add(4);
        set5.add(5);
        System.out.println("Value of Set5 is: " + set5.toString());
        set1.complement(set5);
        System.out.println("Result of complement of Set1 with Set5: " + set1.toString());

        // Test clear
        set1.clear();
        System.out.println("Value of Set1 after clearing: " + set1.toString());
        System.out.println("Is Set1 empty? " + set1.isEmpty());
    }
}
