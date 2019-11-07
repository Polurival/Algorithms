package medium

/**
 * Related Topics: Array, Backtracking
 *
 * My solution
 *
 * Time complexity O(board.size * board(i).size * word.length)
 * Space complexity O(word.length)
 */
class T79WordSearch {

    private lateinit var charsBoard: Array<CharArray>
    private lateinit var searchedWord: String
    private val usedChars = LinkedHashSet<Pair<Int, Int>>()

    fun exist(board: Array<CharArray>, word: String): Boolean {
        charsBoard = board
        searchedWord = word
        if (board.isEmpty() || word.isEmpty()) {
            return false
        }
        for (i in board.indices) {
            for (j in board[i].indices) {
                if (board[i][j] == word[0]) {
                    usedChars.add(Pair(i, j))
                    if (word.length == 1 || checkWord( 1, i, j)) {
                        return true
                    }
                }
            }
        }
        return false
    }

    private fun checkWord(searchIndex: Int, i: Int, j: Int): Boolean {
        var result = false
        // check right cell
        if (j + 1 < charsBoard[i].size
                && charsBoard[i][j + 1] == searchedWord[searchIndex]
                && !usedChars.contains(Pair(i, j + 1))) {
            result = if (searchIndex == searchedWord.length - 1) {
                true
            } else {
                usedChars.add(Pair(i, j + 1))
                checkWord( searchIndex + 1, i, j + 1)
            }
        }
        // check lower cell
        if (!result && i + 1 < charsBoard.size
                && charsBoard[i + 1][j] == searchedWord[searchIndex]
                && !usedChars.contains(Pair(i + 1, j))) {
            result = if (searchIndex == searchedWord.length - 1) {
                true
            } else {
                usedChars.add(Pair(i + 1, j))
                checkWord( searchIndex + 1, i + 1, j)
            }
        }
        // check left cell
        if (!result && j - 1 >= 0
                && charsBoard[i][j - 1] == searchedWord[searchIndex]
                && !usedChars.contains(Pair(i, j - 1))) {
            result = if (searchIndex == searchedWord.length - 1) {
                true
            } else {
                usedChars.add(Pair(i, j - 1))
                checkWord( searchIndex + 1, i, j - 1)
            }
        }
        // check upper cell
        if (!result && i - 1 >= 0
                && charsBoard[i - 1][j] == searchedWord[searchIndex]
                && !usedChars.contains(Pair(i - 1, j))) {
            result = if (searchIndex == searchedWord.length - 1) {
                true
            } else {
                usedChars.add(Pair(i - 1, j))
                checkWord( searchIndex + 1, i - 1, j)
            }
        }

        usedChars.remove(usedChars.last())
        return result
    }
}

class SolutionMoreFaster {

    fun search(board: Array<CharArray>, word: String, index: Int, i: Int, j: Int, visited: Array<BooleanArray>): Boolean {
        if(i<0||i>=board.size||j<0||j>=board[0].size){
            return false
        }
        if(visited[i][j]){
            return false
        }
        if(word[index]==board[i][j]){
            if(index==word.length-1){
                return true
            }else {
                visited[i][j]=true
                if(search(board,word,index+1,i,j+1,visited)){
                    return true
                }
                if(search(board,word,index+1,i-1,j,visited)){
                    return true
                }
                if(search(board,word,index+1,i,j-1,visited)){
                    return true
                }
                if(search(board,word,index+1,i+1,j,visited)){
                    return true
                }
                visited[i][j]=false
            }
        }
        return false
    }

    fun exist(board: Array<CharArray>, word: String): Boolean {
        val visited = Array(board.size) { BooleanArray(board[0].size) }
        for(i in 0 until board.size){
            for(j in 0 until board[0].size){
                if(search(board,word,0,i,j,visited)){
                    return true
                }

            }
        }
        return false
    }
}