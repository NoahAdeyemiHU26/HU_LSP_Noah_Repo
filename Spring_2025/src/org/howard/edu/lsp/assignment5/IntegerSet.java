/**Noah Adeyemi
 * Code is from You.com
 * Link: "https://you.com/search?q=In%20mathematics%2C%20a%20set%20is%20a%C2%A0collection%20of%20elements.%20The%20elements%20that%20make%20up%20a%20set%20can%20be%20any%20kind%20of%20mathematical%20objects%3A%20numbers%2C%20symbols%2C%20points%20in%20space%2C%20lines%2C%20other%20geometrical%20shapes%2C%20variables%2C%20or%20even%20other%20sets.%20The%20set%20with%20no%20element%20is%20the%20empty%20set%3B%20a%20set%20with%20a%20single%20element%20is%20a%20singleton.%20%20Additionally%2C%20a%20set%20cannot%20contain%20duplicates.%20%20Your%20task%20is%20to%0Aimplement%20a%20class%2C%20IntegerSet%2C%20that%20contains%20only%20integers%2C%20given%20the%20specification%20below.%20%0A%0ANote%3A%20You%20are%20not%20allowed%20to%20change%20anything%20below%20%0A%0Apublic%20class%20IntegerSet%20%20%7B%0A%09%2F%2F%20Store%20the%20set%20elements%20in%20an%20ArrayList.%0A%09private%20List%3CInteger%3E%20set%20%3D%20new%20ArrayList%3CInteger%3E()%3B%0A%0A%09%2F%2F%20Default%20Constructor%0A%09public%20IntegerSet()%20%7B%0A%09%7D%0A%0A%09%2F%2F%20Constructor%20if%20you%20want%20to%20pass%20in%20already%20initialized%0A%09public%20IntegerSet(ArrayList%3CInteger%3E%20set)%20%7B%0A%09%09this.set%20%3D%20set%3B%0A%09%7D%0A%0A%09%2F%2F%20Clears%20the%20internal%20representation%20of%20the%20set.%205%20pts.%0Apublic%20void%20clear()%20%7B%E2%80%A6%7D%3B%0A%0A%2F%2F%20Returns%20the%20length%20of%20the%20set.%205%20pts.%0Apublic%20int%20length()%20%7B%E2%80%A6%7D%3B%20%2F%2F%20returns%20the%20length%0A%0A%2F*%0A%20%20%20%20%20%20%20%20%20%20%20%20%20%20*%20Returns%20true%20if%20the%202%20sets%20are%20equal%2C%20false%20otherwise%3B%0A%20*%20Two%20sets%20are%20equal%20if%20they%20contain%20all%20of%20the%20same%20values%20in%20ANY%20order.%20%20This%20overrides%0A%20*%20the%20equal%20method%20from%20the%20Object%20class.%2010%20pts.%0A*%2F%0Apublic%20boolean%20equals(Object%20o)%20%7B%E2%80%A6%7D%3B%20%0A%0A%2F%2F%20Returns%20true%20if%20the%20set%20contains%20the%20value%2C%20otherwise%20false.%205%20pts.%0Apublic%20boolean%20contains(int%20value)%20%7B%E2%80%A6%7D%3B%20%20%20%20%0A%2F%2F%20Returns%20the%20largest%20item%20in%20the%20set.%205%20pts.%0Apublic%20int%20largest()%20%20%7B%E2%80%A6%7D%3B%20%0A%0A%2F%2F%20Returns%20the%20smallest%20item%20in%20the%20set.%205%20pts.%0Apublic%20int%20smallest()%20%20%7B%E2%80%A6%7D%3B%0A%0A%09%2F%2F%20Adds%20an%20item%20to%20the%20set%20or%20does%20nothing%20it%20already%20there.%205%20pts.%09%0A%20%09public%20void%20add(int%20item)%20%7B%E2%80%A6%7D%3B%20%2F%2F%20adds%20item%20to%20the%20set%20or%20does%20nothing%20if%20it%20is%20in%20set%0A%0A%09%2F%2F%20Removes%20an%20item%20from%20the%20set%20or%20does%20nothing%20if%20not%20there.%205%20pts.%0Apublic%20void%20remove(int%20item)%20%7B%E2%80%A6%7D%3B%20%0A%0A%2F%2F%20Set%20union.%2011%20pts.%0Apublic%20void%20union(IntegerSet%20intSetb)%20%7B%E2%80%A6%7D%3B%0A%0A%2F%2F%20Set%20intersection%2C%20all%20elements%20in%20s1%20and%20s2.%2012%20pts.%0Apublic%20void%20intersect(IntegerSet%20intSetb)%20%7B%E2%80%A6%7D%3B%20%0A%0A%2F%2F%20Set%20difference%2C%20i.e.%2C%20s1%20%E2%80%93s2.%2012%20pts.%0Apublic%20void%20diff(IntegerSet%20intSetb)%3B%20%2F%2F%20set%20difference%2C%20i.e.%20s1%20-%20s2%0A%0A%2F%2F%20Set%20complement%2C%20all%20elements%20not%20in%20s1.%2011%20pts.%0Apublic%20void%20complement(IntegerSet%20intSetb)%20%7B%20%E2%80%A6%7D%0A%0A%2F%2F%20Returns%20true%20if%20the%20set%20is%20empty%2C%20false%20otherwise.%205%20pts.%0Aboolean%20isEmpty()%3B%20%0A%0A%2F%2F%20Return%20String%20representation%20of%20your%20set.%20%20This%20overrides%20the%20equal%20method%20from%20%0A%2F%2F%20the%20Object%20class.%205%20pts.%0Apublic%20String%20toString()%20%7B%E2%80%A6%7D%3B%09%2F%2F%20return%20String%20representation%20of%20your%20set%0A%7D&fromSearchBar=true&tbm=youchat"
 */

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
public class IntegerSet {
    // Store the set elements in an ArrayList.
    private List<Integer> set = new ArrayList<>();

    // Default Constructor
    public IntegerSet() {
    }

    // Constructor if you want to pass in already initialized
    public IntegerSet(ArrayList<Integer> set) {
        for (int item : set) {
            if (!this.set.contains(item)) {
                this.set.add(item); // Ensure no duplicates
            }
        }
    }

    // Clears the internal representation of the set. 5 pts.

    /**
     * @ Clears the set
     */
    public void clear() {
        set.clear();
    }

    /**
     *
     * @return length of set
     */
// Returns the length of the set. 5 pts.
    public int length() {
        return set.size();
    }

    /*
     * Returns true if the 2 sets are equal, false otherwise;
     * Two sets are equal if they contain all of the same values in ANY order. 10 pts.
     */

    /**
     *
     * @param Object o
     * @return true if 2 sets are equal, else, returns false (True= Must have allof the same values IN ANY ORDER)
     */
    @Override
    public boolean equals(Object o) {
        if (o == this) return true;
        if (!(o instanceof IntegerSet)) return false;
        IntegerSet otherSet = (IntegerSet) o;
        return set.containsAll(otherSet.set) && otherSet.set.containsAll(set);
    }

    // Returns true if the set contains the value, otherwise false. 5 pts.

    /**
     *
     * @param value
     * @return True if set has value, else false
     */
    public boolean contains(int value) {
        return set.contains(value);
    }

    // Returns the largest item in the set. 5 pts.

    /**
     *
     * @return largest item in set
     */
    public int largest() {
        if (set.isEmpty()) {
            throw new IllegalStateException("Set is empty");
        }
        return Collections.max(set);
    }

    // Returns the smallest item in the set. 5 pts.

    /**
     *
     * @return smallest integer in set
     */
    public int smallest() {
        if (set.isEmpty()) {
            throw new IllegalStateException("Set is empty");
        }
        return Collections.min(set);
    }

    // Adds an item to the set or does nothing if already there. 5 pts.

    /**
     *
     * @param item
     * If item isn't present, adds item to list, else does nothing
     */
    public void add(int item) {
        if (!set.contains(item)) {
            set.add(item);
        }
    }

    // Removes an item from the set or does nothing if not there. 5 pts.

    /**
     *
     * Remove 1 item from set. If missing, nothing occurs
     * @param item
     */
    public void remove(int item) {
        set.remove((Integer) item);
    }

    // Set union. 11 pts.

    /**
     * Creates union
     * @param intSetb
     */
    public void union(IntegerSet intSetb) {
        for (int item : intSetb.set) {
            if (!set.contains(item)) {
                set.add(item);
            }
        }
    }

    // Set intersection, all elements in s1 and s2. 12 pts.

    /**
     * Sets intersection for all elements in s1 & s2
     * @param intSetb
     */
    public void intersect(IntegerSet intSetb) {
        set.removeIf(item -> !intSetb.set.contains(item));
    }

    // Set difference, i.e., s1 – s2. 12 pts.

    /**
     * Sets difference
     * @param intSetb
     */
    public void diff(IntegerSet intSetb) {
        set.removeIf(intSetb.set::contains);
    }

    // Set complement, all elements not in s1. 11 pts.

    /**
     * Sets complement for all elements not in s1
     * @param intSetb
     */
    public void complement(IntegerSet intSetb) {
        List<Integer> complementSet = new ArrayList<>();
        for (int item : intSetb.set) {
            if (!set.contains(item)) {
                complementSet.add(item);
            }
        }
        set = complementSet;
    }

    // Returns true if the set is empty, false otherwise. 5 pts.

    /**
     *
     * @return true if set is empty, otherwise, return false
     */
    public boolean isEmpty() {
        return set.isEmpty();
    }

    // Return String representation of your set. 5 pts.

    /**
     *
     * @return The sett, but as a string
     */
    @Override
    public String toString() {
        return set.toString();
    }
}
