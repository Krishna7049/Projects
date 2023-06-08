import java.util.Scanner;

public class Tic_Tac_Toe {
    public static void printboard(char [][] board)
    {
        for (int row = 0;row<board.length;row++)
        {
            for (int col = 0;col<board[row].length;col++)
            {
                System.out.print(board[row][col] + " | ");
            }
            System.out.println();
        }
    }
    public static boolean haveWon(char [][] board, char Player)
    {
        for (int row = 0;row<board.length;row++)
        {
            if (board[row][0] == Player && board[row][1] == Player && board[row][2] == Player)
            {
                return true;
            }
        }
        for (int col = 0;col<board.length;col++)
        {
            if (board[0][col] == Player && board[1][col] == Player && board[2][col] == Player)
            {
                return true;
            }
        }
        if (board[0][0] == Player && board[1][1] == Player && board[2][2] == Player)
        {
            return true;
        }
        if (board[2][0] == Player && board[1][1] == Player && board[0][2] == Player)
        {
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        char [][] board = new char[3][3];
        for (int row = 0;row<board.length;row++)
        {
            for (int col = 0;col<board[row].length;col++)
            {
                board[row][col] = ' ';
            }
        }
        char Player = 'X';
        boolean gameOver = false;
        Scanner SC = new Scanner(System.in);
        while (!gameOver)
        {
            printboard(board);
            System.out.println("Player->" + Player + " Enter:");
            System.out.print("Row:");
            int row = SC.nextInt();
            System.out.print("Column:");
            int col = SC.nextInt();
            if (board[row][col] == ' ')
            {
                board[row][col] = Player;
                gameOver =  haveWon(board, Player);
                if (gameOver)
                {
                    System.out.println("Player" + Player+" Has Won");
                }
                else
                {
                    if (Player == 'X')
                    {
                        Player = 'O';
                    }
                    else
                    {
                        Player = 'X';
                    }
                }
            }
            else{
                System.out.println("Invalid Move, Try Again");
            }

        }
        printboard(board);
    }
}
