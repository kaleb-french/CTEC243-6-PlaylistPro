# Journal
Write your Journal questions and notes here.

Phase 1-
We set up the linkedList created a few items to store in nodes and displayed that info back to confirm. A linkedList stores information in nodes that have a link reference chain from first all the way to the last item in the list, an array stores data in a sequncial memory block reserved by the size at creation, arrays are indexable can be accessed as so, linked lists have to be traversed in order to find the data.

Phase 2-
My version checks to see if its in first and the only one and removes the references, then checks if its first and has a link then changes the first to the link, then finall steps through the rest one by one checking for the previous returned song as then, then takes the found spot as now and takes then.setLink() and sets it to now.getLink() to remove that reference. It keeps the current pointer by doing this to the object before the pointer in the linked list.

Phase 3-
The Array takes O(1) to traverse replace and O(N) move the items to accommodate. The LinkList take O(N) Taversal time and another bit of O(1) to replace the link references. With this comparison I believe it's kind of a wash between the two.

Phase 4-
Having a second list that is sorted allows you to sort on demand when needed instead of maintaining one sorted list, in this way you can sort in different ways having multiple lists each sorted a different way. It allows you to add and remove sorting styles from the code without modifing the base list class.
