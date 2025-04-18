import java.util.*;
class Solution {
    public int maxArea(int[] height) {
        int maxarea=0;
        int i=0,j=height.length-1;
        while(i<j)
        {
            int width=j-i;
            int ht=Math.min(height[i],height[j]);
            int area=width*ht;
            maxarea=Math.max(maxarea,area);
            if(height[i]<height[j])
            {
                i++;
            }
            else
            {
                j--;
            }
        }
        return maxarea;
        
    }
}
