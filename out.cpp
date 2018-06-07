#include "Variable.cpp"

Variable _silnia(Variable _N){
	Variable _x = Variable(0);
		if( _N>Variable(0)){
			_x = _N*(_silnia( (_N-Variable(1)) ));
		}
		else if( 1){
			_x = Variable(1);
		}
	return _x;
}

Variable _sum(Variable _a1, Variable _a2){
	return 	_a1+_a2;
}

Variable _drukuj(Variable _N){
		if( _N>Variable(0)){
			cout << Variable("*");
			_drukuj( (_N-Variable(1)) );
		}
	return 	NULL;
}

Variable _drukujDrzewo(Variable _N){
		if( _N>Variable(0)){
			_drukuj( _N );
			cout << Variable("\n");
			_drukujDrzewo( (_N-Variable(1)) );
		}
	return 	NULL;
}

Variable _fibo(Variable _N){
	Variable _x = Variable(0);
		if( _N==Variable(0)){
			_x = Variable(0);
		}
		else if( _N==Variable(1)){
			_x = Variable(1);
		}
		else if( 1){
			_x = (_fibo( (_N-Variable(1)) ))+(_fibo( (_N-Variable(2)) ));
		}
	return _x;
}

Variable _h = Variable(8);
int main(){
	cout << Variable("Silnia z 5 wynosi: ")<< (_silnia( (_sum( Variable(2), Variable(3) )) ))<< Variable("\n");
	_drukujDrzewo( Variable(5) );
	Variable _str = Variable("Ciag fibbonaciego z ");
	cout << _str<< _h<< Variable(" wynosi: ")<< (_fibo( _h ))<< Variable("\n");
return 0;
}

