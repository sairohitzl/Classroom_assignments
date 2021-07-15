package Assignment10;

class SList<E>
{
    private Link<E> head=new Link<E>(null);
    SListIterator<E> iterator()
    {
        return new SListIterator<E>(head);
    }
    public String toString()
    {
        if(head.next==null)
        {
            return "sll: {}";
        }
        System.out.println("sll: { ");
        SListIterator<E> iter = this.iterator();
        StringBuilder sb=new StringBuilder();
        while(iter.hasNext())
        {
            if(!iter.hasNext())
            {
                sb.append("");
            }
            else
            {
                sb.append(","+iter.next());
            }
        }
        sb.append(" }");

        return sb.toString();
    }
}
