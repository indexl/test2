package testEx02;

public class Main2 {
	public static void main(String[] args) {
		
		int articleId = 0;
		
		List<Article> article = new ArrayList<>();
		
		Scanner sc = new Scanner(System.in);
			while(true) {
			
			System.out.printf("명령어) ");
			
			String cmd = sc.nextLine();

			if (cmd.equals("exit")) {
				break;
			}
		
		
		if(cmd.equals("article write")) {

			System.out.println("제목: ");
			String title = sc.nextLine();
			System.out.println("내용: ");
			String body = sc.nextLine();
			
			articleId++;					
	//		Article articles = new article (인자)
			
			System.out.printf("%d번 글이 작성되었습니다",articleId);
			
			
	//		article.add(articles);
		
		}else if(cmd.equals("article list")) {
				
			System.out.println("%d             |           %s" );
			
		
		}else if(cmd.equals("article detail")) {
		
	
			
			

class Article{   //id, regDate, title, body
	int id;
	String title;
	String body;	
		Article(int id, String title, String body){
			this.id = id;
			this.title = title;
			this.body = body;	
		}
}


