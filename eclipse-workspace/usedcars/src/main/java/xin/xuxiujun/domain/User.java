package xin.xuxiujun.domain;

public class User {

	private Integer userId;// 用户编号
	private String userTrueName;// 真实姓名
	private String userPassword;// 密码
	private String userNetworkName;// 网名、用户名
	private String userAddress;// 家庭住址
	private String userEmail;// 邮箱
	private String userSex;// 性别
	private String userAvator;// 头像
	private String userRealNameAuthentic;// 是否实名验证
	private String userMobileNumber;// 手机号
	private String userIdNo;// 身份证号码
	private String userBirthday;// 生日

	public User() {
		super();
		// TODO Auto-generated constructor stub
	}

	public User(Integer userId, String userTrueName, String userPassword, String userNetworkName, String userAddress,
			String userEmail, String userSex, String userAvator, String userRealNameAuthentic, String userMobileNumber,
			String userIdNo, String userBirthday) {
		super();
		this.userId = userId;
		this.userTrueName = userTrueName;
		this.userPassword = userPassword;
		this.userNetworkName = userNetworkName;
		this.userAddress = userAddress;
		this.userEmail = userEmail;
		this.userSex = userSex;
		this.userAvator = userAvator;
		this.userRealNameAuthentic = userRealNameAuthentic;
		this.userMobileNumber = userMobileNumber;
		this.userIdNo = userIdNo;
		this.userBirthday = userBirthday;
	}

	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public String getUserTrueName() {
		return userTrueName;
	}

	public void setUserTrueName(String userTrueName) {
		this.userTrueName = userTrueName;
	}

	public String getUserPassword() {
		return userPassword;
	}

	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}

	public String getUserNetworkName() {
		return userNetworkName;
	}

	public void setUserNetworkName(String userNetworkName) {
		this.userNetworkName = userNetworkName;
	}

	public String getUserAddress() {
		return userAddress;
	}

	public void setUserAddress(String userAddress) {
		this.userAddress = userAddress;
	}

	public String getUserEmail() {
		return userEmail;
	}

	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}

	public String getUserSex() {
		return userSex;
	}

	public void setUserSex(String userSex) {
		this.userSex = userSex;
	}

	public String getUserAvator() {
		return userAvator;
	}

	public void setUserAvator(String userAvator) {
		this.userAvator = userAvator;
	}

	public String getUserRealNameAuthentic() {
		return userRealNameAuthentic;
	}

	public void setUserRealNameAuthentic(String userRealNameAuthentic) {
		this.userRealNameAuthentic = userRealNameAuthentic;
	}

	public String getUserMobileNumber() {
		return userMobileNumber;
	}

	public void setUserMobileNumber(String userMobileNumber) {
		this.userMobileNumber = userMobileNumber;
	}

	public String getUserIdNo() {
		return userIdNo;
	}

	public void setUserIdNo(String userIdNo) {
		this.userIdNo = userIdNo;
	}

	public String getUserBirthday() {
		return userBirthday;
	}

	public void setUserBirthday(String userBirthday) {
		this.userBirthday = userBirthday;
	}

}