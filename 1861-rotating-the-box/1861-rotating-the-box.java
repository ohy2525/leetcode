class Solution {
    public char[][] rotateTheBox(char[][] box) {
        int row = box.length;
        int col = box[0].length;

        char[][] answer = new char[col][row];
        for (int i = row - 1; i >= 0; i--) {
            for (int j = col - 2; j >= 0; j--) {
                int y = j;
                while (y < col - 1 && box[i][y] == '#' && box[i][y + 1] == '.') {
                    box[i][y + 1] = '#';
                    box[i][y] = '.';
                    y++;
                }
            }
        }
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                answer[j][row - 1 - i] = box[i][j];
            }
        }

        return answer;
    }
}