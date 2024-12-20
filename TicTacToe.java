import java.util.Scanner;
 public class TicTacToe {
    private int[][] board = new int[3][3];
    
    public void dispalyBoard() {
        for(int i = 0; i <3; i++) {
            for(int j = 0; j <3; j++) {
                System.out.print((board[i][j] == 0? ".": (board[i][j] == 1 ? "x" : "0")) + "");
        }
        System.out.println();
        }
    }

    public boolean makeMove(int player, int row, int col) {
        if(board[row][col] == 0) {
            board[row][col] = player;
            return true;
        }
        return false;
    }

    public boolean checkWin(int player) {
        for(int i = 0; i < 3; i++) {
            if((board [i][0] == player && board[i][1] == player && board[i][2] == player) || (board [i][0] == player && board[1][i] == player && board[2][i] == player) );
            return true;
        }
        return (board [0][0] == player && board[1][1] == player && board[2][2] == player) || (board [0][2] == player && board[1][1] == player && board[2][0] == player);

    }

    public boolean isDrawn() {
        for(int i = 0; i <3; i++) {
            for(int j = 0; j <3; j++) {
                if(board[i][j] == 0) return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        TicTacToe game = new TicTacToe();
        Scanner scanner = new Scanner(System.in);
        int currentPlayer = 1;

        while(true) {
            game.dispalyBoard();
            System.out.println("player" + currentPlayer + ", enter your move (row and column): ");
            int row = scanner.nextInt();
            int col = scanner.nextInt();

            if(!game.makeMove(currentPlayer,row,col)) {
                System.out.println("invalid move try again!");
                continue;

            }

            if(game.checkWin(currentPlayer)) {
                game.dispalyBoard();
                System.out.println("player" + currentPlayer + "wins!");
                break;
            }

            if(game.isDrawn()) {
                game.dispalyBoard();
                System.out.println("its draw!");
                break;
            }

            currentPlayer = (currentPlayer == 1) ? 2:1;
        }

        scanner.close();
    }
    
 }