class Solution {
    public int countGoodRectangles(int[][] rectangles) 
    {
        int temp = 0;
        int counter = 0;
        int lesserOfRecs = 0;
        for(int i = 0; i < rectangles.length; i++){
            lesserOfRecs = (rectangles[i][0] < rectangles[i][1] ? rectangles[i][0] : rectangles[i][1]);
            if(lesserOfRecs  > temp){
                System.out.print("Temp assigned from "+temp);
                temp = lesserOfRecs;
                System.out.print(" to "+temp+"\n");
                counter = 1;
            }else if(temp == lesserOfRecs)
                counter++;
        }
        return counter;
    }
}