public class Main
{
	public static void main(String[] args) {
		int ball = 56;
		if ( ball > 0 && ball <= 15){
		   System.out.println(" ты не прошел плохо!");
		}
		else if ( ball > 15 && ball <= 30){
		   System.out.println(" ты не прошел, но шанс был "); 
		}
		else if ( ball > 30 && ball <= 45){
		    System.out.println(" ты должен был пройти но старайся лучше");
		}
		else if ( ball > 45 && ball <= 60){
		    System.out.println(" Поздравляем вы прошли");
		}
		else{
		    System.out.println(" как так? у тебя не может быть  меньше 0 и больше 60 баллов");
		}
	}
}
