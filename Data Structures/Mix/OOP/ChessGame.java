class Spot { 
	private Piece piece; 
	private int x; 
	private int y; 

	public Spot(int x, int y, Piece piece) 
	{ 
		this.setPiece(piece); 
		this.setX(x); 
		this.setY(y); 
	} 

	public Piece getPiece() 
	{ 
		return this.piece; 
	} 

	public void setPiece(Piece p) 
	{ 
		this.piece = p; 
	} 

	public int getX() 
	{ 
		return this.x; 
	} 

	public void setX(int x) 
	{ 
		this.x = x; 
	} 

	public int getY() 
	{ 
		return this.y; 
	} 

	public void setY(int y) 
	{ 
		this.y = y; 
	} 
} 

abstract class Piece { 

	private boolean killed = false; 
	private boolean white = false; 

	public Piece(boolean white) 
	{ 
		this.setWhite(white); 
	} 

	public boolean isWhite() 
	{ 
		return this.white == true; 
	} 

	public void setWhite(boolean white) 
	{ 
		this.white = white; 
	} 

	public boolean isKilled() 
	{ 
		return this.killed == true; 
	} 

	public void setKilled(boolean killed) 
	{ 
		this.killed = killed; 
	} 

	public abstract boolean canMove(Board board, Spot start, Spot end); 
} 

class King extends Piece { 
	private boolean castlingDone = false; 

	public King(boolean white) 
	{ 
		super(white); 
	} 

	public boolean isCastlingDone() 
	{ 
		return this.castlingDone == true; 
	} 

	public void setCastlingDone(boolean castlingDone) 
	{ 
		this.castlingDone = castlingDone; 
	} 

	@Override
	public boolean canMove(Board board, Spot start, Spot end) 
	{ 
		// we can't move the piece to a Spot that has a piece of the same color 
		if (end.getPiece().isWhite() == this.isWhite()) { 
			return false; 
		} 

		int x = Math.abs(start.getX() - end.getX()); 
		int y = Math.abs(start.getY() - end.getY()); 
		if (x + y == 1) { 
			// check if this move will not result in the king being attacked if so return true 
			return true; 
		} 

		return this.isValidCastling(board, start, end); 
	} 

	private boolean isValidCastling(Board board, Spot start, Spot end) 
	{ 

		if (this.isCastlingDone()) { 
			return false; 
		} 
        
        // Logic for returning true or false 
        return true;
	} 

	public boolean isCastlingMove(Spot start, Spot end) 
	{ 
		// check if the starting and 
        // ending position are correct 
        return true;
	} 
} 


class Knight extends Piece { 
	public Knight(boolean white) 
	{ 
		super(white); 
	} 

	@Override
	public boolean canMove(Board board, Spot start, Spot end) 
	{ 
		// we can't move the piece to a spot that has 
		// a piece of the same colour 
		if (end.getPiece().isWhite() == this.isWhite()) { 
			return false; 
		} 

		int x = Math.abs(start.getX() - end.getX()); 
		int y = Math.abs(start.getY() - end.getY()); 
		return x * y == 2; 
	} 
} 


class Board { 
	Spot[][] boxes; 

	public Board() 
	{ 
		this.resetBoard(); 
	} 

	public Spot getBox(int x, int y) 
	{ 

		if (x < 0 || x > 7 || y < 0 || y > 7) { 
			throw new Exception("Index out of bound"); 
		} 

		return boxes[x][y]; 
	} 

	public void resetBoard() 
	{ 
		// initialize white pieces 
		boxes[0][0] = new Spot(0, 0, new Rook(true)); 
		boxes[0][1] = new Spot(0, 1, new Knight(true)); 
		boxes[0][2] = new Spot(0, 2, new Bishop(true)); 
		//... 
		boxes[1][0] = new Spot(1, 0, new Pawn(true)); 
		boxes[1][1] = new Spot(1, 1, new Pawn(true)); 
		//... 

		// initialize black pieces 
		boxes[7][0] = new Spot(7, 0, new Rook(false)); 
		boxes[7][1] = new Spot(7, 1, new Knight(false)); 
		boxes[7][2] = new Spot(7, 2, new Bishop(false)); 
		//... 
		boxes[6][0] = new Spot(6, 0, new Pawn(false)); 
		boxes[6][1] = new Spot(6, 1, new Pawn(false)); 
		//... 

		// initialize remaining boxes without any piece 
		for (int i = 2; i < 6; i++) { 
			for (int j = 0; j < 8; j++) { 
				boxes[i][j] = new Spot(i, j, null); 
			} 
		} 
	} 
} 



abstract class Player { 
	public boolean whiteSide; 
	public boolean humanPlayer; 

	public boolean isWhiteSide() 
	{ 
		return this.whiteSide == true; 
	} 
	public boolean isHumanPlayer() 
	{ 
		return this.humanPlayer == true; 
	} 
} 



class HumanPlayer extends Player { 

	public HumanPlayer(boolean whiteSide) 
	{ 
		this.whiteSide = whiteSide; 
		this.humanPlayer = true; 
	} 
} 

class ComputerPlayer extends Player { 

	public ComputerPlayer(boolean whiteSide) 
	{ 
		this.whiteSide = whiteSide; 
		this.humanPlayer = false; 
	} 
} 

class Move { 
	private Player player; 
	private Spot start; 
	private Spot end; 
	private Piece pieceMoved; 
	private Piece pieceKilled; 
	private boolean castlingMove = false; 

	public Move(Player player, Spot start, Spot end) 
	{ 
		this.player = player; 
		this.start = start; 
		this.end = end; 
		this.pieceMoved = start.getPiece(); 
	} 

	public boolean isCastlingMove() 
	{ 
		return this.castlingMove == true; 
	} 

	public void setCastlingMove(boolean castlingMove) 
	{ 
		this.castlingMove = castlingMove; 
	} 
} 


public enum GameStatus { 
	ACTIVE, 
	BLACK_WIN, 
	WHITE_WIN, 
	FORFEIT, 
	STALEMATE, 
	RESIGNATION 
} 


class ChessGame { 
	private Player[] players; 
	private Board board; 
	private Player currentTurn; 
	private GameStatus status; 
	private List<Move> movesPlayed; 

	private void initialize(Player p1, Player p2) 
	{ 
		players[0] = p1; 
		players[1] = p2; 

		board.resetBoard(); 

		if (p1.isWhiteSide()) { 
			this.currentTurn = p1; 
		} 
		else { 
			this.currentTurn = p2; 
		} 

		movesPlayed.clear(); 
	} 

	public boolean isEnd() 
	{ 
		return this.getStatus() != GameStatus.ACTIVE; 
	} 

	public boolean getStatus() 
	{ 
		return this.status; 
	} 

	public void setStatus(GameStatus status) 
	{ 
		this.status = status; 
	} 

	public boolean playerMove(Player player, int startX, int startY, int endX, int endY) 
	{ 
		Spot startBox = board.getBox(startX, startY); 
		Spot endBox = board.getBox(startY, endY); 
		Move move = new Move(player, startBox, endBox); 
		return this.makeMove(move, player); 
	} 

	private boolean makeMove(Move move, Player player) 
	{ 
		Piece sourcePiece = move.getStart().getPiece(); 
		if (sourcePiece == null) { 
			return false; 
		} 

		// valid player 
		if (player != currentTurn) { 
			return false; 
		} 

		if (sourcePiece.isWhite() != player.isWhiteSide()) { 
			return false; 
		} 

		// valid move? 
		if (!sourcePiece.canMove(board, move.getStart(), move.getEnd())) { 
			return false; 
		} 

		// kill? 
		Piece destPiece = move.getStart().getPiece(); 
		if (destPiece != null) { 
			destPiece.setKilled(true); 
			move.setPieceKilled(destPiece); 
		} 

		// castling? 
		if (sourcePiece != null && sourcePiece instanceof King 
			&& sourcePiece.isCastlingMove()) { 
			move.setCastlingMove(true); 
		} 

		// store the move 
		movesPlayed.add(move); 

		// move piece from the stat box to end box 
		move.getEnd().setPiece(move.getStart().getPiece()); 
		move.getStart.setPiece(null); 

		if (destPiece != null && destPiece instanceof King) { 
			if (player.isWhiteSide()) { 
				this.setStatus(GameStatus.WHITE_WIN); 
			} 
			else { 
				this.setStatus(GameStatus.BLACK_WIN); 
			} 
		} 

		// set the current turn to the other player 
		if (this.currentTurn == players[0]) { 
			this.currentTurn = players[1]; 
		} 
		else { 
			this.currentTurn = players[0]; 
		} 

		return true; 
	} 
} 


