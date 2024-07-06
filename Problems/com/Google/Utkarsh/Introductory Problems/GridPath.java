package com.Google.Utkarsh;

public class GridPath {

    public static void main(String[] args) {
        String path = "????????????????????????????????????????????????";
        boolean[][] vis = new boolean[7][7];
        long start = System.currentTimeMillis();
        System.out.println(f(0, 0, 0, vis, path));
        System.out.println("Time: " + (System.currentTimeMillis()-start) + "ms");
    }
    

    private static int f(int r, int c, int i, boolean[][] vis, String path) {
        if (r < 0 || r == 7 || c < 0 || c == 7 || vis[r][c]) return 0;
        if (i == path.length()) 
            if (r == 6 && c == 0) return 1;
            else return 0;
        if (r == 6 && c == 0) return 0;
        vis[r][c] = true;
        int count = 0;
        switch (path.charAt(i)) {
            case 'U':
                count = f(r-1, c, i+1, vis, path);
                break;
            case 'D':
                count = f(r+1, c, i+1, vis, path);
                break;
            case 'R':
                count = f(r, c+1, i+1, vis, path);
                break;
            case 'L':
                count = f(r, c-1, i+1, vis, path);
                break;
            default:
                count  += f(r-1, c, i+1, vis, path) // UP
                        + f(r+1, c, i+1, vis, path) // DOWN
                        + f(r, c-1, i+1, vis, path) // LEFT
                        + f(r, c+1, i+1, vis, path); // RIGHT
        }
        vis[r][c] = false;
        return count;
    }
}
