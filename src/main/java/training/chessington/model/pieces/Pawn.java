package training.chessington.model.pieces;

import training.chessington.model.Board;
import training.chessington.model.Coordinates;
import training.chessington.model.Move;
import training.chessington.model.PlayerColour;

import java.util.ArrayList;
import java.util.List;

public class Pawn extends AbstractPiece {
    public Pawn(PlayerColour colour) {
        super(Piece.PieceType.PAWN, colour);
    }

    @Override
    public List<Move> getAllowedMoves(Coordinates from, Board board) {
        List<Move> allowedMoves = new ArrayList<Move>();

        if (colour == PlayerColour.WHITE){
            allowedMoves.add(
                    new Move(from,
                             new Coordinates(from.getRow() - 1, from.getCol() )
                    )
                );
            if ( from.getRow() == 6 ) {
                allowedMoves.add(
                        new Move(from,
                                new Coordinates(from.getRow() - 2, from.getCol())
                        )
                );
            }

        } else {
            allowedMoves.add(
                    new Move(from,
                            new Coordinates(from.getRow() + 1, from.getCol() )
                    )
            );
            if ( from.getRow() == 1 ) {
                allowedMoves.add(
                        new Move(from,
                                new Coordinates(from.getRow() + 2, from.getCol())
                        )
                );
            }

        }

        return allowedMoves;
    }
}
