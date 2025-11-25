package optional;

import java.util.Optional;

class User{
	private String profileUrl;
	
	public User(String profileUrl) {
		this.profileUrl=profileUrl;
	}
	
	public Optional<String> getProfileUrl(){
		return Optional.ofNullable(profileUrl);
	}
}


public class UserProfileFetching {

	public static void main(String[] args) {
		User u1=new User("/images/image.png");
		User u2=new User(null);
		String defualtImages="/images/defualt.png";
		
		String pic1=u1.getProfileUrl().orElse(defualtImages);
		
		String pic2=u2.getProfileUrl().orElse(defualtImages);
		
		System.out.println(pic1); // orignal image
		System.out.println(pic2); // defualt image
		
}
}
