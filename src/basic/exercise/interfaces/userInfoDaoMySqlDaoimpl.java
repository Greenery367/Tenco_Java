package basic.exercise.interfaces;

import java.util.Scanner;

public class userInfoDaoMySqlDaoimpl implements iUserInfoDao {

	@Override
	public void insertUserInfo(userInfo info) {
		// SQL : 질의어 - 배웠다면 -- MySQL 언어를 활용해 구현
		System.out.println("insert into user values(info.getUserName())");

	}

	@Override
	public void updateUserInfo(userInfo info) {
		System.out.println("update set user_tb name = info.getUserName()");

	}

	@Override
	public void deleteUserInfo(int id) {
		System.out.println("delete form user_tb where id=info.getId()");

	}

	@Override
	public void selectUserInfo() {
		System.out.println("select * from user_tb");

	}

}
