//Kristian Hajredinaj ID:113367328


public class ConnectFour {

    private String[][] Board = new String[6][8];

    public ConnectFour() {

        for (int i = 0; i < Board.length; i++) {
            for (int j = 0; j < Board[i].length; j++) {
                if (i == 8)
                    Board[i][j] = "|";
                else
                    Board[i][j] = "| ";
            }
        }
    }

    public String[][] getBoard() {
        return Board;
    }



    public boolean redWin() {

        boolean redWin = false;

        //horizontal line
        outterloop:
        for (int i = 0; i < 6; i++){
            for (int j = 0; j < 3; j++){
                if (getBoard()[i][j] == "|R" && getBoard()[i][j + 1] == "|R" &&
                        getBoard()[i][j + 2] == "|R" && getBoard()[i][j + 3] == "|R"){
                    redWin = true;
                    break outterloop;
                }
            }
        }

        //vertical line
        outterloop:
        for (int i = 0; i < 6; i++ ){
            for (int j = 0; j < 3; j++){
                if (getBoard()[j][i] == "|R" && getBoard()[j + 1][i] == getBoard()[j][i]
                && getBoard()[j + 2][i] == getBoard()[j + 1][i] && getBoard()[j + 3][i] == "|R"){
                    redWin = true;
                    break outterloop;
                }
            }
        }

        //descending line
        outterloop:
        for (int i = 0; i < 3; i++){
            for (int j = 0; j < 4; j++){
                if(getBoard()[i][j] == "|R" && getBoard()[i + 1][j + 1] == "|R" &&
                        getBoard()[i + 2][j + 2] == "|R" && getBoard()[i + 3][j + 3] == "|R"){
                    redWin = true;
                    break outterloop;
                }
            }
        }

        //ascending line
        outterloop:
        for (int i = 0; i < 3; i++){
            for (int j = 3; j < 6; j++){
                if(getBoard()[i][j] == "|R" && getBoard()[i + 1][j - 1] == "|R" &&
                        getBoard()[i + 2][j - 2] == "|R" && getBoard()[i + 3][j - 3] == "|R"){
                    redWin = true;
                    break outterloop;
                }
            }
        }
        return redWin;
    }

    public boolean yellowWin() {

        boolean yellowWin = false;

        //horizontal line
        outterloop:
        for (int i = 0; i < 6; i++){
            for (int j = 0; j < 3; j++){
                if (getBoard()[i][j] == "|Y" && getBoard()[i][j + 1] == "|Y" &&
                        getBoard()[i][j + 2] == "|Y" && getBoard()[i][j + 3] == "|Y"){
                    yellowWin = true;
                    break outterloop;
                }
            }
        }

        //vertical line
        outterloop:
        for (int i = 0; i < 6; i++ ){
            for (int j = 0; j < 3; j++){
                if (getBoard()[j][i] == "|Y" && getBoard()[j + 1][i] == "|Y"
                        && getBoard()[j + 2][i] == "|Y" && getBoard()[j + 3][i] == "|Y"){
                    yellowWin = true;
                    break outterloop;
                }
            }
        }

        //descending line
        outterloop:
        for (int i = 0; i < 3; i++){
            for (int j = 0; j < 4; j++){
                if(getBoard()[i][j] == "|Y" && getBoard()[i + 1][j + 1] == "|Y" &&
                        getBoard()[i + 2][j + 2] == "|Y" && getBoard()[i + 3][j + 3] == "|Y"){
                    yellowWin = true;
                    break outterloop;
                }
            }
        }

        //ascending line
        outterloop:
        for (int i = 0; i < 3; i++){
            for (int j = 3; j < 6; j++){
                if(getBoard()[i][j] == "|Y" && getBoard()[i + 1][j - 1] == "|Y" &&
                        getBoard()[i + 2][j - 2] == "|Y" && getBoard()[i + 3][j - 3] == "|Y"){
                    yellowWin = true;
                    break outterloop;
                }
            }
        }
        return yellowWin;
    }

    public boolean redTurn(boolean redTurn){
        return redTurn;
    }

    public boolean yellowTurn(boolean yellowTurn){
        return yellowTurn;
    }


    public void updatePosition(int position, boolean redTurn, boolean yellowTurn) {

        String[][] newBoard = Board;

        for (int i = 5; i >= 0; i--) {
            if (redTurn && newBoard[i][position].equals("| ")) {
                newBoard[i][position] = "|R";
                break;
            }
            else if(yellowTurn && newBoard[i][position].equals("| ")){
                newBoard[i][position] = "|Y";
                break;
            }
        }
        newBoard = getBoard();

    }
}

