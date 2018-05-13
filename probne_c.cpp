#include <iostream>
#include <stdlib.h>

#define INT 0
#define DOUBLE 1
#define STRING 2
#define TABLE 3

using namespace std;


class Variable{
    public:
    short type;
    void * value;


    Variable(int rValue){
        this->type = INT;

            value = malloc(sizeof(int));
            *((int*)value) = rValue;
    }

        Variable(double rValue){
        this->type = DOUBLE;

            value = malloc(sizeof(double));
            *((double*)value) = rValue;
    }

        Variable(string rValue){
        this->type = STRING;

            value = (void *)new string(rValue);
    }

    istream& operator>> (istream& wejscie, Variable v)
    {
       wejscie >> v;
       return wejscie;
    }
    ostream& operator<< (ostream& wyjscie, Variable v)
    {
       wyjscie << v;
       return wyjscie;
    }
    Variable operator+(Variable v){
        if(this->type == INT){
            if(v.type==INT){
                return Variable(*((int*)this->value) + *((int*)v.value));
            } else if (v.type==DOUBLE){
                return Variable(*((double*)this->value) + *((double*)v.value));
            } else if(v.type==STRING){
                return Variable(*(to_string(this->value)) + *(to_string(v.value));
            }
        } else if(this->type == DOUBLE){
            if(v.type==INT){
                return Variable(*((double*)this->value) + *((double*)v.value));
            } else if (v.type==DOUBLE){
                return Variable(*((double*)this->value) + *((double*)v.value));
            } else if(v.type==STRING){
                return Variable(*(to_string(this->value)) + *(to_string(v.value));
            }
        } else if(this->type == STRING){
            if(v.type==INT){
                return Variable(*(to_string(this->value)) + *(to_string(v.value));
            } else if (v.type==DOUBLE){
               return Variable(*(to_string(this->value)) + *(to_string(v.value));
            } else if(v.type==STRING){
                return Variable(*(to_string(this->value)) + *(to_string(v.value));
            }
        }
    }

    Variable operator-(Variable v){
             if(this->type == INT){
                 if(v.type==INT){
                     return Variable(*((int*)this->value) - *((int*)v.value));
                 } else if (v.type==DOUBLE){
                     return Variable(*((double*)this->value) - *((double*)v.value));
                 }
             } else if(this->type == DOUBLE){
                 if(v.type==INT){
                     return Variable(*((double*)this->value) - *((double*)v.value));
                 } else if (v.type==DOUBLE){
                     return Variable(*((double*)this->value) - *((double*)v.value));
                 }
         }
    Variable operator*(Variable v){
        if(this->type == INT){
            if(v.type==INT){
                return Variable(*((int*)this->value) * *((int*)v.value));
            } else if (v.type==DOUBLE){
                return Variable(*((double*)this->value) * *((double*)v.value));
            }
        } else if(this->type == DOUBLE){
            if(v.type==INT){
                return Variable(*((double*)this->value) * *((double*)v.value));
            } else if (v.type==DOUBLE){
                return Variable(*((double*)this->value) * *((double*)v.value));
            }
    }

};


Variable jakasFunkcja(Variable v1, Variable v2){

    Variable result = Variable(*((int*)v1.value) + *((int*)v2.value));
    return result;

}

int main()
{

    Variable v = Variable(8);
    cout << v.type<< ", "<< *((int*)v.value)<< endl;

    cout << v.type<< ", "<< *((int*)(jakasFunkcja(v,v)).value)<< endl;

    cout << v.type<< ", "<< *((int*)(v+1).value) << endl;

    cout << v.type<< ", "<< *((string*)(Variable("cos")).value) << endl;


    return 0;
}
