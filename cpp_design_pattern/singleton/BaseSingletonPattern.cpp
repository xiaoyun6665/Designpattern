#include "../head/head.h"

class Singleton {
private:
	string value;
	static Singleton* singleton;
	Singleton(const string value) : value(value) {}
public:
	static auto getInstance(const string& value) {
		if (singleton == nullptr) {
			singleton = new Singleton(value);
		}
		return singleton;
	}
	void getValue() {
		cout << value << endl;
	}
};

Singleton* Singleton::singleton = nullptr;

int main() {
	auto sin1 = Singleton::getInstance("data1");
	sin1->getValue();
	
	auto sin2 = Singleton::getInstance("data1");
	sin2->getValue();
	return 0;
}