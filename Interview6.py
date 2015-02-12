reverse the single linklist

class ListNode 
{
   ListNode(Object elem)
   {
     this(elem, null);
   }
   
   ListNode(Object elem, ListNode n)
   {
       elememt = elem;
       next = n;
   }
   
   Object element;
   ListNode next; 
}
 
class LinkList
{
}
      
public reverse(ListNode head) {
  if (head == NULL)
      return;
      
  curNode = head;
  preNode = NULL;
  while (curNode != NULL)
  {
      ListNode nextNode = curNode.next;
      curNode.next = preNode;
      
      preNode = curNode;
  }
}
      curNode = nextNode;
  }
  
  head = preNode;
