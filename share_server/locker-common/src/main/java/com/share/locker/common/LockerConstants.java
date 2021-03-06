package com.share.locker.common;

import java.util.ArrayList;
import java.util.List;

public class LockerConstants {
	public final static String OPERATION_BANNER = "OPERATION_BANNER"; // banner图片配置code
	public final static String OPERATION_CENTER = "OPERATION_CENTER"; // 首页中间位置配置code

	public final static String KEY_REQUEST_LOGIN_USER = "loginUser";

	// item对应的图片尺寸大小编码
	public static enum ImgSizeCode {
		NORMAL("NORMAL"), SMALL("SMALL");
		private String sizeCode;

		ImgSizeCode(String sizeCode) {
			this.sizeCode = sizeCode;
		}

		public String getSizeCode() {
			return sizeCode;
		}

		public void setSizeCode(String sizeCode) {
			this.sizeCode = sizeCode;
		}
	}

	/**
	 * 宝贝数据状态
	 * 
	 * @author Jordan
	 *
	 */
	public static enum ItemStatus {
		CREATED("CREATED", "创建成功"), GENERATED_PUT_QRCODE("GENERATED_PUT_QRCODE", "已生成存件二维码"), ONLINE("ONLINE",
				"已存入柜门，上架"), LOCKED("LOCKED", "正在下单，锁定中"), USING("USING", "租用中"), 
				EXCEPTION("EXCEPTION", "异常情况，人工介入中"), OFFLINE("OFFLINE","下架"), DELETED("DELETED", "删除"), 
				INVALID("INVALID", "无效数据，数据订正删除等造成");

		private String code;
		private String name;

		ItemStatus(String code, String name) {
			this.code = code;
			this.name = name;
		}

		public String getCode() {
			return code;
		}

		public void setCode(String code) {
			this.code = code;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

	}

	/**
	 * 我的宝贝 列表 ，状态
	 */
	public final static List<String> MY_ITEM_STATUS_LIST = new ArrayList<>();
	static {
		MY_ITEM_STATUS_LIST.add(ItemStatus.CREATED.getCode());
		MY_ITEM_STATUS_LIST.add(ItemStatus.GENERATED_PUT_QRCODE.getCode());
		MY_ITEM_STATUS_LIST.add(ItemStatus.ONLINE.getCode());
		MY_ITEM_STATUS_LIST.add(ItemStatus.LOCKED.getCode());
		MY_ITEM_STATUS_LIST.add(ItemStatus.USING.getCode());
		MY_ITEM_STATUS_LIST.add(ItemStatus.EXCEPTION.getCode());
		MY_ITEM_STATUS_LIST.add(ItemStatus.OFFLINE.getCode());
		MY_ITEM_STATUS_LIST.add(ItemStatus.DELETED.getCode());
	}

	/**
	 * 租用计价时间单位
	 * 
	 * @author Jordan
	 *
	 */
	public static enum PriceTimeUnit {
		DAY("DAY", "天"), HALF_DAY("HALF_DAY", "半天"), HOUR("HOUR", "小时");
		private String code;
		private String name;

		PriceTimeUnit(String code, String name) {
			this.code = code;
			this.name = name;
		}

		public String getCode() {
			return code;
		}

		public void setCode(String code) {
			this.code = code;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

	}

	/**
	 * 基本的数据状态
	 * 
	 * @author Jordan
	 *
	 */
	public static enum BaseDataStatus {
		VALID("VALID"), INVALID("INVALID");
		private String code;

		BaseDataStatus(String code) {
			this.code = code;
		}

		public String getCode() {
			return code;
		}

		public void setCode(String code) {
			this.code = code;
		}
	}

	/**
	 * 订单状态
	 * 
	 * @author Jordan
	 *
	 */
	public static enum OrderStatus {
		CREATED("CREATED", "创建成功，待支付"), PAID_DEPOSIT("PAID_DEPOSIT", "已支付押金"), GENERATED_TAKE_QRCODE(
				"GENERATED_TAKE_QRCODE", "生成取件二维码，待取件"), USING("USING", "租用中"), GENERATED_RETURN_QRCODE(
						"GENERATED_RETURN_QRCODE", "生成还件二维码，还件中"), PAID_FEE("PAID_FEE", "租金支付成功"), RETURNED("RETURNED",
								"已还件"), CHECKED_QUALITY("RETURNED", "管理员已检查"), REFUNDED_DEPOSIT("REFUNDED_DEPOSIT",
										"押金已退还"), APPLY_FOR_REFUND_DEPOSIT("APPLY_FOR_REFUND_DEPOSIT",
												"租用前申请退押金"), CANCELLED("CANCELLED", "已取消"), EXCEPTION("EXCEPTION",
														"异常情况，人工介入"), INVALID("INVALID", "无效数据，人工订正等原因造成");

		private String code;
		private String name;

		OrderStatus(String code, String name) {
			this.code = code;
			this.name = name;
		}

		public String getCode() {
			return code;
		}

		public void setCode(String code) {
			this.code = code;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

	}
	
	public final static String EDITOR_SYSTEM="EDITOR_SYSTEM";//默认数据修改人
	
	public final static Long VERIFY_CODE_EXPIRE_TIME = 1000*60*10L;//验证码有效期,10分钟
	
	public final static Long QR_CODE_EXPIRE_TIME_TAKE = 1000*60*60L;//取件验证码有效期，一个小时
	
	public final static Long QR_CODE_EXPIRE_TIME_RETURN = 1000*60*60L;//还件验证码有效期，一个小时
	
	/**
	 * 用户状态
	 * 
	 * @author Jordan
	 *
	 */
	public static enum UserStatus {
		VALID("VALID", "正常状态"), INVALID("INVALID", "无效");

		private String code;
		private String name;

		UserStatus(String code, String name) {
			this.code = code;
			this.name = name;
		}

		public String getCode() {
			return code;
		}

		public void setCode(String code) {
			this.code = code;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

	}

	/**
	 * CheckCode 类型
	 * @author Jordan
	 *
	 */
	public static enum CheckCodeType {
		USER_REGISTER("USER_REGISTER","注册码"),PUT("PUT", "存件二维码"), TAKE("TAKE", "取件二维码"), RETURN("RETURN", "还件二维码");

		private String code;
		private String name;

		CheckCodeType(String code, String name) {
			this.code = code;
			this.name = name;
		}

		public String getCode() {
			return code;
		}

		public void setCode(String code) {
			this.code = code;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

	}
	
	 /**
     * 支付方式
     */
    public enum PayWay{
        ALIPAY("ALIPAY","支付宝"),WECHAT("WECHAT","微信支付");
        private String code;
        private String name;

        PayWay(String code,String name){
            this.code=code;this.name=name;
        }

        public String getCode() {
            return code;
        }

        public void setCode(String code) {
            this.code = code;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }
    
    /**
	 * 交易类型
	 * 
	 * @author Jordan
	 *
	 */
	public static enum TradeType {
		PAY_DEPOSIT("PAY_DEPOSIT", "支付押金"), PAY_RENT_FEE("PAY_RENT_FEE", "支付租金"),REFUND_DEPOSIT("PAY_RENT_FEE","退还押金");

		private String code;
		private String name;

		TradeType(String code, String name) {
			this.code = code;
			this.name = name;
		}

		public String getCode() {
			return code;
		}

		public void setCode(String code) {
			this.code = code;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

	}
	
	/**
	 * 交易状态
	 * 
	 * @author Jordan
	 *
	 */
	public static enum TradeStatus {
		SUCCESS("SUCCESS", "支付成功"), FAIL("PAY_RENT_FEE", "支付失败"),INVALID("INVALID","无效数据");

		private String code;
		private String name;

		TradeStatus(String code, String name) {
			this.code = code;
			this.name = name;
		}

		public String getCode() {
			return code;
		}

		public void setCode(String code) {
			this.code = code;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

	}
	
	/**
	 * 系统配置参数类型
	 * 
	 * @author Jordan
	 *
	 */
	public static enum SystemSettingType {
		DEFAULT("DEFAULT", "默认");

		private String code;
		private String name;

		SystemSettingType(String code, String name) {
			this.code = code;
			this.name = name;
		}

		public String getCode() {
			return code;
		}

		public void setCode(String code) {
			this.code = code;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

	}
	
	/**
	 * 系统配置参数key
	 * 
	 * @author Jordan
	 *
	 */
	public static enum SystemSettingKey {
		OPT_BANNER_ITEM_ID("OPT_BANNER_ITEM_ID", "banner对应的itemId"),
		OPT_LEFT_ITEM_ID("OPT_LEFT_ITEM_ID", "运营位左边对应的itemId"),
		OPT_RIGHT_ITEM_ID1("OPT_RIGHT_ITEM_ID1", "运营位右1对应的itemId"),
		OPT_RIGHT_ITEM_ID2("OPT_RIGHT_ITEM_ID2", "运营位右2对应的itemId");

		private String code;
		private String name;

		SystemSettingKey(String code, String name) {
			this.code = code;
			this.name = name;
		}

		public String getCode() {
			return code;
		}

		public void setCode(String code) {
			this.code = code;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

	}

}
