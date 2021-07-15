package Assignment10;

public class SListIterator<E> {
    Link<E> curr;
    SListIterator(Link<E> link)
    {
        curr=link;
    }

    public boolean hasNext()
    {
        return curr.next!=null;
    }

    public Link<E> next()
    {
        curr=curr.next;
        return curr;
    }
    public void insert(E e)
    {
        curr.next=new Link<E>(e,curr.next);
        curr=curr.next;
    }
    public void remove(E data)
    {
        Link<E> temp1=curr;
        Link<E> temp2;
        if(curr.value==data)
        {
            curr=curr.next;
            return;
        }
        while(curr.next!=null)
        {
            temp2=curr;
            curr=curr.next;
            if(curr.value==data)
            {
                temp2.next=curr.next;
                curr=temp2.next;
                curr=temp1;
                break;
            }

        }
        }
    }
    


