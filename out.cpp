#include "Variable.cpp"

Variable _suma(Variable _arg0, Variable _arg1){
	Variable _zm1 = _arg0+_arg1;
	return _zm1;
}

Variable _zm_gl = Variable(2);
Variable _zrob_costam(Variable _x){
	cout << Variable("Wpisz se jakas liczbe \n");
	Variable _z = Variable(1.5);
	cout << Variable("Argument funkcji to ")<< _x<< Variable("\n");
	cout << Variable("Podana przez Ciebie to ")<< _z<< Variable("\n");
	cout << Variable("Pomnozona przez 2.5 daje: ")<< (_z*Variable(2.5))<< Variable("\n");
	return 	NULL;
}

Variable _funkcja2(Variable _r){
	_zm_gl = Variable(4);
	_r = Variable(1)+Variable(2)*(Variable(5)/Variable(6))-Variable(4);
	Variable _obw = (Variable(3.14)*_r)*_r;
		if( _obw>Variable(2)*Variable(3.14)*_r){
			cout << Variable("jest wieksze");
		}
		else if( _r>Variable(5)){
				if( Variable(2)<Variable(3)){
					cout << Variable("tak");
				}
				else if( 1){
					cout << Variable("nie");
				}
		}
		else if( 1){
			cout << Variable("jest mniejsze");
		}
	return 	_zrob_costam( Variable(4) );
}

Variable _silnia(Variable _N){
	Variable _zwroc = Variable(0);
		if( _N<=Variable(1)){
			_zwroc = Variable(1);
		}
		else if( 1){
			_zwroc = _N*(_silnia( (_N-Variable(1)) ));
		}
	return _zwroc;
}

Variable _zmienna_globalna = Variable(7);
Variable _proba(Variable _ar0, Variable _ar1){
	Variable _wynik = _silnia( Variable(5) );
	cout << _wynik<< Variable("\n");
	_wynik = _wynik/(Variable(3)+Variable(1));
	cout << _wynik<< Variable("\n");
	cout << (_suma( Variable(4), Variable(5) ))<< Variable("\n");
	return 	NULL;
}

int main(){
	_zrob_costam( Variable(5) );
	cout << Variable("Podaj jakegos stringa:\n");
	cout << (_silnia( Variable(5) ))<< Variable("\n");
return 0;
}

