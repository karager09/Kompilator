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
    sprintf((char*)tmp.c_str(), "%g", d);
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
        type = DOUBLE;
        value = malloc(sizeof(double));
        *((double*)value) = rValue;
    }

        Variable(string rValue){
        type = STRING;
        value = (void *)new string(rValue);
    }

    Variable(const Variable & v){
        if(v.type == INT){
            type = INT;
            value = malloc(sizeof(int));
            *((int*)value) = *(int *)v.value;
        }

        if(v.type == DOUBLE){
            type = DOUBLE;
            value = malloc(sizeof(double));
            *((double*)value) = *(double *)v.value;
        }

        if(v.type == STRING){
            type = STRING;
            value = (void *)new string(*(string *)v.value);
        }
    }

 /*   Variable(Variable rValue[]){
        this->type = TABLE;

            value = (void *) rValue;
    }
*/
    friend istream& operator>> (istream& wejscie, Variable & v)
    {
       if(v.type == INT){
              wejscie >> *(int*)v.value;
       } else if(v.type == DOUBLE){
              wejscie >> *(double*)v.value;
       }else if(v.type == STRING){
              wejscie >> *(string*)v.value;
       }
       return wejscie;
    }
    friend ostream& operator<< (ostream& wyjscie, Variable &v)
    {
    if(v.type == INT){
                  wyjscie << *(int*)v.value;
           } else if(v.type == DOUBLE){
                  wyjscie << *(double*)v.value;
           }else if(v.type == STRING){
                  wyjscie << *(string*)v.value;
           }
       return wyjscie;
    }

    Variable operator+(Variable v){
            if(this->type == INT){
                if(v.type==INT){
                    return Variable(*((int*)this->value) + *((int*)v.value));
                } else if (v.type==DOUBLE){
                    return Variable(*((int*)this->value) + *((double*)v.value));
                } else if(v.type==STRING){
                    return Variable(to_string(*(int *)this->value) + *(string *) v.value);
                }
            } else if(this->type == DOUBLE){
                if(v.type==INT){
                    return Variable(*((double*)this->value) + *((int*)v.value));
                } else if (v.type==DOUBLE){
                    return Variable(*((double*)this->value) + *((double*)v.value));
                } else if(v.type==STRING){
                    return Variable(to_string(*(double *)this->value) + *(string *) v.value);
                }
            } else if(this->type == STRING){
                if(v.type==INT){
                    return Variable(*(string *) this->value+to_string(*(int *)v.value));
                } else if (v.type==DOUBLE){
                   return Variable(*(string *) this->value+to_string(*(double *)v.value));
                } else if(v.type==STRING){
                    return Variable(*(string *)this->value+(*(string *)v.value));
                }
            }
        }

    Variable operator-(Variable v){
             if(this->type == INT){
                 if(v.type==INT){
                     return Variable(*((int*)this->value) - *((int*)v.value));
                 } else if (v.type==DOUBLE){
                     return Variable(*(int*)this->value - *((double*)v.value));
                 }
             } else if(this->type == DOUBLE){
                 if(v.type==INT){
                     return Variable(*((double*)this->value) -*((int*)v.value));
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
                return Variable(*((int*)this->value) * *((double*)v.value));
            }
        } else if(this->type == DOUBLE){
            if(v.type==INT){
                return Variable(*((double*)this->value) * *((int*)v.value));
            } else if (v.type==DOUBLE){
                return Variable(*((double*)this->value) * *((double*)v.value));
            }
        }
    }

        Variable operator/(Variable v){
        if(this->type == INT){
            if(v.type==INT){
                return Variable(*((int*)this->value) / *((int*)v.value));
            } else if (v.type==DOUBLE){
                return Variable(*((int*)this->value) / *((double*)v.value));
            }
        } else if(this->type == DOUBLE){
            if(v.type==INT){
                return Variable(*((double*)this->value) / *((int*)v.value));
            } else if (v.type==DOUBLE){
                return Variable(*((double*)this->value) / *((double*)v.value));
            }
        }
    }

        Variable operator > (Variable v){
        if(this->type == INT){
            if(v.type==INT){
                if(*((int*)this->value) > *((int*)v.value))
                    return true;
                else
                    return false;
            } else if (v.type==DOUBLE){
                if(*((int*)this->value) > *((double*)v.value))
                    return true;
                else
                    return false;
            }
        } else if(this->type == DOUBLE){
            if(v.type==INT){
                if(*((double*)this->value) > *((int*)v.value))
                    return true;
                else
                    return false;
            } else if (v.type==DOUBLE){
                if(*((double*)this->value) > *((double*)v.value))
                    return true;
                else
                    return false;
            }
        }
    }

        Variable operator < (Variable v){
        if(this->type == INT){
            if(v.type==INT){
                if(*((int*)this->value) < *((int*)v.value))
                    return true;
                else
                    return false;
            } else if (v.type==DOUBLE){
                if(*((int*)this->value) < *((double*)v.value))
                    return true;
                else
                    return false;
            }
        } else if(this->type == DOUBLE){
            if(v.type==INT){
                if(*((double*)this->value) < *((int*)v.value))
                    return true;
                else
                    return false;
            } else if (v.type==DOUBLE){
                if(*((double*)this->value) < *((double*)v.value))
                    return true;
                else
                    return false;
            }
        }
    }

        Variable operator == (Variable v){
        if(this->type == INT){
            if(v.type==INT){
                if(*((int*)this->value) == *((int*)v.value))
                    return true;
                else
                    return false;
            } else if (v.type==DOUBLE){
                if(*((int*)this->value) == *((double*)v.value))
                    return true;
                else
                    return false;
            }
        } else if(this->type == DOUBLE){
            if(v.type==INT){
                if(*((double*)this->value) == *((int*)v.value))
                    return true;
                else
                    return false;
            } else if (v.type==DOUBLE){
                if(*((double*)this->value) == *((double*)v.value))
                    return true;
                else
                    return false;
            }
        } else if (this->type == STRING){
            if(v.type==STRING){
                if(*((string*)this->value) == *((string*)v.value))
                                    return true;
                                else
                                    return false;
            }
        }
    }
        Variable operator != (Variable v){
        if(this->type == INT){
            if(v.type==INT){
                if(*((int*)this->value) != *((int*)v.value))
                    return true;
                else
                    return false;
            } else if (v.type==DOUBLE){
                if(*((int*)this->value) != *((double*)v.value))
                    return true;
                else
                    return false;
            }
        } else if(this->type == DOUBLE){
            if(v.type==INT){
                if(*((double*)this->value) != *((int*)v.value))
                    return true;
                else
                    return false;
            } else if (v.type==DOUBLE){
                if(*((double*)this->value) != *((double*)v.value))
                    return true;
                else
                    return false;
            }
        } else if (this->type == STRING){
                      if(v.type==STRING){
                          if(*((string*)this->value) != *((string*)v.value))
                                              return true;
                                          else
                                              return false;
                      }
                  }
    }

 explicit operator bool(){
        if(type == INT){
            return *((int*)value);
        } else if(type == DOUBLE){
            return *((double*)value);
        } else if(type == STRING){
            return *((string*)value) == "";
        }
    }
};