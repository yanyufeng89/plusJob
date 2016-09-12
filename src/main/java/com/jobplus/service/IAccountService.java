package com.jobplus.service;

import com.jobplus.pojo.Account;
import com.jobplus.pojo.AccountDetail;

public interface IAccountService {
	
	
	/**
	 * 通过用户id获取accountId
	 * @param userid
	 * @return
	 */
	public Account getAccountByUserId(int userid);
	
	
	
	/**
	 * 增加用户积分或者加币
	 * @param account
	 * @return
	 */
	public int addPointsOrAddJiaMoney(Account account);
	
	
	/**
	 * 增加或减少账户金额(加币或者积分),同时记录详情(AccountDetail)
	 * @param account
	 * @param accountDetail
	 * @return
	 */
	public int adOrDecAccount(Account account,AccountDetail accountDetail);
	
	
	/**
	 * 更改用户积分并记录详情                  Account &&  AccountDetail
	 * @param userid		Account
	 * @param moneyType	    Account        MONEYTYPES = {"points","jiaMoney"};
	 * @param score        Account        []SCORES = {1,2,3,4,5,6,7,8,9,10,15,20};
	 * @param changeitem    AccountDetail  CHANGEITEMS = {"jiaMoney","points"};
	 * @param changetype    AccountDetail  CHANGETYPES = {"1","2"}; 1增加  2减少
	 * @param changevalue   AccountDetail  []CHANGEVALUES = {1,2,3,4,5,6,7,8,9,10,15,20};
	 * @param changecause   AccountDetail  CHANGECAUSES = {"分享文档","分享话题","分享书籍","分享课程","分享文章","分享站点","下载文档","回答问题","文档被下载"}
	 * @return
	 */
	public int modAccountAndDetail(Integer userid,Integer moneyType,Integer score,
			Integer changeitem,Integer changetype,Integer changevalue,Integer changecause);
	
	
	
}