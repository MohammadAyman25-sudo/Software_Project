package com.example.MyFawry.Observer;

public interface Subject {
	void RegisterObserver(Observer O) ;
	void Notify() ;
}
