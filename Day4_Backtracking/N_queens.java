import java.util.*;

public class n_queens {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.close();
		int[][] board = new int[n][n];
		for(int i=0;i<n;i++) {
			Arrays.fill(board[i], 0);
		}
		List<List<Integer>> queens = new ArrayList<>();
		List<List<Integer>> nqueens = generate(board,queens,0);
		for(int i=0;i<n;i++) {
			System.out.println(nqueens.get(i));
		}
	}
	static List<List<Integer>> generate(int[][] board, List<List<Integer>> nqueens, int col) {
		int n = board.length;
		if(col==n) {
			for(int i=0;i<n;i++) {
				List<Integer> list = new ArrayList<>();
				for(int val : board[i]) {
					list.add(val);
				}
				nqueens.add(list);
			}
			return nqueens;
		}
		for(int row=0;row<n;row++) {
			if(isValid(board,row,col)) {
				board[row][col] = 1;
				generate(board,nqueens,col+1);
				board[row][col] = 0;
			}
		}
		return nqueens;
	}
	static boolean isValid(int[][] board, int row, int col) {
		int n = board.length;
		int nrow = row;
		int ncol = col;
		while(ncol>=0) {
			if(board[nrow][ncol--]==1) return false;
		}
		nrow = row;
		ncol = col;
		while(nrow>=0 && ncol>=0) {
			if(board[nrow--][ncol--]==1) return false;
		}
		nrow = row;
		ncol = col;
		while(nrow<n && ncol>=0) {
			if(board[nrow++][ncol--]==1) return false;
		}
		return true;
	}
}
