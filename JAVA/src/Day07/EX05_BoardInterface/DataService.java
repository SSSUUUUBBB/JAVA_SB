package Day07.EX05_BoardInterface;

public interface DataService {

	Text[] selectList();
	
	Text[] selectList(int boardNo);
	
	Text select(int No);
	
	int insert(Text text);
	
	int update(Text text);
	
	int delete(int No);
}
