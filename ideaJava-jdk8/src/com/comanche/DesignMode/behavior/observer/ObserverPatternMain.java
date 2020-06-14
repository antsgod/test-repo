package com.comanche.DesignMode.behavior.observer;

public class ObserverPatternMain {

	public static void main(String[] args) {
	    //定义公众号
		OfficialAccount bobo = new OfficialAccount("bobo");
		OfficialAccount infoq = new OfficialAccount("infoq");
        //定义账号
		Follower mark = new Follower("Mark");
		Follower eric = new Follower("Eric");
		Follower jack = new Follower("Jack");
		Follower frank = new Follower("Frank");
		Follower daniel = new Follower("Daniel");
		Follower alice = new Follower("Alice");
        //mark，eric，jack这些人向bobo账号注册
		bobo.register(mark);
		bobo.register(eric);
		bobo.register(jack);
        //frank，daniel，alice这些人向infoq账号注册
		infoq.register(frank);
		infoq.register(daniel);
		infoq.register(alice);
        //公众号开始推送文章，各个账号都会受到推送
		bobo.pushArticle("observer design pattern video course");
		infoq.pushArticle("spring 5.0 is out");

//		bobo.unregister(eric);
//
//		bobo.pushArticle("core java course is released");
	}

}
