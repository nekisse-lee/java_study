package thisisjava.chap15_collection.exam.exam07;

import java.util.List;

public class ListExample {

    public static void main(String[] args) {

        BoardDao dao = new BoardDao();

        List<Board> list = dao.getBoardList();
        for (Board board : list) {
            System.out.println(board);
        }

    }

}
