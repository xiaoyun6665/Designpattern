#include "../head/head.h"

class AbstractProductA
{
public:
    virtual ~AbstractProductA(){};
    virtual string UserfulFunctionA() const = 0;
};

class ConcreteProductA1 : public AbstractProductA
{
public:
    string UserfulFunctionA() const override
    {
        return "A1";
    }
};

class ConcreteProductA2 : public AbstractProductA
{
public:
    string UserfulFunctionA() const override
    {
        return "A2";
    }
};

class AbstractProductB
{
public:
    virtual ~AbstractProductB(){};
    virtual string UserfulFunctionB() const = 0;
    virtual string AnotherUserfulFunctionB(const AbstractProductA &collaborator) const = 0;
};

class ConcreteProductB1 : public AbstractProductB
{
public:
    string UserfulFunctionB() const override
    {
        return "B1";
    }
    string AnotherUserfulFunctionB(const AbstractProductA &collaborator) const override
    {
        const string result = collaborator.UserfulFunctionA();
        return result;
    }
};

class ConcreteProductB2 : public AbstractProductB
{
public:
    string UserfulFunctionB() const override
    {
        return "B2";
    }
    string AnotherUserfulFunctionB(const AbstractProductA &collaborator) const override
    {
        const string result = collaborator.UserfulFunctionA();
        return result;
    }
};

class AbstractFactory
{
public:
    virtual AbstractProductA *CreateProductA()const = 0;
    virtual AbstractProductB *CreateProductB()const = 0;
};

class Factory1 : public AbstractFactory
{
public:
    AbstractProductA *CreateProductA()const override{
        return new ConcreteProductA1();
    }
    AbstractProductB *CreateProductB()const override{
        return new ConcreteProductB1();
    }
};

class Factory2 : public AbstractFactory
{
public:
    AbstractProductA *CreateProductA()const override{
        return new ConcreteProductA2();
    }
    AbstractProductB *CreateProductB()const override{
        return new ConcreteProductB2();
    }
};

void Client(const AbstractFactory &factory){
    const auto proA = factory.CreateProductA();
    const auto proB = factory.CreateProductB();
    cout<<proA->UserfulFunctionA();
    cout<<proB->UserfulFunctionB();
}

int main(){
    auto factory1 = make_unique<Factory1>();
    Client(*factory1);
    auto factory2 = make_unique<Factory2>();
    Client(*factory2);
}
