#include <iostream>
#include <stdlib.h>
#include <string>
#include <cstdio>

#define INT 0
#define DOUBLE 1
#define STRING 2
#define TABLE 3

using namespace std;

string to_string(int i){
    //char  buf [256];
    //sprintf(buf, "%d", i);

    string tmp;
    sprintf((char*)tmp.c_str(), "%d", i);
    return tmp.c_str();

}

string to_string(double d){
    string tmp;
    sprintf((char*)tmp.c_str(), "%f", d);
    return tmp.c_str();
}


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

 /*   Variable(Variable v){
        this->type = v.type;
        if(v.type == INT){
            this->value = malloc(sizeof(int))
        }

    }*/

    Variable(Variable rValue[]){
        this->type = TABLE;

            value = (void *) rValue;
    }

    friend istream& operator>> (istream& wejscie, Variable  v)
    {
       if(v.type == INT){
              wejscie >> *(int*)v.value;
       } else if(v.type == DOUBLE{
              wejscie >> *(double*)v.value;
       }else if(v.type == STRING{
              wejscie >> *(string*)v.value;
       }
       return wejscie;
    }
    friend ostream& operator<< (ostream& wyjscie, Variable v)
    {
    if(v.type == INT){
                  wyjscie >> *(int*)v.value;
           } else if(v.type == DOUBLE{
                  wyjscie >> *(double*)v.value;
           }else if(v.type == STRING{
                  wyjscie >> *(string*)v.value;
           }
       return wyjscie;
    }

    Variable operator+(Variable v){
            if(this->type == INT){
                if(v.type==INT){
                    return Variable(*((int*)this->value) + *((int*)v.value));
                } else if (v.type==DOUBLE){
                    return Variable(*((double*)this->value) + *((double*)v.value));
                } else if(v.type==STRING){
                    return Variable(to_string(*(int *)this->value) + *(string *) v.value);
                }
            } else if(this->type == DOUBLE){
                if(v.type==INT){
                    return Variable(*((double*)this->value) + *((double*)v.value));
                } else if (v.type==DOUBLE){
                    return Variable(*((double*)this->value) + *((double*)v.value));
                } else if(v.type==STRING){
                    return Variable(to_string(*(int *)this->value) + *(string *) v.value);
                }
            } else if(this->type == STRING){
                if(v.type==INT){
                    return Variable(to_string(*(int *)this->value) + *(string *) v.value);
                } else if (v.type==DOUBLE){
                   return Variable(to_string(*(int *)this->value) + *(string *) v.value);
                } else if(v.type==STRING){
                    return Variable((*(string *)this->value) + (*(string *)v.value));
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

    //Variable v1 = Variable({Variable(2),Variable(6)});
    //cout << v.type<< ", "<< *((int*)(((Variable[])v1).value[0]) << endl;
    Variable vtab[] = {{Variable(2)},{Variable(6)}};

    cout << * (int*)vtab[0].value << endl;

    //Variable vt = Variable({Variable(2),Variable(6)});

    Variable vt = Variable(vtab);


    v = *((Variable*)vt.value);
    //cout << *(int *)(((Variable*)vt.value)[1].value) << endl;
    //cout << *((int*)v.value)<< endl;



    cout << Variable(5) << Variable(5.67) << Variable("dasf");
    return 0;
}
