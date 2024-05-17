package basic.exercise.interfaces;

public interface iUserInfoDao {
	
	// C R U D
	// public abstract 생략 가능
	// TODO-매개변수 수정 예정
	public abstract void insertUserInfo(userInfo info);
	// 단, 수정이 되면 안 되는 것은 제외
	public abstract void updateUserInfo(userInfo info);
	public abstract void deleteUserInfo(int id);
	public abstract void selectUserInfo(); // 전체 조회
}
