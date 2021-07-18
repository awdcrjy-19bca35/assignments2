// leet code problem // date: 18 july 2021
class MyHashSet {
    ArrayList<Integer> a=new ArrayList<Integer>();

    /** Initialize your data structure here. */
    public MyHashSet()
    {

    }

    public void add(int key)
    { 
     if(a.contains(key)==false)
     a.add(key);
    }

    public void remove(int key)
    {
        if(a.contains(key))
        {
        key = a.indexOf (key);
        a.remove (key);
        }
    }

    /** Returns true if this set contains the specified element */
    public boolean contains(int key)
    {
        if(a.contains(key))
        { 
          return true;
        }
        else
        {
         return false;
        }
    }
}

putput:
Your input
["MyHashSet","add","add","contains","contains","add","contains","remove","contains"]
[[],[1],[2],[1],[3],[2],[2],[2],[2]]
Output
[null,null,null,true,false,null,true,null,false]
Expected
[null,null,null,true,false,null,true,null,false]
