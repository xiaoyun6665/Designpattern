#include "../head/head.h"

class Product
{
public:
	virtual ~Product(){};
	virtual string Operation() const = 0;
};

class ConcreateProduct1 : public Product
{
public:
	string Operation() const override
	{
		return "product1\n";
	}
};

class ConcreateProduct2 : public Product
{
public:
	string Operation() const override
	{
		return "product2\n";
	}
};

class Creator
{
public:
	virtual ~Creator(){};
	virtual Product *factoryMethod() const = 0;

	string someOperation() const
	{
		auto product = this->factoryMethod();
		string result = product->Operation();
		delete product;
		return result;
	}
};

class Product1Creator : public Creator
{
public:
	Product *factoryMethod() const override
	{
		return new ConcreateProduct1();
	}
};

class Product2Creator : public Creator
{
public:
	Product *factoryMethod() const override
	{
		return new ConcreateProduct2();
	}
};

int main()
{
	auto create1 = make_unique<Product1Creator>();
	cout << create1->someOperation();
	auto create2 = make_unique<Product2Creator>();
	cout << create2->someOperation();
	return 0;
}