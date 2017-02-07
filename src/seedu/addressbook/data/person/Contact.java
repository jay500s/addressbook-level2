package seedu.addressbook.data.person;

abstract public class Contact {

    public String value;
    public boolean isPrivate;

    
    public String toString() {
        return this.value;
    }
    
    public boolean isPrivate() {
        return isPrivate;
    }
    
    public int hashCode() {
        return value.hashCode();
    }
    
    abstract public boolean equals(Object other);

}
