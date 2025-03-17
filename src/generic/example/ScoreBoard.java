package generic.example;

//점수를 내림 차순으로 정렬하고 저장한다고 가정
public class ScoreBoard {
    private int numEntries;
    private GameEntry[] board;

    public ScoreBoard(int numEntries) {
        board = new GameEntry[numEntries];
    }
    public void add(GameEntry e) {
        int newScore = e.getScore();
        //새로 추가되는 점수가 정말로 높은 점수인가?
        //점수판에 공간이 있는지 없는지 혹은 새 점수가 현재 점수판의 가장 낮은 점수보다 높은지 확인
        if(numEntries < board.length || newScore > board[numEntries - 1].getScore()) {
            //만약 여우 공간이 있다면 하나를 추가
            if(numEntries < board.length) {
                numEntries++;
            }
            int j = numEntries - 1;
            //비교해서 새 점수보다 낮은 점수들을 오른쪽으로 한 칸씩 이동시켜서 새 점수가 들어갈 공간을 만든다
            while(j > 0 && board[j - 1].getScore() <     newScore) {
                board[j] = board[j - 1];
                j--;
            }
            board[j] = e;
        }
    }
    public GameEntry remove(int i) throws IndexOutOfBoundsException {
        //전달받은 인덱스 i가 유효한 범위 내에 있는지 검사한다
        //인덱스가 0 미만이거나 현재 저장된 인덱스 수(numentries)이상이면 IndexOutOfBoundsException 예외를 발생
        //배열의 유효한 범위를 벗어난 접근을 방지
        if(i < 0 || i >= numEntries) {
            //IndexOutOfBoundsException 은 배열이나 리스트 같은 데이터 구조에서 허용된 범위 밖의 인덱스에 접근하려고 할
            throw new IndexOutOfBoundsException("Index: " + i);
        }
        //제거할 GameEntry 객체를 임시 변수 tempt에 저장
        GameEntry tempt = board[i];
        for(int j = i; j < numEntries - 1; j++) {
            board[j] = board[j + 1];
        }
        board[numEntries - 1] = null;
        numEntries--;
        return tempt;
    }
    //pubic으로 선언되어서 어디서든 호출 가능
    //static 이므로 인스턴스 생성 없이 클래스 이름으로 직접 호출 가능
    public static void insertionSort(char[] data){
        int n = data.length;              //데이터의 길이 저장
        //배열의 두 번째 요소부터 시작하여 배열의 마지막 요소까지 순회
        for(int k = 1; k < n; k++){
            char cur =  data[k];          //현재 정렬할 문자를 저장
            int j = k;                    //j 변수는 cur 의 올바른 위치를 찾기 위해 사용
            //cur를 배열에서 올바른 위치로 이동하기 위해 더 작은 값들을 만날때까지 이전 요소들을 오른쪽으로 이동시키는 데 사용됨
            while(j > 0 && data[j - 1] > cur){
                data[j] = data[j - 1];    //cur보다 큰 data[j - 1]을 오른쪽으로 이동시키며 cur에 대한 공간을 만듭니다
                j--;
            }
            data[j] = cur;                //cur를 올바른 위치에 삽입합니다
        }
    }
}
