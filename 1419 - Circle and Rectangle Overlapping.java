// Circle and Rectangle Overlapping

class Solution {
    public boolean checkOverlap(int radius, int xCenter, int yCenter, int x1, int y1, int x2, int y2) {
        int nearx = Math.max(x1, Math.min(xCenter, x2));
        int neary = Math.max(y1, Math.min(yCenter, y2));

        return distance(xCenter, yCenter, nearx, neary) <= radius*radius ;
    }
    public double distance(int x1, int y1, int x2, int y2){
        return Math.pow((x1-x2), 2)+Math.pow((y1-y2), 2);
    }
}
