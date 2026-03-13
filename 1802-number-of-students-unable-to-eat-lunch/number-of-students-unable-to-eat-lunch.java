class Solution {
    public int countStudents(int[] students, int[] sandwiches) {
        Stack<Integer> st = new Stack<>();
        Queue<Integer> q = new LinkedList<>();
        for(int i=0;i<students.length;i++)
        {
            q.add(students[i]);
        }
        for(int j=sandwiches.length-1;j>=0;j--)
        {
            st.push(sandwiches[j]);
        }
        int count = 0;
        while(!q.isEmpty() && count < q.size())
        {
            if(st.peek() == q.peek())
            {
                q.poll();
                st.pop();
                count = 0;
            }
            else
            {
                int back = q.poll();
                q.add(back);
                count++;
            }
        }
        return q.size();
    }
}