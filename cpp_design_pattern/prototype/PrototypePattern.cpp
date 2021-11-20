#include "../head/head.h"

enum Type {
	PROTOTYPE_1 = 0,
	PROTOTYPE_2
};

class Prototype
{
protected:
	string name;
	float data;
public:
	Prototype(const string name_) : name(name_) {}
	virtual ~Prototype();
	virtual Prototype* clone() const = 0;
	virtual void method(float data_) {
		data = data_;
		cout << name << "+" << data << endl;
	}

};

