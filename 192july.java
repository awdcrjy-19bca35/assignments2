// geeks for geeks program // date: 19 july 2021 // https://practice.geeksforgeeks.org/problems/java-hashmap1033/1#
class Solution{
    static int map(int n, String keys[], int arr[], String s)
    {
        // code here
        HashMap <String,Integer> map = new HashMap<String,Integer>();
        for(int i=0; i<keys.length; i++)
        {
            map.put(keys[i], arr[i]);
        }
        if(map.containsKey(s))
        {
             return map.get(s);
        }
        return -1;
    }
}
// output:
Compilation Successful 
For Input:
3
sak 5 varun 7 vijay 3
sak

Your Output is: 
5

  // output foor custom input
  Compilation Successful 
For Input:
4
gyt 3 swa 4 mtu 5 hello 9
sad


Your Output is: 
-1
