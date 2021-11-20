#include "../head/head.h"

class Singleton {
private:
	static Singleton* singleton;
	static std::mutex mMutex;

protected:
	string value;
	Singleton(const string value) : value(value) {}
	~Singleton()
	{

	}

public:
	static Singleton* getInstance(const string value);
	const string getValue() {
		return value;
	}
};

Singleton* Singleton::singleton = { nullptr };
mutex Singleton::mMutex;

Singleton* Singleton::getInstance(const string value) {
	lock_guard<mutex> lock(mMutex);
	if (singleton == nullptr) {
		singleton = new Singleton(value);
	}
	return singleton;
}

void ThreadOne() {
	this_thread::sleep_for(chrono::milliseconds(1000));
	Singleton* singleton = Singleton::getInstance("data1");
	cout << singleton->getValue();
}

void ThreadTwo() {
	this_thread::sleep_for(chrono::milliseconds(1000));
	Singleton* singleton = Singleton::getInstance("data2");
	cout << singleton->getValue();
}

int main() {
	thread t1(ThreadOne);
	thread t2(ThreadTwo);
	t1.join();
	t2.join();
}