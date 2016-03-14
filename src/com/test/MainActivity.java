package com.test;

import com.AbstractFactoryModel.AbstractFactoryModel;
import com.BridgeMode.BridgeMode;
import com.BuilderMode.BuilderMode;
import com.ChainOfResponsibilityModel.ChainOfResponsibilityModel;
import com.CloneMode.CloneMode;
import com.CombinationMode.CombinationMode;
import com.CommandMode.CommandMode;
import com.DecorativeMode.DecorativeMode;
import com.FactoryMethodModel.FactoryMethodModel;
import com.FactoryMethodModel.IProduct;
import com.FactoryMethodModel.Tree;
import com.FlyweightMode.FlyweightMode;
import com.IntermediaryModel.IntermediaryModel;
import com.IteratorModel.IteratorModel;
import com.MemoMode.MemoMode;
import com.ObserverMode.ObserverMode;
import com.ParserMode.ParserMode;
import com.ProxyMode.ProxyMode;
import com.SingleMode.SingleMode;
import com.StateModel.StateModel;
import com.StrategyMode.StrategyMode;
import com.TemplateMethodModel.TemplateMethodModel;
import com.VisitorMode.VisitorMode;
import com.WindowMode.WindowMode;
import com.example.designmode.R;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	public void onClickSingleMode(View view) { // 单例
		SingleMode.getInstance();
	}

	public void onClickFactoryMethodModel(View view) {// 工厂方法
		IProduct iProduct = new FactoryMethodModel();
		iProduct.productMethod();
		iProduct = new Tree();
		iProduct.productMethod();
	}

	public void onClickAbstractFactoryModel(View view) {// 抽象工厂
		AbstractFactoryModel.test();
	}

	public void onClickTemplateMethodModel(View view) {// 模版方法模式
		TemplateMethodModel.test();
	}

	public void onClickBuilderMode(View view) {// 建造者模式
		BuilderMode.test();
	}

	public void onClickProxyMode(View view) {// 代理模式
		ProxyMode.test();
	}

	public void onClickCloneMode(View view) {// 原型模式
		CloneMode.test();
	}

	public void onClickIntermediaryModel(View view) {// 中介者模式
		IntermediaryModel.test1();
		IntermediaryModel.test2();
	}

	public void onClickCommandMode(View view) {// 命令模式
		CommandMode.test();
	}

	public void onChainOfResponsibilityModel(View view) {// 责任链模式
		ChainOfResponsibilityModel.test();
	}

	public void onClickDecorativeMode(View view) {// 装饰模式
		DecorativeMode.test();
	}

	public void onClickStrategyMode(View view) {// 策略模式
		StrategyMode.test();
	}

	public void onClickIteratorModel(View view) {// 模式
		IteratorModel.test();
	}

	public void onClickCombinationMode(View view) {// 组合模式
		CombinationMode.test();
	}

	public void onClickObserverMode(View view) {// 观察者模式
		ObserverMode.test();
	}

	public void onClickWindowMode(View view) {// 门面模式
		WindowMode.test();
	}

	public void onClickMemoMode(View view) {// 备忘录模式
		MemoMode.test();
	}

	public void onClickVisitorMode(View view) {// 访问者模式
		VisitorMode.test();
	}

	public void onClickStateModel(View view) {// 状态模式
		StateModel.test();
	}

	public void onClickParserMode(View view) {// 解释器模式
		ParserMode.test();
	}

	public void onClickFlyweightMode(View view) {// 享元模式
		FlyweightMode.test();
	}

	public void onClickBridgeMode(View view) {// 桥梁模式
		BridgeMode.test();
	}
}
