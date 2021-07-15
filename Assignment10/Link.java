package Assignment10;

public class Link<E> 
{
    E value;
    Link<E> next;
    Link(E value, Link<E> next)
    {
        this.value=value;
        this.next=next;
    }
    Link(E value)
    {
        this(value,null);
    }
    public String toString()
    {
        if(value==null)
        {
            return null;
        }

        return value.toString();
    }
}
