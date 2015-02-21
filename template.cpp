What you have between the argument list and the function body is called the initializer list. This is where there is a key difference between the first constructor and how you would have written it.

MyClass(int val)
    : x(val)  // x is not "assigned" val, but rather x is "initialized" with val
{}

MyClass(int val)
{ //By this point, x has been initialized with a junk value
    x=val; //Now x is "assigned" val
}

And here is analogous code following the same order:

//Analogy to the first constructor
int x(5); //x is initialized with 5

//Analogy to the second constructor
int x; //x has been initialized with some junk value
x = 5; //Now x is assigned 5 

When is this distinction important?

Consider two possibilities:

1) A member variable is constant. Therefore, it must be initialized as you cannot assign anything to it.

struct MyClass{
    const int x;

    MyClass(int val)
        : x(val) //Correct. x is intialized
    {
        //x = val;   // Error. Const variable may not be modified.
    }
};

2) A member variable is an object of a class that has no default constructor (a constructor that takes no arguments). This also forces the variable to be initialized.

struct MemberClass{
    int y;
    MemberClass(int val) //<-- This is the only constructor available (ignoring copy and move)
                                 // So MemberClass::MemberClass() does not exist
        : y(val)
    {}
};

struct MyClass{
    MemberClass mem;
    int x;
/*
    MyClass(int val)
    { // Error. MemberClass has no constructor MemberClass::MemberClass()
        mem = MemberClass(val);
    }
*/
    MyClass(int val)
        : mem(val) //Correct. This calls mem's constructor.
        , x(val >> 1)
    {}
};

Also remember that in the initializer list, you should initialize the variables in the order they were declared, like I did in the above example.



On a side note:
For C++11, you can also call another constructor from the initializer list.

struct MyClass{
    const int x;

    MyClass()
         : MyClass(0) //Calls the second constructor that takes an int argument
    {}

    MyClass(int val)
        : x(val)
    {}
};
